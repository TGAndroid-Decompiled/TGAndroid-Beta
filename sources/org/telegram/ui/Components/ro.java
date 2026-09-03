package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class ro extends FrameLayout {
    public k81 f30855a;
    public float f30856b;
    public boolean f30857c;
    public float d;
    public ValueAnimator f30858e;

    public abstract void a(boolean z4);

    public final void b(boolean z4) {
        float f10;
        this.f30857c = z4;
        ValueAnimator valueAnimator = this.f30858e;
        if (valueAnimator != null) {
            this.f30858e = null;
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
        this.f30858e = ofFloat;
        ofFloat.addUpdateListener(new f6(this, 12));
        this.f30858e.setInterpolator(pr.h);
        this.f30858e.setDuration(320L);
        this.f30858e.addListener(new eg.u2(24, this, z4));
        this.f30858e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f30856b);
    }

    @Override
    public final boolean isShown() {
        return this.f30857c;
    }

    public void setShown(float f10) {
        this.f30856b = f10;
        k81 k81Var = this.f30855a;
        if (k81Var != null) {
            k81Var.setPivotX(k81Var.getWidth() / 2.0f);
            this.f30855a.setPivotY(0.0f);
            this.f30855a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f10));
            this.f30855a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f10));
        }
        setAlpha(f10);
        invalidate();
    }

    public void setTabs(k81 k81Var) {
        this.f30855a = k81Var;
        addView(k81Var, k7.c6.c(-1.0f, -1));
    }
}
