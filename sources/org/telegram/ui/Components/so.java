package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class so extends FrameLayout {
    public h81 f30405a;
    public float f30406b;
    public boolean f30407c;
    public float d;
    public ValueAnimator f30408e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f7;
        this.f30407c = z10;
        ValueAnimator valueAnimator = this.f30408e;
        if (valueAnimator != null) {
            this.f30408e = null;
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
        this.f30408e = ofFloat;
        ofFloat.addUpdateListener(new l6(this, 12));
        this.f30408e.setInterpolator(pr.h);
        this.f30408e.setDuration(320L);
        this.f30408e.addListener(new org.telegram.ui.to(5, this, z10));
        this.f30408e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f30406b);
    }

    @Override
    public final boolean isShown() {
        return this.f30407c;
    }

    public void setShown(float f7) {
        this.f30406b = f7;
        h81 h81Var = this.f30405a;
        if (h81Var != null) {
            h81Var.setPivotX(h81Var.getWidth() / 2.0f);
            this.f30405a.setPivotY(0.0f);
            this.f30405a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
            this.f30405a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        }
        setAlpha(f7);
        invalidate();
    }

    public void setTabs(h81 h81Var) {
        this.f30405a = h81Var;
        addView(h81Var, w7.x5.c(-1.0f, -1));
    }
}
