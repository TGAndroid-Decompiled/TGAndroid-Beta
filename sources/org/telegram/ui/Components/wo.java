package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class wo extends FrameLayout {
    public f91 f32591a;
    public float f32592b;
    public boolean f32593c;
    public float d;
    public ValueAnimator f32594e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f7;
        this.f32593c = z10;
        ValueAnimator valueAnimator = this.f32594e;
        if (valueAnimator != null) {
            this.f32594e = null;
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
        this.f32594e = ofFloat;
        ofFloat.addUpdateListener(new k6(this, 12));
        this.f32594e.setInterpolator(tr.h);
        this.f32594e.setDuration(320L);
        this.f32594e.addListener(new da(4, this, z10));
        this.f32594e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f32592b);
    }

    @Override
    public final boolean isShown() {
        return this.f32593c;
    }

    public void setShown(float f7) {
        this.f32592b = f7;
        f91 f91Var = this.f32591a;
        if (f91Var != null) {
            f91Var.setPivotX(f91Var.getWidth() / 2.0f);
            this.f32591a.setPivotY(0.0f);
            this.f32591a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
            this.f32591a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        }
        setAlpha(f7);
        invalidate();
    }

    public void setTabs(f91 f91Var) {
        this.f32591a = f91Var;
        addView(f91Var, w7.z5.c(-1.0f, -1));
    }
}
