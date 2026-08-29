package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class no extends FrameLayout {
    public y71 f31098a;
    public float f31099b;
    public boolean f31100c;
    public float d;
    public ValueAnimator f31101e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f9;
        this.f31100c = z10;
        ValueAnimator valueAnimator = this.f31101e;
        if (valueAnimator != null) {
            this.f31101e = null;
            valueAnimator.cancel();
        }
        if (z10) {
            setVisibility(0);
        }
        float f10 = this.d;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
        this.f31101e = ofFloat;
        ofFloat.addUpdateListener(new j6(this, 12));
        this.f31101e.setInterpolator(jr.h);
        this.f31101e.setDuration(320L);
        this.f31101e.addListener(new z9(4, this, z10));
        this.f31101e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f31099b);
    }

    @Override
    public final boolean isShown() {
        return this.f31100c;
    }

    public void setShown(float f9) {
        this.f31099b = f9;
        y71 y71Var = this.f31098a;
        if (y71Var != null) {
            y71Var.setPivotX(y71Var.getWidth() / 2.0f);
            this.f31098a.setPivotY(0.0f);
            this.f31098a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f9));
            this.f31098a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f9));
        }
        setAlpha(f9);
        invalidate();
    }

    public void setTabs(y71 y71Var) {
        this.f31098a = y71Var;
        addView(y71Var, i7.f6.c(-1.0f, -1));
    }
}
