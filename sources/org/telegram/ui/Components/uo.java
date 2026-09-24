package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class uo extends FrameLayout {
    public v81 f28838a;
    public float f28839b;
    public boolean f28840c;
    public float d;
    public ValueAnimator e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f7;
        this.f28840c = z10;
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
        this.e.setInterpolator(rr.h);
        this.e.setDuration(320L);
        this.e.addListener(new ca(4, this, z10));
        this.e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f28839b);
    }

    @Override
    public final boolean isShown() {
        return this.f28840c;
    }

    public void setShown(float f7) {
        this.f28839b = f7;
        v81 v81Var = this.f28838a;
        if (v81Var != null) {
            v81Var.setPivotX(v81Var.getWidth() / 2.0f);
            this.f28838a.setPivotY(0.0f);
            this.f28838a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
            this.f28838a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        }
        setAlpha(f7);
        invalidate();
    }

    public void setTabs(v81 v81Var) {
        this.f28838a = v81Var;
        addView(v81Var, w7.y5.c(-1.0f, -1));
    }
}
