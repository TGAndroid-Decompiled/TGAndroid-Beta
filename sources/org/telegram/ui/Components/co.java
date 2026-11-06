package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public abstract class co extends FrameLayout {
    public o61 f32627a;
    public float f32628b;
    public boolean f32629c;
    public float d;
    public ValueAnimator f32630e;

    public abstract void a(boolean z9);

    public final void b(boolean z9) {
        float f10;
        this.f32629c = z9;
        ValueAnimator valueAnimator = this.f32630e;
        if (valueAnimator != null) {
            this.f32630e = null;
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
        this.f32630e = ofFloat;
        ofFloat.addUpdateListener(new e6(this, 13));
        this.f32630e.setInterpolator(xq.h);
        this.f32630e.setDuration(320L);
        this.f32630e.addListener(new t9(4, this, z9));
        this.f32630e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f32628b);
    }

    @Override
    public final boolean isShown() {
        return this.f32629c;
    }

    public void setShown(float f10) {
        this.f32628b = f10;
        o61 o61Var = this.f32627a;
        if (o61Var != null) {
            o61Var.setPivotX(o61Var.getWidth() / 2.0f);
            this.f32627a.setPivotY(0.0f);
            this.f32627a.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
            this.f32627a.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
        }
        setAlpha(f10);
        invalidate();
    }

    public void setTabs(o61 o61Var) {
        this.f32627a = o61Var;
        addView(o61Var, c8.ha.c(-1.0f, -1));
    }
}
