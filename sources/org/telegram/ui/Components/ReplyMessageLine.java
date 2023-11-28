package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import androidx.core.math.MathUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatInvite;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageFwdHeader;
import org.telegram.tgnet.TLRPC$MessageReplyHeader;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$TL_chatInvite;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
public class ReplyMessageLine {
    private int backgroundColor;
    public final AnimatedColor backgroundColorAnimated;
    private LoadingDrawable backgroundLoadingDrawable;
    private int color1;
    public final AnimatedColor color1Animated;
    private int color2;
    public final AnimatedFloat color2Alpha;
    public final AnimatedColor color2Animated;
    private int color3;
    public final AnimatedFloat color3Alpha;
    public final AnimatedColor color3Animated;
    private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emoji;
    private long emojiDocumentId;
    private boolean emojiLoaded;
    public final AnimatedFloat emojiLoadedT;
    public boolean hasColor2;
    public boolean hasColor3;
    private IconCoords[] iconCoords;
    private boolean lastHasColor3;
    private float lastHeight;
    private long lastLoadingTTime;
    private boolean loading;
    public final AnimatedFloat loadingStateT;
    private float loadingT;
    private float loadingTranslationT;
    private int nameColor;
    public final AnimatedColor nameColorAnimated;
    private final View parentView;
    private boolean reversedOut;
    public final AnimatedFloat switchStateT;
    private int wasColorId;
    private int wasMessageId;
    private final RectF rectF = new RectF();
    private final Path clipPath = new Path();
    private final Paint color1Paint = new Paint(1);
    private final Paint color2Paint = new Paint(1);
    private final Paint color3Paint = new Paint(1);
    public final float[] radii = new float[8];
    private final Path lineClipPath = new Path();
    private final Path backgroundPath = new Path();
    private final Paint backgroundPaint = new Paint();
    private Path color2Path = new Path();
    private Path color3Path = new Path();
    private int switchedCount = 0;

