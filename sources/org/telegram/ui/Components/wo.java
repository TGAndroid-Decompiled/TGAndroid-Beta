package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class wo extends FrameLayout {
    public f91 f32584a;
    public float f32585b;
    public boolean f32586c;
    public float d;
    public ValueAnimator f32587e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f7;
        this.f32586c = z10;
        ValueAnimator valueAnimator = this.f32587e;
        if (valueAnimator != null) {
            this.f32587e = null;
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
        this.f32587e = ofFloat;
        ofFloat.addUpdateListener(new k6(this, 12));
        this.f32587e.setInterpolator(tr.h);
        this.f32587e.setDuration(320L);
        this.f32587e.addListener(new da(4, this, z10));
        this.f32587e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f32585b);
    }

    @Override
    public final boolean isShown() {
        return this.f32586c;
    }

    public void setShown(float f7) {
        this.f32585b = f7;
        f91 f91Var = this.f32584a;
        if (f91Var != null) {
            f91Var.setPivotX(f91Var.getWidth() / 2.0f);
            this.f32584a.setPivotY(0.0f);
            this.f32584a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
            this.f32584a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        }
        setAlpha(f7);
        invalidate();
    }

    public void setTabs(f91 f91Var) {
        this.f32584a = f91Var;
        addView(f91Var, w7.z5.c(-1.0f, -1));
    }
}
