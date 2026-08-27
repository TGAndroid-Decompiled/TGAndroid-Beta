package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;

public class nc {

    public View f30944a;

    public final float f30945b;

    public final float f30946c;
    public final float d;

    public long f30947e;

    public Runnable f30948f;

    public ValueAnimator f30949g;
    public boolean h;

    public float f30950i;

    public nc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f10) {
        return com.google.android.recaptcha.internal.a.z(1.0f, this.f30950i, f10, 1.0f - f10);
    }

    public void b() {
        View view = this.f30944a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f30948f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            ValueAnimator valueAnimator = this.f30949g;
            this.f30949g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f30950i, z10 ? 1.0f : 0.0f);
            this.f30949g = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new e6(this, 7));
            this.f30949g.addListener(new org.telegram.ui.go(2, this, z10));
            if (this.h) {
                this.f30949g.setInterpolator(er.f28122f);
                this.f30949g.setDuration((long) (this.f30945b * 60.0f));
                this.f30949g.setStartDelay(0L);
            } else {
                this.f30949g.setInterpolator(new OvershootInterpolator(this.d));
                this.f30949g.setDuration((long) (this.f30946c * 350.0f));
                this.f30949g.setStartDelay(this.f30947e);
            }
            this.f30949g.start();
        }
    }

    public nc(View view, float f10, float f11) {
        this.f30947e = 0L;
        this.f30944a = view;
        this.f30946c = f10;
        this.f30945b = f10;
        this.d = f11;
    }

    public nc(lh.d6 d6Var) {
        this.f30947e = 0L;
        this.f30944a = d6Var;
        this.f30945b = 1.5f;
        this.f30946c = 1.0f;
        this.d = 2.0f;
    }
}
