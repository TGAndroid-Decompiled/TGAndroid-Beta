package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.RadiiUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;

public class ReplyMessageLine {
    public int backgroundColor;
    public final AnimatedColor backgroundColorAnimated;
    private LoadingDrawable backgroundLoadingDrawable;
    private int cachedBar2;
    private int cachedBar3;
    private int cachedBarHeight;
    private int cachedBg;
    private boolean cachedHasColor3;
    public int color1;
    public final AnimatedColor color1Animated;
    public int color2;
    public final AnimatedFloat color2Alpha;
    public final AnimatedColor color2Animated;
    public int color3;
    public final AnimatedFloat color3Alpha;
    public final AnimatedColor color3Animated;
    private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emoji;
    public int emojiColor;
    private long emojiDocumentId;
    private boolean emojiLoaded;
    public final AnimatedFloat emojiLoadedT;
    private float emojiOffsetX;
    private float emojiOffsetY;
    public boolean hasColor2;
    public boolean hasColor3;
    private IconCoords[] iconCoords;
    private long lastLoadingTTime;
    private boolean loading;
    public final AnimatedFloat loadingStateT;
    private float loadingT;
    private float loadingTranslationT;
    public int nameColor;
    public final AnimatedColor nameColorAnimated;
    private final View parentView;
    private Bitmap patternBitmap;
    private boolean reversedOut;
    private boolean sponsored;
    private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable sticker;
    private long stickerDocumentId;
    public final AnimatedFloat switchStateT;
    private long wasCollectionId;
    private int wasColorId;
    private int wasMessageId;
    private final RectF rectF = new RectF();
    private final Paint color1Paint = new Paint(1);
    private final Paint patternPaint = new Paint(3);
    private final Matrix shaderMatrix = new Matrix();
    public final float[] radii = new float[8];
    private final Path backgroundPath = new Path();
    public final Paint backgroundPaint = new Paint();
    private int switchedCount = 0;
    private float emojiAlpha = 1.0f;

