package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class vo extends FrameLayout {
    public x81 f29166a;
    public float f29167b;
    public boolean f29168c;
    public float d;
    public ValueAnimator e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f7;
        this.f29168c = z10;
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
        return (int) (getMeasuredHeight() * this.f29167b);
    }

    @Override
    public final boolean isShown() {
        return this.f29168c;
    }

    public void setShown(float f7) {
        this.f29167b = f7;
        x81 x81Var = this.f29166a;
        if (x81Var != null) {
            x81Var.setPivotX(x81Var.getWidth() / 2.0f);
            this.f29166a.setPivotY(0.0f);
            this.f29166a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
            this.f29166a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        }
        setAlpha(f7);
        invalidate();
    }

    public void setTabs(x81 x81Var) {
        this.f29166a = x81Var;
        addView(x81Var, w7.y5.c(-1.0f, -1));
    }
}
