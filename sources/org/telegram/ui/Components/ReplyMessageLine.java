package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import androidx.core.math.MathUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatInvite;
import org.telegram.tgnet.TLRPC$Message;
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
    private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emoji;
    private long emojiDocumentId;
    public boolean hasColor2;
    private IconCoords[] iconCoords;
    private float lastColor2Height;
    private long lastLoadingTTime;
    private float lineTranslationT;
    private boolean loading;
    private float loadingT;
    private int nameColor;
    public final AnimatedColor nameColorAnimated;
    private final View parentView;
    private boolean reversedOut;
    private final RectF rectF = new RectF();
    private final Path clipPath = new Path();
    private final Paint color1Paint = new Paint();
    private final Paint color2Paint = new Paint();
    public final float[] radii = new float[8];
    private final Path lineClipPath = new Path();
    private final Path backgroundPath = new Path();
    private final Paint backgroundPaint = new Paint();
    private Path color2Path = new Path();

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
        this.nameColorAnimated = new AnimatedColor(view, 0L, 400L, cubicBezierInterpolator);
        this.color2Alpha = new AnimatedFloat(view, 0L, 400L, cubicBezierInterpolator);
    }

    public int getColor() {
        return this.reversedOut ? this.color2 : this.color1;
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public int check(MessageObject messageObject, TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat, Theme.ResourcesProvider resourcesProvider, boolean z) {
        int nameColorKey1For;
        int nameColorKey2For;
        int nameColorKey1For2;
        int nameColorKey2For2;
        MessageObject messageObject2;
        TLRPC$Message tLRPC$Message;
        int nameColorKey1For3;
        int nameColorKey2For3;
        TLRPC$ChatInvite tLRPC$ChatInvite;
        TLRPC$Chat tLRPC$Chat2;
        TLRPC$ChatInvite tLRPC$ChatInvite2;
        this.reversedOut = false;
        this.emojiDocumentId = 0L;
        if (messageObject == null) {
            this.hasColor2 = false;
            int color = Theme.getColor(Theme.key_chat_inReplyLine, resourcesProvider);
            this.color2 = color;
            this.color1 = color;
            this.backgroundColor = Theme.multAlpha(color, Theme.isCurrentThemeDark() ? 0.12f : 0.1f);
            AnimatedColor animatedColor = this.nameColorAnimated;
            int color2 = Theme.getColor(Theme.key_chat_inReplyNameText, resourcesProvider);
            this.nameColor = color2;
            return animatedColor.set(color2);
        }
        if (messageObject.shouldDrawWithoutBackground()) {
            this.hasColor2 = false;
            this.color2 = -1;
            this.color1 = -1;
            this.backgroundColor = 0;
            this.nameColor = Theme.getColor(Theme.key_chat_stickerReplyNameText, resourcesProvider);
        } else if (!z && (messageObject.overrideLinkColor >= 0 || (messageObject.messageOwner != null && ((messageObject.isFromUser() && tLRPC$User != null) || ((messageObject.isFromChannel() && tLRPC$Chat != null) || ((messageObject.isSponsored() && (messageObject.sponsoredChatInvite instanceof TLRPC$TL_chatInvite)) || (messageObject.isSponsored() && (tLRPC$ChatInvite2 = messageObject.sponsoredChatInvite) != null && tLRPC$ChatInvite2.chat != null))))))) {
            int i = messageObject.overrideLinkColor;
            if (i >= 0) {
                nameColorKey1For3 = AvatarDrawable.getNameColorKey1For(i);
                nameColorKey2For3 = AvatarDrawable.getNameColorKey2For(messageObject.overrideLinkColor);
            } else {
                if (messageObject.isSponsored()) {
                    TLRPC$ChatInvite tLRPC$ChatInvite3 = messageObject.sponsoredChatInvite;
                    if (tLRPC$ChatInvite3 instanceof TLRPC$TL_chatInvite) {
                        nameColorKey1For3 = AvatarDrawable.getNameColorKey1For(tLRPC$ChatInvite3.color);
                        nameColorKey2For3 = AvatarDrawable.getNameColorKey2For(messageObject.sponsoredChatInvite.color);
                    }
                }
                if (messageObject.isSponsored() && (tLRPC$ChatInvite = messageObject.sponsoredChatInvite) != null && (tLRPC$Chat2 = tLRPC$ChatInvite.chat) != null) {
                    nameColorKey1For3 = AvatarDrawable.getNameColorKey1For(tLRPC$Chat2);
                    nameColorKey2For3 = AvatarDrawable.getNameColorKey2For(messageObject.sponsoredChatInvite.chat);
                } else if (messageObject.isFromUser() && tLRPC$User != null) {
                    int nameColorKey1For4 = AvatarDrawable.getNameColorKey1For(tLRPC$User);
                    nameColorKey2For3 = AvatarDrawable.getNameColorKey2For(tLRPC$User);
                    nameColorKey1For3 = nameColorKey1For4;
                } else if (messageObject.isFromChannel() && tLRPC$Chat != null) {
                    nameColorKey1For3 = AvatarDrawable.getNameColorKey1For(tLRPC$Chat);
                    nameColorKey2For3 = AvatarDrawable.getNameColorKey2For(tLRPC$Chat);
                } else {
                    nameColorKey1For3 = AvatarDrawable.getNameColorKey1For(0);
                    nameColorKey2For3 = AvatarDrawable.getNameColorKey2For(0);
                }
            }
            this.hasColor2 = nameColorKey1For3 != nameColorKey2For3;
            int color3 = Theme.getColor(nameColorKey1For3, resourcesProvider);
            this.color2 = color3;
            this.color1 = color3;
            if (this.hasColor2) {
                this.color2 = Theme.getColor(nameColorKey2For3, resourcesProvider);
            }
            this.backgroundColor = Theme.multAlpha(this.color1, Theme.isCurrentThemeDark() ? 0.12f : 0.1f);
            this.nameColor = Theme.isCurrentThemeDark() ? this.color2 : this.color1;
        } else if (z && (messageObject.overrideLinkColor >= 0 || (messageObject.messageOwner != null && (messageObject2 = messageObject.replyMessageObject) != null && (tLRPC$Message = messageObject2.messageOwner) != null && tLRPC$Message.from_id != null && (messageObject2.isFromUser() || messageObject.replyMessageObject.isFromChannel())))) {
            int i2 = messageObject.overrideLinkColor;
            if (i2 >= 0) {
                nameColorKey1For = AvatarDrawable.getNameColorKey1For(i2);
                nameColorKey2For = AvatarDrawable.getNameColorKey2For(messageObject.overrideLinkColor);
            } else {
                if (messageObject.replyMessageObject.isFromUser()) {
                    TLRPC$User user = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(messageObject.replyMessageObject.messageOwner.from_id.user_id));
                    nameColorKey1For2 = AvatarDrawable.getNameColorKey1For(user);
                    nameColorKey2For2 = AvatarDrawable.getNameColorKey2For(user);
                    if (user != null && (user.flags2 & 64) != 0) {
                        this.emojiDocumentId = user.background_emoji_id;
                    }
                } else if (messageObject.replyMessageObject.isFromChannel()) {
                    TLRPC$Chat chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(messageObject.replyMessageObject.messageOwner.from_id.channel_id));
                    nameColorKey1For2 = AvatarDrawable.getNameColorKey1For(chat);
                    nameColorKey2For2 = AvatarDrawable.getNameColorKey2For(chat);
                    if (chat != null && (chat.flags2 & 32) != 0) {
                        this.emojiDocumentId = chat.background_emoji_id;
                    }
                } else {
                    nameColorKey1For = AvatarDrawable.getNameColorKey1For(0);
                    nameColorKey2For = AvatarDrawable.getNameColorKey2For(0);
                }
                nameColorKey1For = nameColorKey1For2;
                nameColorKey2For = nameColorKey2For2;
            }
            this.hasColor2 = nameColorKey1For != nameColorKey2For;
            this.color1 = Theme.getColor(nameColorKey1For, resourcesProvider);
            this.color2 = Theme.getColor(nameColorKey2For, resourcesProvider);
            this.backgroundColor = Theme.multAlpha(this.color1, Theme.isCurrentThemeDark() ? 0.12f : 0.1f);
            this.nameColor = Theme.isCurrentThemeDark() ? this.color2 : this.color1;
        } else {
            this.hasColor2 = false;
            int color4 = Theme.getColor(Theme.key_chat_inReplyLine, resourcesProvider);
            this.color2 = color4;
            this.color1 = color4;
            this.backgroundColor = Theme.multAlpha(color4, Theme.isCurrentThemeDark() ? 0.12f : 0.1f);
            this.nameColor = Theme.getColor(Theme.key_chat_inReplyNameText, resourcesProvider);
        }
        if (messageObject.isOutOwner()) {
            int color5 = Theme.getColor(Theme.key_chat_outReplyLine, resourcesProvider);
            this.color2 = color5;
            this.color1 = color5;
            if (this.hasColor2) {
                this.color1 = Theme.multAlpha(color5, 0.35f);
                this.reversedOut = true;
            }
            this.backgroundColor = Theme.multAlpha(this.color2, Theme.isCurrentThemeDark() ? 0.12f : 0.1f);
            this.nameColor = Theme.getColor(Theme.key_chat_outReplyNameText, resourcesProvider);
        }
        if (z) {
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
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.set(this.emojiDocumentId, true);
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
        this.loadingT += (float) Math.min(30L, currentTimeMillis - this.lastLoadingTTime);
        this.lineTranslationT += (float) Math.min(30L, currentTimeMillis - this.lastLoadingTTime);
        this.lastLoadingTTime = currentTimeMillis;
    }

    public void drawLine(Canvas canvas, RectF rectF) {
        drawLine(canvas, rectF, 1.0f);
    }

    public void drawLine(Canvas canvas, RectF rectF, float f) {
        boolean z;
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
        if (!this.loading || this.hasColor2) {
            z = false;
        } else {
            canvas.save();
            int alpha = this.color1Paint.getAlpha();
            this.color1Paint.setAlpha((int) (alpha * 0.3f));
            canvas.drawPaint(this.color1Paint);
            this.color1Paint.setAlpha(alpha);
            canvas.clipPath(this.lineClipPath);
            incrementLoadingT();
            float pow = ((float) Math.pow((this.loadingT / 240.0f) / 4.0f, 0.8500000238418579d)) * 4.0f;
            this.rectF.set(rectF.left, rectF.top + (rectF.height() * (1.0f - CubicBezierInterpolator.EASE_IN.getInterpolation(MathUtils.clamp(((Math.max(pow, 0.5f) + 1.5f) % 3.5f) * 0.5f, 0.0f, 1.0f)))), rectF.left + AndroidUtilities.dp(6.0f), rectF.top + (rectF.height() * (1.0f - CubicBezierInterpolator.EASE_OUT.getInterpolation(MathUtils.clamp((((pow + 1.5f) % 3.5f) - 1.5f) * 0.5f, 0.0f, 1.0f)))));
            this.lineClipPath.rewind();
            this.lineClipPath.addRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), Path.Direction.CW);
            canvas.clipPath(this.lineClipPath);
            z = true;
            this.parentView.invalidate();
        }
        canvas.drawPaint(this.color1Paint);
        float f5 = this.color2Alpha.set(this.hasColor2);
        if (f5 > 0.0f) {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            if (this.loading) {
                incrementLoadingT();
            }
            canvas.translate(0.0f, -((((this.lineTranslationT + (this.reversedOut ? 100 : 0)) / 1000.0f) * AndroidUtilities.dp(30.0f)) % (rectF.height() - ReplyMessageLine$$ExternalSyntheticBackport0.m((int) rectF.height(), AndroidUtilities.dp(12.66f)))));
            checkColor2Path(rectF.height() * 2.0f);
            int alpha2 = this.color2Paint.getAlpha();
            this.color2Paint.setAlpha((int) (alpha2 * f5));
            canvas.drawPath(this.color2Path, this.color2Paint);
            this.color2Paint.setAlpha(alpha2);
            canvas.restore();
        }
        if (z) {
            canvas.restore();
        }
        canvas.restore();
    }

    public void drawBackground(Canvas canvas, RectF rectF, float f, float f2, float f3, float f4) {
        drawBackground(canvas, rectF, f, f2, f3, f4, false);
    }

    public void drawBackground(Canvas canvas, RectF rectF, float f, float f2, float f3, float f4, boolean z) {
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
        drawBackground(canvas, rectF, f4, z);
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

    public void drawBackground(Canvas canvas, RectF rectF, float f, boolean z) {
        this.backgroundPath.rewind();
        this.backgroundPath.addRoundRect(rectF, this.radii, Path.Direction.CW);
        this.backgroundPaint.setColor(this.backgroundColorAnimated.set(this.backgroundColor));
        Paint paint = this.backgroundPaint;
        paint.setAlpha((int) (paint.getAlpha() * f));
        canvas.drawPath(this.backgroundPath, this.backgroundPaint);
        if (this.emoji == null) {
            return;
        }
        int i = 0;
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
        this.emoji.setAlpha((int) (255.0f * f * 0.5f));
        while (true) {
            IconCoords[] iconCoordsArr = this.iconCoords;
            if (i < iconCoordsArr.length) {
                IconCoords iconCoords = iconCoordsArr[i];
                if (!iconCoords.q || z) {
                    this.emoji.setAlpha((int) (iconCoords.a * 76.5f));
                    float dp = max - AndroidUtilities.dp(iconCoords.x);
                    float dp2 = AndroidUtilities.dp(iconCoords.y) + min;
                    float dp3 = AndroidUtilities.dp(10.0f) * iconCoords.s;
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

    private void checkColor2Path(float f) {
        if (Math.abs(this.lastColor2Height - f) > 3.0f) {
            float dpf2 = AndroidUtilities.dpf2(3.0f);
            float dpf22 = AndroidUtilities.dpf2(6.33f);
            float dpf23 = AndroidUtilities.dpf2(3.0f);
            float dpf24 = AndroidUtilities.dpf2(3.33f);
            this.color2Path.rewind();
            for (float f2 = dpf24; f2 < f; f2 += dpf22 + dpf23 + dpf24) {
                this.color2Path.moveTo(dpf2, f2);
                float f3 = f2 + dpf22;
                this.color2Path.lineTo(dpf2, f3);
                this.color2Path.lineTo(0.0f, f3 + dpf23);
                this.color2Path.lineTo(0.0f, f2 + dpf23);
                this.color2Path.close();
            }
            this.lastColor2Height = f;
        }
    }
}
