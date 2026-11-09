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
    public ValueAnimator f31711a;
    public float f31712b;
    public boolean f31713c;
    public Boolean d;
    public final c51 f31714e;

    public a51(c51 c51Var, Context context) {
        super(context);
        this.f31714e = c51Var;
        this.f31713c = false;
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
        c51 c51Var = this.f31714e;
        Drawable drawable = c51Var.n1;
        RectF rectF = c51Var.f32537t1;
        int L = org.telegram.messenger.g0.L(6.0f) + (c51Var.f32538u1 - c51Var.f28653s0);
        int L2 = (c51Var.f32538u1 - c51Var.f28653s0) - org.telegram.messenger.g0.L(13.0f);
        int L3 = org.telegram.messenger.g0.L(50.0f) + getMeasuredHeight();
        int i12 = c51Var.f28653s0;
        int i13 = org.telegram.messenger.g0.f22557m;
        int i14 = L2 + i13;
        int i15 = L + i13;
        int i16 = (L3 + i12) - i13;
        float translationY = getTranslationY() + i12 + i14;
        int i17 = org.telegram.messenger.g0.f22557m;
        if (translationY < i17 * 2) {
            int min = (int) Math.min(i17, ((i7 - i14) - c51Var.f28653s0) - getTranslationY());
            i14 -= min;
            i16 += min;
            f10 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.g0.f22557m);
        } else {
            f10 = 1.0f;
        }
        float translationY2 = getTranslationY() + c51Var.f28653s0 + i14;
        float f11 = org.telegram.messenger.g0.f22557m;
        boolean z11 = false;
        if (translationY2 < f11) {
            i11 = (int) Math.min(f11, ((i10 - i14) - c51Var.f28653s0) - getTranslationY());
        } else {
            i11 = 0;
        }
        drawable.setBounds(0, i14, getMeasuredWidth(), i16);
        drawable.draw(canvas);
        if (!c51Var.J1) {
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.l6.f28156t0.setColor(c51Var.f32540w1);
                rectF.set(c51Var.f28654t0, c51Var.f28653s0 + i14, getMeasuredWidth() - c51Var.f28654t0, org.telegram.messenger.g0.L(24.0f) + c51Var.f28653s0 + i14);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.l6.f28156t0);
            }
            int L4 = org.telegram.messenger.g0.L(36.0f);
            rectF.set((getMeasuredWidth() - L4) / 2, i15, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.g0.L(4.0f) + i15);
            org.telegram.ui.ActionBar.l6.f28156t0.setColor(org.telegram.ui.ActionBar.l6.x0(null, c51Var.f32543z1, false));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.l6.f28156t0);
        }
        if (i11 > 0) {
            org.telegram.ui.ActionBar.l6.f28156t0.setColor(c51Var.f32540w1);
        }
        if (i11 > org.telegram.messenger.g0.f22557m / 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z9) {
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27938h5, c51Var.I0)) > 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28145s8, c51Var.I0), 855638016)) > 0.721f) {
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
            c51 c51Var = this.f31714e;
            if (y10 < c51Var.f32538u1) {
                c51Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.f31714e.Q0();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        int size = View.MeasureSpec.getSize(i10);
        this.f31713c = true;
        c51 c51Var = this.f31714e;
        bi.q1 q1Var = c51Var.f32530k1;
        int i11 = c51Var.f28654t0;
        setPadding(i11, org.telegram.messenger.g0.f22557m, i11, 0);
        this.f31713c = false;
        int paddingTop = size - getPaddingTop();
        if (c51Var.d) {
            L = org.telegram.messenger.g0.L(8.0f);
            c51Var.u0(false);
            int i12 = c51Var.f32538u1;
            if (i12 != 0) {
                float f10 = i12;
                this.f31712b = f10;
                setTranslationY(f10);
                ValueAnimator valueAnimator = this.f31711a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.f31711a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f31712b, 0.0f);
                this.f31711a = ofFloat;
                ofFloat.addUpdateListener(new d60(this, 29));
                this.f31711a.setDuration(250L);
                this.f31711a.setInterpolator(org.telegram.ui.ActionBar.i1.f27519w);
                this.f31711a.addListener(new g11(this, 5));
                this.f31711a.start();
            } else if (this.f31711a != null) {
                setTranslationY(this.f31712b);
            }
        } else {
            L = (paddingTop - ((paddingTop / 5) * 3)) + org.telegram.messenger.g0.L(8.0f);
            c51Var.f28649q0 = true;
        }
        if (q1Var.getPaddingTop() != L) {
            this.f31713c = true;
            q1Var.setPadding(0, L, 0, 0);
            this.f31713c = false;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f31714e.I && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f31713c) {
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
