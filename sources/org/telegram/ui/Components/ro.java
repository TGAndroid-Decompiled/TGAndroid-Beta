package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class ro extends FrameLayout {
    public l81 f30804a;
    public float f30805b;
    public boolean f30806c;
    public float d;
    public ValueAnimator f30807e;

    public abstract void a(boolean z4);

    public final void b(boolean z4) {
        float f10;
        this.f30806c = z4;
        ValueAnimator valueAnimator = this.f30807e;
        if (valueAnimator != null) {
            this.f30807e = null;
            valueAnimator.cancel();
        }
        if (z4) {
            setVisibility(0);
        }
        float f11 = this.d;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f30807e = ofFloat;
        ofFloat.addUpdateListener(new f6(this, 12));
        this.f30807e.setInterpolator(pr.h);
        this.f30807e.setDuration(320L);
        this.f30807e.addListener(new eg.u2(24, this, z4));
        this.f30807e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f30805b);
    }

    @Override
    public final boolean isShown() {
        return this.f30806c;
    }

    public void setShown(float f10) {
        this.f30805b = f10;
        l81 l81Var = this.f30804a;
        if (l81Var != null) {
            l81Var.setPivotX(l81Var.getWidth() / 2.0f);
            this.f30804a.setPivotY(0.0f);
            this.f30804a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f10));
            this.f30804a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f10));
        }
        setAlpha(f10);
        invalidate();
    }

    public void setTabs(l81 l81Var) {
        this.f30804a = l81Var;
        addView(l81Var, k7.c6.c(-1.0f, -1));
    }
}
