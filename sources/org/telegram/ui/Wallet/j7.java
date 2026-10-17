package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class j7 extends yh.h1 {
    public TL_wallet.nftItem f34360o0;
    public w7 f34361p0;
    public float f34362q0;
    public boolean f34363r0;
    public ValueAnimator f34364s0;

    @Override
    public final void draw(Canvas canvas) {
        if (this.f34362q0 == 1.0f) {
            super.draw(canvas);
            return;
        }
        canvas.save();
        float f7 = this.f34362q0;
        canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        w7 w7Var;
        float clamp01;
        float f7;
        int i10;
        float f10;
        boolean drawChild = super.drawChild(canvas, view, j10);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout && (w7Var = this.f34361p0) != null) {
            RectF rectF = w7Var.H;
            Paint paint = w7Var.f35094x;
            v7 v7Var = w7Var.f35057f1;
            if (this == w7Var.f35059g1 && v7Var != null && v7Var.v != null) {
                paint.setShader(null);
                paint.setColorFilter(null);
                float clamp012 = Utilities.clamp01(w7Var.f35067k1.f34937a);
                float[] F = w7Var.F(w7Var.f35063i1 % 2.0f);
                float f11 = F[0] * clamp012;
                float f12 = F[1] * clamp012;
                float f13 = F[2] * clamp012;
                int left = frameLayout.getLeft();
                org.telegram.ui.Components.w9 w9Var = this.f50305y;
                float left2 = w9Var.getLeft() + left + (w9Var.getWidth() / 2.0f);
                float height = (w9Var.getHeight() / 2.0f) + w9Var.getTop() + frameLayout.getTop();
                float B = com.google.android.gms.internal.cast.a6.B(f13, 0.025f, (0.07f * f12) + 1.0f, (w9Var.getWidth() * 288) / 268.0f);
                if (f12 > 0.01f && v7Var.f35015w != null) {
                    float f14 = ((176.0f * B) / 128.0f) / 2.0f;
                    float dp = (AndroidUtilities.dp(2.0f) * f12) + height;
                    rectF.set(left2 - f14, dp - f14, left2 + f14, dp + f14);
                    paint.setColor(-16777216);
                    paint.setAlpha((int) (60.0f * f12));
                    canvas.drawBitmap(v7Var.f35015w, (Rect) null, rectF, paint);
                    paint.setColor(-1);
                }
                if (v7Var.f35014u == null) {
                    clamp01 = 0.0f;
                } else {
                    clamp01 = Utilities.clamp01(1.4f * f12);
                }
                float f15 = clamp01;
                float dp2 = height - (AndroidUtilities.dp(5.0f) * f12);
                float f16 = f12 * (-5.0f);
                if (f15 < 0.99f) {
                    paint.setAlpha(255);
                    f10 = dp2;
                    f7 = B;
                    i10 = 255;
                    w7Var.r(canvas, v7Var.v, left2, f10, f7, f11, 1.0f, f16, 0.24f, 0.97f);
                } else {
                    f7 = B;
                    i10 = 255;
                    f10 = dp2;
                }
                if (f15 > 0.01f) {
                    paint.setAlpha((int) (255.0f * f15));
                    w7Var.r(canvas, v7Var.f35014u, left2, f10, f7, f11, 1.0f, f16, 0.24f, 0.97f);
                }
                paint.setAlpha(i10);
            }
        }
        return drawChild;
    }

    @Override
    public final void drawableStateChanged() {
        float f7;
        long j10;
        OvershootInterpolator overshootInterpolator;
        super.drawableStateChanged();
        if (isPressed() == this.f34363r0) {
            return;
        }
        boolean isPressed = isPressed();
        this.f34363r0 = isPressed;
        if (isPressed) {
            f7 = 0.96f;
        } else {
            f7 = 1.0f;
        }
        if (isPressed) {
            j10 = 80;
        } else {
            j10 = 350;
        }
        if (isPressed) {
            overshootInterpolator = null;
        } else {
            overshootInterpolator = new OvershootInterpolator(1.5f);
        }
        l(f7, j10, overshootInterpolator);
    }

    public final void l(float f7, long j10, OvershootInterpolator overshootInterpolator) {
        ValueAnimator valueAnimator = this.f34364s0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f34362q0, f7);
        this.f34364s0 = ofFloat;
        ofFloat.addUpdateListener(new u2(this, 6));
        if (overshootInterpolator != null) {
            this.f34364s0.setInterpolator(overshootInterpolator);
        }
        this.f34364s0.setDuration(j10);
        this.f34364s0.start();
    }

    public final void m(float f7) {
        this.f34362q0 = f7;
        invalidate();
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final void n() {
        ValueAnimator valueAnimator = this.f34364s0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f34362q0 == 1.0f) {
            return;
        }
        setScaleX(getScaleX() * this.f34362q0);
        setScaleY(getScaleY() * this.f34362q0);
        m(1.0f);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w7 w7Var = this.f34361p0;
        if (w7Var != null) {
            w7Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        w7 w7Var = this.f34361p0;
        if (w7Var != null) {
            w7Var.h.remove(this);
        }
        super.onDetachedFromWindow();
    }
}
