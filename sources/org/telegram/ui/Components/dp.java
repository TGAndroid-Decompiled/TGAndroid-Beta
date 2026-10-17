package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class dp extends FrameLayout {
    public b91 f25629a;
    public float f25630b;
    public boolean f25631c;
    public float d;
    public ValueAnimator e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f7;
        this.f25631c = z10;
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
        ofFloat.addUpdateListener(new l6(this, 13));
        this.e.setInterpolator(bs.h);
        this.e.setDuration(320L);
        this.e.addListener(new org.telegram.ui.ho(5, this, z10));
        this.e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f25630b);
    }

    @Override
    public final boolean isShown() {
        return this.f25631c;
    }

    public void setShown(float f7) {
        this.f25630b = f7;
        b91 b91Var = this.f25629a;
        if (b91Var != null) {
            b91Var.setPivotX(b91Var.getWidth() / 2.0f);
            this.f25629a.setPivotY(0.0f);
            this.f25629a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
            this.f25629a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        }
        setAlpha(f7);
        invalidate();
    }

    public void setTabs(b91 b91Var) {
        this.f25629a = b91Var;
        addView(b91Var, w7.z5.d(-1.0f, -1));
    }
}
