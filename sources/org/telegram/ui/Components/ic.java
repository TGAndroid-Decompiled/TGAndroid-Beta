package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class ic {
    public View f34579a;
    public final float f34580b;
    public final float f34581c;
    public final float d;
    public long f34582e;
    public Runnable f34583f;
    public ValueAnimator f34584g;
    public final float h;
    public boolean f34585i;
    public float f34586j;

    public ic(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f10) {
        return com.google.android.recaptcha.internal.a.z(1.0f, this.f34586j, f10, 1.0f - f10) * this.h;
    }

    public void b() {
        View view = this.f34579a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f34583f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z9) {
        float f10;
        if (this.f34585i != z9) {
            this.f34585i = z9;
            ValueAnimator valueAnimator = this.f34584g;
            this.f34584g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f34586j;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f34584g = ofFloat;
            ofFloat.addUpdateListener(new e6(this, 7));
            this.f34584g.addListener(new t9(1, this, z9));
            if (this.f34585i) {
                this.f34584g.setInterpolator(xq.f40345f);
                this.f34584g.setDuration(this.f34580b * 60.0f);
                this.f34584g.setStartDelay(0L);
            } else {
                this.f34584g.setInterpolator(new OvershootInterpolator(this.d));
                this.f34584g.setDuration(this.f34581c * 350.0f);
                this.f34584g.setStartDelay(this.f34582e);
            }
            this.f34584g.start();
        }
    }

    public ic(View view, float f10, float f11) {
        this.f34582e = 0L;
        this.h = 1.0f;
        this.f34579a = view;
        this.f34581c = f10;
        this.f34580b = f10;
        this.d = f11;
    }

    public ic(fi.m5 m5Var) {
        this.f34582e = 0L;
        this.h = 1.0f;
        this.f34579a = m5Var;
        this.f34580b = 1.5f;
        this.f34581c = 1.0f;
        this.d = 2.0f;
    }
}
