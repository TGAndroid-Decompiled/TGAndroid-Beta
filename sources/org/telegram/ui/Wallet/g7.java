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
import org.telegram.ui.Components.g80;
public final class g7 extends yh.g1 {
    public TL_wallet.nftItem f34248o0;
    public t7 f34249p0;
    public float f34250q0;
    public boolean f34251r0;
    public ValueAnimator f34252s0;

    @Override
    public final void a(g80 g80Var, Canvas canvas, float f7, float f10, float f11) {
        if (this.f34250q0 == 1.0f) {
            super.a(g80Var, canvas, f7, f10, f11);
            return;
        }
        canvas.save();
        float f12 = this.f34250q0;
        canvas.scale(f12, f12, f7 / 2.0f, f10 / 2.0f);
        super.a(g80Var, canvas, f7, f10, f11);
        canvas.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f34250q0 == 1.0f) {
            super.draw(canvas);
            return;
        }
        canvas.save();
        float f7 = this.f34250q0;
        canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        t7 t7Var;
        float clamp01;
        float f7;
        int i10;
        float f10;
        boolean drawChild = super.drawChild(canvas, view, j10);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout && (t7Var = this.f34249p0) != null) {
            RectF rectF = t7Var.H;
            Paint paint = t7Var.f34957x;
            s7 s7Var = t7Var.f34930k1;
            if (this == t7Var.l1 && s7Var != null && s7Var.v != null) {
                paint.setShader(null);
                paint.setColorFilter(null);
                float clamp012 = Utilities.clamp01(t7Var.f34939p1.f34803a);
                float[] D = t7Var.D(t7Var.f34935n1 % 2.0f);
                float f11 = D[0] * clamp012;
                float f12 = D[1] * clamp012;
                float f13 = D[2] * clamp012;
                int left = frameLayout.getLeft();
                org.telegram.ui.Components.w9 w9Var = this.f50271y;
                float left2 = w9Var.getLeft() + left + (w9Var.getWidth() / 2.0f);
                float height = (w9Var.getHeight() / 2.0f) + w9Var.getTop() + frameLayout.getTop();
                float B = com.google.android.gms.internal.play_billing.k3.B(f13, 0.025f, (0.07f * f12) + 1.0f, (w9Var.getWidth() * 288) / 268.0f);
                if (f12 > 0.01f && s7Var.f34880w != null) {
                    float f14 = ((176.0f * B) / 128.0f) / 2.0f;
                    float dp = (AndroidUtilities.dp(2.0f) * f12) + height;
                    rectF.set(left2 - f14, dp - f14, left2 + f14, dp + f14);
                    paint.setColor(-16777216);
                    paint.setAlpha((int) (60.0f * f12));
                    canvas.drawBitmap(s7Var.f34880w, (Rect) null, rectF, paint);
                    paint.setColor(-1);
                }
                if (s7Var.f34879u == null) {
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
                    t7Var.r(canvas, s7Var.v, left2, f10, f7, f11, 1.0f, f16, 0.24f, 0.97f);
                } else {
                    f7 = B;
                    i10 = 255;
                    f10 = dp2;
                }
                if (f15 > 0.01f) {
                    paint.setAlpha((int) (255.0f * f15));
                    t7Var.r(canvas, s7Var.f34879u, left2, f10, f7, f11, 1.0f, f16, 0.24f, 0.97f);
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
        if (isPressed() == this.f34251r0) {
            return;
        }
        boolean isPressed = isPressed();
        this.f34251r0 = isPressed;
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
        ValueAnimator valueAnimator = this.f34252s0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f34250q0, f7);
        this.f34252s0 = ofFloat;
        ofFloat.addUpdateListener(new b3(this, 5));
        if (overshootInterpolator != null) {
            this.f34252s0.setInterpolator(overshootInterpolator);
        }
        this.f34252s0.setDuration(j10);
        this.f34252s0.start();
    }

    public final void m(float f7) {
        this.f34250q0 = f7;
        invalidate();
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final void n() {
        ValueAnimator valueAnimator = this.f34252s0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f34250q0 == 1.0f) {
            return;
        }
        setScaleX(getScaleX() * this.f34250q0);
        setScaleY(getScaleY() * this.f34250q0);
        m(1.0f);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t7 t7Var = this.f34249p0;
        if (t7Var != null) {
            t7Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        t7 t7Var = this.f34249p0;
        if (t7Var != null) {
            t7Var.h.remove(this);
        }
        super.onDetachedFromWindow();
    }
}
