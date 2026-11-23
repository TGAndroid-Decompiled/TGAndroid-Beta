package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class mc {
    public View f37472a;
    public final float f37473b;
    public final float f37474c;
    public final float d;
    public long f37475e;
    public Runnable f37476f;
    public ValueAnimator f37477g;
    public final float h;
    public boolean f37478i;
    public float f37479j;

    public mc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f10) {
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f37479j, f10, 1.0f - f10) * this.h;
    }

    public void b() {
        View view = this.f37472a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f37476f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f10;
        if (this.f37478i != z10) {
            this.f37478i = z10;
            ValueAnimator valueAnimator = this.f37477g;
            this.f37477g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f37479j;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f37477g = ofFloat;
            ofFloat.addUpdateListener(new x(this, 8));
            this.f37477g.addListener(new org.telegram.ui.on(2, this, z10));
            if (this.f37478i) {
                this.f37477g.setInterpolator(nr.f37961f);
                this.f37477g.setDuration(this.f37473b * 60.0f);
                this.f37477g.setStartDelay(0L);
            } else {
                this.f37477g.setInterpolator(new OvershootInterpolator(this.d));
                this.f37477g.setDuration(this.f37474c * 350.0f);
                this.f37477g.setStartDelay(this.f37475e);
            }
            this.f37477g.start();
        }
    }

    public mc(View view, float f10, float f11) {
        this.f37475e = 0L;
        this.h = 1.0f;
        this.f37472a = view;
        this.f37474c = f10;
        this.f37473b = f10;
        this.d = f11;
    }

    public mc(hi.i5 i5Var) {
        this.f37475e = 0L;
        this.h = 1.0f;
        this.f37472a = i5Var;
        this.f37473b = 1.5f;
        this.f37474c = 1.0f;
        this.d = 2.0f;
    }
}
