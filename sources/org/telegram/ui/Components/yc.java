package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class yc {
    public View f30585a;
    public final float f30586b;
    public final float f30587c;
    public final float d;
    public long e;
    public Runnable f30588f;
    public ValueAnimator f30589g;
    public boolean h;
    public float f30590i;

    public yc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f30590i, f7, 1.0f - f7);
    }

    public void b() {
        View view = this.f30585a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f30588f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.h != z10) {
            this.h = z10;
            ValueAnimator valueAnimator = this.f30589g;
            this.f30589g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f30590i;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f30589g = ofFloat;
            ofFloat.addUpdateListener(new k6(this, 7));
            this.f30589g.addListener(new ca(1, this, z10));
            if (this.h) {
                this.f30589g.setInterpolator(rr.f28030f);
                this.f30589g.setDuration(this.f30586b * 60.0f);
                this.f30589g.setStartDelay(0L);
            } else {
                this.f30589g.setInterpolator(new OvershootInterpolator(this.d));
                this.f30589g.setDuration(this.f30587c * 350.0f);
                this.f30589g.setStartDelay(this.e);
            }
            this.f30589g.start();
        }
    }

    public yc(View view, float f7, float f10) {
        this.e = 0L;
        this.f30585a = view;
        this.f30587c = f7;
        this.f30586b = f7;
        this.d = f10;
    }

    public yc(ci.o6 o6Var) {
        this.e = 0L;
        this.f30585a = o6Var;
        this.f30586b = 1.5f;
        this.f30587c = 1.0f;
        this.d = 2.0f;
    }
}
