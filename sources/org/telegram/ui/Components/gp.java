package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class gp extends FrameLayout {
    public u91 f28710a;
    public float f28711b;
    public boolean f28712c;
    public float d;
    public ValueAnimator e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f7;
        this.f28712c = z10;
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
        ofFloat.addUpdateListener(new n6(this, 14));
        this.e.setInterpolator(ds.h);
        this.e.setDuration(320L);
        this.e.addListener(new org.telegram.ui.lo(5, this, z10));
        this.e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f28711b);
    }

    @Override
    public final boolean isShown() {
        return this.f28712c;
    }

    public void setShown(float f7) {
        this.f28711b = f7;
        u91 u91Var = this.f28710a;
        if (u91Var != null) {
            u91Var.setPivotX(u91Var.getWidth() / 2.0f);
            this.f28710a.setPivotY(0.0f);
            this.f28710a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
            this.f28710a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        }
        setAlpha(f7);
        invalidate();
    }

    public void setTabs(u91 u91Var) {
        this.f28710a = u91Var;
        addView(u91Var, kb1.g(-1.0f, -1));
    }
}
