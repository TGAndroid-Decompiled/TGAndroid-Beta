package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public abstract class vo extends FrameLayout {
    public i71 f40839a;
    public float f40840b;
    public boolean f40841c;
    public float d;
    public ValueAnimator f40842e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f10;
        this.f40841c = z10;
        ValueAnimator valueAnimator = this.f40842e;
        if (valueAnimator != null) {
            this.f40842e = null;
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
        this.f40842e = ofFloat;
        ofFloat.addUpdateListener(new x(this, 14));
        this.f40842e.setInterpolator(nr.h);
        this.f40842e.setDuration(320L);
        this.f40842e.addListener(new org.telegram.ui.on(5, this, z10));
        this.f40842e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f40840b);
    }

    @Override
    public final boolean isShown() {
        return this.f40841c;
    }

    public void setShown(float f10) {
        this.f40840b = f10;
        i71 i71Var = this.f40839a;
        if (i71Var != null) {
            i71Var.setPivotX(i71Var.getWidth() / 2.0f);
            this.f40839a.setPivotY(0.0f);
            this.f40839a.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
            this.f40839a.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
        }
        setAlpha(f10);
        invalidate();
    }

    public void setTabs(i71 i71Var) {
        this.f40839a = i71Var;
        addView(i71Var, c8.na.c(-1.0f, -1));
    }
}
