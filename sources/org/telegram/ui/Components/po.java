package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class po extends FrameLayout {
    public k81 f27959a;
    public float f27960b;
    public boolean f27961c;
    public float d;
    public ValueAnimator e;

    public abstract void a(boolean z4);

    public final void b(boolean z4) {
        float f10;
        this.f27961c = z4;
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            this.e = null;
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
        this.e = ofFloat;
        ofFloat.addUpdateListener(new f6(this, 12));
        this.e.setInterpolator(nr.h);
        this.e.setDuration(320L);
        this.e.addListener(new dg.w2(26, this, z4));
        this.e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f27960b);
    }

    @Override
    public final boolean isShown() {
        return this.f27961c;
    }

    public void setShown(float f10) {
        this.f27960b = f10;
        k81 k81Var = this.f27959a;
        if (k81Var != null) {
            k81Var.setPivotX(k81Var.getWidth() / 2.0f);
            this.f27959a.setPivotY(0.0f);
            this.f27959a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f10));
            this.f27959a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f10));
        }
        setAlpha(f10);
        invalidate();
    }

    public void setTabs(k81 k81Var) {
        this.f27959a = k81Var;
        addView(k81Var, k7.b6.c(-1.0f, -1));
    }
}
