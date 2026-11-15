package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public abstract class mo extends FrameLayout {
    public v61 f37328a;
    public float f37329b;
    public boolean f37330c;
    public float d;
    public ValueAnimator f37331e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f10;
        this.f37330c = z10;
        ValueAnimator valueAnimator = this.f37331e;
        if (valueAnimator != null) {
            this.f37331e = null;
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
        this.f37331e = ofFloat;
        ofFloat.addUpdateListener(new c6(this, 13));
        this.f37331e.setInterpolator(er.h);
        this.f37331e.setDuration(320L);
        this.f37331e.addListener(new org.telegram.ui.nn(5, this, z10));
        this.f37331e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f37329b);
    }

    @Override
    public final boolean isShown() {
        return this.f37330c;
    }

    public void setShown(float f10) {
        this.f37329b = f10;
        v61 v61Var = this.f37328a;
        if (v61Var != null) {
            v61Var.setPivotX(v61Var.getWidth() / 2.0f);
            this.f37328a.setPivotY(0.0f);
            this.f37328a.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
            this.f37328a.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
        }
        setAlpha(f10);
        invalidate();
    }

    public void setTabs(v61 v61Var) {
        this.f37328a = v61Var;
        addView(v61Var, c8.ja.c(-1.0f, -1));
    }
}
