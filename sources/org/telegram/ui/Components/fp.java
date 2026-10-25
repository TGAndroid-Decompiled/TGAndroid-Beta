package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class fp extends FrameLayout {
    public t91 f28281a;
    public float f28282b;
    public boolean f28283c;
    public float d;
    public ValueAnimator e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f7;
        this.f28283c = z10;
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
        this.e.addListener(new org.telegram.ui.jo(5, this, z10));
        this.e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f28282b);
    }

    @Override
    public final boolean isShown() {
        return this.f28283c;
    }

    public void setShown(float f7) {
        this.f28282b = f7;
        t91 t91Var = this.f28281a;
        if (t91Var != null) {
            t91Var.setPivotX(t91Var.getWidth() / 2.0f);
            this.f28281a.setPivotY(0.0f);
            this.f28281a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
            this.f28281a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        }
        setAlpha(f7);
        invalidate();
    }

    public void setTabs(t91 t91Var) {
        this.f28281a = t91Var;
        addView(t91Var, gb1.g(-1.0f, -1));
    }
}
