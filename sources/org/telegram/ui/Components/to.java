package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class to extends FrameLayout {
    public i81 f28169a;
    public float f28170b;
    public boolean f28171c;
    public float d;
    public ValueAnimator e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        float f7;
        this.f28171c = z10;
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
        ofFloat.addUpdateListener(new i6(this, 12));
        this.e.setInterpolator(qr.h);
        this.e.setDuration(320L);
        this.e.addListener(new aa(4, this, z10));
        this.e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.f28170b);
    }

    @Override
    public final boolean isShown() {
        return this.f28171c;
    }

    public void setShown(float f7) {
        this.f28170b = f7;
        i81 i81Var = this.f28169a;
        if (i81Var != null) {
            i81Var.setPivotX(i81Var.getWidth() / 2.0f);
            this.f28169a.setPivotY(0.0f);
            this.f28169a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
            this.f28169a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        }
        setAlpha(f7);
        invalidate();
    }

    public void setTabs(i81 i81Var) {
        this.f28169a = i81Var;
        addView(i81Var, w7.x5.c(-1.0f, -1));
    }
}
