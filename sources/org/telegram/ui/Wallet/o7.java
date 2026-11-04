package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.d60;
public final class o7 extends ai.q2 {
    public boolean A0;
    public ValueAnimator B0;
    public TL_wallet.nftItem f43011x0;
    public b8 f43012y0;
    public float f43013z0;

    @Override
    public final void b(d60 d60Var, Canvas canvas, float f10, float f11, float f12) {
        if (this.f43013z0 == 1.0f) {
            super.b(d60Var, canvas, f10, f11, f12);
            return;
        }
        canvas.save();
        float f13 = this.f43013z0;
        canvas.scale(f13, f13, f10 / 2.0f, f11 / 2.0f);
        super.b(d60Var, canvas, f10, f11, f12);
        canvas.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f43013z0 == 1.0f) {
            super.draw(canvas);
            return;
        }
        canvas.save();
        float f10 = this.f43013z0;
        canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        b8 b8Var;
        float l10;
        float f10;
        int i3;
        float f11;
        boolean drawChild = super.drawChild(canvas, view, j10);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout && (b8Var = this.f43012y0) != null) {
            RectF rectF = b8Var.I;
            Paint paint = b8Var.f42343y;
            a8 a8Var = b8Var.f42315l1;
            if (this == b8Var.m1 && a8Var != null && a8Var.v != null) {
                paint.setShader(null);
                paint.setColorFilter(null);
                float l11 = Utilities.l(b8Var.f42324q1.f43511a);
                float[] D = b8Var.D(b8Var.f42320o1 % 2.0f);
                float f12 = D[0] * l11;
                float f13 = D[1] * l11;
                float f14 = D[2] * l11;
                int left = frameLayout.getLeft();
                org.telegram.ui.Components.k9 k9Var = this.E;
                float left2 = k9Var.getLeft() + left + (k9Var.getWidth() / 2.0f);
                float height = (k9Var.getHeight() / 2.0f) + k9Var.getTop() + frameLayout.getTop();
                float B = com.google.android.recaptcha.internal.a.B(f14, 0.025f, (0.07f * f13) + 1.0f, (k9Var.getWidth() * 288) / 268.0f);
                if (f13 > 0.01f && a8Var.f42185w != null) {
                    float f15 = ((176.0f * B) / 128.0f) / 2.0f;
                    float L = (org.telegram.messenger.g0.L(2.0f) * f13) + height;
                    rectF.set(left2 - f15, L - f15, left2 + f15, L + f15);
                    paint.setColor(-16777216);
                    paint.setAlpha((int) (60.0f * f13));
                    canvas.drawBitmap(a8Var.f42185w, (Rect) null, rectF, paint);
                    paint.setColor(-1);
                }
                if (a8Var.f42184u == null) {
                    l10 = 0.0f;
                } else {
                    l10 = Utilities.l(1.4f * f13);
                }
                float f16 = l10;
                float L2 = height - (org.telegram.messenger.g0.L(5.0f) * f13);
                float f17 = f13 * (-5.0f);
                if (f16 < 0.99f) {
                    paint.setAlpha(255);
                    f11 = L2;
                    f10 = B;
                    i3 = 255;
                    b8Var.r(canvas, a8Var.v, left2, f11, f10, f12, 1.0f, f17, 0.24f, 0.97f);
                } else {
                    f10 = B;
                    i3 = 255;
                    f11 = L2;
                }
                if (f16 > 0.01f) {
                    paint.setAlpha((int) (255.0f * f16));
                    b8Var.r(canvas, a8Var.f42184u, left2, f11, f10, f12, 1.0f, f17, 0.24f, 0.97f);
                }
                paint.setAlpha(i3);
            }
        }
        return drawChild;
    }

    @Override
    public final void drawableStateChanged() {
        float f10;
        long j10;
        OvershootInterpolator overshootInterpolator;
        super.drawableStateChanged();
        if (isPressed() == this.A0) {
            return;
        }
        boolean isPressed = isPressed();
        this.A0 = isPressed;
        if (isPressed) {
            f10 = 0.96f;
        } else {
            f10 = 1.0f;
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
        m(f10, j10, overshootInterpolator);
    }

    public final void m(float f10, long j10, OvershootInterpolator overshootInterpolator) {
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f43013z0, f10);
        this.B0 = ofFloat;
        ofFloat.addUpdateListener(new p3(this, 5));
        if (overshootInterpolator != null) {
            this.B0.setInterpolator(overshootInterpolator);
        }
        this.B0.setDuration(j10);
        this.B0.start();
    }

    public final void n(float f10) {
        this.f43013z0 = f10;
        invalidate();
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final void o() {
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f43013z0 == 1.0f) {
            return;
        }
        setScaleX(getScaleX() * this.f43013z0);
        setScaleY(getScaleY() * this.f43013z0);
        n(1.0f);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b8 b8Var = this.f43012y0;
        if (b8Var != null) {
            b8Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        b8 b8Var = this.f43012y0;
        if (b8Var != null) {
            b8Var.h.remove(this);
        }
        super.onDetachedFromWindow();
    }
}
