package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class zc {
    public View f33118a;
    public final float f33119b;
    public final float f33120c;
    public final float d;
    public long f33121e;
    public Runnable f33122f;
    public ValueAnimator f33123g;
    public boolean h;
    public float f33124i;

    public zc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f33124i, f7, 1.0f - f7);
    }

    public void b() {
        View view = this.f33118a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f33122f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.h != z10) {
            this.h = z10;
            ValueAnimator valueAnimator = this.f33123g;
            this.f33123g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f33124i;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f33123g = ofFloat;
            ofFloat.addUpdateListener(new l6(this, 7));
            this.f33123g.addListener(new org.telegram.ui.to(2, this, z10));
            if (this.h) {
                this.f33123g.setInterpolator(pr.f29466f);
                this.f33123g.setDuration(this.f33119b * 60.0f);
                this.f33123g.setStartDelay(0L);
            } else {
                this.f33123g.setInterpolator(new OvershootInterpolator(this.d));
                this.f33123g.setDuration(this.f33120c * 350.0f);
                this.f33123g.setStartDelay(this.f33121e);
            }
            this.f33123g.start();
        }
    }

    public zc(View view, float f7, float f10) {
        this.f33121e = 0L;
        this.f33118a = view;
        this.f33120c = f7;
        this.f33119b = f7;
        this.d = f10;
    }

    public zc(di.o6 o6Var) {
        this.f33121e = 0L;
        this.f33118a = o6Var;
        this.f33119b = 1.5f;
        this.f33120c = 1.0f;
        this.d = 2.0f;
    }
}
