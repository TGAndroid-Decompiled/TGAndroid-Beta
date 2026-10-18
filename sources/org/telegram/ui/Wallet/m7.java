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
public final class m7 extends yh.h1 {
    public TL_wallet.nftItem f34601o0;
    public z7 f34602p0;
    public float f34603q0;
    public boolean f34604r0;
    public ValueAnimator f34605s0;

    @Override
    public final void draw(Canvas canvas) {
        if (this.f34603q0 == 1.0f) {
            super.draw(canvas);
            return;
        }
        canvas.save();
        float f7 = this.f34603q0;
        canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        z7 z7Var;
        float clamp01;
        float f7;
        int i10;
        float f10;
        boolean drawChild = super.drawChild(canvas, view, j10);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout && (z7Var = this.f34602p0) != null) {
            RectF rectF = z7Var.H;
            Paint paint = z7Var.f35230x;
            y7 y7Var = z7Var.f35193f1;
            if (this == z7Var.f35195g1 && y7Var != null && y7Var.v != null) {
                paint.setShader(null);
                paint.setColorFilter(null);
                float clamp012 = Utilities.clamp01(z7Var.f35203k1.f35096a);
                float[] F = z7Var.F(z7Var.f35199i1 % 2.0f);
                float f11 = F[0] * clamp012;
                float f12 = F[1] * clamp012;
                float f13 = F[2] * clamp012;
                int left = frameLayout.getLeft();
                org.telegram.ui.Components.w9 w9Var = this.f50330y;
                float left2 = w9Var.getLeft() + left + (w9Var.getWidth() / 2.0f);
                float height = (w9Var.getHeight() / 2.0f) + w9Var.getTop() + frameLayout.getTop();
                float B = com.google.android.gms.internal.play_billing.k3.B(f13, 0.025f, (0.07f * f12) + 1.0f, (w9Var.getWidth() * 288) / 268.0f);
                if (f12 > 0.01f && y7Var.f35155w != null) {
                    float f14 = ((176.0f * B) / 128.0f) / 2.0f;
                    float dp = (AndroidUtilities.dp(2.0f) * f12) + height;
                    rectF.set(left2 - f14, dp - f14, left2 + f14, dp + f14);
                    paint.setColor(-16777216);
                    paint.setAlpha((int) (60.0f * f12));
                    canvas.drawBitmap(y7Var.f35155w, (Rect) null, rectF, paint);
                    paint.setColor(-1);
                }
                if (y7Var.f35154u == null) {
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
                    z7Var.r(canvas, y7Var.v, left2, f10, f7, f11, 1.0f, f16, 0.24f, 0.97f);
                } else {
                    f7 = B;
                    i10 = 255;
                    f10 = dp2;
                }
                if (f15 > 0.01f) {
                    paint.setAlpha((int) (255.0f * f15));
                    z7Var.r(canvas, y7Var.f35154u, left2, f10, f7, f11, 1.0f, f16, 0.24f, 0.97f);
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
        if (isPressed() == this.f34604r0) {
            return;
        }
        boolean isPressed = isPressed();
        this.f34604r0 = isPressed;
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
        ValueAnimator valueAnimator = this.f34605s0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f34603q0, f7);
        this.f34605s0 = ofFloat;
        ofFloat.addUpdateListener(new u2(this, 6));
        if (overshootInterpolator != null) {
            this.f34605s0.setInterpolator(overshootInterpolator);
        }
        this.f34605s0.setDuration(j10);
        this.f34605s0.start();
    }

    public final void m(float f7) {
        this.f34603q0 = f7;
        invalidate();
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final void n() {
        ValueAnimator valueAnimator = this.f34605s0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f34603q0 == 1.0f) {
            return;
        }
        setScaleX(getScaleX() * this.f34603q0);
        setScaleY(getScaleY() * this.f34603q0);
        m(1.0f);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z7 z7Var = this.f34602p0;
        if (z7Var != null) {
            z7Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        z7 z7Var = this.f34602p0;
        if (z7Var != null) {
            z7Var.h.remove(this);
        }
        super.onDetachedFromWindow();
    }
}
