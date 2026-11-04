package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public class t41 extends FrameLayout {
    public ValueAnimator f38248a;
    public float f38249b;
    public boolean f38250c;
    public Boolean d;
    public final v41 f38251e;

    public t41(v41 v41Var, Context context) {
        super(context);
        this.f38251e = v41Var;
        this.f38250c = false;
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
        int i3;
        float f10;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        canvas.save();
        v41 v41Var = this.f38251e;
        Drawable drawable = v41Var.f38996o1;
        RectF rectF = v41Var.f39002u1;
        int L = org.telegram.messenger.g0.L(6.0f) + (v41Var.f39003v1 - v41Var.f28617t0);
        int L2 = (v41Var.f39003v1 - v41Var.f28617t0) - org.telegram.messenger.g0.L(13.0f);
        int L3 = org.telegram.messenger.g0.L(50.0f) + getMeasuredHeight();
        int i12 = v41Var.f28617t0;
        int i13 = org.telegram.messenger.g0.f22602m;
        int i14 = L2 + i13;
        int i15 = L + i13;
        int i16 = (L3 + i12) - i13;
        float translationY = getTranslationY() + i12 + i14;
        int i17 = org.telegram.messenger.g0.f22602m;
        if (translationY < i17 * 2) {
            int min = (int) Math.min(i17, ((i3 - i14) - v41Var.f28617t0) - getTranslationY());
            i14 -= min;
            i16 += min;
            f10 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.g0.f22602m);
        } else {
            f10 = 1.0f;
        }
        float translationY2 = getTranslationY() + v41Var.f28617t0 + i14;
        float f11 = org.telegram.messenger.g0.f22602m;
        boolean z12 = false;
        if (translationY2 < f11) {
            i11 = (int) Math.min(f11, ((i10 - i14) - v41Var.f28617t0) - getTranslationY());
        } else {
            i11 = 0;
        }
        drawable.setBounds(0, i14, getMeasuredWidth(), i16);
        drawable.draw(canvas);
        if (!v41Var.K1) {
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.k6.f28171t0.setColor(v41Var.f39005x1);
                rectF.set(v41Var.f28618u0, v41Var.f28617t0 + i14, getMeasuredWidth() - v41Var.f28618u0, org.telegram.messenger.g0.L(24.0f) + v41Var.f28617t0 + i14);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.k6.f28171t0);
            }
            int L4 = org.telegram.messenger.g0.L(36.0f);
            rectF.set((getMeasuredWidth() - L4) / 2, i15, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.g0.L(4.0f) + i15);
            org.telegram.ui.ActionBar.k6.f28171t0.setColor(org.telegram.ui.ActionBar.k6.x0(null, v41Var.A1, false));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.f28171t0);
        }
        if (i11 > 0) {
            org.telegram.ui.ActionBar.k6.f28171t0.setColor(v41Var.f39005x1);
        }
        if (i11 > org.telegram.messenger.g0.f22602m / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, v41Var.J0)) > 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28160s8, v41Var.J0), 855638016)) > 0.721f) {
                z12 = true;
            }
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            org.telegram.messenger.g0.s3(v41Var.getWindow(), z11);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y9 = motionEvent.getY();
            v41 v41Var = this.f38251e;
            if (y9 < v41Var.f39003v1) {
                v41Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        this.f38251e.Q0();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int L;
        int size = View.MeasureSpec.getSize(i10);
        this.f38250c = true;
        v41 v41Var = this.f38251e;
        ci.j1 j1Var = v41Var.f38994l1;
        int i11 = v41Var.f28618u0;
        setPadding(i11, org.telegram.messenger.g0.f22602m, i11, 0);
        this.f38250c = false;
        int paddingTop = size - getPaddingTop();
        if (v41Var.d) {
            L = org.telegram.messenger.g0.L(8.0f);
            v41Var.u0(false);
            int i12 = v41Var.f39003v1;
            if (i12 != 0) {
                float f10 = i12;
                this.f38249b = f10;
                setTranslationY(f10);
                ValueAnimator valueAnimator = this.f38248a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.f38248a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38249b, 0.0f);
                this.f38248a = ofFloat;
                ofFloat.addUpdateListener(new m41(1, this));
                this.f38248a.setDuration(250L);
                this.f38248a.setInterpolator(org.telegram.ui.ActionBar.h1.f27551w);
                this.f38248a.addListener(new j01(this, 6));
                this.f38248a.start();
            } else if (this.f38248a != null) {
                setTranslationY(this.f38249b);
            }
        } else {
            L = (paddingTop - ((paddingTop / 5) * 3)) + org.telegram.messenger.g0.L(8.0f);
            v41Var.f28614r0 = true;
        }
        if (j1Var.getPaddingTop() != L) {
            this.f38250c = true;
            j1Var.setPadding(0, L, 0, 0);
            this.f38250c = false;
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f38251e.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f38250c) {
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
