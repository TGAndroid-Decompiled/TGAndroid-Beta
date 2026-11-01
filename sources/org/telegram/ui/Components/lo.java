package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public abstract class lo extends FrameLayout {
    public w71 f28232a;
    public float f28233b;
    public boolean f28234c;
    public float d;
    public ValueAnimator e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f7;
        this.f28234c = z10;
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            this.e = null;
            valueAnimator.cancel();
        }
        if (z10) {
            setVisibility(0);
        }
        float f10 = this.d;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.e = ofFloat;
        ofFloat.addUpdateListener(new a6(this, 13));
        this.e.setInterpolator(gr.h);
        this.e.setDuration(320L);
        this.e.addListener(new eg.m(20, this, z10));
        this.e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f28233b);
    }

    @Override
    public final boolean isShown() {
        return this.f28234c;
    }

    public void setShown(float f7) {
        this.f28233b = f7;
        w71 w71Var = this.f28232a;
        if (w71Var != null) {
            w71Var.setPivotX(w71Var.getWidth() / 2.0f);
            this.f28232a.setPivotY(0.0f);
            this.f28232a.setScaleX(org.telegram.messenger.i0.T1(0.8f, 1.0f, f7));
            this.f28232a.setScaleY(org.telegram.messenger.i0.T1(0.8f, 1.0f, f7));
        }
        setAlpha(f7);
        invalidate();
    }

    public void setTabs(w71 w71Var) {
        this.f28232a = w71Var;
        addView(w71Var, w7.b6.c(-1.0f, -1));
    }
}
