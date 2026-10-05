package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class wo extends FrameLayout {
    public g91 f32673a;
    public float f32674b;
    public boolean f32675c;
    public float d;
    public ValueAnimator f32676e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f7;
        this.f32675c = z10;
        ValueAnimator valueAnimator = this.f32676e;
        if (valueAnimator != null) {
            this.f32676e = null;
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
        this.f32676e = ofFloat;
        ofFloat.addUpdateListener(new k6(this, 12));
        this.f32676e.setInterpolator(tr.h);
        this.f32676e.setDuration(320L);
        this.f32676e.addListener(new da(4, this, z10));
        this.f32676e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f32674b);
    }

    @Override
    public final boolean isShown() {
        return this.f32675c;
    }

    public void setShown(float f7) {
        this.f32674b = f7;
        g91 g91Var = this.f32673a;
        if (g91Var != null) {
            g91Var.setPivotX(g91Var.getWidth() / 2.0f);
            this.f32673a.setPivotY(0.0f);
            this.f32673a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
            this.f32673a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        }
        setAlpha(f7);
        invalidate();
    }

    public void setTabs(g91 g91Var) {
        this.f32673a = g91Var;
        addView(g91Var, w7.z5.c(-1.0f, -1));
    }
}
