package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public class y41 extends FrameLayout {
    public ValueAnimator f40520a;
    public float f40521b;
    public boolean f40522c;
    public Boolean d;
    public final a51 f40523e;

    public y41(a51 a51Var, Context context) {
        super(context);
        this.f40523e = a51Var;
        this.f40522c = false;
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
        a51 a51Var = this.f40523e;
        Drawable drawable = a51Var.n1;
        RectF rectF = a51Var.f31692t1;
        int L = org.telegram.messenger.g0.L(6.0f) + (a51Var.f31693u1 - a51Var.f28644s0);
        int L2 = (a51Var.f31693u1 - a51Var.f28644s0) - org.telegram.messenger.g0.L(13.0f);
        int L3 = org.telegram.messenger.g0.L(50.0f) + getMeasuredHeight();
        int i12 = a51Var.f28644s0;
        int i13 = org.telegram.messenger.g0.f22531m;
        int i14 = L2 + i13;
        int i15 = L + i13;
        int i16 = (L3 + i12) - i13;
        float translationY = getTranslationY() + i12 + i14;
        int i17 = org.telegram.messenger.g0.f22531m;
        if (translationY < i17 * 2) {
            int min = (int) Math.min(i17, ((i7 - i14) - a51Var.f28644s0) - getTranslationY());
            i14 -= min;
            i16 += min;
            f10 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.g0.f22531m);
        } else {
            f10 = 1.0f;
        }
        float translationY2 = getTranslationY() + a51Var.f28644s0 + i14;
        float f11 = org.telegram.messenger.g0.f22531m;
        boolean z11 = false;
        if (translationY2 < f11) {
            i11 = (int) Math.min(f11, ((i10 - i14) - a51Var.f28644s0) - getTranslationY());
        } else {
            i11 = 0;
        }
        drawable.setBounds(0, i14, getMeasuredWidth(), i16);
        drawable.draw(canvas);
        if (!a51Var.J1) {
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.k6.f28139t0.setColor(a51Var.f31695w1);
                rectF.set(a51Var.f28645t0, a51Var.f28644s0 + i14, getMeasuredWidth() - a51Var.f28645t0, org.telegram.messenger.g0.L(24.0f) + a51Var.f28644s0 + i14);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.k6.f28139t0);
            }
            int L4 = org.telegram.messenger.g0.L(36.0f);
            rectF.set((getMeasuredWidth() - L4) / 2, i15, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.g0.L(4.0f) + i15);
            org.telegram.ui.ActionBar.k6.f28139t0.setColor(org.telegram.ui.ActionBar.k6.x0(null, a51Var.f31698z1, false));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.f28139t0);
        }
        if (i11 > 0) {
            org.telegram.ui.ActionBar.k6.f28139t0.setColor(a51Var.f31695w1);
        }
        if (i11 > org.telegram.messenger.g0.f22531m / 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z9) {
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, a51Var.I0)) > 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28128s8, a51Var.I0), 855638016)) > 0.721f) {
                z11 = true;
            }
            this.d = Boolean.valueOf(z9);
            if (!z9) {
                z10 = z11;
            }
            org.telegram.messenger.g0.s3(a51Var.getWindow(), z10);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            a51 a51Var = this.f40523e;
            if (y10 < a51Var.f31693u1) {
                a51Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.f40523e.Q0();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        int size = View.MeasureSpec.getSize(i10);
        this.f40522c = true;
        a51 a51Var = this.f40523e;
        bi.q1 q1Var = a51Var.f31685k1;
        int i11 = a51Var.f28645t0;
        setPadding(i11, org.telegram.messenger.g0.f22531m, i11, 0);
        this.f40522c = false;
        int paddingTop = size - getPaddingTop();
        if (a51Var.d) {
            L = org.telegram.messenger.g0.L(8.0f);
            a51Var.u0(false);
            int i12 = a51Var.f31693u1;
            if (i12 != 0) {
                float f10 = i12;
                this.f40521b = f10;
                setTranslationY(f10);
                ValueAnimator valueAnimator = this.f40520a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.f40520a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f40521b, 0.0f);
                this.f40520a = ofFloat;
                ofFloat.addUpdateListener(new c60(this, 29));
                this.f40520a.setDuration(250L);
                this.f40520a.setInterpolator(org.telegram.ui.ActionBar.i1.f27540w);
                this.f40520a.addListener(new e11(this, 5));
                this.f40520a.start();
            } else if (this.f40520a != null) {
                setTranslationY(this.f40521b);
            }
        } else {
            L = (paddingTop - ((paddingTop / 5) * 3)) + org.telegram.messenger.g0.L(8.0f);
            a51Var.f28640q0 = true;
        }
        if (q1Var.getPaddingTop() != L) {
            this.f40522c = true;
            q1Var.setPadding(0, L, 0, 0);
            this.f40522c = false;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f40523e.I && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f40522c) {
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
