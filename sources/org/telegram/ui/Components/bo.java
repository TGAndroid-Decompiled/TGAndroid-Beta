package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public abstract class bo extends FrameLayout {
    public m61 f32330a;
    public float f32331b;
    public boolean f32332c;
    public float d;
    public ValueAnimator f32333e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f10;
        this.f32332c = z10;
        ValueAnimator valueAnimator = this.f32333e;
        if (valueAnimator != null) {
            this.f32333e = null;
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
        this.f32333e = ofFloat;
        ofFloat.addUpdateListener(new c6(this, 13));
        this.f32333e.setInterpolator(xq.h);
        this.f32333e.setDuration(320L);
        this.f32333e.addListener(new s9(4, this, z10));
        this.f32333e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f32331b);
    }

    @Override
    public final boolean isShown() {
        return this.f32332c;
    }

    public void setShown(float f10) {
        this.f32331b = f10;
        m61 m61Var = this.f32330a;
        if (m61Var != null) {
            m61Var.setPivotX(m61Var.getWidth() / 2.0f);
            this.f32330a.setPivotY(0.0f);
            this.f32330a.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
            this.f32330a.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
        }
        setAlpha(f10);
        invalidate();
    }

    public void setTabs(m61 m61Var) {
        this.f32330a = m61Var;
        addView(m61Var, b8.mf.c(-1.0f, -1));
    }
}
