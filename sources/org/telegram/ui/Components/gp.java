package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class gp extends FrameLayout {
    public j91 f25372a;
    public float f25373b;
    public boolean f25374c;
    public float d;
    public ValueAnimator e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f7;
        this.f25374c = z10;
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
        ofFloat.addUpdateListener(new n6(this, 13));
        this.e.setInterpolator(es.h);
        this.e.setDuration(320L);
        this.e.addListener(new org.telegram.ui.vo(5, this, z10));
        this.e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f25373b);
    }

    @Override
    public final boolean isShown() {
        return this.f25374c;
    }

    public void setShown(float f7) {
        this.f25373b = f7;
        j91 j91Var = this.f25372a;
        if (j91Var != null) {
            j91Var.setPivotX(j91Var.getWidth() / 2.0f);
            this.f25372a.setPivotY(0.0f);
            this.f25372a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
            this.f25372a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        }
        setAlpha(f7);
        invalidate();
    }

    public void setTabs(j91 j91Var) {
        this.f25372a = j91Var;
        addView(j91Var, w7.a6.d(-1.0f, -1));
    }
}
