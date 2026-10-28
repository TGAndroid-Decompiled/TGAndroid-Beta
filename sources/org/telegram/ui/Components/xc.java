package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class xc {
    public View f34720a;
    public final float f34721b;
    public final float f34722c;
    public final float d;
    public long e;
    public Runnable f34723f;
    public ValueAnimator f34724g;
    public final float h;
    public boolean f34725i;
    public float f34726j;

    public xc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return c3.h0.z(1.0f, this.f34726j, f7, 1.0f - f7) * this.h;
    }

    public void b() {
        View view = this.f34720a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f34723f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.f34725i != z10) {
            this.f34725i = z10;
            ValueAnimator valueAnimator = this.f34724g;
            this.f34724g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f34726j;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f34724g = ofFloat;
            ofFloat.addUpdateListener(new n6(this, 7));
            this.f34724g.addListener(new org.telegram.ui.lo(2, this, z10));
            if (this.f34725i) {
                this.f34724g.setInterpolator(ds.f27530f);
                this.f34724g.setDuration(this.f34721b * 60.0f);
                this.f34724g.setStartDelay(0L);
            } else {
                this.f34724g.setInterpolator(new OvershootInterpolator(this.d));
                this.f34724g.setDuration(this.f34722c * 350.0f);
                this.f34724g.setStartDelay(this.e);
            }
            this.f34724g.start();
        }
    }

    public xc(View view, float f7, float f10) {
        this.e = 0L;
        this.h = 1.0f;
        this.f34720a = view;
        this.f34722c = f7;
        this.f34721b = f7;
        this.d = f10;
    }

    public xc(fi.c6 c6Var) {
        this.e = 0L;
        this.h = 1.0f;
        this.f34720a = c6Var;
        this.f34721b = 1.5f;
        this.f34722c = 1.0f;
        this.d = 2.0f;
    }
}
