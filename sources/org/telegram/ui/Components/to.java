package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public abstract class to extends FrameLayout {
    public f71 f40061a;
    public float f40062b;
    public boolean f40063c;
    public float d;
    public ValueAnimator f40064e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f10;
        this.f40063c = z10;
        ValueAnimator valueAnimator = this.f40064e;
        if (valueAnimator != null) {
            this.f40064e = null;
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
        this.f40064e = ofFloat;
        ofFloat.addUpdateListener(new w(this, 14));
        this.f40064e.setInterpolator(lr.h);
        this.f40064e.setDuration(320L);
        this.f40064e.addListener(new org.telegram.ui.on(5, this, z10));
        this.f40064e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f40062b);
    }

    @Override
    public final boolean isShown() {
        return this.f40063c;
    }

    public void setShown(float f10) {
        this.f40062b = f10;
        f71 f71Var = this.f40061a;
        if (f71Var != null) {
            f71Var.setPivotX(f71Var.getWidth() / 2.0f);
            this.f40061a.setPivotY(0.0f);
            this.f40061a.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
            this.f40061a.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
        }
        setAlpha(f10);
        invalidate();
    }

    public void setTabs(f71 f71Var) {
        this.f40061a = f71Var;
        addView(f71Var, c8.ma.c(-1.0f, -1));
    }
}
