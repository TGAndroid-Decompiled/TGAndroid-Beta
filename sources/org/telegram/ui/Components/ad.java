package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class ad {
    public View f23196a;
    public final float f23197b;
    public final float f23198c;
    public final float d;
    public long e;
    public Runnable f23199f;
    public ValueAnimator f23200g;
    public final float h;
    public boolean f23201i;
    public float f23202j;

    public ad(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f23202j, f7, 1.0f - f7) * this.h;
    }

    public void b() {
        View view = this.f23196a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f23199f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.f23201i != z10) {
            this.f23201i = z10;
            ValueAnimator valueAnimator = this.f23200g;
            this.f23200g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f23202j;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f23200g = ofFloat;
            ofFloat.addUpdateListener(new n6(this, 7));
            this.f23200g.addListener(new org.telegram.ui.vo(2, this, z10));
            if (this.f23201i) {
                this.f23200g.setInterpolator(es.f24465f);
                this.f23200g.setDuration(this.f23197b * 60.0f);
                this.f23200g.setStartDelay(0L);
            } else {
                this.f23200g.setInterpolator(new OvershootInterpolator(this.d));
                this.f23200g.setDuration(this.f23198c * 350.0f);
                this.f23200g.setStartDelay(this.e);
            }
            this.f23200g.start();
        }
    }

    public ad(View view, float f7, float f10) {
        this.e = 0L;
        this.h = 1.0f;
        this.f23196a = view;
        this.f23198c = f7;
        this.f23197b = f7;
        this.d = f10;
    }

    public ad(di.m6 m6Var) {
        this.e = 0L;
        this.h = 1.0f;
        this.f23196a = m6Var;
        this.f23197b = 1.5f;
        this.f23198c = 1.0f;
        this.d = 2.0f;
    }
}
