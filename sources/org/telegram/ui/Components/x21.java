package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
public final class x21 extends rt0 {
    public final Paint f40129f0;
    public boolean f40130g0;
    public boolean f40131h0;
    public boolean f40132i0;
    public ValueAnimator f40133j0;
    public float f40134k0;
    public final float[] f40135l0;
    public boolean m0;
    public final y21 f40136n0;

    public x21(y21 y21Var, Context context) {
        super(context, null);
        this.f40136n0 = y21Var;
        this.f40129f0 = new Paint(1);
        this.f40130g0 = false;
        this.f40131h0 = false;
        this.f40132i0 = false;
        this.f40134k0 = 0.0f;
        this.f40135l0 = new float[8];
        setWillNotDraw(false);
        int i7 = y21Var.f28645t0;
        setPadding(i7, 0, i7, 0);
        setDelegate(new w21(this));
    }

    public final float X() {
        y21 y21Var = this.f40136n0;
        return Math.min(1.0f, Math.max(0.0f, y21Var.l1 / (y21Var.f40480i1 * 2.0f)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z9;
        boolean z10;
        Canvas canvas2;
        int w02;
        int max;
        boolean z11;
        float f10;
        float f11;
        y21 y21Var = this.f40136n0;
        n31 n31Var = y21Var.f40482k1;
        int i7 = y21Var.f40480i1;
        GradientDrawable gradientDrawable = y21Var.f40481j1;
        float X = X();
        boolean z12 = false;
        if (X == 0.0f && !y21Var.I) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f40132i0 != z9) {
            ValueAnimator valueAnimator = this.f40133j0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f40132i0 = z9;
            ValueAnimator valueAnimator2 = this.f40133j0;
            if (valueAnimator2 == null) {
                float f12 = this.f40134k0;
                if (z9) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
                this.f40133j0 = ofFloat;
                ofFloat.addUpdateListener(new c60(this, 28));
                this.f40133j0.setDuration(200L);
            } else {
                float f13 = this.f40134k0;
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                valueAnimator2.setFloatValues(f13, f10);
            }
            this.f40133j0.start();
        }
        if (this.f40134k0 > 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.m0 != z10) {
            this.m0 = z10;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, y21Var.I0)) > 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28128s8, y21Var.I0), 855638016)) > 0.721f) {
                z12 = true;
            }
            if (!z10) {
                z11 = z12;
            }
            org.telegram.messenger.g0.s3(y21Var.getWindow(), z11);
        }
        if (this.f40134k0 > 0.0f) {
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, y21Var.I0);
            Paint paint = this.f40129f0;
            paint.setColor(w03);
            float max2 = (int) Math.max(0.0f, n31Var.getTranslationY() + (org.telegram.messenger.g0.f22531m - i7) + ((1.0f - X()) * i7) + y21Var.l1 + org.telegram.messenger.g0.L(24.0f));
            canvas2 = canvas;
            canvas2.drawRect(y21Var.f28645t0, org.telegram.messenger.g0.W1(this.f40134k0, max, -org.telegram.messenger.g0.f22531m), getMeasuredWidth() - y21Var.f28645t0, max2, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas2.save();
        canvas2.translate(0.0f, (n31Var.getTranslationY() + org.telegram.messenger.g0.f22531m) - i7);
        int L = org.telegram.messenger.g0.L(36.0f);
        int L2 = org.telegram.messenger.g0.L(4.0f);
        int i10 = (int) ((1.0f - X) * L2 * 2.0f);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(2.0f));
        gradientDrawable.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wj, y21Var.I0), (int) (Color.alpha(w02) * X)));
        gradientDrawable.setBounds((getWidth() - L) / 2, org.telegram.messenger.k5.C(10.0f, y21Var.l1, i10), (getWidth() + L) / 2, org.telegram.messenger.g0.L(10.0f) + y21Var.l1 + i10 + L2);
        gradientDrawable.draw(canvas2);
        canvas2.restore();
    }

    @Override
    public final float getTranslationY() {
        return this.f40136n0.f40482k1.getTranslationY();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.messenger.g0.i3(new ir0(this, 23), 200L);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        y21 y21Var = this.f40136n0;
        GradientDrawable gradientDrawable = y21Var.f40481j1;
        n31 n31Var = y21Var.f40482k1;
        if (n31Var.c()) {
            y21Var.l1 = n31Var.getContentTopOffset();
            y21Var.f28615b.invalidate();
        }
        super.onDraw(canvas);
        float X = X();
        int i10 = y21Var.f40480i1;
        int i11 = (int) ((1.0f - X) * i10);
        int i12 = org.telegram.messenger.g0.f22531m - i10;
        canvas.save();
        canvas.translate(0.0f, n31Var.getTranslationY() + i12);
        Drawable drawable = y21Var.f28642r0;
        int i13 = (y21Var.l1 - y21Var.f28644s0) + i11;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (i12 < 0) {
            i7 = -i12;
        } else {
            i7 = 0;
        }
        drawable.setBounds(0, i13, measuredWidth, measuredHeight + i7);
        y21Var.f28642r0.draw(canvas);
        if (X > 0.0f && X < 1.0f) {
            float L = org.telegram.messenger.g0.L(12.0f) * X;
            gradientDrawable.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, y21Var.I0));
            float[] fArr = this.f40135l0;
            fArr[3] = L;
            fArr[2] = L;
            fArr[1] = L;
            fArr[0] = L;
            gradientDrawable.setCornerRadii(fArr);
            gradientDrawable.setBounds(y21Var.f28645t0, y21Var.l1 + i11, getWidth() - y21Var.f28645t0, org.telegram.messenger.g0.L(24.0f) + y21Var.l1 + i11);
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            y21 y21Var = this.f40136n0;
            if (y21Var.l1 != 0 && motionEvent.getY() < y21Var.l1) {
                y21Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13 = org.telegram.messenger.g0.f22531m;
        int Q = Q();
        int size = (int) (((View.MeasureSpec.getSize(getMeasuredHeight()) - i13) + Q) * 0.2f);
        this.f40131h0 = true;
        int L = org.telegram.messenger.g0.L(20.0f);
        y21 y21Var = this.f40136n0;
        if (Q > L) {
            y21Var.f40482k1.a(true);
            y21Var.f28640q0 = false;
            this.f40130g0 = true;
        } else {
            y21Var.f40482k1.a(false);
            y21Var.f28640q0 = true;
            this.f40130g0 = false;
        }
        y21Var.f40482k1.setContentViewPaddingTop(size);
        if (getPaddingTop() != i13) {
            int i14 = y21Var.f28645t0;
            setPadding(i14, i13, i14, 0);
        }
        this.f40131h0 = false;
        super.onLayout(z9, i7, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f40136n0.I && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (!this.f40131h0) {
            super.requestLayout();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        this.f40136n0.f40482k1.setTranslationY(f10);
        invalidate();
    }
}
