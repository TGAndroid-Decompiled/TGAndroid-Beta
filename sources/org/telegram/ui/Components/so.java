package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public abstract class so extends FrameLayout {
    public j71 f39660a;
    public float f39661b;
    public boolean f39662c;
    public float d;
    public ValueAnimator f39663e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f10;
        this.f39662c = z10;
        ValueAnimator valueAnimator = this.f39663e;
        if (valueAnimator != null) {
            this.f39663e = null;
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
        this.f39663e = ofFloat;
        ofFloat.addUpdateListener(new w(this, 14));
        this.f39663e.setInterpolator(kr.h);
        this.f39663e.setDuration(320L);
        this.f39663e.addListener(new org.telegram.ui.on(5, this, z10));
        this.f39663e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f39661b);
    }

    @Override
    public final boolean isShown() {
        return this.f39662c;
    }

    public void setShown(float f10) {
        this.f39661b = f10;
        j71 j71Var = this.f39660a;
        if (j71Var != null) {
            j71Var.setPivotX(j71Var.getWidth() / 2.0f);
            this.f39660a.setPivotY(0.0f);
            this.f39660a.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
            this.f39660a.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
        }
        setAlpha(f10);
        invalidate();
    }

    public void setTabs(j71 j71Var) {
        this.f39660a = j71Var;
        addView(j71Var, c8.na.c(-1.0f, -1));
    }
}
