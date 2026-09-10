package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class zo extends FrameLayout {
    public u81 f29776a;
    public float f29777b;
    public boolean f29778c;
    public float d;
    public ValueAnimator e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f7;
        this.f29778c = z10;
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
        ofFloat.addUpdateListener(new j6(this, 12));
        this.e.setInterpolator(wr.h);
        this.e.setDuration(320L);
        this.e.addListener(new yo(0, this, z10));
        this.e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f29777b);
    }

    @Override
    public final boolean isShown() {
        return this.f29778c;
    }

    public void setShown(float f7) {
        this.f29777b = f7;
        u81 u81Var = this.f29776a;
        if (u81Var != null) {
            u81Var.setPivotX(u81Var.getWidth() / 2.0f);
            this.f29776a.setPivotY(0.0f);
            this.f29776a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
            this.f29776a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        }
        setAlpha(f7);
        invalidate();
    }

    public void setTabs(u81 u81Var) {
        this.f29776a = u81Var;
        addView(u81Var, w7.a6.c(-1.0f, -1));
    }
}
