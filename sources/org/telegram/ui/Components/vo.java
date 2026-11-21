package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public abstract class vo extends FrameLayout {
    public i71 f40876a;
    public float f40877b;
    public boolean f40878c;
    public float d;
    public ValueAnimator f40879e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f10;
        this.f40878c = z10;
        ValueAnimator valueAnimator = this.f40879e;
        if (valueAnimator != null) {
            this.f40879e = null;
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
        this.f40879e = ofFloat;
        ofFloat.addUpdateListener(new x(this, 14));
        this.f40879e.setInterpolator(nr.h);
        this.f40879e.setDuration(320L);
        this.f40879e.addListener(new org.telegram.ui.on(5, this, z10));
        this.f40879e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f40877b);
    }

    @Override
    public final boolean isShown() {
        return this.f40878c;
    }

    public void setShown(float f10) {
        this.f40877b = f10;
        i71 i71Var = this.f40876a;
        if (i71Var != null) {
            i71Var.setPivotX(i71Var.getWidth() / 2.0f);
            this.f40876a.setPivotY(0.0f);
            this.f40876a.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
            this.f40876a.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
        }
        setAlpha(f10);
        invalidate();
    }

    public void setTabs(i71 i71Var) {
        this.f40876a = i71Var;
        addView(i71Var, c8.ma.c(-1.0f, -1));
    }
}
