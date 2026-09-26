package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class vo extends FrameLayout {
    public w81 f29162a;
    public float f29163b;
    public boolean f29164c;
    public float d;
    public ValueAnimator e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f7;
        this.f29164c = z10;
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
        this.e.setInterpolator(sr.h);
        this.e.setDuration(320L);
        this.e.addListener(new ca(4, this, z10));
        this.e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f29163b);
    }

    @Override
    public final boolean isShown() {
        return this.f29164c;
    }

    public void setShown(float f7) {
        this.f29163b = f7;
        w81 w81Var = this.f29162a;
        if (w81Var != null) {
            w81Var.setPivotX(w81Var.getWidth() / 2.0f);
            this.f29162a.setPivotY(0.0f);
            this.f29162a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
            this.f29162a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        }
        setAlpha(f7);
        invalidate();
    }

    public void setTabs(w81 w81Var) {
        this.f29162a = w81Var;
        addView(w81Var, w7.y5.c(-1.0f, -1));
    }
}
