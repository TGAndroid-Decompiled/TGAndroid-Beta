package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class yc {
    public View f30586a;
    public final float f30587b;
    public final float f30588c;
    public final float d;
    public long e;
    public Runnable f30589f;
    public ValueAnimator f30590g;
    public boolean h;
    public float f30591i;

    public yc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f30591i, f7, 1.0f - f7);
    }

    public void b() {
        View view = this.f30586a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f30589f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.h != z10) {
            this.h = z10;
            ValueAnimator valueAnimator = this.f30590g;
            this.f30590g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f30591i;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f30590g = ofFloat;
            ofFloat.addUpdateListener(new k6(this, 7));
            this.f30590g.addListener(new ca(1, this, z10));
            if (this.h) {
                this.f30590g.setInterpolator(rr.f28031f);
                this.f30590g.setDuration(this.f30587b * 60.0f);
                this.f30590g.setStartDelay(0L);
            } else {
                this.f30590g.setInterpolator(new OvershootInterpolator(this.d));
                this.f30590g.setDuration(this.f30588c * 350.0f);
                this.f30590g.setStartDelay(this.e);
            }
            this.f30590g.start();
        }
    }

    public yc(View view, float f7, float f10) {
        this.e = 0L;
        this.f30586a = view;
        this.f30588c = f7;
        this.f30587b = f7;
        this.d = f10;
    }

    public yc(ci.o6 o6Var) {
        this.e = 0L;
        this.f30586a = o6Var;
        this.f30587b = 1.5f;
        this.f30588c = 1.0f;
        this.d = 2.0f;
    }
}
