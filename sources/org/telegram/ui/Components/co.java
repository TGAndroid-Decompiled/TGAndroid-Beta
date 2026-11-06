package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public abstract class co extends FrameLayout {
    public t61 f32631a;
    public float f32632b;
    public boolean f32633c;
    public float d;
    public ValueAnimator f32634e;

    public abstract void a(boolean z9);

    public final void b(boolean z9) {
        float f10;
        this.f32633c = z9;
        ValueAnimator valueAnimator = this.f32634e;
        if (valueAnimator != null) {
            this.f32634e = null;
            valueAnimator.cancel();
        }
        if (z9) {
            setVisibility(0);
        }
        float f11 = this.d;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f32634e = ofFloat;
        ofFloat.addUpdateListener(new e6(this, 13));
        this.f32634e.setInterpolator(xq.h);
        this.f32634e.setDuration(320L);
        this.f32634e.addListener(new t9(4, this, z9));
        this.f32634e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f32632b);
    }

    @Override
    public final boolean isShown() {
        return this.f32633c;
    }

    public void setShown(float f10) {
        this.f32632b = f10;
        t61 t61Var = this.f32631a;
        if (t61Var != null) {
            t61Var.setPivotX(t61Var.getWidth() / 2.0f);
            this.f32631a.setPivotY(0.0f);
            this.f32631a.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
            this.f32631a.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
        }
        setAlpha(f10);
        invalidate();
    }

    public void setTabs(t61 t61Var) {
        this.f32631a = t61Var;
        addView(t61Var, c8.ha.c(-1.0f, -1));
    }
}
