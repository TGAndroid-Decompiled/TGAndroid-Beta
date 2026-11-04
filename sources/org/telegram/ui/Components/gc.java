package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class gc {
    public View f34043a;
    public final float f34044b;
    public final float f34045c;
    public final float d;
    public long f34046e;
    public Runnable f34047f;
    public ValueAnimator f34048g;
    public final float h;
    public boolean f34049i;
    public float f34050j;

    public gc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f10) {
        return com.google.android.recaptcha.internal.a.y(1.0f, this.f34050j, f10, 1.0f - f10) * this.h;
    }

    public void b() {
        View view = this.f34043a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f34047f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f10;
        if (this.f34049i != z10) {
            this.f34049i = z10;
            ValueAnimator valueAnimator = this.f34048g;
            this.f34048g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f34050j;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f34048g = ofFloat;
            ofFloat.addUpdateListener(new c6(this, 7));
            this.f34048g.addListener(new s9(1, this, z10));
            if (this.f34049i) {
                this.f34048g.setInterpolator(xq.f40452f);
                this.f34048g.setDuration(this.f34044b * 60.0f);
                this.f34048g.setStartDelay(0L);
            } else {
                this.f34048g.setInterpolator(new OvershootInterpolator(this.d));
                this.f34048g.setDuration(this.f34045c * 350.0f);
                this.f34048g.setStartDelay(this.f34046e);
            }
            this.f34048g.start();
        }
    }

    public gc(View view, float f10, float f11) {
        this.f34046e = 0L;
        this.h = 1.0f;
        this.f34043a = view;
        this.f34045c = f10;
        this.f34044b = f10;
        this.d = f11;
    }

    public gc(gi.k5 k5Var) {
        this.f34046e = 0L;
        this.h = 1.0f;
        this.f34043a = k5Var;
        this.f34044b = 1.5f;
        this.f34045c = 1.0f;
        this.d = 2.0f;
    }
}
