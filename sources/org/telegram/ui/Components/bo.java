package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public abstract class bo extends FrameLayout {
    public u61 f32302a;
    public float f32303b;
    public boolean f32304c;
    public float d;
    public ValueAnimator f32305e;

    public abstract void a(boolean z9);

    public final void b(boolean z9) {
        float f10;
        this.f32304c = z9;
        ValueAnimator valueAnimator = this.f32305e;
        if (valueAnimator != null) {
            this.f32305e = null;
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
        this.f32305e = ofFloat;
        ofFloat.addUpdateListener(new d6(this, 13));
        this.f32305e.setInterpolator(wq.h);
        this.f32305e.setDuration(320L);
        this.f32305e.addListener(new s9(4, this, z9));
        this.f32305e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f32303b);
    }

    @Override
    public final boolean isShown() {
        return this.f32304c;
    }

    public void setShown(float f10) {
        this.f32303b = f10;
        u61 u61Var = this.f32302a;
        if (u61Var != null) {
            u61Var.setPivotX(u61Var.getWidth() / 2.0f);
            this.f32302a.setPivotY(0.0f);
            this.f32302a.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
            this.f32302a.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
        }
        setAlpha(f10);
        invalidate();
    }

    public void setTabs(u61 u61Var) {
        this.f32302a = u61Var;
        addView(u61Var, c8.ha.c(-1.0f, -1));
    }
}
