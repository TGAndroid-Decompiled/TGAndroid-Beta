package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;

public final class VoIpCoverView extends View {
    public final boolean allowAnimations;
    public final VoIPBackgroundProvider backgroundProvider;
    public final Rect bgRect;
    public int connectedDiffX;
    public int diffX1;
    public int diffX2;
    public int diffX3;
    public int diffX4;
    public int diffX5;
    public int diffY1;
    public int diffY2;
    public int diffY3;
    public int diffY4;
    public int diffY5;
    public boolean isConnected;
    public boolean isEmojiExpanded;
    public boolean isPaused;
    public ValueAnimator positionAnimator;
    public final Paint saveLayerPaint;
    public final VoipCoverEmoji[] voipCoverEmojiLeft;
    public final VoipCoverEmoji[] voipCoverEmojiRight;

    public VoIpCoverView(Context context, TLRPC.User user, VoIPBackgroundProvider voIPBackgroundProvider) {
        super(context);
        Paint paint = new Paint(1);
        this.saveLayerPaint = paint;
        this.bgRect = new Rect();
        boolean zIsEnabled = LiteMode.isEnabled(512);
        this.allowAnimations = zIsEnabled;
        this.backgroundProvider = voIPBackgroundProvider;
        if (zIsEnabled) {
            this.voipCoverEmojiLeft = new VoipCoverEmoji[]{new VoipCoverEmoji(user, this, AndroidUtilities.dp(32.0f)), new VoipCoverEmoji(user, this, AndroidUtilities.dp(28.0f)), new VoipCoverEmoji(user, this, AndroidUtilities.dp(35.0f)), new VoipCoverEmoji(user, this, AndroidUtilities.dp(28.0f)), new VoipCoverEmoji(user, this, AndroidUtilities.dp(26.0f))};
            this.voipCoverEmojiRight = new VoipCoverEmoji[]{new VoipCoverEmoji(user, this, AndroidUtilities.dp(32.0f)), new VoipCoverEmoji(user, this, AndroidUtilities.dp(28.0f)), new VoipCoverEmoji(user, this, AndroidUtilities.dp(35.0f)), new VoipCoverEmoji(user, this, AndroidUtilities.dp(28.0f)), new VoipCoverEmoji(user, this, AndroidUtilities.dp(26.0f))};
            voIPBackgroundProvider.views.add(this);
            setLayerType(2, null);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.allowAnimations) {
            for (VoipCoverEmoji voipCoverEmoji : this.voipCoverEmojiLeft) {
                AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = voipCoverEmoji.emoji;
                if (swapAnimatedEmojiDrawable != null) {
                    swapAnimatedEmojiDrawable.attach();
                    ValueAnimator valueAnimator = voipCoverEmoji.positionAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            }
            for (VoipCoverEmoji voipCoverEmoji2 : this.voipCoverEmojiRight) {
                AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = voipCoverEmoji2.emoji;
                if (swapAnimatedEmojiDrawable2 != null) {
                    swapAnimatedEmojiDrawable2.attach();
                    ValueAnimator valueAnimator2 = voipCoverEmoji2.positionAnimator;
                    if (valueAnimator2 != null) {
                        valueAnimator2.start();
                    }
                }
            }
        }
    }

    public final void onConnected() {
        if (this.allowAnimations && !this.isConnected) {
            this.isConnected = true;
            int iDp = AndroidUtilities.dp(12.0f);
            this.connectedDiffX = iDp;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, iDp);
            this.positionAnimator = valueAnimatorOfInt;
            valueAnimatorOfInt.addUpdateListener(new VoIpCoverView$$ExternalSyntheticLambda0(this, 0));
            this.positionAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.positionAnimator.setDuration(200L);
            this.positionAnimator.start();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.allowAnimations) {
            for (VoipCoverEmoji voipCoverEmoji : this.voipCoverEmojiLeft) {
                if (voipCoverEmoji.emoji != null) {
                    ValueAnimator valueAnimator = voipCoverEmoji.positionAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        voipCoverEmoji.positionAnimator = null;
                    }
                    voipCoverEmoji.emoji.detach();
                }
            }
            for (VoipCoverEmoji voipCoverEmoji2 : this.voipCoverEmojiRight) {
                if (voipCoverEmoji2.emoji != null) {
                    ValueAnimator valueAnimator2 = voipCoverEmoji2.positionAnimator;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        voipCoverEmoji2.positionAnimator = null;
                    }
                    voipCoverEmoji2.emoji.detach();
                }
            }
            ValueAnimator valueAnimator3 = this.positionAnimator;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.allowAnimations && !this.isPaused) {
            int width = getWidth();
            int height = getHeight();
            Rect rect = this.bgRect;
            rect.set(0, 0, width, height);
            float x = getX();
            float y = getY();
            VoIPBackgroundProvider voIPBackgroundProvider = this.backgroundProvider;
            voIPBackgroundProvider.setDarkTranslation(x, y);
            int measuredWidth = getMeasuredWidth() / 2;
            VoipCoverEmoji[] voipCoverEmojiArr = this.voipCoverEmojiLeft;
            voipCoverEmojiArr[0].setPosition((measuredWidth - AndroidUtilities.dp(120.0f)) - this.diffX1, AndroidUtilities.dp(120.0f) - this.diffY1);
            voipCoverEmojiArr[1].setPosition((measuredWidth - AndroidUtilities.dp(180.0f)) - this.diffX2, AndroidUtilities.dp(150.0f) - this.diffY2);
            voipCoverEmojiArr[2].setPosition((measuredWidth - AndroidUtilities.dp(150.0f)) - this.diffX3, AndroidUtilities.dp(185.0f) - this.diffY3);
            voipCoverEmojiArr[3].setPosition((measuredWidth - AndroidUtilities.dp(176.0f)) - this.diffX4, AndroidUtilities.dp(240.0f) - this.diffY4);
            voipCoverEmojiArr[4].setPosition((measuredWidth - AndroidUtilities.dp(130.0f)) - this.diffX5, AndroidUtilities.dp(265.0f) - this.diffY5);
            for (VoipCoverEmoji voipCoverEmoji : voipCoverEmojiArr) {
                voipCoverEmoji.onDraw(canvas);
            }
            VoipCoverEmoji[] voipCoverEmojiArr2 = this.voipCoverEmojiRight;
            voipCoverEmojiArr2[0].setPosition(AndroidUtilities.dp(50.0f) + measuredWidth + this.diffX1, AndroidUtilities.dp(120.0f) - this.diffY1);
            voipCoverEmojiArr2[1].setPosition(AndroidUtilities.dp(110.0f) + measuredWidth + this.diffX2, AndroidUtilities.dp(150.0f) - this.diffY2);
            voipCoverEmojiArr2[2].setPosition(AndroidUtilities.dp(80.0f) + measuredWidth + this.diffX3, AndroidUtilities.dp(185.0f) - this.diffY3);
            voipCoverEmojiArr2[3].setPosition(AndroidUtilities.dp(106.0f) + measuredWidth + this.diffX4, AndroidUtilities.dp(240.0f) - this.diffY4);
            voipCoverEmojiArr2[4].setPosition(AndroidUtilities.dp(60.0f) + measuredWidth + this.diffX5, AndroidUtilities.dp(265.0f) - this.diffY5);
            for (VoipCoverEmoji voipCoverEmoji2 : voipCoverEmojiArr2) {
                voipCoverEmoji2.onDraw(canvas);
            }
            int alpha = voIPBackgroundProvider.getDarkPaint().getAlpha();
            Paint paint = this.saveLayerPaint;
            paint.setAlpha(255);
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint, 31);
            voIPBackgroundProvider.getDarkPaint().setAlpha(255);
            canvas.drawRect(rect, voIPBackgroundProvider.getDarkPaint());
            voIPBackgroundProvider.getDarkPaint().setAlpha(alpha);
            if (voIPBackgroundProvider.isReveal) {
                int alpha2 = voIPBackgroundProvider.revealDarkShaderTools.paint.getAlpha();
                voIPBackgroundProvider.revealDarkShaderTools.paint.setAlpha(255);
                canvas.drawRect(rect, voIPBackgroundProvider.revealDarkShaderTools.paint);
                voIPBackgroundProvider.revealDarkShaderTools.paint.setAlpha(alpha2);
            }
            canvas.restore();
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.allowAnimations) {
            for (VoipCoverEmoji voipCoverEmoji : this.voipCoverEmojiLeft) {
                int measuredWidth = getMeasuredWidth();
                getMeasuredHeight();
                voipCoverEmoji.width = measuredWidth;
                voipCoverEmoji.parent.invalidate();
            }
            for (VoipCoverEmoji voipCoverEmoji2 : this.voipCoverEmojiRight) {
                int measuredWidth2 = getMeasuredWidth();
                getMeasuredHeight();
                voipCoverEmoji2.width = measuredWidth2;
                voipCoverEmoji2.parent.invalidate();
            }
        }
    }

    public void setState(boolean z) {
        this.isPaused = z;
        invalidate();
    }
}
