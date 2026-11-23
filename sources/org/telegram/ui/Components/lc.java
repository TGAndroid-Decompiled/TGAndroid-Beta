package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class lc {
    public View f37103a;
    public final float f37104b;
    public final float f37105c;
    public final float d;
    public long f37106e;
    public Runnable f37107f;
    public ValueAnimator f37108g;
    public final float h;
    public boolean f37109i;
    public float f37110j;

    public lc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f10) {
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f37110j, f10, 1.0f - f10) * this.h;
    }

    public void b() {
        View view = this.f37103a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f37107f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f10;
        if (this.f37109i != z10) {
            this.f37109i = z10;
            ValueAnimator valueAnimator = this.f37108g;
            this.f37108g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f37110j;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f37108g = ofFloat;
            ofFloat.addUpdateListener(new w(this, 8));
            this.f37108g.addListener(new org.telegram.ui.on(2, this, z10));
            if (this.f37109i) {
                this.f37108g.setInterpolator(kr.f36858f);
                this.f37108g.setDuration(this.f37104b * 60.0f);
                this.f37108g.setStartDelay(0L);
            } else {
                this.f37108g.setInterpolator(new OvershootInterpolator(this.d));
                this.f37108g.setDuration(this.f37105c * 350.0f);
                this.f37108g.setStartDelay(this.f37106e);
            }
            this.f37108g.start();
        }
    }

    public lc(View view, float f10, float f11) {
        this.f37106e = 0L;
        this.h = 1.0f;
        this.f37103a = view;
        this.f37105c = f10;
        this.f37104b = f10;
        this.d = f11;
    }

    public lc(hi.t5 t5Var) {
        this.f37106e = 0L;
        this.h = 1.0f;
        this.f37103a = t5Var;
        this.f37104b = 1.5f;
        this.f37105c = 1.0f;
        this.d = 2.0f;
    }
}
