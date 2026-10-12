package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class lp extends FrameLayout {
    public t91 f28256a;
    public float f28257b;
    public boolean f28258c;
    public float d;
    public ValueAnimator f28259e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f7;
        this.f28258c = z10;
        ValueAnimator valueAnimator = this.f28259e;
        if (valueAnimator != null) {
            this.f28259e = null;
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
        this.f28259e = ofFloat;
        ofFloat.addUpdateListener(new m6(this, 13));
        this.f28259e.setInterpolator(js.h);
        this.f28259e.setDuration(320L);
        this.f28259e.addListener(new ea(4, this, z10));
        this.f28259e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f28257b);
    }

    @Override
    public final boolean isShown() {
        return this.f28258c;
    }

    public void setShown(float f7) {
        this.f28257b = f7;
        t91 t91Var = this.f28256a;
        if (t91Var != null) {
            t91Var.setPivotX(t91Var.getWidth() / 2.0f);
            this.f28256a.setPivotY(0.0f);
            this.f28256a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
            this.f28256a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        }
        setAlpha(f7);
        invalidate();
    }

    public void setTabs(t91 t91Var) {
        this.f28256a = t91Var;
        addView(t91Var, w7.w5.d(-1.0f, -1));
    }
}
