package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class mc {
    public View f37471a;
    public final float f37472b;
    public final float f37473c;
    public final float d;
    public long f37474e;
    public Runnable f37475f;
    public ValueAnimator f37476g;
    public final float h;
    public boolean f37477i;
    public float f37478j;

    public mc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f10) {
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f37478j, f10, 1.0f - f10) * this.h;
    }

    public void b() {
        View view = this.f37471a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f37475f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f10;
        if (this.f37477i != z10) {
            this.f37477i = z10;
            ValueAnimator valueAnimator = this.f37476g;
            this.f37476g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f37478j;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f37476g = ofFloat;
            ofFloat.addUpdateListener(new x(this, 8));
            this.f37476g.addListener(new org.telegram.ui.on(2, this, z10));
            if (this.f37477i) {
                this.f37476g.setInterpolator(nr.f37960f);
                this.f37476g.setDuration(this.f37472b * 60.0f);
                this.f37476g.setStartDelay(0L);
            } else {
                this.f37476g.setInterpolator(new OvershootInterpolator(this.d));
                this.f37476g.setDuration(this.f37473c * 350.0f);
                this.f37476g.setStartDelay(this.f37474e);
            }
            this.f37476g.start();
        }
    }

    public mc(View view, float f10, float f11) {
        this.f37474e = 0L;
        this.h = 1.0f;
        this.f37471a = view;
        this.f37473c = f10;
        this.f37472b = f10;
        this.d = f11;
    }

    public mc(hi.i5 i5Var) {
        this.f37474e = 0L;
        this.h = 1.0f;
        this.f37471a = i5Var;
        this.f37472b = 1.5f;
        this.f37473c = 1.0f;
        this.d = 2.0f;
    }
}
