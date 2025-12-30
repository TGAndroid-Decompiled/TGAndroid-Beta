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
import org.telegram.ui.Components.CubicBezierInterpolator;

public class VoIpCoverView extends View {
    private final boolean allowAnimations;
    private final VoIPBackgroundProvider backgroundProvider;
    private final Rect bgRect;
    private int connectedDiffX;
    private int diffX1;
    private int diffX2;
    private int diffX3;
    private int diffX4;
    private int diffX5;
    private int diffY1;
    private int diffY2;
    private int diffY3;
    private int diffY4;
    private int diffY5;
    private boolean isConnected;
    private boolean isEmojiExpanded;
    private boolean isPaused;
    private ValueAnimator positionAnimator;
    private final Paint saveLayerPaint;
    private VoipCoverEmoji[] voipCoverEmojiLeft;
    private VoipCoverEmoji[] voipCoverEmojiRight;

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
            voIPBackgroundProvider.attach(this);
            setLayerType(2, null);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
    }

    public void onConnected() {
        if (this.allowAnimations && !this.isConnected) {
            this.isConnected = true;
            int iDp = AndroidUtilities.dp(12.0f);
            this.connectedDiffX = iDp;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, iDp);
            this.positionAnimator = valueAnimatorOfInt;
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$onConnected$0(valueAnimator);
                }
            });
            this.positionAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.positionAnimator.setDuration(200L);
            this.positionAnimator.start();
        }
    }

    public void lambda$onConnected$0(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.diffX1 = iIntValue;
        this.diffX2 = iIntValue;
        this.diffX3 = iIntValue;
        this.diffX4 = iIntValue;
        this.diffX5 = iIntValue;
        invalidate();
    }

    public void onEmojiExpanded(boolean z) {
        if (this.allowAnimations && z != this.isEmojiExpanded) {
            this.isEmojiExpanded = z;
            ValueAnimator valueAnimatorOfFloat = z ? ValueAnimator.ofFloat(0.0f, 1.0f) : ValueAnimator.ofFloat(1.0f, 0.0f);
            this.positionAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$onEmojiExpanded$1(valueAnimator);
                }
            });
            this.positionAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.positionAnimator.setDuration(200L);
            this.positionAnimator.start();
        }
    }

    public void lambda$onEmojiExpanded$1(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.diffX1 = AndroidUtilities.lerp(this.connectedDiffX, AndroidUtilities.dp(56.0f), fFloatValue);
        this.diffX2 = AndroidUtilities.lerp(this.connectedDiffX, AndroidUtilities.dp(36.0f), fFloatValue);
        this.diffX3 = AndroidUtilities.lerp(this.connectedDiffX, AndroidUtilities.dp(60.0f), fFloatValue);
        this.diffX4 = AndroidUtilities.lerp(this.connectedDiffX, AndroidUtilities.dp(36.0f), fFloatValue);
        this.diffX5 = AndroidUtilities.lerp(this.connectedDiffX, AndroidUtilities.dp(64.0f), fFloatValue);
        this.diffY1 = AndroidUtilities.lerp(0, AndroidUtilities.dp(50.0f), fFloatValue);
        this.diffY2 = AndroidUtilities.lerp(0, AndroidUtilities.dp(20.0f), fFloatValue);
        this.diffY3 = AndroidUtilities.lerp(0, 0, fFloatValue);
        this.diffY4 = AndroidUtilities.lerp(0, AndroidUtilities.dp(-20.0f), fFloatValue);
        this.diffY5 = AndroidUtilities.lerp(0, AndroidUtilities.dp(-40.0f), fFloatValue);
        invalidate();
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.allowAnimations) {
            for (VoipCoverEmoji voipCoverEmoji : this.voipCoverEmojiLeft) {
                voipCoverEmoji.onLayout(getMeasuredWidth(), getMeasuredHeight());
            }
            for (VoipCoverEmoji voipCoverEmoji2 : this.voipCoverEmojiRight) {
                voipCoverEmoji2.onLayout(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.allowAnimations && !this.isPaused) {
            this.bgRect.set(0, 0, getWidth(), getHeight());
            this.backgroundProvider.setDarkTranslation(getX(), getY());
            int measuredWidth = getMeasuredWidth() / 2;
            this.voipCoverEmojiLeft[0].setPosition((measuredWidth - AndroidUtilities.dp(120.0f)) - this.diffX1, AndroidUtilities.dp(120.0f) - this.diffY1);
            this.voipCoverEmojiLeft[1].setPosition((measuredWidth - AndroidUtilities.dp(180.0f)) - this.diffX2, AndroidUtilities.dp(150.0f) - this.diffY2);
            this.voipCoverEmojiLeft[2].setPosition((measuredWidth - AndroidUtilities.dp(150.0f)) - this.diffX3, AndroidUtilities.dp(185.0f) - this.diffY3);
            this.voipCoverEmojiLeft[3].setPosition((measuredWidth - AndroidUtilities.dp(176.0f)) - this.diffX4, AndroidUtilities.dp(240.0f) - this.diffY4);
            this.voipCoverEmojiLeft[4].setPosition((measuredWidth - AndroidUtilities.dp(130.0f)) - this.diffX5, AndroidUtilities.dp(265.0f) - this.diffY5);
            for (VoipCoverEmoji voipCoverEmoji : this.voipCoverEmojiLeft) {
                voipCoverEmoji.onDraw(canvas);
            }
            this.voipCoverEmojiRight[0].setPosition(AndroidUtilities.dp(50.0f) + measuredWidth + this.diffX1, AndroidUtilities.dp(120.0f) - this.diffY1);
            this.voipCoverEmojiRight[1].setPosition(AndroidUtilities.dp(110.0f) + measuredWidth + this.diffX2, AndroidUtilities.dp(150.0f) - this.diffY2);
            this.voipCoverEmojiRight[2].setPosition(AndroidUtilities.dp(80.0f) + measuredWidth + this.diffX3, AndroidUtilities.dp(185.0f) - this.diffY3);
            this.voipCoverEmojiRight[3].setPosition(AndroidUtilities.dp(106.0f) + measuredWidth + this.diffX4, AndroidUtilities.dp(240.0f) - this.diffY4);
            this.voipCoverEmojiRight[4].setPosition(measuredWidth + AndroidUtilities.dp(60.0f) + this.diffX5, AndroidUtilities.dp(265.0f) - this.diffY5);
            for (VoipCoverEmoji voipCoverEmoji2 : this.voipCoverEmojiRight) {
                voipCoverEmoji2.onDraw(canvas);
            }
            int alpha = this.backgroundProvider.getDarkPaint().getAlpha();
            this.saveLayerPaint.setAlpha(255);
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.saveLayerPaint, 31);
            this.backgroundProvider.getDarkPaint().setAlpha(255);
            canvas.drawRect(this.bgRect, this.backgroundProvider.getDarkPaint());
            this.backgroundProvider.getDarkPaint().setAlpha(alpha);
            if (this.backgroundProvider.isReveal()) {
                int alpha2 = this.backgroundProvider.getRevealDarkPaint().getAlpha();
                this.backgroundProvider.getRevealDarkPaint().setAlpha(255);
                canvas.drawRect(this.bgRect, this.backgroundProvider.getRevealDarkPaint());
                this.backgroundProvider.getRevealDarkPaint().setAlpha(alpha2);
            }
            canvas.restore();
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.allowAnimations) {
            for (VoipCoverEmoji voipCoverEmoji : this.voipCoverEmojiLeft) {
                voipCoverEmoji.onAttachedToWindow();
            }
            for (VoipCoverEmoji voipCoverEmoji2 : this.voipCoverEmojiRight) {
                voipCoverEmoji2.onAttachedToWindow();
            }
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.allowAnimations) {
            for (VoipCoverEmoji voipCoverEmoji : this.voipCoverEmojiLeft) {
                voipCoverEmoji.onDetachedFromWindow();
            }
            for (VoipCoverEmoji voipCoverEmoji2 : this.voipCoverEmojiRight) {
                voipCoverEmoji2.onDetachedFromWindow();
            }
            ValueAnimator valueAnimator = this.positionAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        }
    }

    public void setState(boolean z) {
        this.isPaused = z;
        invalidate();
    }
}
