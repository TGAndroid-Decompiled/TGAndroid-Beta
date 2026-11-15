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
public final class i31 extends st0 {
    public final Paint f35436g0;
    public boolean f35437h0;
    public boolean f35438i0;
    public boolean f35439j0;
    public ValueAnimator f35440k0;
    public float f35441l0;
    public final float[] m0;
    public boolean f35442n0;
    public final j31 f35443o0;

    public i31(j31 j31Var, Context context) {
        super(context, null);
        this.f35443o0 = j31Var;
        this.f35436g0 = new Paint(1);
        this.f35437h0 = false;
        this.f35438i0 = false;
        this.f35439j0 = false;
        this.f35441l0 = 0.0f;
        this.m0 = new float[8];
        setWillNotDraw(false);
        int i7 = j31Var.f29717u0;
        setPadding(i7, 0, i7, 0);
        setDelegate(new h31(this));
    }

    public final float X() {
        j31 j31Var = this.f35443o0;
        return Math.min(1.0f, Math.max(0.0f, j31Var.f35851p1 / (j31Var.f35849m1 * 2.0f)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        Canvas canvas2;
        int w02;
        int max;
        boolean z12;
        float f10;
        float f11;
        j31 j31Var = this.f35443o0;
        x31 x31Var = j31Var.f35850o1;
        int i7 = j31Var.f35849m1;
        GradientDrawable gradientDrawable = j31Var.n1;
        float X = X();
        boolean z13 = false;
        if (X == 0.0f && !j31Var.J) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f35439j0 != z10) {
            ValueAnimator valueAnimator = this.f35440k0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f35439j0 = z10;
            ValueAnimator valueAnimator2 = this.f35440k0;
            if (valueAnimator2 == null) {
                float f12 = this.f35441l0;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
                this.f35440k0 = ofFloat;
                ofFloat.addUpdateListener(new f60(this, 27));
                this.f35440k0.setDuration(200L);
            } else {
                float f13 = this.f35441l0;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                valueAnimator2.setFloatValues(f13, f10);
            }
            this.f35440k0.start();
        }
        if (this.f35441l0 > 0.5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f35442n0 != z11) {
            this.f35442n0 = z11;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, j31Var.J0)) > 0.721f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29129s8, j31Var.J0), 855638016)) > 0.721f) {
                z13 = true;
            }
            if (!z11) {
                z12 = z13;
            }
            org.telegram.messenger.g0.s3(j31Var.getWindow(), z12);
        }
        if (this.f35441l0 > 0.0f) {
            int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, j31Var.J0);
            Paint paint = this.f35436g0;
            paint.setColor(w03);
            float max2 = (int) Math.max(0.0f, x31Var.getTranslationY() + (org.telegram.messenger.g0.f23603m - i7) + ((1.0f - X()) * i7) + j31Var.f35851p1 + org.telegram.messenger.g0.L(24.0f));
            canvas2 = canvas;
            canvas2.drawRect(j31Var.f29717u0, org.telegram.messenger.g0.W1(this.f35441l0, max, -org.telegram.messenger.g0.f23603m), getMeasuredWidth() - j31Var.f29717u0, max2, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas2.save();
        canvas2.translate(0.0f, (x31Var.getTranslationY() + org.telegram.messenger.g0.f23603m) - i7);
        int L = org.telegram.messenger.g0.L(36.0f);
        int L2 = org.telegram.messenger.g0.L(4.0f);
        int i10 = (int) ((1.0f - X) * L2 * 2.0f);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(2.0f));
        gradientDrawable.setColor(i0.a.o(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.zj, j31Var.J0), (int) (Color.alpha(w02) * X)));
        gradientDrawable.setBounds((getWidth() - L) / 2, org.telegram.messenger.k5.C(10.0f, j31Var.f35851p1, i10), (getWidth() + L) / 2, org.telegram.messenger.g0.L(10.0f) + j31Var.f35851p1 + i10 + L2);
        gradientDrawable.draw(canvas2);
        canvas2.restore();
    }

    @Override
    public final float getTranslationY() {
        return this.f35443o0.f35850o1.getTranslationY();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.messenger.g0.i3(new ro0(this, 27), 200L);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        j31 j31Var = this.f35443o0;
        GradientDrawable gradientDrawable = j31Var.n1;
        x31 x31Var = j31Var.f35850o1;
        if (x31Var.c()) {
            j31Var.f35851p1 = x31Var.getContentTopOffset();
            j31Var.f29682b.invalidate();
        }
        super.onDraw(canvas);
        float X = X();
        int i10 = j31Var.f35849m1;
        int i11 = (int) ((1.0f - X) * i10);
        int i12 = org.telegram.messenger.g0.f23603m - i10;
        canvas.save();
        canvas.translate(0.0f, x31Var.getTranslationY() + i12);
        Drawable drawable = j31Var.f29715s0;
        int i13 = (j31Var.f35851p1 - j31Var.f29716t0) + i11;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (i12 < 0) {
            i7 = -i12;
        } else {
            i7 = 0;
        }
        drawable.setBounds(0, i13, measuredWidth, measuredHeight + i7);
        j31Var.f29715s0.draw(canvas);
        if (X > 0.0f && X < 1.0f) {
            float L = org.telegram.messenger.g0.L(12.0f) * X;
            gradientDrawable.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, j31Var.J0));
            float[] fArr = this.m0;
            fArr[3] = L;
            fArr[2] = L;
            fArr[1] = L;
            fArr[0] = L;
            gradientDrawable.setCornerRadii(fArr);
            gradientDrawable.setBounds(j31Var.f29717u0, j31Var.f35851p1 + i11, getWidth() - j31Var.f29717u0, org.telegram.messenger.g0.L(24.0f) + j31Var.f35851p1 + i11);
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            j31 j31Var = this.f35443o0;
            if (j31Var.f35851p1 != 0 && motionEvent.getY() < j31Var.f35851p1) {
                j31Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = org.telegram.messenger.g0.f23603m;
        int Q = Q();
        int size = (int) (((View.MeasureSpec.getSize(getMeasuredHeight()) - i13) + Q) * 0.2f);
        this.f35438i0 = true;
        int L = org.telegram.messenger.g0.L(20.0f);
        j31 j31Var = this.f35443o0;
        if (Q > L) {
            j31Var.f35850o1.a(true);
            j31Var.f29713r0 = false;
            this.f35437h0 = true;
        } else {
            j31Var.f35850o1.a(false);
            j31Var.f29713r0 = true;
            this.f35437h0 = false;
        }
        j31Var.f35850o1.setContentViewPaddingTop(size);
        if (getPaddingTop() != i13) {
            int i14 = j31Var.f29717u0;
            setPadding(i14, i13, i14, 0);
        }
        this.f35438i0 = false;
        super.onLayout(z10, i7, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f35443o0.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (!this.f35438i0) {
            super.requestLayout();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        this.f35443o0.f35850o1.setTranslationY(f10);
        invalidate();
    }
}
