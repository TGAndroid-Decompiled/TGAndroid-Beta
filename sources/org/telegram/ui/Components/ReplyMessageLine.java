package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
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
import org.telegram.messenger.utils.FBool;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.PhotoViewer;

public final class ReplyMessageLine {
    public int backgroundColor;
    public final AnimatedColor backgroundColorAnimated;
    public LoadingDrawable backgroundLoadingDrawable;
    public int cachedBar2;
    public int cachedBar3;
    public int cachedBarHeight;
    public int cachedBg;
    public boolean cachedHasColor3;
    public int color1;
    public final AnimatedColor color1Animated;
    public int color2;
    public final AnimatedFloat color2Alpha;
    public final AnimatedColor color2Animated;
    public int color3;
    public final AnimatedFloat color3Alpha;
    public final AnimatedColor color3Animated;
    public AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emoji;
    public int emojiColor;
    public long emojiDocumentId;
    public boolean emojiLoaded;
    public final AnimatedFloat emojiLoadedT;
    public float emojiOffsetY;
    public boolean hasColor2;
    public boolean hasColor3;
    public IconCoords[] iconCoords;
    public long lastLoadingTTime;
    public boolean loading;
    public final AnimatedFloat loadingStateT;
    public float loadingT;
    public float loadingTranslationT;
    public int nameColor;
    public final AnimatedColor nameColorAnimated;
    public final View parentView;
    public Bitmap patternBitmap;
    public boolean reversedOut;
    public boolean sponsored;
    public AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable sticker;
    public long stickerDocumentId;
    public final AnimatedFloat switchStateT;
    public long wasCollectionId;
    public int wasColorId;
    public int wasMessageId;
    public final RectF rectF = new RectF();
    public final Paint color1Paint = new Paint(1);
    public final Paint patternPaint = new Paint(3);
    public final Matrix shaderMatrix = new Matrix();
    public final float[] radii = new float[8];
    public final Path backgroundPath = new Path();
    public final Paint backgroundPaint = new Paint();
    public int switchedCount = 0;
    public float emojiAlpha = 1.0f;

    public final class IconCoords {
        public final float a;
        public boolean q;
        public final float s;
        public final float x;
        public final float y;

        public IconCoords(float f, float f2, float f3, float f4) {
            this.x = f;
            this.y = f2;
            this.s = f3;
            this.a = f4;
        }
    }

    public ReplyMessageLine(View view) {
        this.parentView = view;
        if (view != null) {
            view.addOnAttachStateChangeListener(new AvatarSpan.AnonymousClass1(this, 8));
        }
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.backgroundColorAnimated = new AnimatedColor(view, 400L, cubicBezierInterpolator, 0);
        this.color1Animated = new AnimatedColor(view, 400L, cubicBezierInterpolator, 0);
        this.color2Animated = new AnimatedColor(view, 400L, cubicBezierInterpolator, 0);
        this.color3Animated = new AnimatedColor(view, 400L, cubicBezierInterpolator, 0);
        this.nameColorAnimated = new AnimatedColor(view, 400L, cubicBezierInterpolator, 0);
        this.color2Alpha = new AnimatedFloat(view, 0L, 400L, cubicBezierInterpolator);
        this.color3Alpha = new AnimatedFloat(view, 0L, 400L, cubicBezierInterpolator);
        this.emojiLoadedT = new AnimatedFloat(view, 0L, 440L, cubicBezierInterpolator);
        this.loadingStateT = new AnimatedFloat(view, 0L, 320L, cubicBezierInterpolator);
        this.switchStateT = new AnimatedFloat(view, 0L, 320L, cubicBezierInterpolator);
    }

