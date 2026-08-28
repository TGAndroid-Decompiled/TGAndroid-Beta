package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class jo extends FrameLayout {
    public m71 f29804a;
    public float f29805b;
    public boolean f29806c;
    public float d;
    public ValueAnimator f29807e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f10;
        this.f29806c = z10;
        ValueAnimator valueAnimator = this.f29807e;
        if (valueAnimator != null) {
            this.f29807e = null;
            valueAnimator.cancel();
        }
        if (z10) {
            setVisibility(0);
        }
        float f11 = this.d;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f29807e = ofFloat;
        ofFloat.addUpdateListener(new e6(this, 12));
        this.f29807e.setInterpolator(gr.h);
        this.f29807e.setDuration(320L);
        this.f29807e.addListener(new u9(4, this, z10));
        this.f29807e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f29805b);
    }

    @Override
    public final boolean isShown() {
        return this.f29806c;
    }

    public void setShown(float f10) {
        this.f29805b = f10;
        m71 m71Var = this.f29804a;
        if (m71Var != null) {
            m71Var.setPivotX(m71Var.getWidth() / 2.0f);
            this.f29804a.setPivotY(0.0f);
            this.f29804a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f10));
            this.f29804a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f10));
        }
        setAlpha(f10);
        invalidate();
    }

    public void setTabs(m71 m71Var) {
        this.f29804a = m71Var;
        addView(m71Var, g7.e6.c(-1.0f, -1));
    }
}