    public ReplyMessageLine(View view) {
        this.parentView = view;
        if (view != null) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                @Override
                public void onViewAttachedToWindow(View view2) {
                    if (ReplyMessageLine.this.emoji != null) {
                        ReplyMessageLine.this.emoji.attach();
                    }
                    if (ReplyMessageLine.this.sticker != null) {
                        ReplyMessageLine.this.sticker.attach();
                    }
                }

                @Override
                public void onViewDetachedFromWindow(View view2) {
                    if (ReplyMessageLine.this.emoji != null) {
                        ReplyMessageLine.this.emoji.detach();
                    }
                    if (ReplyMessageLine.this.sticker != null) {
                        ReplyMessageLine.this.sticker.attach();
                    }
                }
            });
        }
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.backgroundColorAnimated = new AnimatedColor(view, 0L, 400L, cubicBezierInterpolator);
        this.color1Animated = new AnimatedColor(view, 0L, 400L, cubicBezierInterpolator);
        this.color2Animated = new AnimatedColor(view, 0L, 400L, cubicBezierInterpolator);
        this.color3Animated = new AnimatedColor(view, 0L, 400L, cubicBezierInterpolator);
        this.nameColorAnimated = new AnimatedColor(view, 0L, 400L, cubicBezierInterpolator);
        this.color2Alpha = new AnimatedFloat(view, 0L, 400L, cubicBezierInterpolator);
        this.color3Alpha = new AnimatedFloat(view, 0L, 400L, cubicBezierInterpolator);
        this.emojiLoadedT = new AnimatedFloat(view, 0L, 440L, cubicBezierInterpolator);
        this.loadingStateT = new AnimatedFloat(view, 0L, 320L, cubicBezierInterpolator);
        this.switchStateT = new AnimatedFloat(view, 0L, 320L, cubicBezierInterpolator);
    }

    public int getColor() {
        return this.reversedOut ? this.color2 : this.color1;
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public void setSimpleColor(int i, boolean z) {
        this.reversedOut = false;
        this.hasColor3 = false;
        this.hasColor2 = false;
        this.color3 = i;
        this.color2 = i;
        this.color1 = i;
        this.backgroundColor = Theme.multAlpha(i, z ? 0.12f : 0.1f);
        this.emojiColor = i;
    }

    private void resolveColor(MessageObject messageObject, int i, Theme.ResourcesProvider resourcesProvider) {
        if (resourcesProvider != null) {
            resourcesProvider.isDark();
        } else {
            Theme.isCurrentThemeDark();
        }
        if (this.wasColorId != i) {
            int id = messageObject != null ? messageObject.getId() : 0;
            if (id == this.wasMessageId) {
                this.switchedCount++;
            }
            this.wasCollectionId = 0L;
            this.wasColorId = i;
            this.wasMessageId = id;
        }
        if (i < 7) {
            int color = Theme.getColor(Theme.keys_avatar_nameInMessage[i], resourcesProvider);
            this.color3 = color;
            this.color2 = color;
            this.color1 = color;
            this.hasColor3 = false;
            this.hasColor2 = false;
            return;
        }
        MessagesController.PeerColors peerColors = MessagesController.getInstance(messageObject != null ? messageObject.currentAccount : UserConfig.selectedAccount).peerColors;
        MessagesController.PeerColor color2 = peerColors != null ? peerColors.getColor(i) : null;
        if (color2 == null) {
            int color3 = Theme.getColor((messageObject == null || !messageObject.isOutOwner()) ? Theme.key_chat_inReplyLine : Theme.key_chat_outReplyLine, resourcesProvider);
            this.color3 = color3;
            this.color2 = color3;
            this.color1 = color3;
            this.hasColor3 = false;
            this.hasColor2 = false;
            return;
        }
        this.color1 = color2.getColor(0, resourcesProvider);
        this.color2 = color2.getColor(1, resourcesProvider);
        int color4 = color2.getColor(2, resourcesProvider);
        this.color3 = color4;
        int i2 = this.color2;
        int i3 = this.color1;
        this.hasColor2 = i2 != i3;
        boolean z = color4 != i3;
        this.hasColor3 = z;
        if (z) {
            this.color3 = i2;
            this.color2 = color4;
        }
    }

    private int resolveCollectionColor(MessageObject messageObject, TLRPC.TL_peerColorCollectible tL_peerColorCollectible, Theme.ResourcesProvider resourcesProvider) {
        boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.isCurrentThemeDark();
        int i = (!zIsDark || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
        ArrayList<Integer> arrayList = (!zIsDark || (tL_peerColorCollectible.flags & 2) == 0) ? tL_peerColorCollectible.colors : tL_peerColorCollectible.dark_colors;
        if (arrayList == null || arrayList.isEmpty()) {
            return 0;
        }
        if (this.wasCollectionId != tL_peerColorCollectible.collectible_id) {
            int id = messageObject != null ? messageObject.getId() : 0;
            if (id == this.wasMessageId) {
                this.switchedCount++;
            }
            this.wasColorId = 0;
            this.wasCollectionId = tL_peerColorCollectible.collectible_id;
            this.wasMessageId = id;
        }
        this.reversedOut = false;
        this.color1 = tL_peerColorCollectible.colors.get(0).intValue() | (-16777216);
        boolean z = arrayList.size() >= 2;
        this.hasColor2 = z;
        if (z) {
            this.color2 = tL_peerColorCollectible.colors.get(1).intValue() | (-16777216);
        }
        boolean z2 = arrayList.size() >= 3;
        this.hasColor3 = z2;
        if (z2) {
            this.color3 = tL_peerColorCollectible.colors.get(2).intValue() | (-16777216);
        }
        int i2 = i | (-16777216);
        this.nameColor = i2;
        this.backgroundColor = Theme.multAlpha(i2, 0.1f);
        long j = tL_peerColorCollectible.background_emoji_id;
        this.emojiDocumentId = j;
        this.stickerDocumentId = tL_peerColorCollectible.gift_emoji_id;
        if (j != 0 && this.emoji == null && this.parentView != null) {
            this.emoji = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this.parentView, false, AndroidUtilities.dp(20.0f), 13);
            View view = this.parentView;
            if (!(view instanceof ChatMessageCell) ? view.isAttachedToWindow() : ((ChatMessageCell) view).isCellAttachedToWindow()) {
                this.emoji.attach();
            }
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emoji;
        if (swapAnimatedEmojiDrawable != null && swapAnimatedEmojiDrawable.set(this.emojiDocumentId, true)) {
            this.emojiLoaded = false;
        }
        this.emojiColor = this.nameColor;
        if (this.stickerDocumentId != 0 && this.sticker == null && this.parentView != null) {
            this.sticker = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this.parentView, false, AndroidUtilities.dp(20.0f), 13);
            View view2 = this.parentView;
            if (!(view2 instanceof ChatMessageCell) ? view2.isAttachedToWindow() : ((ChatMessageCell) view2).isCellAttachedToWindow()) {
                this.sticker.attach();
            }
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.sticker;
        if (swapAnimatedEmojiDrawable2 != null) {
            swapAnimatedEmojiDrawable2.set(this.stickerDocumentId, true);
        }
        return this.nameColorAnimated.set(this.nameColor);
    }

    public int check(MessageObject messageObject, TLRPC.User user, TLRPC.Chat chat, Theme.ResourcesProvider resourcesProvider, int i) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.MessageFwdHeader messageFwdHeader;
        MessageObject messageObject2;
        TLRPC.Message message2;
        int colorId;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        TLRPC.Peer peer;
        TLRPC.PeerColor peerColor;
        int i2;
        TLRPC.Message message3;
        TLRPC.PeerColor peerColor2;
        TLRPC.MessageFwdHeader messageFwdHeader3;
        int i3;
        TLRPC.Message message4;
        int colorId2;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.User currentUser = user;
        boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.isCurrentThemeDark();
        if (messageObject != null && !messageObject.isOutOwner() && i != 2 && (tL_peerColorCollectible = messageObject.overrideLinkPeerColor) != null) {
            return resolveCollectionColor(messageObject, tL_peerColorCollectible, resourcesProvider);
        }
        this.reversedOut = false;
        this.emojiDocumentId = 0L;
        this.stickerDocumentId = 0L;
        this.sponsored = messageObject != null && messageObject.isSponsored();
        if (messageObject == null) {
            this.hasColor3 = false;
            this.hasColor2 = false;
            int color = Theme.getColor(Theme.key_chat_inReplyLine, resourcesProvider);
            this.color3 = color;
            this.color2 = color;
            this.color1 = color;
            this.backgroundColor = Theme.multAlpha(color, zIsDark ? 0.12f : 0.1f);
            this.emojiColor = getColor();
            AnimatedColor animatedColor = this.nameColorAnimated;
            int color2 = Theme.getColor(Theme.key_chat_inReplyNameText, resourcesProvider);
            this.nameColor = color2;
            return animatedColor.set(color2);
        }
        if (i == 4 && (message4 = messageObject.messageOwner) != null && MessageObject.getMedia(message4) != null && (MessageObject.getMedia(messageObject.messageOwner) instanceof TLRPC.TL_messageMediaContact)) {
            long j = MessageObject.getMedia(messageObject.messageOwner).user_id;
            TLRPC.User user2 = j != 0 ? MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(j)) : null;
            if (!messageObject.isOutOwner() && i != 2 && user2 != null) {
                TLRPC.PeerColor peerColor3 = user2.color;
                if (peerColor3 instanceof TLRPC.TL_peerColorCollectible) {
                    return resolveCollectionColor(messageObject, (TLRPC.TL_peerColorCollectible) peerColor3, resourcesProvider);
                }
            }
            if (user2 != null) {
                colorId2 = UserObject.getColorId(user2);
                this.emojiDocumentId = UserObject.getEmojiId(user2);
            } else {
                colorId2 = 0;
            }
            resolveColor(messageObject, colorId2, resourcesProvider);
            this.backgroundColor = Theme.multAlpha(this.color1, 0.1f);
            this.nameColor = this.color1;
        } else if (i != 0 && (messageObject.overrideLinkColor >= 0 || (messageObject.messageOwner != null && (((messageObject.isFromUser() || DialogObject.isEncryptedDialog(messageObject.getDialogId())) && currentUser != null) || ((messageObject.isFromChannel() && chat != null) || (((message3 = messageObject.messageOwner) != null && (messageFwdHeader3 = message3.fwd_from) != null && messageFwdHeader3.from_id != null) || (messageObject.isSponsored() && (peerColor2 = messageObject.sponsoredColor) != null && peerColor2.color != -1))))))) {
            int colorId3 = messageObject.overrideLinkColor;
            if (colorId3 >= 0) {
                colorId = colorId3;
            } else if (!messageObject.isSponsored() || (peerColor = messageObject.sponsoredColor) == null || (i2 = peerColor.color) == -1) {
                TLRPC.Message message5 = messageObject.messageOwner;
                if (message5 != null && (messageFwdHeader2 = message5.fwd_from) != null && (peer = messageFwdHeader2.from_id) != null) {
                    long peerDialogId = DialogObject.getPeerDialogId(peer);
                    if (peerDialogId < 0) {
                        TLRPC.Chat chat2 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-peerDialogId));
                        if (!messageObject.isOutOwner() && i != 2 && chat2 != null) {
                            TLRPC.PeerColor peerColor4 = chat2.color;
                            if (peerColor4 instanceof TLRPC.TL_peerColorCollectible) {
                                return resolveCollectionColor(messageObject, (TLRPC.TL_peerColorCollectible) peerColor4, resourcesProvider);
                            }
                        }
                        colorId3 = chat2 != null ? ChatObject.getColorId(chat2) : 5;
                        if (i == 3) {
                            this.emojiDocumentId = ChatObject.getEmojiId(chat2);
                        }
                    } else {
                        TLRPC.User user3 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(peerDialogId));
                        if (!messageObject.isOutOwner() && i != 2 && user3 != null) {
                            TLRPC.PeerColor peerColor5 = user3.color;
                            if (peerColor5 instanceof TLRPC.TL_peerColorCollectible) {
                                return resolveCollectionColor(messageObject, (TLRPC.TL_peerColorCollectible) peerColor5, resourcesProvider);
                            }
                        }
                        colorId3 = user3 != null ? UserObject.getColorId(user3) : 5;
                        if (i == 3) {
                            this.emojiDocumentId = UserObject.getEmojiId(user3);
                        }
                    }
                    colorId = colorId3;
                } else if (DialogObject.isEncryptedDialog(messageObject.getDialogId()) && currentUser != null) {
                    TLRPC.User currentUser2 = messageObject.isOutOwner() ? UserConfig.getInstance(messageObject.currentAccount).getCurrentUser() : currentUser;
                    if (currentUser2 != null) {
                        currentUser = currentUser2;
                    }
                    if (!messageObject.isOutOwner() && i != 2) {
                        TLRPC.PeerColor peerColor6 = currentUser.color;
                        if (peerColor6 instanceof TLRPC.TL_peerColorCollectible) {
                            return resolveCollectionColor(messageObject, (TLRPC.TL_peerColorCollectible) peerColor6, resourcesProvider);
                        }
                    }
                    colorId = UserObject.getColorId(currentUser);
                    if (i == 3) {
                        this.emojiDocumentId = UserObject.getEmojiId(currentUser);
                    }
                } else if (messageObject.isFromUser() && currentUser != null) {
                    if (!messageObject.isOutOwner() && i != 2) {
                        TLRPC.PeerColor peerColor7 = currentUser.color;
                        if (peerColor7 instanceof TLRPC.TL_peerColorCollectible) {
                            return resolveCollectionColor(messageObject, (TLRPC.TL_peerColorCollectible) peerColor7, resourcesProvider);
                        }
                    }
                    colorId = UserObject.getColorId(user);
                    if (i == 3) {
                        this.emojiDocumentId = UserObject.getEmojiId(user);
                    }
                } else if (!messageObject.isFromChannel() || chat == null) {
                    colorId = 0;
                } else {
                    if (!messageObject.isOutOwner() && i != 2) {
                        TLRPC.PeerColor peerColor8 = chat.color;
                        if (peerColor8 instanceof TLRPC.TL_peerColorCollectible) {
                            return resolveCollectionColor(messageObject, (TLRPC.TL_peerColorCollectible) peerColor8, resourcesProvider);
                        }
                    }
                    if (chat.signature_profiles) {
                        long fromChatId = messageObject.getFromChatId();
                        if (fromChatId >= 0) {
                            TLRPC.User user4 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(fromChatId));
                            colorId = UserObject.getColorId(user4);
                            if (i == 3) {
                                this.emojiDocumentId = UserObject.getEmojiId(user4);
                            }
                        } else {
                            TLRPC.Chat chat3 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-fromChatId));
                            colorId = ChatObject.getColorId(chat3);
                            if (i == 3) {
                                this.emojiDocumentId = ChatObject.getEmojiId(chat3);
                            }
                        }
                    } else {
                        int colorId4 = ChatObject.getColorId(chat);
                        if (i == 3) {
                            this.emojiDocumentId = ChatObject.getEmojiId(chat);
                        }
                        colorId = colorId4;
                    }
                }
            } else {
                if (i == 3) {
                    this.emojiDocumentId = peerColor.background_emoji_id;
                }
                colorId = i2;
            }
            resolveColor(messageObject, colorId, resourcesProvider);
            this.backgroundColor = Theme.multAlpha(this.color1, 0.1f);
            this.nameColor = this.color1;
        } else if (i == 0 && (messageObject.overrideLinkColor >= 0 || ((message = messageObject.messageOwner) != null && messageObject.replyMessageObject != null && (messageReplyHeader = message.reply_to) != null && (((messageFwdHeader = messageReplyHeader.reply_from) == null || TextUtils.isEmpty(messageFwdHeader.from_name)) && (message2 = (messageObject2 = messageObject.replyMessageObject).messageOwner) != null && message2.from_id != null && (messageObject2.isFromUser() || DialogObject.isEncryptedDialog(messageObject.getDialogId()) || messageObject.replyMessageObject.isFromChannel()))))) {
            int colorId5 = messageObject.overrideLinkColor;
            if (colorId5 < 0) {
                if (DialogObject.isEncryptedDialog(messageObject.replyMessageObject.getDialogId())) {
                    if (messageObject.replyMessageObject.isOutOwner()) {
                        currentUser = UserConfig.getInstance(messageObject.replyMessageObject.currentAccount).getCurrentUser();
                    }
                    if (currentUser != null) {
                        colorId5 = UserObject.getColorId(currentUser);
                        this.emojiDocumentId = UserObject.getEmojiId(currentUser);
                    } else {
                        colorId5 = 0;
                    }
                } else if (messageObject.replyMessageObject.isFromUser()) {
                    TLRPC.User user5 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(messageObject.replyMessageObject.messageOwner.from_id.user_id));
                    if (!messageObject.isOutOwner() && i != 2 && user5 != null) {
                        TLRPC.PeerColor peerColor9 = user5.color;
                        if (peerColor9 instanceof TLRPC.TL_peerColorCollectible) {
                            return resolveCollectionColor(messageObject, (TLRPC.TL_peerColorCollectible) peerColor9, resourcesProvider);
                        }
                    }
                    if (user5 != null) {
                        colorId5 = UserObject.getColorId(user5);
                        this.emojiDocumentId = UserObject.getEmojiId(user5);
                    } else {
                        colorId5 = 0;
                    }
                } else if (messageObject.replyMessageObject.isFromChannel()) {
                    TLRPC.Chat chat4 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(messageObject.replyMessageObject.messageOwner.from_id.channel_id));
                    if (!messageObject.isOutOwner() && i != 2 && chat4 != null) {
                        TLRPC.PeerColor peerColor10 = chat4.color;
                        if (peerColor10 instanceof TLRPC.TL_peerColorCollectible) {
                            return resolveCollectionColor(messageObject, (TLRPC.TL_peerColorCollectible) peerColor10, resourcesProvider);
                        }
                    }
                    if (chat4 != null) {
                        colorId5 = ChatObject.getColorId(chat4);
                        this.emojiDocumentId = ChatObject.getEmojiId(chat4);
                    } else {
                        colorId5 = 0;
                    }
                } else {
                    colorId5 = 0;
                }
            }
            resolveColor(messageObject.replyMessageObject, colorId5, resourcesProvider);
            this.backgroundColor = Theme.multAlpha(this.color1, 0.1f);
            this.nameColor = this.color1;
        } else {
            this.hasColor2 = false;
            this.hasColor3 = false;
            int color3 = Theme.getColor(Theme.key_chat_inReplyLine, resourcesProvider);
            this.color3 = color3;
            this.color2 = color3;
            this.color1 = color3;
            this.backgroundColor = Theme.multAlpha(color3, 0.1f);
            this.nameColor = Theme.getColor(Theme.key_chat_inReplyNameText, resourcesProvider);
        }
        if (messageObject.shouldDrawWithoutBackground()) {
            this.hasColor2 = false;
            this.hasColor3 = false;
            this.color3 = -1;
            this.color2 = -1;
            this.color1 = -1;
            this.backgroundColor = 0;
            this.nameColor = Theme.getColor(Theme.key_chat_stickerReplyNameText, resourcesProvider);
        } else {
            if (messageObject.isOutOwner()) {
                i3 = 2;
            } else {
                i3 = 2;
                if (i == 2) {
                }
            }
            if (i == i3 && !messageObject.isOutOwner()) {
                int color4 = Theme.getColor(Theme.key_chat_inCodeBackground, resourcesProvider);
                this.color3 = color4;
                this.color2 = color4;
                this.color1 = color4;
            } else {
                int color5 = Theme.getColor((this.hasColor2 || this.hasColor3) ? Theme.key_chat_outReplyLine2 : Theme.key_chat_outReplyLine, resourcesProvider);
                this.color3 = color5;
                this.color2 = color5;
                this.color1 = color5;
            }
            if (this.hasColor3) {
                this.reversedOut = true;
                this.color1 = Theme.multAlpha(this.color1, 0.2f);
                this.color2 = Theme.multAlpha(this.color2, 0.5f);
            } else if (this.hasColor2) {
                this.reversedOut = true;
                this.color1 = Theme.multAlpha(this.color1, 0.35f);
            }
            this.backgroundColor = Theme.multAlpha(this.color3, zIsDark ? 0.12f : 0.1f);
            this.nameColor = Theme.getColor(Theme.key_chat_outReplyNameText, resourcesProvider);
        }
        if (i == 0 || i == 3 || i == 4) {
            long j2 = messageObject.overrideLinkEmoji;
            if (j2 != -1) {
                this.emojiDocumentId = j2;
            }
        }
        if (this.emojiDocumentId != 0 && this.emoji == null && this.parentView != null) {
            this.emoji = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this.parentView, false, AndroidUtilities.dp(20.0f), 13);
            View view = this.parentView;
            if (!(view instanceof ChatMessageCell) ? view.isAttachedToWindow() : ((ChatMessageCell) view).isCellAttachedToWindow()) {
                this.emoji.attach();
            }
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emoji;
        if (swapAnimatedEmojiDrawable != null && swapAnimatedEmojiDrawable.set(this.emojiDocumentId, true)) {
            this.emojiLoaded = false;
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.sticker;
        if (swapAnimatedEmojiDrawable2 != null) {
            swapAnimatedEmojiDrawable2.set(this.stickerDocumentId, true);
        }
        this.emojiColor = getColor();
        return this.nameColorAnimated.set(this.nameColor);
    }

    public boolean hasSticker() {
        return this.stickerDocumentId != 0;
    }

    public int setFactCheck(Theme.ResourcesProvider resourcesProvider) {
        int i = Theme.key_text_RedBold;
        this.nameColor = Theme.getColor(i, resourcesProvider);
        this.color1 = Theme.getColor(i, resourcesProvider);
        this.hasColor2 = false;
        this.hasColor3 = false;
        this.backgroundColor = Theme.multAlpha(Theme.getColor(i, resourcesProvider), 0.1f);
        if (this.emojiDocumentId != 0 && this.emoji == null && this.parentView != null) {
            this.emoji = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this.parentView, false, AndroidUtilities.dp(20.0f), 13);
            View view = this.parentView;
            if (!(view instanceof ChatMessageCell) ? view.isAttachedToWindow() : ((ChatMessageCell) view).isCellAttachedToWindow()) {
                this.emoji.attach();
            }
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emoji;
        if (swapAnimatedEmojiDrawable != null && swapAnimatedEmojiDrawable.set(this.emojiDocumentId, true)) {
            this.emojiLoaded = false;
        }
        this.emojiColor = getColor();
        return this.nameColorAnimated.set(this.nameColor);
    }

    public void setEmojiAlpha(float f) {
        this.emojiAlpha = f;
    }

    public void resetAnimation() {
        this.color1Animated.set(this.color1, true);
        this.color2Animated.set(this.color2, true);
        this.color2Alpha.set(this.hasColor2, true);
        this.nameColorAnimated.set(this.nameColor, true);
        this.backgroundColorAnimated.set(this.backgroundColor, true);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emoji;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.resetAnimation();
        }
    }

    public void setLoading(boolean z) {
        LoadingDrawable loadingDrawable;
        if (!z && this.loading) {
            this.loadingT = 0.0f;
            LoadingDrawable loadingDrawable2 = this.backgroundLoadingDrawable;
            if (loadingDrawable2 != null) {
                loadingDrawable2.disappear();
            }
        } else if (z && !this.loading && (loadingDrawable = this.backgroundLoadingDrawable) != null) {
            loadingDrawable.resetDisappear();
            this.backgroundLoadingDrawable.reset();
        }
        this.loading = z;
    }

    private void incrementLoadingT() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        float f = this.loadingStateT.set(this.loading);
        this.loadingT += Math.min(30L, jCurrentTimeMillis - this.lastLoadingTTime) * f;
        this.loadingTranslationT += Math.min(30L, jCurrentTimeMillis - this.lastLoadingTTime) * f;
        this.lastLoadingTTime = jCurrentTimeMillis;
    }

    public void drawLine(Canvas canvas, RectF rectF) {
        drawLine(canvas, rectF, 1.0f);
    }

    public void drawLine(Canvas canvas, RectF rectF, float f) {
        float fHeight;
        int iM;
        int iFloor = (int) Math.floor(SharedConfig.bubbleRadius / (this.sponsored ? 2.0f : 3.0f));
        float fMax = rectF.left + Math.max(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(iFloor * 2));
        int i = this.color1Animated.set(this.color1);
        this.color1Paint.setColor(Theme.multAlpha(i, f));
        float f2 = this.loadingStateT.set(this.loading);
        float f3 = this.color2Alpha.set(this.hasColor2);
        float f4 = this.color3Alpha.set(this.hasColor3);
        if (f2 > 0.0f && !this.hasColor2) {
            int alpha = this.color1Paint.getAlpha();
            this.color1Paint.setAlpha((int) (alpha * 0.3f));
            this.rectF.set(rectF.left, rectF.top, fMax, rectF.bottom);
            canvas.save();
            RectF rectF2 = this.rectF;
            float f5 = rectF2.left;
            canvas.clipRect(f5, rectF2.top, AndroidUtilities.dp(3.0f) + f5, this.rectF.bottom);
            float f6 = iFloor;
            canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(f6), AndroidUtilities.dp(f6), this.color1Paint);
            this.color1Paint.setAlpha(alpha);
            incrementLoadingT();
            float fPow = ((float) Math.pow((this.loadingT / 240.0f) / 4.0f, 0.8500000238418579d)) * 4.0f;
            this.rectF.set(rectF.left, rectF.top + (rectF.height() * AndroidUtilities.lerp(0.0f, 1.0f - CubicBezierInterpolator.EASE_IN.getInterpolation(MathUtils.clamp(((Math.max(fPow, 0.5f) + 1.5f) % 3.5f) * 0.5f, 0.0f, 1.0f)), f2)), rectF.left + AndroidUtilities.dp(6.0f), rectF.top + (rectF.height() * AndroidUtilities.lerp(1.0f, 1.0f - CubicBezierInterpolator.EASE_OUT.getInterpolation(MathUtils.clamp((((fPow + 1.5f) % 3.5f) - 1.5f) * 0.5f, 0.0f, 1.0f)), f2)));
            canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.color1Paint);
            canvas.restore();
            View view = this.parentView;
            if (view != null) {
                view.invalidate();
                return;
            }
            return;
        }
        if (f3 <= 0.0f) {
            this.rectF.set(rectF.left, rectF.top, fMax, rectF.bottom);
            canvas.save();
            RectF rectF3 = this.rectF;
            float f7 = rectF3.left;
            canvas.clipRect(f7, rectF3.top, AndroidUtilities.dp(3.0f) + f7, this.rectF.bottom);
            float f8 = iFloor;
            canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(f8), AndroidUtilities.dp(f8), this.color1Paint);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        incrementLoadingT();
        if (this.hasColor3) {
            fHeight = rectF.height();
            iM = ReplyMessageLine$$ExternalSyntheticBackport0.m((int) rectF.height(), AndroidUtilities.dp(18.99f));
        } else {
            fHeight = rectF.height();
            iM = ReplyMessageLine$$ExternalSyntheticBackport0.m((int) rectF.height(), AndroidUtilities.dp(12.66f));
        }
        float fDp = ((((this.loadingTranslationT + this.switchStateT.set(this.switchedCount * 425)) + (this.reversedOut ? 100 : 0)) / 1000.0f) * AndroidUtilities.dp(30.0f)) % (fHeight - iM);
        checkPatternBitmap(i, this.color2Animated.set(this.color2), this.color3Animated.set(this.color3), f3, f4, f);
        this.shaderMatrix.setTranslate(0.0f, -fDp);
        this.patternPaint.getShader().setLocalMatrix(this.shaderMatrix);
        this.patternPaint.setAlpha(255);
        this.rectF.set(0.0f, 0.0f, fMax - rectF.left, rectF.bottom - rectF.top);
        RectF rectF4 = this.rectF;
        float f9 = rectF4.left;
        canvas.clipRect(f9, rectF4.top, AndroidUtilities.dp(3.0f) + f9, this.rectF.bottom);
        float f10 = iFloor;
        canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), this.patternPaint);
        canvas.restore();
    }

    public void drawBackground(Canvas canvas, RectF rectF, float f, float f2, float f3, float f4) {
        drawBackground(canvas, rectF, f, f2, f3, f4, false, false);
    }

    public void drawBackground(Canvas canvas, RectF rectF, float f, float f2, float f3, float f4, boolean z, boolean z2) {
        float[] fArr = this.radii;
        float fMax = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f));
        fArr[1] = fMax;
        fArr[0] = fMax;
        float[] fArr2 = this.radii;
        float fDp = AndroidUtilities.dp(f2);
        fArr2[3] = fDp;
        fArr2[2] = fDp;
        float[] fArr3 = this.radii;
        float fDp2 = AndroidUtilities.dp(f3);
        fArr3[5] = fDp2;
        fArr3[4] = fDp2;
        float[] fArr4 = this.radii;
        float fMax2 = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f3));
        fArr4[7] = fMax2;
        fArr4[6] = fMax2;
        drawBackground(canvas, rectF, f4, z, z2);
    }

    private static class IconCoords {
        public float a;
        public boolean q;
        public float s;
        public float x;
        public float y;

        public IconCoords(float f, float f2, float f3, float f4, boolean z) {
            this(f, f2, f3, f4);
            this.q = z;
        }

        public IconCoords(float f, float f2, float f3, float f4) {
            this.x = f;
            this.y = f2;
            this.s = f3;
            this.a = f4;
        }
    }

    public void drawBackground(Canvas canvas, RectF rectF, float f) {
        drawBackground(canvas, rectF, f, false, false);
    }

    public ReplyMessageLine offsetEmoji(float f, float f2) {
        this.emojiOffsetX = f;
        this.emojiOffsetY = f2;
        return this;
    }

    public void drawBackground(Canvas canvas, RectF rectF, float f, boolean z, boolean z2) {
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable;
        if (!z2) {
            this.backgroundPaint.setColor(Theme.multAlpha(this.backgroundColorAnimated.set(this.backgroundColor), f));
            if (RadiiUtils.radiiAreSame(this.radii)) {
                float f2 = this.radii[0];
                canvas.drawRoundRect(rectF, f2, f2, this.backgroundPaint);
            } else {
                this.backgroundPath.rewind();
                this.backgroundPath.addRoundRect(rectF, this.radii, Path.Direction.CW);
                canvas.drawPath(this.backgroundPath, this.backgroundPaint);
            }
        }
        if (this.emoji == null) {
            return;
        }
        float f3 = this.emojiLoadedT.set(isEmojiLoaded());
        if (f3 <= 0.0f || this.emojiAlpha <= 0.0f) {
            return;
        }
        if (this.iconCoords == null) {
            this.iconCoords = new IconCoords[]{new IconCoords(4.0f, -6.33f, 1.0f, 1.0f), new IconCoords(30.0f, 3.0f, 0.78f, 0.9f), new IconCoords(46.0f, -17.0f, 0.6f, 0.6f), new IconCoords(69.66f, -0.666f, 0.87f, 0.7f), new IconCoords(98.0f, -12.6f, 1.03f, 0.3f), new IconCoords(51.0f, 24.0f, 1.0f, 0.5f), new IconCoords(6.33f, 20.0f, 0.77f, 0.7f), new IconCoords(-19.0f, 12.0f, 0.8f, 0.6f, true), new IconCoords(-22.0f, 36.0f, 0.7f, 0.5f, true)};
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(this.emojiOffsetX, this.emojiOffsetY);
        float fMax = Math.max(rectF.right - AndroidUtilities.dp(15.0f), rectF.centerX());
        if (z) {
            fMax -= AndroidUtilities.dp(12.0f);
        }
        float fMin = Math.min(rectF.centerY(), rectF.top + AndroidUtilities.dp(21.0f));
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.sticker;
        if (swapAnimatedEmojiDrawable2 != null) {
            swapAnimatedEmojiDrawable2.setAlpha((int) (f * 255.0f));
        }
        this.emoji.setColor(Integer.valueOf(this.emojiColor));
        int i = 0;
        while (true) {
            IconCoords[] iconCoordsArr = this.iconCoords;
            if (i < iconCoordsArr.length) {
                if (i != 0 || (swapAnimatedEmojiDrawable = this.sticker) == null || this.stickerDocumentId == 0) {
                    swapAnimatedEmojiDrawable = this.emoji;
                }
                IconCoords iconCoords = iconCoordsArr[i];
                if (!iconCoords.q || z) {
                    swapAnimatedEmojiDrawable.setAlpha((int) ((swapAnimatedEmojiDrawable == this.sticker ? 1.0f : 0.3f) * 255.0f * iconCoords.a * this.emojiAlpha));
                    float fDp = fMax - AndroidUtilities.dp(iconCoords.x);
                    float fDp2 = AndroidUtilities.dp(iconCoords.y) + fMin;
                    float fDp3 = AndroidUtilities.dp(10.0f) * iconCoords.s * f3;
                    swapAnimatedEmojiDrawable.setBounds((int) (fDp - fDp3), (int) (fDp2 - fDp3), (int) (fDp + fDp3), (int) (fDp2 + fDp3));
                    swapAnimatedEmojiDrawable.draw(canvas);
                }
                i++;
            } else {
                canvas.restore();
                return;
            }
        }
    }

    private boolean isEmojiLoaded() {
        if (this.emojiLoaded) {
            return true;
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emoji;
        if (swapAnimatedEmojiDrawable == null || !(swapAnimatedEmojiDrawable.getDrawable() instanceof AnimatedEmojiDrawable)) {
            return false;
        }
        AnimatedEmojiDrawable animatedEmojiDrawable = (AnimatedEmojiDrawable) this.emoji.getDrawable();
        if (animatedEmojiDrawable.getImageReceiver() == null || !animatedEmojiDrawable.getImageReceiver().hasImageLoaded()) {
            return false;
        }
        this.emojiLoaded = true;
        return true;
    }

    public void drawLoadingBackground(Canvas canvas, RectF rectF, float f, float f2, float f3, float f4) {
        LoadingDrawable loadingDrawable;
        float[] fArr = this.radii;
        float fMax = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f));
        fArr[1] = fMax;
        fArr[0] = fMax;
        float[] fArr2 = this.radii;
        float fDp = AndroidUtilities.dp(f2);
        fArr2[3] = fDp;
        fArr2[2] = fDp;
        float[] fArr3 = this.radii;
        float fDp2 = AndroidUtilities.dp(f3);
        fArr3[5] = fDp2;
        fArr3[4] = fDp2;
        float[] fArr4 = this.radii;
        float fMax2 = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f3));
        fArr4[7] = fMax2;
        fArr4[6] = fMax2;
        if (this.loading || ((loadingDrawable = this.backgroundLoadingDrawable) != null && loadingDrawable.isDisappearing())) {
            if (this.backgroundLoadingDrawable == null) {
                LoadingDrawable loadingDrawable2 = new LoadingDrawable();
                this.backgroundLoadingDrawable = loadingDrawable2;
                loadingDrawable2.setAppearByGradient(true);
                this.backgroundLoadingDrawable.setGradientScale(3.5f);
                this.backgroundLoadingDrawable.setSpeed(0.5f);
            }
            this.backgroundLoadingDrawable.setColors(Theme.multAlpha(this.color1, 0.1f), Theme.multAlpha(this.color1, 0.3f), Theme.multAlpha(this.color1, 0.3f), Theme.multAlpha(this.color1, 1.25f));
            this.backgroundLoadingDrawable.setBounds(rectF);
            this.backgroundLoadingDrawable.setRadii(this.radii);
            this.backgroundLoadingDrawable.strokePaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
            this.backgroundLoadingDrawable.setAlpha((int) (f4 * 255.0f));
            this.backgroundLoadingDrawable.draw(canvas);
            View view = this.parentView;
            if (view != null) {
                view.invalidate();
                return;
            }
            return;
        }
        LoadingDrawable loadingDrawable3 = this.backgroundLoadingDrawable;
        if (loadingDrawable3 != null) {
            loadingDrawable3.reset();
        }
    }

    private void checkPatternBitmap(int i, int i2, int i3, float f, float f2, float f3) {
        int iDp;
        int iMultAlpha = Theme.multAlpha(i, f3);
        int iCompositeColors = ColorUtils.compositeColors(Theme.multAlpha(i2, f * f3), iMultAlpha);
        int iCompositeColors2 = this.hasColor3 ? ColorUtils.compositeColors(Theme.multAlpha(i3, f3 * f2), iMultAlpha) : 0;
        int iRound = Math.round(AndroidUtilities.dpf2(6.33f));
        int iMax = Math.max(1, AndroidUtilities.dp(3.0f));
        if (this.hasColor3) {
            iDp = AndroidUtilities.dp(18.99f);
        } else {
            iDp = AndroidUtilities.dp(12.66f);
        }
        Bitmap bitmap = this.patternBitmap;
        if (bitmap != null && this.cachedBg == iMultAlpha && this.cachedBar2 == iCompositeColors && this.cachedBar3 == iCompositeColors2 && this.cachedHasColor3 == this.hasColor3 && this.cachedBarHeight == iRound && bitmap.getWidth() == iMax && this.patternBitmap.getHeight() == iDp) {
            return;
        }
        this.cachedBg = iMultAlpha;
        this.cachedBar2 = iCompositeColors;
        this.cachedBar3 = iCompositeColors2;
        this.cachedHasColor3 = this.hasColor3;
        this.cachedBarHeight = iRound;
        Bitmap bitmap2 = this.patternBitmap;
        if (bitmap2 == null || bitmap2.getWidth() != iMax || this.patternBitmap.getHeight() != iDp) {
            Bitmap bitmap3 = this.patternBitmap;
            if (bitmap3 != null) {
                bitmap3.recycle();
            }
            this.patternBitmap = Bitmap.createBitmap(iMax, iDp, Bitmap.Config.ARGB_8888);
            this.patternPaint.setShader(new BitmapShader(this.patternBitmap, Shader.TileMode.CLAMP, Shader.TileMode.REPEAT));
        }
        Utilities.drawReplyLinePattern(this.patternBitmap, iMultAlpha, iCompositeColors, iCompositeColors2, iRound, this.hasColor3);
    }
}
