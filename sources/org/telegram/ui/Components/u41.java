package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public class u41 extends FrameLayout {
    public ValueAnimator f38521a;
    public float f38522b;
    public boolean f38523c;
    public Boolean d;
    public final w41 f38524e;

    public u41(w41 w41Var, Context context) {
        super(context);
        this.f38524e = w41Var;
        this.f38523c = false;
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
        w41 w41Var = this.f38524e;
        Drawable drawable = w41Var.n1;
        RectF rectF = w41Var.f39840t1;
        int L = org.telegram.messenger.g0.L(6.0f) + (w41Var.f39841u1 - w41Var.f28644s0);
        int L2 = (w41Var.f39841u1 - w41Var.f28644s0) - org.telegram.messenger.g0.L(13.0f);
        int L3 = org.telegram.messenger.g0.L(50.0f) + getMeasuredHeight();
        int i12 = w41Var.f28644s0;
        int i13 = org.telegram.messenger.g0.f22531m;
        int i14 = L2 + i13;
        int i15 = L + i13;
        int i16 = (L3 + i12) - i13;
        float translationY = getTranslationY() + i12 + i14;
        int i17 = org.telegram.messenger.g0.f22531m;
        if (translationY < i17 * 2) {
            int min = (int) Math.min(i17, ((i7 - i14) - w41Var.f28644s0) - getTranslationY());
            i14 -= min;
            i16 += min;
            f10 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.g0.f22531m);
        } else {
            f10 = 1.0f;
        }
        float translationY2 = getTranslationY() + w41Var.f28644s0 + i14;
        float f11 = org.telegram.messenger.g0.f22531m;
        boolean z11 = false;
        if (translationY2 < f11) {
            i11 = (int) Math.min(f11, ((i10 - i14) - w41Var.f28644s0) - getTranslationY());
        } else {
            i11 = 0;
        }
        drawable.setBounds(0, i14, getMeasuredWidth(), i16);
        drawable.draw(canvas);
        if (!w41Var.J1) {
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.k6.f28139t0.setColor(w41Var.f39843w1);
                rectF.set(w41Var.f28645t0, w41Var.f28644s0 + i14, getMeasuredWidth() - w41Var.f28645t0, org.telegram.messenger.g0.L(24.0f) + w41Var.f28644s0 + i14);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.k6.f28139t0);
            }
            int L4 = org.telegram.messenger.g0.L(36.0f);
            rectF.set((getMeasuredWidth() - L4) / 2, i15, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.g0.L(4.0f) + i15);
            org.telegram.ui.ActionBar.k6.f28139t0.setColor(org.telegram.ui.ActionBar.k6.x0(null, w41Var.f39846z1, false));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.f28139t0);
        }
        if (i11 > 0) {
            org.telegram.ui.ActionBar.k6.f28139t0.setColor(w41Var.f39843w1);
        }
        if (i11 > org.telegram.messenger.g0.f22531m / 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z9) {
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, w41Var.I0)) > 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28128s8, w41Var.I0), 855638016)) > 0.721f) {
                z11 = true;
            }
            this.d = Boolean.valueOf(z9);
            if (!z9) {
                z10 = z11;
            }
            org.telegram.messenger.g0.s3(w41Var.getWindow(), z10);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            w41 w41Var = this.f38524e;
            if (y10 < w41Var.f39841u1) {
                w41Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.f38524e.Q0();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        int size = View.MeasureSpec.getSize(i10);
        this.f38523c = true;
        w41 w41Var = this.f38524e;
        bi.q1 q1Var = w41Var.f39833k1;
        int i11 = w41Var.f28645t0;
        setPadding(i11, org.telegram.messenger.g0.f22531m, i11, 0);
        this.f38523c = false;
        int paddingTop = size - getPaddingTop();
        if (w41Var.d) {
            L = org.telegram.messenger.g0.L(8.0f);
            w41Var.u0(false);
            int i12 = w41Var.f39841u1;
            if (i12 != 0) {
                float f10 = i12;
                this.f38522b = f10;
                setTranslationY(f10);
                ValueAnimator valueAnimator = this.f38521a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.f38521a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38522b, 0.0f);
                this.f38521a = ofFloat;
                ofFloat.addUpdateListener(new t41(0, this));
                this.f38521a.setDuration(250L);
                this.f38521a.setInterpolator(org.telegram.ui.ActionBar.i1.f27540w);
                this.f38521a.addListener(new j01(this, 6));
                this.f38521a.start();
            } else if (this.f38521a != null) {
                setTranslationY(this.f38522b);
            }
        } else {
            L = (paddingTop - ((paddingTop / 5) * 3)) + org.telegram.messenger.g0.L(8.0f);
            w41Var.f28640q0 = true;
        }
        if (q1Var.getPaddingTop() != L) {
            this.f38523c = true;
            q1Var.setPadding(0, L, 0, 0);
            this.f38523c = false;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f38524e.I && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f38523c) {
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
