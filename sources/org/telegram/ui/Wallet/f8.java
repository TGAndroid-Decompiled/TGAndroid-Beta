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
import org.telegram.ui.Components.t60;
public final class f8 extends bi.i3 {
    public boolean A0;
    public ValueAnimator B0;
    public TL_wallet.nftItem f44308x0;
    public s8 f44309y0;
    public float f44310z0;

    @Override
    public final void b(t60 t60Var, Canvas canvas, float f10, float f11, float f12) {
        if (this.f44310z0 == 1.0f) {
            super.b(t60Var, canvas, f10, f11, f12);
            return;
        }
        canvas.save();
        float f13 = this.f44310z0;
        canvas.scale(f13, f13, f10 / 2.0f, f11 / 2.0f);
        super.b(t60Var, canvas, f10, f11, f12);
        canvas.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f44310z0 == 1.0f) {
            super.draw(canvas);
            return;
        }
        canvas.save();
        float f10 = this.f44310z0;
        canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        s8 s8Var;
        float l10;
        float f10;
        int i7;
        float f11;
        boolean drawChild = super.drawChild(canvas, view, j3);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout && (s8Var = this.f44309y0) != null) {
            RectF rectF = s8Var.I;
            Paint paint = s8Var.f45110y;
            r8 r8Var = s8Var.l1;
            if (this == s8Var.f45083m1 && r8Var != null && r8Var.v != null) {
                paint.setShader(null);
                paint.setColorFilter(null);
                float l11 = Utilities.l(s8Var.f45091q1.f44967a);
                float[] D = s8Var.D(s8Var.f45087o1 % 2.0f);
                float f12 = D[0] * l11;
                float f13 = D[1] * l11;
                float f14 = D[2] * l11;
                int left = frameLayout.getLeft();
                org.telegram.ui.Components.p9 p9Var = this.E;
                float left2 = p9Var.getLeft() + left + (p9Var.getWidth() / 2.0f);
                float height = (p9Var.getHeight() / 2.0f) + p9Var.getTop() + frameLayout.getTop();
                float C = com.google.android.gms.internal.vision.e2.C(f14, 0.025f, (0.07f * f13) + 1.0f, (p9Var.getWidth() * 288) / 268.0f);
                if (f13 > 0.01f && r8Var.f45021w != null) {
                    float f15 = ((176.0f * C) / 128.0f) / 2.0f;
                    float L = (org.telegram.messenger.g0.L(2.0f) * f13) + height;
                    rectF.set(left2 - f15, L - f15, left2 + f15, L + f15);
                    paint.setColor(-16777216);
                    paint.setAlpha((int) (60.0f * f13));
                    canvas.drawBitmap(r8Var.f45021w, (Rect) null, rectF, paint);
                    paint.setColor(-1);
                }
                if (r8Var.f45020u == null) {
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
                    f10 = C;
                    i7 = 255;
                    s8Var.r(canvas, r8Var.v, left2, f11, f10, f12, 1.0f, f17, 0.24f, 0.97f);
                } else {
                    f10 = C;
                    i7 = 255;
                    f11 = L2;
                }
                if (f16 > 0.01f) {
                    paint.setAlpha((int) (255.0f * f16));
                    s8Var.r(canvas, r8Var.f45020u, left2, f11, f10, f12, 1.0f, f17, 0.24f, 0.97f);
                }
                paint.setAlpha(i7);
            }
        }
        return drawChild;
    }

    @Override
    public final void drawableStateChanged() {
        float f10;
        long j3;
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
            j3 = 80;
        } else {
            j3 = 350;
        }
        if (isPressed) {
            overshootInterpolator = null;
        } else {
            overshootInterpolator = new OvershootInterpolator(1.5f);
        }
        m(f10, j3, overshootInterpolator);
    }

    public final void m(float f10, long j3, OvershootInterpolator overshootInterpolator) {
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f44310z0, f10);
        this.B0 = ofFloat;
        ofFloat.addUpdateListener(new a4(this, 5));
        if (overshootInterpolator != null) {
            this.B0.setInterpolator(overshootInterpolator);
        }
        this.B0.setDuration(j3);
        this.B0.start();
    }

    public final void n(float f10) {
        this.f44310z0 = f10;
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
        if (this.f44310z0 == 1.0f) {
            return;
        }
        setScaleX(getScaleX() * this.f44310z0);
        setScaleY(getScaleY() * this.f44310z0);
        n(1.0f);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        s8 s8Var = this.f44309y0;
        if (s8Var != null) {
            s8Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        s8 s8Var = this.f44309y0;
        if (s8Var != null) {
            s8Var.h.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        hi.z2.W = getMeasuredHeight();
    }
}
