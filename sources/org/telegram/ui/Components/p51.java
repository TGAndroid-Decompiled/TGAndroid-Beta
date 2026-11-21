package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public class p51 extends FrameLayout {
    public ValueAnimator f38510a;
    public float f38511b;
    public boolean f38512c;
    public Boolean d;
    public final r51 f38513e;

    public p51(r51 r51Var, Context context) {
        super(context);
        this.f38513e = r51Var;
        this.f38512c = false;
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
        r51 r51Var = this.f38513e;
        Drawable drawable = r51Var.f39075r1;
        RectF rectF = r51Var.f39081x1;
        int L = org.telegram.messenger.g0.L(6.0f) + (r51Var.f39082y1 - r51Var.f30207t0);
        int L2 = (r51Var.f39082y1 - r51Var.f30207t0) - org.telegram.messenger.g0.L(13.0f);
        int L3 = org.telegram.messenger.g0.L(50.0f) + getMeasuredHeight();
        int i12 = r51Var.f30207t0;
        int i13 = org.telegram.messenger.g0.f24140m;
        int i14 = L2 + i13;
        int i15 = L + i13;
        int i16 = (L3 + i12) - i13;
        float translationY = getTranslationY() + i12 + i14;
        int i17 = org.telegram.messenger.g0.f24140m;
        if (translationY < i17 * 2) {
            int min = (int) Math.min(i17, ((i7 - i14) - r51Var.f30207t0) - getTranslationY());
            i14 -= min;
            i16 += min;
            f10 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.g0.f24140m);
        } else {
            f10 = 1.0f;
        }
        float translationY2 = getTranslationY() + r51Var.f30207t0 + i14;
        float f11 = org.telegram.messenger.g0.f24140m;
        boolean z12 = false;
        if (translationY2 < f11) {
            i11 = (int) Math.min(f11, ((i10 - i14) - r51Var.f30207t0) - getTranslationY());
        } else {
            i11 = 0;
        }
        drawable.setBounds(0, i14, getMeasuredWidth(), i16);
        drawable.draw(canvas);
        if (!r51Var.N1) {
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.m6.f29669t0.setColor(r51Var.A1);
                rectF.set(r51Var.f30208u0, r51Var.f30207t0 + i14, getMeasuredWidth() - r51Var.f30208u0, org.telegram.messenger.g0.L(24.0f) + r51Var.f30207t0 + i14);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.m6.f29669t0);
            }
            int L4 = org.telegram.messenger.g0.L(36.0f);
            rectF.set((getMeasuredWidth() - L4) / 2, i15, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.g0.L(4.0f) + i15);
            org.telegram.ui.ActionBar.m6.f29669t0.setColor(org.telegram.ui.ActionBar.m6.x0(null, r51Var.D1, false));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.f29669t0);
        }
        if (i11 > 0) {
            org.telegram.ui.ActionBar.m6.f29669t0.setColor(r51Var.A1);
        }
        if (i11 > org.telegram.messenger.g0.f24140m / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29451h5, r51Var.J0)) > 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29658s8, r51Var.J0), 855638016)) > 0.721f) {
                z12 = true;
            }
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            org.telegram.messenger.g0.r3(r51Var.getWindow(), z11);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            r51 r51Var = this.f38513e;
            if (y10 < r51Var.f39082y1) {
                r51Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f38513e.R0();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        int size = View.MeasureSpec.getSize(i10);
        this.f38512c = true;
        r51 r51Var = this.f38513e;
        di.b1 b1Var = r51Var.f39072o1;
        int i11 = r51Var.f30208u0;
        setPadding(i11, org.telegram.messenger.g0.f24140m, i11, 0);
        this.f38512c = false;
        int paddingTop = size - getPaddingTop();
        if (r51Var.d) {
            L = org.telegram.messenger.g0.L(8.0f);
            r51Var.u0(false);
            int i12 = r51Var.f39082y1;
            if (i12 != 0) {
                float f10 = i12;
                this.f38511b = f10;
                setTranslationY(f10);
                ValueAnimator valueAnimator = this.f38510a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.f38510a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38511b, 0.0f);
                this.f38510a = ofFloat;
                ofFloat.addUpdateListener(new i51(1, this));
                this.f38510a.setDuration(250L);
                this.f38510a.setInterpolator(org.telegram.ui.ActionBar.i1.f29002w);
                this.f38510a.addListener(new u11(this, 5));
                this.f38510a.start();
            } else if (this.f38510a != null) {
                setTranslationY(this.f38511b);
            }
        } else {
            L = (paddingTop - ((paddingTop / 5) * 3)) + org.telegram.messenger.g0.L(8.0f);
            r51Var.f30204r0 = true;
        }
        if (b1Var.getPaddingTop() != L) {
            this.f38512c = true;
            b1Var.setPadding(0, L, 0, 0);
            this.f38512c = false;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f38513e.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f38512c) {
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
