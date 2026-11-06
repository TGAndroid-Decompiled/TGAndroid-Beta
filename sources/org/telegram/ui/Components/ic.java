package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class ic {
    public View f34549a;
    public final float f34550b;
    public final float f34551c;
    public final float d;
    public long f34552e;
    public Runnable f34553f;
    public ValueAnimator f34554g;
    public final float h;
    public boolean f34555i;
    public float f34556j;

    public ic(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f10) {
        return com.google.android.recaptcha.internal.a.z(1.0f, this.f34556j, f10, 1.0f - f10) * this.h;
    }

    public void b() {
        View view = this.f34549a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f34553f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z9) {
        float f10;
        if (this.f34555i != z9) {
            this.f34555i = z9;
            ValueAnimator valueAnimator = this.f34554g;
            this.f34554g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f34556j;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f34554g = ofFloat;
            ofFloat.addUpdateListener(new e6(this, 7));
            this.f34554g.addListener(new t9(1, this, z9));
            if (this.f34555i) {
                this.f34554g.setInterpolator(xq.f40329f);
                this.f34554g.setDuration(this.f34550b * 60.0f);
                this.f34554g.setStartDelay(0L);
            } else {
                this.f34554g.setInterpolator(new OvershootInterpolator(this.d));
                this.f34554g.setDuration(this.f34551c * 350.0f);
                this.f34554g.setStartDelay(this.f34552e);
            }
            this.f34554g.start();
        }
    }

    public ic(View view, float f10, float f11) {
        this.f34552e = 0L;
        this.h = 1.0f;
        this.f34549a = view;
        this.f34551c = f10;
        this.f34550b = f10;
        this.d = f11;
    }

    public ic(fi.m5 m5Var) {
        this.f34552e = 0L;
        this.h = 1.0f;
        this.f34549a = m5Var;
        this.f34550b = 1.5f;
        this.f34551c = 1.0f;
        this.d = 2.0f;
    }
}