    public final int check(MessageObject messageObject, TLRPC.User user, TLRPC.Chat chat, Theme.ResourcesProvider resourcesProvider, int i) {
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
        boolean z;
        View view;
        TLRPC.Message message4;
        int colorId2;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.User currentUser = user;
        boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
        if (messageObject != null && !messageObject.isOutOwner() && i != 2 && (tL_peerColorCollectible = messageObject.overrideLinkPeerColor) != null) {
            return resolveCollectionColor(messageObject, tL_peerColorCollectible, resourcesProvider);
        }
        this.reversedOut = false;
        this.emojiDocumentId = 0L;
        this.stickerDocumentId = 0L;
        this.sponsored = messageObject != null && messageObject.isSponsored();
        AnimatedColor animatedColor = this.nameColorAnimated;
        if (messageObject == null) {
            this.hasColor3 = false;
            this.hasColor2 = false;
            int color = Theme.getColor(Theme.key_chat_inReplyLine, resourcesProvider);
            this.color3 = color;
            this.color2 = color;
            this.color1 = color;
            this.backgroundColor = Theme.multAlpha(zIsDark ? 0.12f : 0.1f, color);
            this.emojiColor = getColor();
            int color2 = Theme.getColor(Theme.key_chat_inReplyNameText, resourcesProvider);
            this.nameColor = color2;
            return animatedColor.set(color2, false);
        }
        if (i != 4 || (message4 = messageObject.messageOwner) == null || MessageObject.getMedia(message4) == null || !(MessageObject.getMedia(messageObject.messageOwner) instanceof TLRPC.TL_messageMediaContact)) {
            animatedColor = animatedColor;
            if (i != 0 && (messageObject.overrideLinkColor >= 0 || (messageObject.messageOwner != null && (((messageObject.isFromUser() || DialogObject.isEncryptedDialog(messageObject.getDialogId())) && currentUser != null) || ((messageObject.isFromChannel() && chat != null) || (((message3 = messageObject.messageOwner) != null && (messageFwdHeader3 = message3.fwd_from) != null && messageFwdHeader3.from_id != null) || (messageObject.isSponsored() && (peerColor2 = messageObject.sponsoredColor) != null && peerColor2.color != -1))))))) {
                int colorId3 = messageObject.overrideLinkColor;
                if (colorId3 < 0) {
                    if (!messageObject.isSponsored() || (peerColor = messageObject.sponsoredColor) == null || (i2 = peerColor.color) == -1) {
                        TLRPC.Message message5 = messageObject.messageOwner;
                        if (message5 != null && (messageFwdHeader2 = message5.fwd_from) != null && (peer = messageFwdHeader2.from_id) != null) {
                            long peerDialogId = DialogObject.getPeerDialogId(peer);
                            if (peerDialogId < 0) {
                                TLRPC.Chat chat2 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-peerDialogId));
                                if (!messageObject.isOutOwner() && i != 2 && chat2 != null) {
                                    TLRPC.PeerColor peerColor3 = chat2.color;
                                    if (peerColor3 instanceof TLRPC.TL_peerColorCollectible) {
                                        return resolveCollectionColor(messageObject, (TLRPC.TL_peerColorCollectible) peerColor3, resourcesProvider);
                                    }
                                }
                                colorId3 = chat2 != null ? ChatObject.getColorId(chat2) : 5;
                                if (i == 3) {
                                    this.emojiDocumentId = ChatObject.getEmojiId(chat2);
                                }
                            } else {
                                TLRPC.User user2 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(peerDialogId));
                                if (!messageObject.isOutOwner() && i != 2 && user2 != null) {
                                    TLRPC.PeerColor peerColor4 = user2.color;
                                    if (peerColor4 instanceof TLRPC.TL_peerColorCollectible) {
                                        return resolveCollectionColor(messageObject, (TLRPC.TL_peerColorCollectible) peerColor4, resourcesProvider);
                                    }
                                }
                                colorId3 = user2 != null ? UserObject.getColorId(user2) : 5;
                                if (i == 3) {
                                    this.emojiDocumentId = UserObject.getEmojiId(user2);
                                }
                            }
                        } else if (DialogObject.isEncryptedDialog(messageObject.getDialogId()) && currentUser != null) {
                            TLRPC.User currentUser2 = messageObject.isOutOwner() ? UserConfig.getInstance(messageObject.currentAccount).getCurrentUser() : currentUser;
                            if (currentUser2 != null) {
                                currentUser = currentUser2;
                            }
                            if (!messageObject.isOutOwner() && i != 2) {
                                TLRPC.PeerColor peerColor5 = currentUser.color;
                                if (peerColor5 instanceof TLRPC.TL_peerColorCollectible) {
                                    return resolveCollectionColor(messageObject, (TLRPC.TL_peerColorCollectible) peerColor5, resourcesProvider);
                                }
                            }
                            colorId3 = UserObject.getColorId(currentUser);
                            if (i == 3) {
                                this.emojiDocumentId = UserObject.getEmojiId(currentUser);
                            }
                        } else if (messageObject.isFromUser() && currentUser != null) {
                            if (!messageObject.isOutOwner() && i != 2) {
                                TLRPC.PeerColor peerColor6 = currentUser.color;
                                if (peerColor6 instanceof TLRPC.TL_peerColorCollectible) {
                                    return resolveCollectionColor(messageObject, (TLRPC.TL_peerColorCollectible) peerColor6, resourcesProvider);
                                }
                            }
                            colorId3 = UserObject.getColorId(currentUser);
                            if (i == 3) {
                                this.emojiDocumentId = UserObject.getEmojiId(currentUser);
                            }
                        } else if (!messageObject.isFromChannel() || chat == null) {
                            colorId3 = 0;
                        } else {
                            if (!messageObject.isOutOwner() && i != 2) {
                                TLRPC.PeerColor peerColor7 = chat.color;
                                if (peerColor7 instanceof TLRPC.TL_peerColorCollectible) {
                                    return resolveCollectionColor(messageObject, (TLRPC.TL_peerColorCollectible) peerColor7, resourcesProvider);
                                }
                            }
                            if (chat.signature_profiles) {
                                long fromChatId = messageObject.getFromChatId();
                                if (fromChatId >= 0) {
                                    TLRPC.User user3 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(fromChatId));
                                    colorId = UserObject.getColorId(user3);
                                    if (i == 3) {
                                        this.emojiDocumentId = UserObject.getEmojiId(user3);
                                    }
                                } else {
                                    TLRPC.Chat chat3 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-fromChatId));
                                    colorId = ChatObject.getColorId(chat3);
                                    if (i == 3) {
                                        this.emojiDocumentId = ChatObject.getEmojiId(chat3);
                                    }
                                }
                                colorId3 = colorId;
                            } else {
                                colorId3 = ChatObject.getColorId(chat);
                                if (i == 3) {
                                    this.emojiDocumentId = ChatObject.getEmojiId(chat);
                                }
                            }
                        }
                    } else {
                        if (i == 3) {
                            this.emojiDocumentId = peerColor.background_emoji_id;
                        }
                        colorId3 = i2;
                    }
                }
                resolveColor(resourcesProvider, colorId3, messageObject);
                this.backgroundColor = Theme.multAlpha(0.1f, this.color1);
                this.nameColor = this.color1;
            } else if (i != 0 || (messageObject.overrideLinkColor < 0 && ((message = messageObject.messageOwner) == null || messageObject.replyMessageObject == null || (messageReplyHeader = message.reply_to) == null || (!((messageFwdHeader = messageReplyHeader.reply_from) == null || TextUtils.isEmpty(messageFwdHeader.from_name)) || (message2 = (messageObject2 = messageObject.replyMessageObject).messageOwner) == null || message2.from_id == null || !(messageObject2.isFromUser() || DialogObject.isEncryptedDialog(messageObject.getDialogId()) || messageObject.replyMessageObject.isFromChannel()))))) {
                this.hasColor2 = false;
                this.hasColor3 = false;
                int color3 = Theme.getColor(Theme.key_chat_inReplyLine, resourcesProvider);
                this.color3 = color3;
                this.color2 = color3;
                this.color1 = color3;
                this.backgroundColor = Theme.multAlpha(0.1f, color3);
                this.nameColor = Theme.getColor(Theme.key_chat_inReplyNameText, resourcesProvider);
            } else {
                int colorId4 = messageObject.overrideLinkColor;
                if (colorId4 < 0) {
                    if (DialogObject.isEncryptedDialog(messageObject.replyMessageObject.getDialogId())) {
                        if (messageObject.replyMessageObject.isOutOwner()) {
                            currentUser = UserConfig.getInstance(messageObject.replyMessageObject.currentAccount).getCurrentUser();
                        }
                        if (currentUser != null) {
                            colorId4 = UserObject.getColorId(currentUser);
                            this.emojiDocumentId = UserObject.getEmojiId(currentUser);
                        } else {
                            colorId4 = 0;
                        }
                    } else if (messageObject.replyMessageObject.isFromUser()) {
                        TLRPC.User user4 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(messageObject.replyMessageObject.messageOwner.from_id.user_id));
                        if (!messageObject.isOutOwner() && i != 2 && user4 != null) {
                            TLRPC.PeerColor peerColor8 = user4.color;
                            if (peerColor8 instanceof TLRPC.TL_peerColorCollectible) {
                                return resolveCollectionColor(messageObject, (TLRPC.TL_peerColorCollectible) peerColor8, resourcesProvider);
                            }
                        }
                        if (user4 != null) {
                            colorId4 = UserObject.getColorId(user4);
                            this.emojiDocumentId = UserObject.getEmojiId(user4);
                        } else {
                            colorId4 = 0;
                        }
                    } else if (messageObject.replyMessageObject.isFromChannel()) {
                        TLRPC.Chat chat4 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(messageObject.replyMessageObject.messageOwner.from_id.channel_id));
                        if (!messageObject.isOutOwner() && i != 2 && chat4 != null) {
                            TLRPC.PeerColor peerColor9 = chat4.color;
                            if (peerColor9 instanceof TLRPC.TL_peerColorCollectible) {
                                return resolveCollectionColor(messageObject, (TLRPC.TL_peerColorCollectible) peerColor9, resourcesProvider);
                            }
                        }
                        if (chat4 != null) {
                            colorId4 = ChatObject.getColorId(chat4);
                            this.emojiDocumentId = ChatObject.getEmojiId(chat4);
                        } else {
                            colorId4 = 0;
                        }
                    } else {
                        colorId4 = 0;
                    }
                }
                resolveColor(resourcesProvider, colorId4, messageObject.replyMessageObject);
                this.backgroundColor = Theme.multAlpha(0.1f, this.color1);
                this.nameColor = this.color1;
            }
        } else {
            long j = MessageObject.getMedia(messageObject.messageOwner).user_id;
            TLRPC.User user5 = j != 0 ? MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(j)) : null;
            if (!messageObject.isOutOwner() && i != 2 && user5 != null) {
                TLRPC.PeerColor peerColor10 = user5.color;
                if (peerColor10 instanceof TLRPC.TL_peerColorCollectible) {
                    return resolveCollectionColor(messageObject, (TLRPC.TL_peerColorCollectible) peerColor10, resourcesProvider);
                }
            }
            if (user5 != null) {
                colorId2 = UserObject.getColorId(user5);
                this.emojiDocumentId = UserObject.getEmojiId(user5);
            } else {
                colorId2 = 0;
            }
            resolveColor(resourcesProvider, colorId2, messageObject);
            this.backgroundColor = Theme.multAlpha(0.1f, this.color1);
            this.nameColor = this.color1;
        }
        if (messageObject.shouldDrawWithoutBackground()) {
            this.hasColor2 = false;
            this.hasColor3 = false;
            this.color3 = -1;
            this.color2 = -1;
            this.color1 = -1;
            this.backgroundColor = 0;
            this.nameColor = Theme.getColor(Theme.key_chat_stickerReplyNameText, resourcesProvider);
        } else if (messageObject.isOutOwner() || i == 2) {
            if (i != 2 || messageObject.isOutOwner()) {
                int color4 = Theme.getColor((this.hasColor2 || this.hasColor3) ? Theme.key_chat_outReplyLine2 : Theme.key_chat_outReplyLine, resourcesProvider);
                this.color3 = color4;
                this.color2 = color4;
                this.color1 = color4;
            } else {
                int color5 = Theme.getColor(Theme.key_chat_inCodeBackground, resourcesProvider);
                this.color3 = color5;
                this.color2 = color5;
                this.color1 = color5;
            }
            if (this.hasColor3) {
                this.reversedOut = true;
                this.color1 = Theme.multAlpha(0.2f, this.color1);
                this.color2 = Theme.multAlpha(0.5f, this.color2);
            } else if (this.hasColor2) {
                this.reversedOut = true;
                this.color1 = Theme.multAlpha(0.35f, this.color1);
            }
            this.backgroundColor = Theme.multAlpha(zIsDark ? 0.12f : 0.1f, this.color3);
            this.nameColor = Theme.getColor(Theme.key_chat_outReplyNameText, resourcesProvider);
        }
        if (i == 0 || i == 3 || i == 4) {
            long j2 = messageObject.overrideLinkEmoji;
            if (j2 != -1) {
                this.emojiDocumentId = j2;
            }
        }
        if (this.emojiDocumentId != 0 && this.emoji == null && (view = this.parentView) != null) {
            this.emoji = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(view, false, AndroidUtilities.dp(20.0f), 13);
            if (!(view instanceof ChatMessageCell) ? view.isAttachedToWindow() : ((ChatMessageCell) view).attachedToWindow) {
                this.emoji.attach();
            }
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emoji;
        if (swapAnimatedEmojiDrawable != null) {
            z = true;
            if (swapAnimatedEmojiDrawable.set(this.emojiDocumentId, true)) {
                this.emojiLoaded = false;
            }
        } else {
            z = true;
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.sticker;
        if (swapAnimatedEmojiDrawable2 != null) {
            swapAnimatedEmojiDrawable2.set(this.stickerDocumentId, z);
        }
        this.emojiColor = getColor();
        return animatedColor.set(this.nameColor, false);
    }

    public final void drawBackground(Canvas canvas, RectF rectF, float f, float f2, float f3, float f4) {
        drawBackground(canvas, rectF, f, f2, f3, f4, false, false);
    }

    public final void drawLine(Canvas canvas, RectF rectF) {
        drawLine(canvas, rectF, 1.0f);
    }

    public final void drawLoadingBackground(Canvas canvas, RectF rectF, float f, float f2, float f3, float f4) {
        LoadingDrawable loadingDrawable;
        float fMax = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f));
        float[] fArr = this.radii;
        fArr[1] = fMax;
        fArr[0] = fMax;
        float fDp = AndroidUtilities.dp(f2);
        fArr[3] = fDp;
        fArr[2] = fDp;
        float fDp2 = AndroidUtilities.dp(f3);
        fArr[5] = fDp2;
        fArr[4] = fDp2;
        float fMax2 = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f3));
        fArr[7] = fMax2;
        fArr[6] = fMax2;
        if (!this.loading && ((loadingDrawable = this.backgroundLoadingDrawable) == null || !loadingDrawable.isDisappearing())) {
            LoadingDrawable loadingDrawable2 = this.backgroundLoadingDrawable;
            if (loadingDrawable2 != null) {
                loadingDrawable2.start = -1L;
                return;
            }
            return;
        }
        if (this.backgroundLoadingDrawable == null) {
            LoadingDrawable loadingDrawable3 = new LoadingDrawable();
            this.backgroundLoadingDrawable = loadingDrawable3;
            loadingDrawable3.appearByGradient = true;
            loadingDrawable3.gradientWidthScale = 3.5f;
            loadingDrawable3.speed = 0.5f;
        }
        this.backgroundLoadingDrawable.setColors(Theme.multAlpha(0.1f, this.color1), Theme.multAlpha(0.3f, this.color1), Theme.multAlpha(0.3f, this.color1), Theme.multAlpha(1.25f, this.color1));
        this.backgroundLoadingDrawable.setBounds(rectF);
        this.backgroundLoadingDrawable.setRadii(fArr);
        this.backgroundLoadingDrawable.strokePaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.backgroundLoadingDrawable.setAlpha((int) (f4 * 255.0f));
        this.backgroundLoadingDrawable.draw(canvas);
        View view = this.parentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getColor() {
        return this.reversedOut ? this.color2 : this.color1;
    }

    public final void offsetEmoji(float f) {
        this.emojiOffsetY = f;
    }

    public final int resolveCollectionColor(MessageObject messageObject, TLRPC.TL_peerColorCollectible tL_peerColorCollectible, Theme.ResourcesProvider resourcesProvider) {
        boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
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
        this.backgroundColor = Theme.multAlpha(0.1f, i2);
        long j = tL_peerColorCollectible.background_emoji_id;
        this.emojiDocumentId = j;
        this.stickerDocumentId = tL_peerColorCollectible.gift_emoji_id;
        View view = this.parentView;
        if (j != 0 && this.emoji == null && view != null) {
            this.emoji = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(view, false, AndroidUtilities.dp(20.0f), 13);
            if (!(view instanceof ChatMessageCell) ? view.isAttachedToWindow() : ((ChatMessageCell) view).attachedToWindow) {
                this.emoji.attach();
            }
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emoji;
        if (swapAnimatedEmojiDrawable != null && swapAnimatedEmojiDrawable.set(this.emojiDocumentId, true)) {
            this.emojiLoaded = false;
        }
        this.emojiColor = this.nameColor;
        if (this.stickerDocumentId != 0 && this.sticker == null && view != null) {
            this.sticker = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(view, false, AndroidUtilities.dp(20.0f), 13);
            if (!(view instanceof ChatMessageCell) ? view.isAttachedToWindow() : ((ChatMessageCell) view).attachedToWindow) {
                this.sticker.attach();
            }
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.sticker;
        if (swapAnimatedEmojiDrawable2 != null) {
            swapAnimatedEmojiDrawable2.set(this.stickerDocumentId, true);
        }
        return this.nameColorAnimated.set(this.nameColor, false);
    }

    public final void resolveColor(Theme.ResourcesProvider resourcesProvider, int i, MessageObject messageObject) {
        if (resourcesProvider != null) {
            resourcesProvider.isDark();
        } else {
            Theme.currentTheme.isDark();
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

    public final void setEmojiAlpha(float f) {
        this.emojiAlpha = f;
    }

    public final int setFactCheck(Theme.ResourcesProvider resourcesProvider) {
        View view;
        int i = Theme.key_text_RedBold;
        this.nameColor = Theme.getColor(i, resourcesProvider);
        this.color1 = Theme.getColor(i, resourcesProvider);
        this.hasColor2 = false;
        this.hasColor3 = false;
        this.backgroundColor = Theme.multAlpha(0.1f, Theme.getColor(i, resourcesProvider));
        if (this.emojiDocumentId != 0 && this.emoji == null && (view = this.parentView) != null) {
            this.emoji = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(view, false, AndroidUtilities.dp(20.0f), 13);
            if (!(view instanceof ChatMessageCell) ? view.isAttachedToWindow() : ((ChatMessageCell) view).attachedToWindow) {
                this.emoji.attach();
            }
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emoji;
        if (swapAnimatedEmojiDrawable != null && swapAnimatedEmojiDrawable.set(this.emojiDocumentId, true)) {
            this.emojiLoaded = false;
        }
        this.emojiColor = getColor();
        return this.nameColorAnimated.set(this.nameColor, false);
    }

    public final void setLoading(boolean z) {
        LoadingDrawable loadingDrawable;
        if (!z && this.loading) {
            this.loadingT = 0.0f;
            LoadingDrawable loadingDrawable2 = this.backgroundLoadingDrawable;
            if (loadingDrawable2 != null) {
                loadingDrawable2.disappear();
            }
        } else if (z && !this.loading && (loadingDrawable = this.backgroundLoadingDrawable) != null) {
            loadingDrawable.disappearStart = -1L;
            loadingDrawable.start = -1L;
        }
        this.loading = z;
    }

    public final void drawBackground(Canvas canvas, RectF rectF, float f, float f2, float f3, float f4, boolean z, boolean z2) {
        float fMax = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f));
        float[] fArr = this.radii;
        fArr[1] = fMax;
        fArr[0] = fMax;
        float fDp = AndroidUtilities.dp(f2);
        fArr[3] = fDp;
        fArr[2] = fDp;
        float fDp2 = AndroidUtilities.dp(f3);
        fArr[5] = fDp2;
        fArr[4] = fDp2;
        float fMax2 = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f3));
        fArr[7] = fMax2;
        fArr[6] = fMax2;
        drawBackground(canvas, rectF, f4, z, z2);
    }

    public final void drawLine(Canvas canvas, RectF rectF, float f) {
        float fHeight;
        int iDp;
        int i;
        int i2;
        float f2;
        int iFloor = (int) Math.floor(SharedConfig.bubbleRadius / (this.sponsored ? 2.0f : 3.0f));
        float fMax = rectF.left + Math.max(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(iFloor * 2));
        int i3 = this.color1Animated.set(this.color1, false);
        Paint paint = this.color1Paint;
        paint.setColor(Theme.multAlpha(f, i3));
        boolean z = this.loading;
        AnimatedFloat animatedFloat = this.loadingStateT;
        float f3 = animatedFloat.set(z);
        float f4 = this.color2Alpha.set(this.hasColor2);
        float f5 = this.color3Alpha.set(this.hasColor3);
        RectF rectF2 = this.rectF;
        if (f3 > 0.0f && !this.hasColor2) {
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * 0.3f));
            rectF2.set(rectF.left, rectF.top, fMax, rectF.bottom);
            canvas.save();
            float f6 = rectF2.left;
            canvas.clipRect(f6, rectF2.top, AndroidUtilities.dp(3.0f) + f6, rectF2.bottom);
            float f7 = iFloor;
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), paint);
            paint.setAlpha(alpha);
            long jCurrentTimeMillis = System.currentTimeMillis();
            float f8 = animatedFloat.set(this.loading);
            this.loadingT = (Math.min(30L, jCurrentTimeMillis - this.lastLoadingTTime) * f8) + this.loadingT;
            this.loadingTranslationT = (Math.min(30L, jCurrentTimeMillis - this.lastLoadingTTime) * f8) + this.loadingTranslationT;
            this.lastLoadingTTime = jCurrentTimeMillis;
            float fPow = ((float) Math.pow((this.loadingT / 240.0f) / 4.0f, 0.8500000238418579d)) * 4.0f;
            rectF2.set(rectF.left, (AndroidUtilities.lerp(0.0f, 1.0f - CubicBezierInterpolator.EASE_IN.getInterpolation(MathUtils.clamp(((Math.max(fPow, 0.5f) + 1.5f) % 3.5f) * 0.5f, 0.0f, 1.0f)), f3) * rectF.height()) + rectF.top, rectF.left + AndroidUtilities.dp(6.0f), (AndroidUtilities.lerp(1.0f, 1.0f - CubicBezierInterpolator.EASE_OUT.getInterpolation(MathUtils.clamp((((fPow + 1.5f) % 3.5f) - 1.5f) * 0.5f, 0.0f, 1.0f)), f3) * rectF.height()) + rectF.top);
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
            canvas.restore();
            View view = this.parentView;
            if (view != null) {
                view.invalidate();
                return;
            }
            return;
        }
        if (f4 <= 0.0f) {
            rectF2.set(rectF.left, rectF.top, fMax, rectF.bottom);
            canvas.save();
            float f9 = rectF2.left;
            canvas.clipRect(f9, rectF2.top, AndroidUtilities.dp(3.0f) + f9, rectF2.bottom);
            float f10 = iFloor;
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), paint);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        float f11 = animatedFloat.set(this.loading);
        this.loadingT = (Math.min(30L, jCurrentTimeMillis2 - this.lastLoadingTTime) * f11) + this.loadingT;
        this.loadingTranslationT = (Math.min(30L, jCurrentTimeMillis2 - this.lastLoadingTTime) * f11) + this.loadingTranslationT;
        this.lastLoadingTTime = jCurrentTimeMillis2;
        if (this.hasColor3) {
            fHeight = rectF.height();
            int iHeight = (int) rectF.height();
            iDp = AndroidUtilities.dp(18.99f);
            i = iHeight % iDp;
            if (i == 0) {
                i2 = 0;
            } else if ((((iHeight ^ iDp) >> 31) | 1) > 0) {
                i2 = i;
            } else {
                i2 = i + iDp;
            }
        } else {
            fHeight = rectF.height();
            int iHeight2 = (int) rectF.height();
            iDp = AndroidUtilities.dp(12.66f);
            i = iHeight2 % iDp;
            if (i == 0) {
                i2 = 0;
            } else if ((((iHeight2 ^ iDp) >> 31) | 1) > 0) {
                i2 = i;
            } else {
                i2 = i + iDp;
            }
        }
        float fDp = ((((this.switchStateT.set(this.switchedCount * 425, false) + this.loadingTranslationT) + (this.reversedOut ? 100 : 0)) / 1000.0f) * AndroidUtilities.dp(30.0f)) % (fHeight - i2);
        int i4 = this.color2Animated.set(this.color2, false);
        int i5 = this.color3Animated.set(this.color3, false);
        int iMultAlpha = Theme.multAlpha(f, i3);
        int iCompositeColors = ColorUtils.compositeColors(Theme.multAlpha(f4 * f, i4), iMultAlpha);
        int iCompositeColors2 = this.hasColor3 ? ColorUtils.compositeColors(Theme.multAlpha(f * f5, i5), iMultAlpha) : 0;
        int iRound = Math.round(AndroidUtilities.dpf2(6.33f));
        int iMax = Math.max(1, AndroidUtilities.dp(3.0f));
        int iDp2 = this.hasColor3 ? AndroidUtilities.dp(18.99f) : AndroidUtilities.dp(12.66f);
        Bitmap bitmap = this.patternBitmap;
        Paint paint2 = this.patternPaint;
        if (bitmap != null && this.cachedBg == iMultAlpha && this.cachedBar2 == iCompositeColors && this.cachedBar3 == iCompositeColors2) {
            f2 = fMax;
            if (this.cachedHasColor3 != this.hasColor3 || this.cachedBarHeight != iRound || bitmap.getWidth() != iMax || this.patternBitmap.getHeight() != iDp2) {
            }
            Matrix matrix = this.shaderMatrix;
            matrix.setTranslate(0.0f, -fDp);
            paint2.getShader().setLocalMatrix(matrix);
            paint2.setAlpha(255);
            rectF2.set(0.0f, 0.0f, f2 - rectF.left, rectF.bottom - rectF.top);
            float f12 = rectF2.left;
            canvas.clipRect(f12, rectF2.top, AndroidUtilities.dp(3.0f) + f12, rectF2.bottom);
            float f13 = iFloor;
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(f13), AndroidUtilities.dp(f13), paint2);
            canvas.restore();
        }
        f2 = fMax;
        this.cachedBg = iMultAlpha;
        this.cachedBar2 = iCompositeColors;
        this.cachedBar3 = iCompositeColors2;
        this.cachedHasColor3 = this.hasColor3;
        this.cachedBarHeight = iRound;
        Bitmap bitmap2 = this.patternBitmap;
        if (bitmap2 == null || bitmap2.getWidth() != iMax || this.patternBitmap.getHeight() != iDp2) {
            Bitmap bitmap3 = this.patternBitmap;
            if (bitmap3 != null) {
                bitmap3.recycle();
            }
            this.patternBitmap = Bitmap.createBitmap(iMax, iDp2, Bitmap.Config.ARGB_8888);
            paint2.setShader(new BitmapShader(this.patternBitmap, Shader.TileMode.CLAMP, Shader.TileMode.REPEAT));
        }
        Utilities.drawReplyLinePattern(this.patternBitmap, iMultAlpha, iCompositeColors, iCompositeColors2, iRound, this.hasColor3);
        Matrix matrix2 = this.shaderMatrix;
        matrix2.setTranslate(0.0f, -fDp);
        paint2.getShader().setLocalMatrix(matrix2);
        paint2.setAlpha(255);
        rectF2.set(0.0f, 0.0f, f2 - rectF.left, rectF.bottom - rectF.top);
        float f14 = rectF2.left;
        canvas.clipRect(f14, rectF2.top, AndroidUtilities.dp(3.0f) + f14, rectF2.bottom);
        float f15 = iFloor;
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(f15), AndroidUtilities.dp(f15), paint2);
        canvas.restore();
    }

    public final void drawBackground(Canvas canvas, RectF rectF, float f, boolean z, boolean z2) {
        boolean z3;
        PhotoViewer.AnonymousClass11 anonymousClass11;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable;
        if (!z2) {
            Paint paint = this.backgroundPaint;
            paint.setColor(Theme.multAlpha(f, this.backgroundColorAnimated.set(this.backgroundColor, false)));
            float[] fArr = this.radii;
            if (FBool.radiiAreSame(fArr)) {
                float f2 = fArr[0];
                canvas.drawRoundRect(rectF, f2, f2, paint);
            } else {
                Path path = this.backgroundPath;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.emoji;
        if (swapAnimatedEmojiDrawable2 == null) {
            return;
        }
        if (this.emojiLoaded) {
            z3 = true;
        } else {
            Drawable drawable = swapAnimatedEmojiDrawable2.drawables[0];
            if ((drawable instanceof AnimatedEmojiDrawable) && (anonymousClass11 = ((AnimatedEmojiDrawable) drawable).imageReceiver) != null && anonymousClass11.hasImageLoaded()) {
                this.emojiLoaded = true;
                z3 = true;
            } else {
                z3 = false;
            }
        }
        float f3 = this.emojiLoadedT.set(z3);
        if (f3 <= 0.0f || this.emojiAlpha <= 0.0f) {
            return;
        }
        if (this.iconCoords == null) {
            IconCoords iconCoords = new IconCoords(4.0f, -6.33f, 1.0f, 1.0f);
            IconCoords iconCoords2 = new IconCoords(30.0f, 3.0f, 0.78f, 0.9f);
            IconCoords iconCoords3 = new IconCoords(46.0f, -17.0f, 0.6f, 0.6f);
            IconCoords iconCoords4 = new IconCoords(69.66f, -0.666f, 0.87f, 0.7f);
            IconCoords iconCoords5 = new IconCoords(98.0f, -12.6f, 1.03f, 0.3f);
            IconCoords iconCoords6 = new IconCoords(51.0f, 24.0f, 1.0f, 0.5f);
            IconCoords iconCoords7 = new IconCoords(6.33f, 20.0f, 0.77f, 0.7f);
            IconCoords iconCoords8 = new IconCoords(-19.0f, 12.0f, 0.8f, 0.6f);
            iconCoords8.q = true;
            IconCoords iconCoords9 = new IconCoords(-22.0f, 36.0f, 0.7f, 0.5f);
            iconCoords9.q = true;
            this.iconCoords = new IconCoords[]{iconCoords, iconCoords2, iconCoords3, iconCoords4, iconCoords5, iconCoords6, iconCoords7, iconCoords8, iconCoords9};
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, this.emojiOffsetY);
        float fMax = Math.max(rectF.right - AndroidUtilities.dp(15.0f), rectF.centerX());
        if (z) {
            fMax -= AndroidUtilities.dp(12.0f);
        }
        float fMin = Math.min(rectF.centerY(), rectF.top + AndroidUtilities.dp(21.0f));
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable3 = this.sticker;
        if (swapAnimatedEmojiDrawable3 != null) {
            swapAnimatedEmojiDrawable3.alpha = (int) (f * 255.0f);
        }
        this.emoji.setColor(Integer.valueOf(this.emojiColor));
        int i = 0;
        while (true) {
            IconCoords[] iconCoordsArr = this.iconCoords;
            if (i < iconCoordsArr.length) {
                if (i != 0 || (swapAnimatedEmojiDrawable = this.sticker) == null || this.stickerDocumentId == 0) {
                    swapAnimatedEmojiDrawable = this.emoji;
                }
                IconCoords iconCoords10 = iconCoordsArr[i];
                if (!iconCoords10.q || z) {
                    swapAnimatedEmojiDrawable.alpha = (int) ((swapAnimatedEmojiDrawable == this.sticker ? 1.0f : 0.3f) * 255.0f * iconCoords10.a * this.emojiAlpha);
                    float fDp = fMax - AndroidUtilities.dp(iconCoords10.x);
                    float fDp2 = AndroidUtilities.dp(iconCoords10.y) + fMin;
                    float fDp3 = AndroidUtilities.dp(10.0f) * iconCoords10.s * f3;
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
}
