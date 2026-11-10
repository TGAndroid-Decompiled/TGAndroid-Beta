package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class hc {
    public View f34296a;
    public final float f34297b;
    public final float f34298c;
    public final float d;
    public long f34299e;
    public Runnable f34300f;
    public ValueAnimator f34301g;
    public final float h;
    public boolean f34302i;
    public float f34303j;

    public hc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f10) {
        return com.google.android.recaptcha.internal.a.z(1.0f, this.f34303j, f10, 1.0f - f10) * this.h;
    }

    public void b() {
        View view = this.f34296a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f34300f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z9) {
        float f10;
        if (this.f34302i != z9) {
            this.f34302i = z9;
            ValueAnimator valueAnimator = this.f34301g;
            this.f34301g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f34303j;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f34301g = ofFloat;
            ofFloat.addUpdateListener(new d6(this, 7));
            this.f34301g.addListener(new s9(1, this, z9));
            if (this.f34302i) {
                this.f34301g.setInterpolator(wq.f40046f);
                this.f34301g.setDuration(this.f34297b * 60.0f);
                this.f34301g.setStartDelay(0L);
            } else {
                this.f34301g.setInterpolator(new OvershootInterpolator(this.d));
                this.f34301g.setDuration(this.f34298c * 350.0f);
                this.f34301g.setStartDelay(this.f34299e);
            }
            this.f34301g.start();
        }
    }

    public hc(View view, float f10, float f11) {
        this.f34299e = 0L;
        this.h = 1.0f;
        this.f34296a = view;
        this.f34298c = f10;
        this.f34297b = f10;
        this.d = f11;
    }

    public hc(fi.m5 m5Var) {
        this.f34299e = 0L;
        this.h = 1.0f;
        this.f34296a = m5Var;
        this.f34297b = 1.5f;
        this.f34298c = 1.0f;
        this.d = 2.0f;
    }
}
