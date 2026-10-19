package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class dp extends FrameLayout {
    public c91 f25602a;
    public float f25603b;
    public boolean f25604c;
    public float d;
    public ValueAnimator e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f7;
        this.f25604c = z10;
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
        ofFloat.addUpdateListener(new l6(this, 13));
        this.e.setInterpolator(bs.h);
        this.e.setDuration(320L);
        this.e.addListener(new org.telegram.ui.fo(5, this, z10));
        this.e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f25603b);
    }

    @Override
    public final boolean isShown() {
        return this.f25604c;
    }

    public void setShown(float f7) {
        this.f25603b = f7;
        c91 c91Var = this.f25602a;
        if (c91Var != null) {
            c91Var.setPivotX(c91Var.getWidth() / 2.0f);
            this.f25602a.setPivotY(0.0f);
            this.f25602a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
            this.f25602a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        }
        setAlpha(f7);
        invalidate();
    }

    public void setTabs(c91 c91Var) {
        this.f25602a = c91Var;
        addView(c91Var, w7.z5.c(-1.0f, -1));
    }
}
