package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class uo extends FrameLayout {
    public g81 f28524a;
    public float f28525b;
    public boolean f28526c;
    public float d;
    public ValueAnimator e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f7;
        this.f28526c = z10;
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
        ofFloat.addUpdateListener(new k6(this, 12));
        this.e.setInterpolator(rr.h);
        this.e.setDuration(320L);
        this.e.addListener(new ca(4, this, z10));
        this.e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f28525b);
    }

    @Override
    public final boolean isShown() {
        return this.f28526c;
    }

    public void setShown(float f7) {
        this.f28525b = f7;
        g81 g81Var = this.f28524a;
        if (g81Var != null) {
            g81Var.setPivotX(g81Var.getWidth() / 2.0f);
            this.f28524a.setPivotY(0.0f);
            this.f28524a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
            this.f28524a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        }
        setAlpha(f7);
        invalidate();
    }

    public void setTabs(g81 g81Var) {
        this.f28524a = g81Var;
        addView(g81Var, w7.x5.c(-1.0f, -1));
    }
}
