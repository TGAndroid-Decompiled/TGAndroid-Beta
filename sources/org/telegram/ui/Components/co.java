package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public abstract class co extends FrameLayout {
    public u61 f32649a;
    public float f32650b;
    public boolean f32651c;
    public float d;
    public ValueAnimator f32652e;

    public abstract void a(boolean z9);

    public final void b(boolean z9) {
        float f10;
        this.f32651c = z9;
        ValueAnimator valueAnimator = this.f32652e;
        if (valueAnimator != null) {
            this.f32652e = null;
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
        this.f32652e = ofFloat;
        ofFloat.addUpdateListener(new e6(this, 13));
        this.f32652e.setInterpolator(xq.h);
        this.f32652e.setDuration(320L);
        this.f32652e.addListener(new t9(4, this, z9));
        this.f32652e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f32650b);
    }

    @Override
    public final boolean isShown() {
        return this.f32651c;
    }

    public void setShown(float f10) {
        this.f32650b = f10;
        u61 u61Var = this.f32649a;
        if (u61Var != null) {
            u61Var.setPivotX(u61Var.getWidth() / 2.0f);
            this.f32649a.setPivotY(0.0f);
            this.f32649a.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
            this.f32649a.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
        }
        setAlpha(f10);
        invalidate();
    }

    public void setTabs(u61 u61Var) {
        this.f32649a = u61Var;
        addView(u61Var, c8.ha.c(-1.0f, -1));
    }
}
