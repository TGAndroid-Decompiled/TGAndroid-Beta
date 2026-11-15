package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public abstract class mo extends FrameLayout {
    public v61 f37329a;
    public float f37330b;
    public boolean f37331c;
    public float d;
    public ValueAnimator f37332e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f10;
        this.f37331c = z10;
        ValueAnimator valueAnimator = this.f37332e;
        if (valueAnimator != null) {
            this.f37332e = null;
            valueAnimator.cancel();
        }
        if (z10) {
            setVisibility(0);
        }
        float f11 = this.d;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f37332e = ofFloat;
        ofFloat.addUpdateListener(new c6(this, 13));
        this.f37332e.setInterpolator(er.h);
        this.f37332e.setDuration(320L);
        this.f37332e.addListener(new org.telegram.ui.nn(5, this, z10));
        this.f37332e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f37330b);
    }

    @Override
    public final boolean isShown() {
        return this.f37331c;
    }

    public void setShown(float f10) {
        this.f37330b = f10;
        v61 v61Var = this.f37329a;
        if (v61Var != null) {
            v61Var.setPivotX(v61Var.getWidth() / 2.0f);
            this.f37329a.setPivotY(0.0f);
            this.f37329a.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
            this.f37329a.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
        }
        setAlpha(f10);
        invalidate();
    }

    public void setTabs(v61 v61Var) {
        this.f37329a = v61Var;
        addView(v61Var, c8.ja.c(-1.0f, -1));
    }
}
