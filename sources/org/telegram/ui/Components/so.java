package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class so extends FrameLayout {
    public h81 f30377a;
    public float f30378b;
    public boolean f30379c;
    public float d;
    public ValueAnimator f30380e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f7;
        this.f30379c = z10;
        ValueAnimator valueAnimator = this.f30380e;
        if (valueAnimator != null) {
            this.f30380e = null;
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
        this.f30380e = ofFloat;
        ofFloat.addUpdateListener(new l6(this, 12));
        this.f30380e.setInterpolator(pr.h);
        this.f30380e.setDuration(320L);
        this.f30380e.addListener(new org.telegram.ui.to(5, this, z10));
        this.f30380e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f30378b);
    }

    @Override
    public final boolean isShown() {
        return this.f30379c;
    }

    public void setShown(float f7) {
        this.f30378b = f7;
        h81 h81Var = this.f30377a;
        if (h81Var != null) {
            h81Var.setPivotX(h81Var.getWidth() / 2.0f);
            this.f30377a.setPivotY(0.0f);
            this.f30377a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
            this.f30377a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        }
        setAlpha(f7);
        invalidate();
    }

    public void setTabs(h81 h81Var) {
        this.f30377a = h81Var;
        addView(h81Var, w7.x5.c(-1.0f, -1));
    }
}
