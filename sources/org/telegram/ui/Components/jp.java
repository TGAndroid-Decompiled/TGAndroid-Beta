package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class jp extends FrameLayout {
    public p91 f27716a;
    public float f27717b;
    public boolean f27718c;
    public float d;
    public ValueAnimator f27719e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f7;
        this.f27718c = z10;
        ValueAnimator valueAnimator = this.f27719e;
        if (valueAnimator != null) {
            this.f27719e = null;
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
        this.f27719e = ofFloat;
        ofFloat.addUpdateListener(new m6(this, 13));
        this.f27719e.setInterpolator(is.h);
        this.f27719e.setDuration(320L);
        this.f27719e.addListener(new ea(4, this, z10));
        this.f27719e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f27717b);
    }

    @Override
    public final boolean isShown() {
        return this.f27718c;
    }

    public void setShown(float f7) {
        this.f27717b = f7;
        p91 p91Var = this.f27716a;
        if (p91Var != null) {
            p91Var.setPivotX(p91Var.getWidth() / 2.0f);
            this.f27716a.setPivotY(0.0f);
            this.f27716a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
            this.f27716a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        }
        setAlpha(f7);
        invalidate();
    }

    public void setTabs(p91 p91Var) {
        this.f27716a = p91Var;
        addView(p91Var, w7.x5.d(-1.0f, -1));
    }
}
