package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public abstract class co extends FrameLayout {
    public v61 f32727a;
    public float f32728b;
    public boolean f32729c;
    public float d;
    public ValueAnimator f32730e;

    public abstract void a(boolean z9);

    public final void b(boolean z9) {
        float f10;
        this.f32729c = z9;
        ValueAnimator valueAnimator = this.f32730e;
        if (valueAnimator != null) {
            this.f32730e = null;
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
        this.f32730e = ofFloat;
        ofFloat.addUpdateListener(new e6(this, 13));
        this.f32730e.setInterpolator(xq.h);
        this.f32730e.setDuration(320L);
        this.f32730e.addListener(new t9(4, this, z9));
        this.f32730e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f32728b);
    }

    @Override
    public final boolean isShown() {
        return this.f32729c;
    }

    public void setShown(float f10) {
        this.f32728b = f10;
        v61 v61Var = this.f32727a;
        if (v61Var != null) {
            v61Var.setPivotX(v61Var.getWidth() / 2.0f);
            this.f32727a.setPivotY(0.0f);
            this.f32727a.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
            this.f32727a.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
        }
        setAlpha(f10);
        invalidate();
    }

    public void setTabs(v61 v61Var) {
        this.f32727a = v61Var;
        addView(v61Var, c8.ha.c(-1.0f, -1));
    }
}
