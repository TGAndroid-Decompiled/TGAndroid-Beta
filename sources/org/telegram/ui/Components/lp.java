package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class lp extends FrameLayout {
    public t91 f28245a;
    public float f28246b;
    public boolean f28247c;
    public float d;
    public ValueAnimator f28248e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f7;
        this.f28247c = z10;
        ValueAnimator valueAnimator = this.f28248e;
        if (valueAnimator != null) {
            this.f28248e = null;
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
        this.f28248e = ofFloat;
        ofFloat.addUpdateListener(new m6(this, 13));
        this.f28248e.setInterpolator(js.h);
        this.f28248e.setDuration(320L);
        this.f28248e.addListener(new ea(4, this, z10));
        this.f28248e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f28246b);
    }

    @Override
    public final boolean isShown() {
        return this.f28247c;
    }

    public void setShown(float f7) {
        this.f28246b = f7;
        t91 t91Var = this.f28245a;
        if (t91Var != null) {
            t91Var.setPivotX(t91Var.getWidth() / 2.0f);
            this.f28245a.setPivotY(0.0f);
            this.f28245a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
            this.f28245a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        }
        setAlpha(f7);
        invalidate();
    }

    public void setTabs(t91 t91Var) {
        this.f28245a = t91Var;
        addView(t91Var, w7.w5.d(-1.0f, -1));
    }
}
