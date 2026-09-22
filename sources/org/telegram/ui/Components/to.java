package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class to extends FrameLayout {
    public y81 f28504a;
    public float f28505b;
    public boolean f28506c;
    public float d;
    public ValueAnimator e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f7;
        this.f28506c = z10;
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
        ofFloat.addUpdateListener(new j6(this, 12));
        this.e.setInterpolator(qr.h);
        this.e.setDuration(320L);
        this.e.addListener(new ba(4, this, z10));
        this.e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f28505b);
    }

    @Override
    public final boolean isShown() {
        return this.f28506c;
    }

    public void setShown(float f7) {
        this.f28505b = f7;
        y81 y81Var = this.f28504a;
        if (y81Var != null) {
            y81Var.setPivotX(y81Var.getWidth() / 2.0f);
            this.f28504a.setPivotY(0.0f);
            this.f28504a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
            this.f28504a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        }
        setAlpha(f7);
        invalidate();
    }

    public void setTabs(y81 y81Var) {
        this.f28504a = y81Var;
        addView(y81Var, w7.y5.c(-1.0f, -1));
    }
}
