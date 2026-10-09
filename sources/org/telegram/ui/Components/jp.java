package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class jp extends FrameLayout {
    public n91 f27751a;
    public float f27752b;
    public boolean f27753c;
    public float d;
    public ValueAnimator f27754e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f7;
        this.f27753c = z10;
        ValueAnimator valueAnimator = this.f27754e;
        if (valueAnimator != null) {
            this.f27754e = null;
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
        this.f27754e = ofFloat;
        ofFloat.addUpdateListener(new m6(this, 13));
        this.f27754e.setInterpolator(hs.h);
        this.f27754e.setDuration(320L);
        this.f27754e.addListener(new fa(4, this, z10));
        this.f27754e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f27752b);
    }

    @Override
    public final boolean isShown() {
        return this.f27753c;
    }

    public void setShown(float f7) {
        this.f27752b = f7;
        n91 n91Var = this.f27751a;
        if (n91Var != null) {
            n91Var.setPivotX(n91Var.getWidth() / 2.0f);
            this.f27751a.setPivotY(0.0f);
            this.f27751a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
            this.f27751a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        }
        setAlpha(f7);
        invalidate();
    }

    public void setTabs(n91 n91Var) {
        this.f27751a = n91Var;
        addView(n91Var, w7.x5.d(-1.0f, -1));
    }
}