    public ReplyMessageLine(View view) {
        this.parentView = view;
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            @Override
            public void onViewAttachedToWindow(View view2) {
                if (ReplyMessageLine.this.emoji != null) {
                    ReplyMessageLine.this.emoji.attach();
                }
            }

            @Override
            public void onViewDetachedFromWindow(View view2) {
                if (ReplyMessageLine.this.emoji != null) {
                    ReplyMessageLine.this.emoji.detach();
                }
            }
        });
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

    private void resolveColor(MessageObject messageObject, int i, Theme.ResourcesProvider resourcesProvider) {
        boolean isDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.isCurrentThemeDark();
        if (this.wasColorId != i) {
            int id = messageObject != null ? messageObject.getId() : 0;
            if (id == this.wasMessageId) {
                this.switchedCount++;
            }
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
        this.color1 = color2.getColor1(isDark);
        this.color2 = color2.getColor2(isDark);
        int color32 = color2.getColor3(isDark);
        this.color3 = color32;
        int i2 = this.color2;
        int i3 = this.color1;
        this.hasColor2 = i2 != i3;
        boolean z = color32 != i3;
        this.hasColor3 = z;
        if (z) {
            this.color3 = i2;
            this.color2 = color32;
        }
    }

    public int check(MessageObject messageObject, TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat, Theme.ResourcesProvider resourcesProvider, int i) {
        TLRPC$Chat chat;
        TLRPC$Message tLRPC$Message;
        TLRPC$MessageReplyHeader tLRPC$MessageReplyHeader;
        TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader;
        MessageObject messageObject2;
        TLRPC$Message tLRPC$Message2;
        TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader2;
        TLRPC$Peer tLRPC$Peer;
        TLRPC$ChatInvite tLRPC$ChatInvite;
        TLRPC$Chat tLRPC$Chat2;
        TLRPC$Message tLRPC$Message3;
        TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader3;
        TLRPC$ChatInvite tLRPC$ChatInvite2;
        boolean isDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.isCurrentThemeDark();
        this.reversedOut = false;
        this.emojiDocumentId = 0L;
        if (messageObject == null) {
            this.hasColor3 = false;
            this.hasColor2 = false;
            int color = Theme.getColor(Theme.key_chat_inReplyLine, resourcesProvider);
            this.color3 = color;
            this.color2 = color;
            this.color1 = color;
            this.backgroundColor = Theme.multAlpha(color, isDark ? 0.12f : 0.1f);
            AnimatedColor animatedColor = this.nameColorAnimated;
            int color2 = Theme.getColor(Theme.key_chat_inReplyNameText, resourcesProvider);
            this.nameColor = color2;
            return animatedColor.set(color2);
        }
        if (i != 0 && (messageObject.overrideLinkColor >= 0 || (messageObject.messageOwner != null && (((messageObject.isFromUser() || DialogObject.isEncryptedDialog(messageObject.getDialogId())) && tLRPC$User != null) || ((messageObject.isFromChannel() && tLRPC$Chat != null) || ((messageObject.isSponsored() && (messageObject.sponsoredChatInvite instanceof TLRPC$TL_chatInvite)) || ((messageObject.isSponsored() && (tLRPC$ChatInvite2 = messageObject.sponsoredChatInvite) != null && tLRPC$ChatInvite2.chat != null) || ((tLRPC$Message3 = messageObject.messageOwner) != null && (tLRPC$MessageFwdHeader3 = tLRPC$Message3.fwd_from) != null && tLRPC$MessageFwdHeader3.from_id != null)))))))) {
            int i2 = 5;
            int i3 = messageObject.overrideLinkColor;
            if (i3 < 0) {
                if (messageObject.isSponsored()) {
                    TLRPC$ChatInvite tLRPC$ChatInvite3 = messageObject.sponsoredChatInvite;
                    if (tLRPC$ChatInvite3 instanceof TLRPC$TL_chatInvite) {
                        i3 = tLRPC$ChatInvite3.color;
                    }
                }
                if (messageObject.isSponsored() && (tLRPC$ChatInvite = messageObject.sponsoredChatInvite) != null && (tLRPC$Chat2 = tLRPC$ChatInvite.chat) != null) {
                    i3 = ChatObject.getColorId(tLRPC$Chat2);
                } else {
                    TLRPC$Message tLRPC$Message4 = messageObject.messageOwner;
                    if (tLRPC$Message4 != null && (tLRPC$MessageFwdHeader2 = tLRPC$Message4.fwd_from) != null && (tLRPC$Peer = tLRPC$MessageFwdHeader2.from_id) != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(tLRPC$Peer);
                        if (peerDialogId < 0) {
                            TLRPC$Chat chat2 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-peerDialogId));
                            if (chat2 != null) {
                                i2 = ChatObject.getColorId(chat2);
                            }
                        } else {
                            TLRPC$User user = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(peerDialogId));
                            if (user != null) {
                                i2 = UserObject.getColorId(user);
                            }
                        }
                        i3 = i2;
                    } else if (DialogObject.isEncryptedDialog(messageObject.getDialogId()) && tLRPC$User != null) {
                        TLRPC$User currentUser = messageObject.isOutOwner() ? UserConfig.getInstance(messageObject.currentAccount).getCurrentUser() : tLRPC$User;
                        if (currentUser != null) {
                            tLRPC$User = currentUser;
                        }
                        i3 = UserObject.getColorId(tLRPC$User);
                    } else if (messageObject.isFromUser() && tLRPC$User != null) {
                        i3 = UserObject.getColorId(tLRPC$User);
                    } else {
                        i3 = (!messageObject.isFromChannel() || tLRPC$Chat == null) ? 0 : ChatObject.getColorId(tLRPC$Chat);
                    }
                }
            }
            resolveColor(messageObject, i3, resourcesProvider);
            this.backgroundColor = Theme.multAlpha(this.color1, 0.1f);
            this.nameColor = this.color1;
        } else if (i == 0 && (messageObject.overrideLinkColor >= 0 || ((tLRPC$Message = messageObject.messageOwner) != null && messageObject.replyMessageObject != null && (tLRPC$MessageReplyHeader = tLRPC$Message.reply_to) != null && (((tLRPC$MessageFwdHeader = tLRPC$MessageReplyHeader.reply_from) == null || TextUtils.isEmpty(tLRPC$MessageFwdHeader.from_name)) && (tLRPC$Message2 = (messageObject2 = messageObject.replyMessageObject).messageOwner) != null && tLRPC$Message2.from_id != null && (messageObject2.isFromUser() || DialogObject.isEncryptedDialog(messageObject.getDialogId()) || messageObject.replyMessageObject.isFromChannel()))))) {
            int i4 = messageObject.overrideLinkColor;
            if (i4 < 0) {
                if (DialogObject.isEncryptedDialog(messageObject.replyMessageObject.getDialogId())) {
                    if (messageObject.replyMessageObject.isOutOwner()) {
                        tLRPC$User = UserConfig.getInstance(messageObject.replyMessageObject.currentAccount).getCurrentUser();
                    }
                    if (tLRPC$User != null) {
                        i4 = UserObject.getColorId(tLRPC$User);
                        this.emojiDocumentId = UserObject.getEmojiId(tLRPC$User);
                    }
                    i4 = 0;
                } else if (messageObject.replyMessageObject.isFromUser()) {
                    TLRPC$User user2 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(messageObject.replyMessageObject.messageOwner.from_id.user_id));
                    if (user2 != null) {
                        i4 = UserObject.getColorId(user2);
                        this.emojiDocumentId = UserObject.getEmojiId(user2);
                    }
                    i4 = 0;
                } else {
                    if (messageObject.replyMessageObject.isFromChannel() && (chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(messageObject.replyMessageObject.messageOwner.from_id.channel_id))) != null) {
                        i4 = ChatObject.getColorId(chat);
                        this.emojiDocumentId = ChatObject.getEmojiId(chat);
                    }
                    i4 = 0;
                }
            }
            resolveColor(messageObject.replyMessageObject, i4, resourcesProvider);
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
        } else if (messageObject.isOutOwner()) {
            int color4 = Theme.getColor((this.hasColor2 || this.hasColor3) ? Theme.key_chat_outReplyLine2 : Theme.key_chat_outReplyLine, resourcesProvider);
            this.color3 = color4;
            this.color2 = color4;
            this.color1 = color4;
            if (this.hasColor3) {
                this.reversedOut = true;
                this.color1 = Theme.multAlpha(color4, 0.2f);
                this.color2 = Theme.multAlpha(this.color2, 0.5f);
            } else if (this.hasColor2) {
                this.reversedOut = true;
                this.color1 = Theme.multAlpha(color4, 0.35f);
            }
            this.backgroundColor = Theme.multAlpha(this.color3, isDark ? 0.12f : 0.1f);
            this.nameColor = Theme.getColor(Theme.key_chat_outReplyNameText, resourcesProvider);
        }
        if (i == 0) {
            long j = messageObject.overrideLinkEmoji;
            if (j != -1) {
                this.emojiDocumentId = j;
            }
        }
        if (this.emojiDocumentId != 0 && this.emoji == null) {
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
        return this.nameColorAnimated.set(this.nameColor);
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
        long currentTimeMillis = System.currentTimeMillis();
        float f = this.loadingStateT.set(this.loading);
        this.loadingT += ((float) Math.min(30L, currentTimeMillis - this.lastLoadingTTime)) * f;
        this.loadingTranslationT += ((float) Math.min(30L, currentTimeMillis - this.lastLoadingTTime)) * f;
        this.lastLoadingTTime = currentTimeMillis;
    }

    public void drawLine(Canvas canvas, RectF rectF) {
        drawLine(canvas, rectF, 1.0f);
    }

    public void drawLine(Canvas canvas, RectF rectF, float f) {
        boolean z;
        float height;
        int m;
        canvas.save();
        this.clipPath.rewind();
        int floor = (int) Math.floor(SharedConfig.bubbleRadius / 3.0f);
        RectF rectF2 = this.rectF;
        float f2 = rectF.left;
        rectF2.set(f2, rectF.top, Math.max(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(floor * 2)) + f2, rectF.bottom);
        float f3 = floor;
        this.clipPath.addRoundRect(this.rectF, AndroidUtilities.dp(f3), AndroidUtilities.dp(f3), Path.Direction.CW);
        canvas.clipPath(this.clipPath);
        float f4 = rectF.left;
        canvas.clipRect(f4, rectF.top, AndroidUtilities.dp(3.0f) + f4, rectF.bottom);
        this.color1Paint.setColor(Theme.multAlpha(this.color1Animated.set(this.color1), f));
        this.color2Paint.setColor(Theme.multAlpha(this.color2Animated.set(this.color2), f));
        this.color3Paint.setColor(Theme.multAlpha(this.color3Animated.set(this.color3), f));
        float f5 = this.loadingStateT.set(this.loading);
        if (f5 <= 0.0f || this.hasColor2) {
            z = false;
        } else {
            canvas.save();
            int alpha = this.color1Paint.getAlpha();
            this.color1Paint.setAlpha((int) (alpha * 0.3f));
            canvas.drawPaint(this.color1Paint);
            this.color1Paint.setAlpha(alpha);
            incrementLoadingT();
            float pow = ((float) Math.pow((this.loadingT / 240.0f) / 4.0f, 0.8500000238418579d)) * 4.0f;
            this.rectF.set(rectF.left, rectF.top + (rectF.height() * AndroidUtilities.lerp(0.0f, 1.0f - CubicBezierInterpolator.EASE_IN.getInterpolation(MathUtils.clamp(((Math.max(pow, 0.5f) + 1.5f) % 3.5f) * 0.5f, 0.0f, 1.0f)), f5)), rectF.left + AndroidUtilities.dp(6.0f), rectF.top + (rectF.height() * AndroidUtilities.lerp(1.0f, 1.0f - CubicBezierInterpolator.EASE_OUT.getInterpolation(MathUtils.clamp((((pow + 1.5f) % 3.5f) - 1.5f) * 0.5f, 0.0f, 1.0f)), f5)));
            this.lineClipPath.rewind();
            this.lineClipPath.addRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), Path.Direction.CW);
            canvas.clipPath(this.lineClipPath);
            z = true;
            this.parentView.invalidate();
        }
        canvas.drawPaint(this.color1Paint);
        float f6 = this.color2Alpha.set(this.hasColor2);
        if (f6 > 0.0f) {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            incrementLoadingT();
            float f7 = this.color3Alpha.set(this.hasColor3);
            if (this.hasColor3) {
                height = rectF.height();
                m = ReplyMessageLine$$ExternalSyntheticBackport0.m((int) rectF.height(), AndroidUtilities.dp(18.99f));
            } else {
                height = rectF.height();
                m = ReplyMessageLine$$ExternalSyntheticBackport0.m((int) rectF.height(), AndroidUtilities.dp(12.66f));
            }
            canvas.translate(0.0f, -(((((this.loadingTranslationT + this.switchStateT.set(this.switchedCount * 425)) + (this.reversedOut ? 100 : 0)) / 1000.0f) * AndroidUtilities.dp(30.0f)) % (height - m)));
            checkColorPathes(rectF.height() * 2.0f);
            int alpha2 = this.color2Paint.getAlpha();
            this.color2Paint.setAlpha((int) (alpha2 * f6));
            canvas.drawPath(this.color2Path, this.color2Paint);
            this.color2Paint.setAlpha(alpha2);
            int alpha3 = this.color3Paint.getAlpha();
            this.color3Paint.setAlpha((int) (alpha3 * f7));
            canvas.drawPath(this.color3Path, this.color3Paint);
            this.color3Paint.setAlpha(alpha3);
            canvas.restore();
        }
        if (z) {
            canvas.restore();
        }
        canvas.restore();
    }

    public void drawBackground(Canvas canvas, RectF rectF, float f, float f2, float f3, float f4) {
        drawBackground(canvas, rectF, f, f2, f3, f4, false, false);
    }

    public void drawBackground(Canvas canvas, RectF rectF, float f, float f2, float f3, float f4, boolean z, boolean z2) {
        float[] fArr = this.radii;
        float max = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f));
        fArr[1] = max;
        fArr[0] = max;
        float[] fArr2 = this.radii;
        float dp = AndroidUtilities.dp(f2);
        fArr2[3] = dp;
        fArr2[2] = dp;
        float[] fArr3 = this.radii;
        float dp2 = AndroidUtilities.dp(f3);
        fArr3[5] = dp2;
        fArr3[4] = dp2;
        float[] fArr4 = this.radii;
        float max2 = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f3));
        fArr4[7] = max2;
        fArr4[6] = max2;
        drawBackground(canvas, rectF, f4, z, z2);
    }

    public static class IconCoords {
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

    public void drawBackground(Canvas canvas, RectF rectF, float f, boolean z, boolean z2) {
        if (!z2) {
            this.backgroundPath.rewind();
            this.backgroundPath.addRoundRect(rectF, this.radii, Path.Direction.CW);
            this.backgroundPaint.setColor(this.backgroundColorAnimated.set(this.backgroundColor));
            Paint paint = this.backgroundPaint;
            paint.setAlpha((int) (paint.getAlpha() * f));
            canvas.drawPath(this.backgroundPath, this.backgroundPaint);
        }
        if (this.emoji == null) {
            return;
        }
        float f2 = this.emojiLoadedT.set(isEmojiLoaded());
        if (f2 <= 0.0f) {
            return;
        }
        if (this.iconCoords == null) {
            this.iconCoords = new IconCoords[]{new IconCoords(4.0f, -6.33f, 1.0f, 1.0f), new IconCoords(30.0f, 3.0f, 0.78f, 0.9f), new IconCoords(46.0f, -17.0f, 0.6f, 0.6f), new IconCoords(69.66f, -0.666f, 0.87f, 0.7f), new IconCoords(107.0f, -12.6f, 1.03f, 0.3f), new IconCoords(51.0f, 24.0f, 1.0f, 0.5f), new IconCoords(6.33f, 20.0f, 0.77f, 0.7f), new IconCoords(-19.0f, 12.0f, 0.8f, 0.6f, true), new IconCoords(26.0f, 42.0f, 0.78f, 0.9f), new IconCoords(-22.0f, 36.0f, 0.7f, 0.5f, true), new IconCoords(-1.0f, 48.0f, 1.0f, 0.4f)};
        }
        canvas.save();
        canvas.clipRect(rectF);
        float max = Math.max(rectF.right - AndroidUtilities.dp(15.0f), rectF.centerX());
        if (z) {
            max -= AndroidUtilities.dp(12.0f);
        }
        float min = Math.min(rectF.centerY(), rectF.top + AndroidUtilities.dp(21.0f));
        this.emoji.setColor(Integer.valueOf(getColor()));
        this.emoji.setAlpha((int) (255.0f * f * (rectF.width() < ((float) AndroidUtilities.dp(140.0f)) ? 0.3f : 0.5f)));
        int i = 0;
        while (true) {
            IconCoords[] iconCoordsArr = this.iconCoords;
            if (i < iconCoordsArr.length) {
                IconCoords iconCoords = iconCoordsArr[i];
                if (!iconCoords.q || z) {
                    this.emoji.setAlpha((int) (iconCoords.a * 76.5f));
                    float dp = max - AndroidUtilities.dp(iconCoords.x);
                    float dp2 = AndroidUtilities.dp(iconCoords.y) + min;
                    float dp3 = AndroidUtilities.dp(10.0f) * iconCoords.s * f2;
                    this.emoji.setBounds((int) (dp - dp3), (int) (dp2 - dp3), (int) (dp + dp3), (int) (dp2 + dp3));
                    this.emoji.draw(canvas);
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
        float max = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f));
        fArr[1] = max;
        fArr[0] = max;
        float[] fArr2 = this.radii;
        float dp = AndroidUtilities.dp(f2);
        fArr2[3] = dp;
        fArr2[2] = dp;
        float[] fArr3 = this.radii;
        float dp2 = AndroidUtilities.dp(f3);
        fArr3[5] = dp2;
        fArr3[4] = dp2;
        float[] fArr4 = this.radii;
        float max2 = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f3));
        fArr4[7] = max2;
        fArr4[6] = max2;
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
            this.parentView.invalidate();
            return;
        }
        LoadingDrawable loadingDrawable3 = this.backgroundLoadingDrawable;
        if (loadingDrawable3 != null) {
            loadingDrawable3.reset();
        }
    }

    private void checkColorPathes(float f) {
        if (Math.abs(this.lastHeight - f) > 3.0f || this.lastHasColor3 != this.hasColor3) {
            float dpf2 = AndroidUtilities.dpf2(3.0f);
            float dpf22 = AndroidUtilities.dpf2(6.33f);
            float dpf23 = AndroidUtilities.dpf2(3.0f);
            float dpf24 = AndroidUtilities.dpf2(3.33f);
            float f2 = dpf24 + dpf23;
            this.color2Path.rewind();
            float f3 = f2;
            while (f3 < f) {
                float f4 = dpf2 + 1.0f;
                this.color2Path.moveTo(f4, f3 - 1.0f);
                float f5 = f3 + dpf22;
                this.color2Path.lineTo(f4, f5);
                this.color2Path.lineTo(0.0f, f5 + dpf23);
                this.color2Path.lineTo(0.0f, f3 + dpf23);
                this.color2Path.close();
                f3 += dpf22 + dpf23 + dpf24;
                if (this.hasColor3) {
                    f3 += dpf22;
                }
            }
            if (this.hasColor3) {
                this.color3Path.rewind();
                for (float f6 = f2 + dpf22; f6 < f; f6 += dpf22 + dpf23 + dpf24 + dpf22) {
                    float f7 = dpf2 + 1.0f;
                    this.color3Path.moveTo(f7, f6 - 1.0f);
                    float f8 = f6 + dpf22;
                    this.color3Path.lineTo(f7, f8);
                    this.color3Path.lineTo(0.0f, f8 + dpf23);
                    this.color3Path.lineTo(0.0f, f6 + dpf23);
                    this.color3Path.close();
                }
            }
            this.lastHeight = f;
            this.lastHasColor3 = this.hasColor3;
        }
    }
}
