package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class wo extends FrameLayout {
    public x81 f30018a;
    public float f30019b;
    public boolean f30020c;
    public float d;
    public ValueAnimator e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f7;
        this.f30020c = z10;
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
        this.e.setInterpolator(tr.h);
        this.e.setDuration(320L);
        this.e.addListener(new da(4, this, z10));
        this.e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f30019b);
    }

    @Override
    public final boolean isShown() {
        return this.f30020c;
    }

    public void setShown(float f7) {
        this.f30019b = f7;
        x81 x81Var = this.f30018a;
        if (x81Var != null) {
            x81Var.setPivotX(x81Var.getWidth() / 2.0f);
            this.f30018a.setPivotY(0.0f);
            this.f30018a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
            this.f30018a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        }
        setAlpha(f7);
        invalidate();
    }

    public void setTabs(x81 x81Var) {
        this.f30018a = x81Var;
        addView(x81Var, w7.y5.c(-1.0f, -1));
    }
}
