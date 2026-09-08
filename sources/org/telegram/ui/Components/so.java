package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class so extends FrameLayout {
    public h81 f30404a;
    public float f30405b;
    public boolean f30406c;
    public float d;
    public ValueAnimator f30407e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f7;
        this.f30406c = z10;
        ValueAnimator valueAnimator = this.f30407e;
        if (valueAnimator != null) {
            this.f30407e = null;
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
        this.f30407e = ofFloat;
        ofFloat.addUpdateListener(new l6(this, 12));
        this.f30407e.setInterpolator(pr.h);
        this.f30407e.setDuration(320L);
        this.f30407e.addListener(new org.telegram.ui.to(5, this, z10));
        this.f30407e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f30405b);
    }

    @Override
    public final boolean isShown() {
        return this.f30406c;
    }

    public void setShown(float f7) {
        this.f30405b = f7;
        h81 h81Var = this.f30404a;
        if (h81Var != null) {
            h81Var.setPivotX(h81Var.getWidth() / 2.0f);
            this.f30404a.setPivotY(0.0f);
            this.f30404a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
            this.f30404a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        }
        setAlpha(f7);
        invalidate();
    }

    public void setTabs(h81 h81Var) {
        this.f30404a = h81Var;
        addView(h81Var, w7.x5.c(-1.0f, -1));
    }
}
