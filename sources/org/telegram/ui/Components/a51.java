package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public class a51 extends FrameLayout {
    public ValueAnimator f31712a;
    public float f31713b;
    public boolean f31714c;
    public Boolean d;
    public final c51 f31715e;

    public a51(c51 c51Var, Context context) {
        super(context);
        this.f31715e = c51Var;
        this.f31714c = false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0, getPaddingTop(), getMeasuredWidth(), getMeasuredHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        int i10;
        int i11;
        boolean z9;
        boolean z10;
        canvas.save();
        c51 c51Var = this.f31715e;
        Drawable drawable = c51Var.f32466q1;
        RectF rectF = c51Var.f32472w1;
        int L = org.telegram.messenger.g0.L(6.0f) + (c51Var.f32473x1 - c51Var.f28704s0);
        int L2 = (c51Var.f32473x1 - c51Var.f28704s0) - org.telegram.messenger.g0.L(13.0f);
        int L3 = org.telegram.messenger.g0.L(50.0f) + getMeasuredHeight();
        int i12 = c51Var.f28704s0;
        int i13 = org.telegram.messenger.g0.f22561m;
        int i14 = L2 + i13;
        int i15 = L + i13;
        int i16 = (L3 + i12) - i13;
        float translationY = getTranslationY() + i12 + i14;
        int i17 = org.telegram.messenger.g0.f22561m;
        if (translationY < i17 * 2) {
            int min = (int) Math.min(i17, ((i7 - i14) - c51Var.f28704s0) - getTranslationY());
            i14 -= min;
            i16 += min;
            f10 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.g0.f22561m);
        } else {
            f10 = 1.0f;
        }
        float translationY2 = getTranslationY() + c51Var.f28704s0 + i14;
        float f11 = org.telegram.messenger.g0.f22561m;
        boolean z11 = false;
        if (translationY2 < f11) {
            i11 = (int) Math.min(f11, ((i10 - i14) - c51Var.f28704s0) - getTranslationY());
        } else {
            i11 = 0;
        }
        drawable.setBounds(0, i14, getMeasuredWidth(), i16);
        drawable.draw(canvas);
        if (!c51Var.M1) {
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.m6.f28181t0.setColor(c51Var.f32475z1);
                rectF.set(c51Var.f28705t0, c51Var.f28704s0 + i14, getMeasuredWidth() - c51Var.f28705t0, org.telegram.messenger.g0.L(24.0f) + c51Var.f28704s0 + i14);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.m6.f28181t0);
            }
            int L4 = org.telegram.messenger.g0.L(36.0f);
            rectF.set((getMeasuredWidth() - L4) / 2, i15, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.g0.L(4.0f) + i15);
            org.telegram.ui.ActionBar.m6.f28181t0.setColor(org.telegram.ui.ActionBar.m6.x0(null, c51Var.C1, false));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.f28181t0);
        }
        if (i11 > 0) {
            org.telegram.ui.ActionBar.m6.f28181t0.setColor(c51Var.f32475z1);
        }
        if (i11 > org.telegram.messenger.g0.f22561m / 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z9) {
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, c51Var.I0)) > 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28170s8, c51Var.I0), 855638016)) > 0.721f) {
                z11 = true;
            }
            this.d = Boolean.valueOf(z9);
            if (!z9) {
                z10 = z11;
            }
            org.telegram.messenger.g0.s3(c51Var.getWindow(), z10);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            c51 c51Var = this.f31715e;
            if (y10 < c51Var.f32473x1) {
                c51Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.f31715e.Q0();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        int size = View.MeasureSpec.getSize(i10);
        this.f31714c = true;
        c51 c51Var = this.f31715e;
        bi.q1 q1Var = c51Var.n1;
        int i11 = c51Var.f28705t0;
        setPadding(i11, org.telegram.messenger.g0.f22561m, i11, 0);
        this.f31714c = false;
        int paddingTop = size - getPaddingTop();
        if (c51Var.d) {
            L = org.telegram.messenger.g0.L(8.0f);
            c51Var.u0(false);
            int i12 = c51Var.f32473x1;
            if (i12 != 0) {
                float f10 = i12;
                this.f31713b = f10;
                setTranslationY(f10);
                ValueAnimator valueAnimator = this.f31712a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.f31712a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f31713b, 0.0f);
                this.f31712a = ofFloat;
                ofFloat.addUpdateListener(new c60(this, 29));
                this.f31712a.setDuration(250L);
                this.f31712a.setInterpolator(org.telegram.ui.ActionBar.i1.f27527w);
                this.f31712a.addListener(new f11(this, 5));
                this.f31712a.start();
            } else if (this.f31712a != null) {
                setTranslationY(this.f31713b);
            }
        } else {
            L = (paddingTop - ((paddingTop / 5) * 3)) + org.telegram.messenger.g0.L(8.0f);
            c51Var.f28700q0 = true;
        }
        if (q1Var.getPaddingTop() != L) {
            this.f31714c = true;
            q1Var.setPadding(0, L, 0, 0);
            this.f31714c = false;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f31715e.I && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f31714c) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        invalidate();
    }
}
