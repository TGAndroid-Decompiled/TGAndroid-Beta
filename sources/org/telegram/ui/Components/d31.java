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
public final class d31 extends rt0 {
    public final Paint f32774f0;
    public boolean f32775g0;
    public boolean f32776h0;
    public boolean f32777i0;
    public ValueAnimator f32778j0;
    public float f32779k0;
    public final float[] f32780l0;
    public boolean m0;
    public final e31 f32781n0;

    public d31(e31 e31Var, Context context) {
        super(context, null);
        this.f32781n0 = e31Var;
        this.f32774f0 = new Paint(1);
        this.f32775g0 = false;
        this.f32776h0 = false;
        this.f32777i0 = false;
        this.f32779k0 = 0.0f;
        this.f32780l0 = new float[8];
        setWillNotDraw(false);
        int i7 = e31Var.f28649t0;
        setPadding(i7, 0, i7, 0);
        setDelegate(new c31(this));
    }

    public final float X() {
        e31 e31Var = this.f32781n0;
        return Math.min(1.0f, Math.max(0.0f, e31Var.l1 / (e31Var.f33190i1 * 2.0f)));
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
        e31 e31Var = this.f32781n0;
        t31 t31Var = e31Var.f33192k1;
        int i7 = e31Var.f33190i1;
        GradientDrawable gradientDrawable = e31Var.f33191j1;
        float X = X();
        boolean z12 = false;
        if (X == 0.0f && !e31Var.I) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f32777i0 != z9) {
            ValueAnimator valueAnimator = this.f32778j0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f32777i0 = z9;
            ValueAnimator valueAnimator2 = this.f32778j0;
            if (valueAnimator2 == null) {
                float f12 = this.f32779k0;
                if (z9) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
                this.f32778j0 = ofFloat;
                ofFloat.addUpdateListener(new c60(this, 27));
                this.f32778j0.setDuration(200L);
            } else {
                float f13 = this.f32779k0;
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                valueAnimator2.setFloatValues(f13, f10);
            }
            this.f32778j0.start();
        }
        if (this.f32779k0 > 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.m0 != z10) {
            this.m0 = z10;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27925h5, e31Var.I0)) > 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28132s8, e31Var.I0), 855638016)) > 0.721f) {
                z12 = true;
            }
            if (!z10) {
                z11 = z12;
            }
            org.telegram.messenger.g0.s3(e31Var.getWindow(), z11);
        }
        if (this.f32779k0 > 0.0f) {
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27925h5, e31Var.I0);
            Paint paint = this.f32774f0;
            paint.setColor(w03);
            float max2 = (int) Math.max(0.0f, t31Var.getTranslationY() + (org.telegram.messenger.g0.f22557m - i7) + ((1.0f - X()) * i7) + e31Var.l1 + org.telegram.messenger.g0.L(24.0f));
            canvas2 = canvas;
            canvas2.drawRect(e31Var.f28649t0, org.telegram.messenger.g0.W1(this.f32779k0, max, -org.telegram.messenger.g0.f22557m), getMeasuredWidth() - e31Var.f28649t0, max2, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas2.save();
        canvas2.translate(0.0f, (t31Var.getTranslationY() + org.telegram.messenger.g0.f22557m) - i7);
        int L = org.telegram.messenger.g0.L(36.0f);
        int L2 = org.telegram.messenger.g0.L(4.0f);
        int i10 = (int) ((1.0f - X) * L2 * 2.0f);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(2.0f));
        gradientDrawable.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wj, e31Var.I0), (int) (Color.alpha(w02) * X)));
        gradientDrawable.setBounds((getWidth() - L) / 2, org.telegram.messenger.k5.C(10.0f, e31Var.l1, i10), (getWidth() + L) / 2, org.telegram.messenger.g0.L(10.0f) + e31Var.l1 + i10 + L2);
        gradientDrawable.draw(canvas2);
        canvas2.restore();
    }

    @Override
    public final float getTranslationY() {
        return this.f32781n0.f33192k1.getTranslationY();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.messenger.g0.i3(new ir0(this, 24), 200L);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        e31 e31Var = this.f32781n0;
        GradientDrawable gradientDrawable = e31Var.f33191j1;
        t31 t31Var = e31Var.f33192k1;
        if (t31Var.c()) {
            e31Var.l1 = t31Var.getContentTopOffset();
            e31Var.f28619b.invalidate();
        }
        super.onDraw(canvas);
        float X = X();
        int i10 = e31Var.f33190i1;
        int i11 = (int) ((1.0f - X) * i10);
        int i12 = org.telegram.messenger.g0.f22557m - i10;
        canvas.save();
        canvas.translate(0.0f, t31Var.getTranslationY() + i12);
        Drawable drawable = e31Var.f28646r0;
        int i13 = (e31Var.l1 - e31Var.f28648s0) + i11;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (i12 < 0) {
            i7 = -i12;
        } else {
            i7 = 0;
        }
        drawable.setBounds(0, i13, measuredWidth, measuredHeight + i7);
        e31Var.f28646r0.draw(canvas);
        if (X > 0.0f && X < 1.0f) {
            float L = org.telegram.messenger.g0.L(12.0f) * X;
            gradientDrawable.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27925h5, e31Var.I0));
            float[] fArr = this.f32780l0;
            fArr[3] = L;
            fArr[2] = L;
            fArr[1] = L;
            fArr[0] = L;
            gradientDrawable.setCornerRadii(fArr);
            gradientDrawable.setBounds(e31Var.f28649t0, e31Var.l1 + i11, getWidth() - e31Var.f28649t0, org.telegram.messenger.g0.L(24.0f) + e31Var.l1 + i11);
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            e31 e31Var = this.f32781n0;
            if (e31Var.l1 != 0 && motionEvent.getY() < e31Var.l1) {
                e31Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13 = org.telegram.messenger.g0.f22557m;
        int Q = Q();
        int size = (int) (((View.MeasureSpec.getSize(getMeasuredHeight()) - i13) + Q) * 0.2f);
        this.f32776h0 = true;
        int L = org.telegram.messenger.g0.L(20.0f);
        e31 e31Var = this.f32781n0;
        if (Q > L) {
            e31Var.f33192k1.a(true);
            e31Var.f28644q0 = false;
            this.f32775g0 = true;
        } else {
            e31Var.f33192k1.a(false);
            e31Var.f28644q0 = true;
            this.f32775g0 = false;
        }
        e31Var.f33192k1.setContentViewPaddingTop(size);
        if (getPaddingTop() != i13) {
            int i14 = e31Var.f28649t0;
            setPadding(i14, i13, i14, 0);
        }
        this.f32776h0 = false;
        super.onLayout(z9, i7, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f32781n0.I && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (!this.f32776h0) {
            super.requestLayout();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        this.f32781n0.f33192k1.setTranslationY(f10);
        invalidate();
    }
}
