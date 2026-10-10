package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class jp extends FrameLayout {
    public o91 f27743a;
    public float f27744b;
    public boolean f27745c;
    public float d;
    public ValueAnimator f27746e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f7;
        this.f27745c = z10;
        ValueAnimator valueAnimator = this.f27746e;
        if (valueAnimator != null) {
            this.f27746e = null;
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
        this.f27746e = ofFloat;
        ofFloat.addUpdateListener(new m6(this, 13));
        this.f27746e.setInterpolator(is.h);
        this.f27746e.setDuration(320L);
        this.f27746e.addListener(new fa(4, this, z10));
        this.f27746e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f27744b);
    }

    @Override
    public final boolean isShown() {
        return this.f27745c;
    }

    public void setShown(float f7) {
        this.f27744b = f7;
        o91 o91Var = this.f27743a;
        if (o91Var != null) {
            o91Var.setPivotX(o91Var.getWidth() / 2.0f);
            this.f27743a.setPivotY(0.0f);
            this.f27743a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
            this.f27743a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        }
        setAlpha(f7);
        invalidate();
    }

    public void setTabs(o91 o91Var) {
        this.f27743a = o91Var;
        addView(o91Var, w7.x5.d(-1.0f, -1));
    }
}
