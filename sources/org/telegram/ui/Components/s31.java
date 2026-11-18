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
public final class s31 extends au0 {
    public final Paint f39472g0;
    public boolean f39473h0;
    public boolean f39474i0;
    public boolean f39475j0;
    public ValueAnimator f39476k0;
    public float f39477l0;
    public final float[] m0;
    public boolean f39478n0;
    public final t31 f39479o0;

    public s31(t31 t31Var, Context context) {
        super(context, null);
        this.f39479o0 = t31Var;
        this.f39472g0 = new Paint(1);
        this.f39473h0 = false;
        this.f39474i0 = false;
        this.f39475j0 = false;
        this.f39477l0 = 0.0f;
        this.m0 = new float[8];
        setWillNotDraw(false);
        int i7 = t31Var.f30225u0;
        setPadding(i7, 0, i7, 0);
        setDelegate(new r31(this));
    }

    public final float X() {
        t31 t31Var = this.f39479o0;
        return Math.min(1.0f, Math.max(0.0f, t31Var.f39901p1 / (t31Var.f39899m1 * 2.0f)));
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
        t31 t31Var = this.f39479o0;
        h41 h41Var = t31Var.f39900o1;
        int i7 = t31Var.f39899m1;
        GradientDrawable gradientDrawable = t31Var.n1;
        float X = X();
        boolean z13 = false;
        if (X == 0.0f && !t31Var.J) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f39475j0 != z10) {
            ValueAnimator valueAnimator = this.f39476k0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f39475j0 = z10;
            ValueAnimator valueAnimator2 = this.f39476k0;
            if (valueAnimator2 == null) {
                float f12 = this.f39477l0;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
                this.f39476k0 = ofFloat;
                ofFloat.addUpdateListener(new e60(this, 29));
                this.f39476k0.setDuration(200L);
            } else {
                float f13 = this.f39477l0;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                valueAnimator2.setFloatValues(f13, f10);
            }
            this.f39476k0.start();
        }
        if (this.f39477l0 > 0.5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f39478n0 != z11) {
            this.f39478n0 = z11;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29467h5, t31Var.J0)) > 0.721f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29674s8, t31Var.J0), 855638016)) > 0.721f) {
                z13 = true;
            }
            if (!z11) {
                z12 = z13;
            }
            org.telegram.messenger.g0.r3(t31Var.getWindow(), z12);
        }
        if (this.f39477l0 > 0.0f) {
            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29467h5, t31Var.J0);
            Paint paint = this.f39472g0;
            paint.setColor(w03);
            float max2 = (int) Math.max(0.0f, h41Var.getTranslationY() + (org.telegram.messenger.g0.f24112m - i7) + ((1.0f - X()) * i7) + t31Var.f39901p1 + org.telegram.messenger.g0.L(24.0f));
            canvas2 = canvas;
            canvas2.drawRect(t31Var.f30225u0, org.telegram.messenger.g0.W1(this.f39477l0, max, -org.telegram.messenger.g0.f24112m), getMeasuredWidth() - t31Var.f30225u0, max2, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas2.save();
        canvas2.translate(0.0f, (h41Var.getTranslationY() + org.telegram.messenger.g0.f24112m) - i7);
        int L = org.telegram.messenger.g0.L(36.0f);
        int L2 = org.telegram.messenger.g0.L(4.0f);
        int i10 = (int) ((1.0f - X) * L2 * 2.0f);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(2.0f));
        gradientDrawable.setColor(i0.a.o(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.zj, t31Var.J0), (int) (Color.alpha(w02) * X)));
        gradientDrawable.setBounds((getWidth() - L) / 2, org.telegram.messenger.f3.C(10.0f, t31Var.f39901p1, i10), (getWidth() + L) / 2, org.telegram.messenger.g0.L(10.0f) + t31Var.f39901p1 + i10 + L2);
        gradientDrawable.draw(canvas2);
        canvas2.restore();
    }

    @Override
    public final float getTranslationY() {
        return this.f39479o0.f39900o1.getTranslationY();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.messenger.g0.h3(new ap0(this, 26), 200L);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        t31 t31Var = this.f39479o0;
        GradientDrawable gradientDrawable = t31Var.n1;
        h41 h41Var = t31Var.f39900o1;
        if (h41Var.c()) {
            t31Var.f39901p1 = h41Var.getContentTopOffset();
            t31Var.f30190b.invalidate();
        }
        super.onDraw(canvas);
        float X = X();
        int i10 = t31Var.f39899m1;
        int i11 = (int) ((1.0f - X) * i10);
        int i12 = org.telegram.messenger.g0.f24112m - i10;
        canvas.save();
        canvas.translate(0.0f, h41Var.getTranslationY() + i12);
        Drawable drawable = t31Var.f30223s0;
        int i13 = (t31Var.f39901p1 - t31Var.f30224t0) + i11;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (i12 < 0) {
            i7 = -i12;
        } else {
            i7 = 0;
        }
        drawable.setBounds(0, i13, measuredWidth, measuredHeight + i7);
        t31Var.f30223s0.draw(canvas);
        if (X > 0.0f && X < 1.0f) {
            float L = org.telegram.messenger.g0.L(12.0f) * X;
            gradientDrawable.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29467h5, t31Var.J0));
            float[] fArr = this.m0;
            fArr[3] = L;
            fArr[2] = L;
            fArr[1] = L;
            fArr[0] = L;
            gradientDrawable.setCornerRadii(fArr);
            gradientDrawable.setBounds(t31Var.f30225u0, t31Var.f39901p1 + i11, getWidth() - t31Var.f30225u0, org.telegram.messenger.g0.L(24.0f) + t31Var.f39901p1 + i11);
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            t31 t31Var = this.f39479o0;
            if (t31Var.f39901p1 != 0 && motionEvent.getY() < t31Var.f39901p1) {
                t31Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = org.telegram.messenger.g0.f24112m;
        int Q = Q();
        int size = (int) (((View.MeasureSpec.getSize(getMeasuredHeight()) - i13) + Q) * 0.2f);
        this.f39474i0 = true;
        int L = org.telegram.messenger.g0.L(20.0f);
        t31 t31Var = this.f39479o0;
        if (Q > L) {
            t31Var.f39900o1.a(true);
            t31Var.f30221r0 = false;
            this.f39473h0 = true;
        } else {
            t31Var.f39900o1.a(false);
            t31Var.f30221r0 = true;
            this.f39473h0 = false;
        }
        t31Var.f39900o1.setContentViewPaddingTop(size);
        if (getPaddingTop() != i13) {
            int i14 = t31Var.f30225u0;
            setPadding(i14, i13, i14, 0);
        }
        this.f39474i0 = false;
        super.onLayout(z10, i7, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f39479o0.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (!this.f39474i0) {
            super.requestLayout();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        this.f39479o0.f39900o1.setTranslationY(f10);
        invalidate();
    }
}
