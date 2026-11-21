package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class mc {
    public View f37473a;
    public final float f37474b;
    public final float f37475c;
    public final float d;
    public long f37476e;
    public Runnable f37477f;
    public ValueAnimator f37478g;
    public final float h;
    public boolean f37479i;
    public float f37480j;

    public mc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f10) {
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f37480j, f10, 1.0f - f10) * this.h;
    }

    public void b() {
        View view = this.f37473a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f37477f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f10;
        if (this.f37479i != z10) {
            this.f37479i = z10;
            ValueAnimator valueAnimator = this.f37478g;
            this.f37478g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f37480j;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f37478g = ofFloat;
            ofFloat.addUpdateListener(new x(this, 8));
            this.f37478g.addListener(new org.telegram.ui.on(2, this, z10));
            if (this.f37479i) {
                this.f37478g.setInterpolator(nr.f37956f);
                this.f37478g.setDuration(this.f37474b * 60.0f);
                this.f37478g.setStartDelay(0L);
            } else {
                this.f37478g.setInterpolator(new OvershootInterpolator(this.d));
                this.f37478g.setDuration(this.f37475c * 350.0f);
                this.f37478g.setStartDelay(this.f37476e);
            }
            this.f37478g.start();
        }
    }

    public mc(View view, float f10, float f11) {
        this.f37476e = 0L;
        this.h = 1.0f;
        this.f37473a = view;
        this.f37475c = f10;
        this.f37474b = f10;
        this.d = f11;
    }

    public mc(hi.i5 i5Var) {
        this.f37476e = 0L;
        this.h = 1.0f;
        this.f37473a = i5Var;
        this.f37474b = 1.5f;
        this.f37475c = 1.0f;
        this.d = 2.0f;
    }
}
