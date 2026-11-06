package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public class z41 extends FrameLayout {
    public ValueAnimator f40871a;
    public float f40872b;
    public boolean f40873c;
    public Boolean d;
    public final b51 f40874e;

    public z41(b51 b51Var, Context context) {
        super(context);
        this.f40874e = b51Var;
        this.f40873c = false;
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
        b51 b51Var = this.f40874e;
        Drawable drawable = b51Var.n1;
        RectF rectF = b51Var.f32029t1;
        int L = org.telegram.messenger.g0.L(6.0f) + (b51Var.f32030u1 - b51Var.f28645s0);
        int L2 = (b51Var.f32030u1 - b51Var.f28645s0) - org.telegram.messenger.g0.L(13.0f);
        int L3 = org.telegram.messenger.g0.L(50.0f) + getMeasuredHeight();
        int i12 = b51Var.f28645s0;
        int i13 = org.telegram.messenger.g0.f22538m;
        int i14 = L2 + i13;
        int i15 = L + i13;
        int i16 = (L3 + i12) - i13;
        float translationY = getTranslationY() + i12 + i14;
        int i17 = org.telegram.messenger.g0.f22538m;
        if (translationY < i17 * 2) {
            int min = (int) Math.min(i17, ((i7 - i14) - b51Var.f28645s0) - getTranslationY());
            i14 -= min;
            i16 += min;
            f10 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.g0.f22538m);
        } else {
            f10 = 1.0f;
        }
        float translationY2 = getTranslationY() + b51Var.f28645s0 + i14;
        float f11 = org.telegram.messenger.g0.f22538m;
        boolean z11 = false;
        if (translationY2 < f11) {
            i11 = (int) Math.min(f11, ((i10 - i14) - b51Var.f28645s0) - getTranslationY());
        } else {
            i11 = 0;
        }
        drawable.setBounds(0, i14, getMeasuredWidth(), i16);
        drawable.draw(canvas);
        if (!b51Var.J1) {
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.k6.f28140t0.setColor(b51Var.f32032w1);
                rectF.set(b51Var.f28646t0, b51Var.f28645s0 + i14, getMeasuredWidth() - b51Var.f28646t0, org.telegram.messenger.g0.L(24.0f) + b51Var.f28645s0 + i14);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.k6.f28140t0);
            }
            int L4 = org.telegram.messenger.g0.L(36.0f);
            rectF.set((getMeasuredWidth() - L4) / 2, i15, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.g0.L(4.0f) + i15);
            org.telegram.ui.ActionBar.k6.f28140t0.setColor(org.telegram.ui.ActionBar.k6.x0(null, b51Var.f32035z1, false));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.f28140t0);
        }
        if (i11 > 0) {
            org.telegram.ui.ActionBar.k6.f28140t0.setColor(b51Var.f32032w1);
        }
        if (i11 > org.telegram.messenger.g0.f22538m / 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z9) {
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27922h5, b51Var.I0)) > 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28129s8, b51Var.I0), 855638016)) > 0.721f) {
                z11 = true;
            }
            this.d = Boolean.valueOf(z9);
            if (!z9) {
                z10 = z11;
            }
            org.telegram.messenger.g0.s3(b51Var.getWindow(), z10);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            b51 b51Var = this.f40874e;
            if (y10 < b51Var.f32030u1) {
                b51Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.f40874e.Q0();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        int size = View.MeasureSpec.getSize(i10);
        this.f40873c = true;
        b51 b51Var = this.f40874e;
        bi.q1 q1Var = b51Var.f32022k1;
        int i11 = b51Var.f28646t0;
        setPadding(i11, org.telegram.messenger.g0.f22538m, i11, 0);
        this.f40873c = false;
        int paddingTop = size - getPaddingTop();
        if (b51Var.d) {
            L = org.telegram.messenger.g0.L(8.0f);
            b51Var.u0(false);
            int i12 = b51Var.f32030u1;
            if (i12 != 0) {
                float f10 = i12;
                this.f40872b = f10;
                setTranslationY(f10);
                ValueAnimator valueAnimator = this.f40871a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.f40871a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f40872b, 0.0f);
                this.f40871a = ofFloat;
                ofFloat.addUpdateListener(new c60(this, 29));
                this.f40871a.setDuration(250L);
                this.f40871a.setInterpolator(org.telegram.ui.ActionBar.i1.f27541w);
                this.f40871a.addListener(new f11(this, 5));
                this.f40871a.start();
            } else if (this.f40871a != null) {
                setTranslationY(this.f40872b);
            }
        } else {
            L = (paddingTop - ((paddingTop / 5) * 3)) + org.telegram.messenger.g0.L(8.0f);
            b51Var.f28641q0 = true;
        }
        if (q1Var.getPaddingTop() != L) {
            this.f40873c = true;
            q1Var.setPadding(0, L, 0, 0);
            this.f40873c = false;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f40874e.I && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f40873c) {
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
