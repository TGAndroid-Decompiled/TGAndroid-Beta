package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class zc {
    public View f33482a;
    public final float f33483b;
    public final float f33484c;
    public final float d;
    public long f33485e;
    public Runnable f33486f;
    public ValueAnimator f33487g;
    public boolean h;
    public float f33488i;

    public zc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f33488i, f7, 1.0f - f7);
    }

    public void b() {
        View view = this.f33482a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f33486f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.h != z10) {
            this.h = z10;
            ValueAnimator valueAnimator = this.f33487g;
            this.f33487g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f33488i;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f33487g = ofFloat;
            ofFloat.addUpdateListener(new k6(this, 7));
            this.f33487g.addListener(new da(1, this, z10));
            if (this.h) {
                this.f33487g.setInterpolator(tr.f31215f);
                this.f33487g.setDuration(this.f33483b * 60.0f);
                this.f33487g.setStartDelay(0L);
            } else {
                this.f33487g.setInterpolator(new OvershootInterpolator(this.d));
                this.f33487g.setDuration(this.f33484c * 350.0f);
                this.f33487g.setStartDelay(this.f33485e);
            }
            this.f33487g.start();
        }
    }

    public zc(View view, float f7, float f10) {
        this.f33485e = 0L;
        this.f33482a = view;
        this.f33484c = f7;
        this.f33483b = f7;
        this.d = f10;
    }

    public zc(ci.o6 o6Var) {
        this.f33485e = 0L;
        this.f33482a = o6Var;
        this.f33483b = 1.5f;
        this.f33484c = 1.0f;
        this.d = 2.0f;
    }
}
