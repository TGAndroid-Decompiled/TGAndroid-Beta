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
import org.telegram.ui.Components.i60;
public final class p7 extends zh.z0 {
    public ValueAnimator A0;
    public TL_wallet.nftItem f43014w0;
    public c8 f43015x0;
    public float f43016y0;
    public boolean f43017z0;

    @Override
    public final void b(i60 i60Var, Canvas canvas, float f10, float f11, float f12) {
        if (this.f43016y0 == 1.0f) {
            super.b(i60Var, canvas, f10, f11, f12);
            return;
        }
        canvas.save();
        float f13 = this.f43016y0;
        canvas.scale(f13, f13, f10 / 2.0f, f11 / 2.0f);
        super.b(i60Var, canvas, f10, f11, f12);
        canvas.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f43016y0 == 1.0f) {
            super.draw(canvas);
            return;
        }
        canvas.save();
        float f10 = this.f43016y0;
        canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        c8 c8Var;
        float l10;
        float f10;
        int i7;
        float f11;
        boolean drawChild = super.drawChild(canvas, view, j3);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout && (c8Var = this.f43015x0) != null) {
            RectF rectF = c8Var.H;
            Paint paint = c8Var.f42305y;
            b8 b8Var = c8Var.f42276k1;
            if (this == c8Var.l1 && b8Var != null && b8Var.v != null) {
                paint.setShader(null);
                paint.setColorFilter(null);
                float l11 = Utilities.l(c8Var.f42284p1.f42104a);
                float[] D = c8Var.D(c8Var.n1 % 2.0f);
                float f12 = D[0] * l11;
                float f13 = D[1] * l11;
                float f14 = D[2] * l11;
                int left = frameLayout.getLeft();
                org.telegram.ui.Components.l9 l9Var = this.D;
                float left2 = l9Var.getLeft() + left + (l9Var.getWidth() / 2.0f);
                float height = (l9Var.getHeight() / 2.0f) + l9Var.getTop() + frameLayout.getTop();
                float C = com.google.android.recaptcha.internal.a.C(f14, 0.025f, (0.07f * f13) + 1.0f, (l9Var.getWidth() * 288) / 268.0f);
                if (f13 > 0.01f && b8Var.f42174w != null) {
                    float f15 = ((176.0f * C) / 128.0f) / 2.0f;
                    float L = (org.telegram.messenger.g0.L(2.0f) * f13) + height;
                    rectF.set(left2 - f15, L - f15, left2 + f15, L + f15);
                    paint.setColor(-16777216);
                    paint.setAlpha((int) (60.0f * f13));
                    canvas.drawBitmap(b8Var.f42174w, (Rect) null, rectF, paint);
                    paint.setColor(-1);
                }
                if (b8Var.f42173u == null) {
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
                    c8Var.r(canvas, b8Var.v, left2, f11, f10, f12, 1.0f, f17, 0.24f, 0.97f);
                } else {
                    f10 = C;
                    i7 = 255;
                    f11 = L2;
                }
                if (f16 > 0.01f) {
                    paint.setAlpha((int) (255.0f * f16));
                    c8Var.r(canvas, b8Var.f42173u, left2, f11, f10, f12, 1.0f, f17, 0.24f, 0.97f);
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
        if (isPressed() == this.f43017z0) {
            return;
        }
        boolean isPressed = isPressed();
        this.f43017z0 = isPressed;
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
        ValueAnimator valueAnimator = this.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f43016y0, f10);
        this.A0 = ofFloat;
        ofFloat.addUpdateListener(new r3(this, 5));
        if (overshootInterpolator != null) {
            this.A0.setInterpolator(overshootInterpolator);
        }
        this.A0.setDuration(j3);
        this.A0.start();
    }

    public final void n(float f10) {
        this.f43016y0 = f10;
        invalidate();
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final void o() {
        ValueAnimator valueAnimator = this.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f43016y0 == 1.0f) {
            return;
        }
        setScaleX(getScaleX() * this.f43016y0);
        setScaleY(getScaleY() * this.f43016y0);
        n(1.0f);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c8 c8Var = this.f43015x0;
        if (c8Var != null) {
            c8Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        c8 c8Var = this.f43015x0;
        if (c8Var != null) {
            c8Var.h.remove(this);
        }
        super.onDetachedFromWindow();
    }
}
