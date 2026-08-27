package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public abstract class ho extends FrameLayout {

    public o71 f29062a;

    public float f29063b;

    public boolean f29064c;
    public float d;

    public ValueAnimator f29065e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        this.f29064c = z10;
        ValueAnimator valueAnimator = this.f29065e;
        if (valueAnimator != null) {
            this.f29065e = null;
            valueAnimator.cancel();
        }
        if (z10) {
            setVisibility(0);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.d, z10 ? 1.0f : 0.0f);
        this.f29065e = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new e6(this, 12));
        this.f29065e.setInterpolator(er.h);
        this.f29065e.setDuration(320L);
        this.f29065e.addListener(new org.telegram.ui.go(5, this, z10));
        this.f29065e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f29063b);
    }

    @Override
    public final boolean isShown() {
        return this.f29064c;
    }

    public void setShown(float f10) {
        this.f29063b = f10;
        o71 o71Var = this.f29062a;
        if (o71Var != null) {
            o71Var.setPivotX(o71Var.getWidth() / 2.0f);
            this.f29062a.setPivotY(0.0f);
            this.f29062a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f10));
            this.f29062a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f10));
        }
        setAlpha(f10);
        invalidate();
    }

    public void setTabs(o71 o71Var) {
        this.f29062a = o71Var;
        addView(o71Var, h7.z5.c(-1.0f, -1));
    }
}
