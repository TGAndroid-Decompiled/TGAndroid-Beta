package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public class o51 extends FrameLayout {
    public ValueAnimator f38035a;
    public float f38036b;
    public boolean f38037c;
    public Boolean d;
    public final q51 f38038e;

    public o51(q51 q51Var, Context context) {
        super(context);
        this.f38038e = q51Var;
        this.f38037c = false;
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
        boolean z10;
        boolean z11;
        canvas.save();
        q51 q51Var = this.f38038e;
        Drawable drawable = q51Var.f38701r1;
        RectF rectF = q51Var.f38707x1;
        int L = org.telegram.messenger.g0.L(6.0f) + (q51Var.f38708y1 - q51Var.f30260t0);
        int L2 = (q51Var.f38708y1 - q51Var.f30260t0) - org.telegram.messenger.g0.L(13.0f);
        int L3 = org.telegram.messenger.g0.L(50.0f) + getMeasuredHeight();
        int i12 = q51Var.f30260t0;
        int i13 = org.telegram.messenger.g0.f24220m;
        int i14 = L2 + i13;
        int i15 = L + i13;
        int i16 = (L3 + i12) - i13;
        float translationY = getTranslationY() + i12 + i14;
        int i17 = org.telegram.messenger.g0.f24220m;
        if (translationY < i17 * 2) {
            int min = (int) Math.min(i17, ((i7 - i14) - q51Var.f30260t0) - getTranslationY());
            i14 -= min;
            i16 += min;
            f10 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.g0.f24220m);
        } else {
            f10 = 1.0f;
        }
        float translationY2 = getTranslationY() + q51Var.f30260t0 + i14;
        float f11 = org.telegram.messenger.g0.f24220m;
        boolean z12 = false;
        if (translationY2 < f11) {
            i11 = (int) Math.min(f11, ((i10 - i14) - q51Var.f30260t0) - getTranslationY());
        } else {
            i11 = 0;
        }
        drawable.setBounds(0, i14, getMeasuredWidth(), i16);
        drawable.draw(canvas);
        if (!q51Var.N1) {
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.n6.f29742t0.setColor(q51Var.A1);
                rectF.set(q51Var.f30261u0, q51Var.f30260t0 + i14, getMeasuredWidth() - q51Var.f30261u0, org.telegram.messenger.g0.L(24.0f) + q51Var.f30260t0 + i14);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.n6.f29742t0);
            }
            int L4 = org.telegram.messenger.g0.L(36.0f);
            rectF.set((getMeasuredWidth() - L4) / 2, i15, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.g0.L(4.0f) + i15);
            org.telegram.ui.ActionBar.n6.f29742t0.setColor(org.telegram.ui.ActionBar.n6.x0(null, q51Var.D1, false));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.n6.f29742t0);
        }
        if (i11 > 0) {
            org.telegram.ui.ActionBar.n6.f29742t0.setColor(q51Var.A1);
        }
        if (i11 > org.telegram.messenger.g0.f24220m / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, q51Var.J0)) > 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29731s8, q51Var.J0), 855638016)) > 0.721f) {
                z12 = true;
            }
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            org.telegram.messenger.g0.r3(q51Var.getWindow(), z11);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            q51 q51Var = this.f38038e;
            if (y10 < q51Var.f38708y1) {
                q51Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f38038e.R0();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        int size = View.MeasureSpec.getSize(i10);
        this.f38037c = true;
        q51 q51Var = this.f38038e;
        di.b1 b1Var = q51Var.f38698o1;
        int i11 = q51Var.f30261u0;
        setPadding(i11, org.telegram.messenger.g0.f24220m, i11, 0);
        this.f38037c = false;
        int paddingTop = size - getPaddingTop();
        if (q51Var.d) {
            L = org.telegram.messenger.g0.L(8.0f);
            q51Var.u0(false);
            int i12 = q51Var.f38708y1;
            if (i12 != 0) {
                float f10 = i12;
                this.f38036b = f10;
                setTranslationY(f10);
                ValueAnimator valueAnimator = this.f38035a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.f38035a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38036b, 0.0f);
                this.f38035a = ofFloat;
                ofFloat.addUpdateListener(new h51(1, this));
                this.f38035a.setDuration(250L);
                this.f38035a.setInterpolator(org.telegram.ui.ActionBar.i1.f29066w);
                this.f38035a.addListener(new s11(this, 5));
                this.f38035a.start();
            } else if (this.f38035a != null) {
                setTranslationY(this.f38036b);
            }
        } else {
            L = (paddingTop - ((paddingTop / 5) * 3)) + org.telegram.messenger.g0.L(8.0f);
            q51Var.f30257r0 = true;
        }
        if (b1Var.getPaddingTop() != L) {
            this.f38037c = true;
            b1Var.setPadding(0, L, 0, 0);
            this.f38037c = false;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f38038e.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f38037c) {
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
