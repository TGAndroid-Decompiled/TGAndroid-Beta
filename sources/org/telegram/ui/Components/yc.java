package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class yc {
    public View f30545a;
    public final float f30546b;
    public final float f30547c;
    public final float d;
    public long e;
    public Runnable f30548f;
    public ValueAnimator f30549g;
    public boolean h;
    public float f30550i;

    public yc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f30550i, f7, 1.0f - f7);
    }

    public void b() {
        View view = this.f30545a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f30548f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.h != z10) {
            this.h = z10;
            ValueAnimator valueAnimator = this.f30549g;
            this.f30549g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f30550i;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f30549g = ofFloat;
            ofFloat.addUpdateListener(new k6(this, 7));
            this.f30549g.addListener(new ca(1, this, z10));
            if (this.h) {
                this.f30549g.setInterpolator(qr.f27715f);
                this.f30549g.setDuration(this.f30546b * 60.0f);
                this.f30549g.setStartDelay(0L);
            } else {
                this.f30549g.setInterpolator(new OvershootInterpolator(this.d));
                this.f30549g.setDuration(this.f30547c * 350.0f);
                this.f30549g.setStartDelay(this.e);
            }
            this.f30549g.start();
        }
    }

    public yc(View view, float f7, float f10) {
        this.e = 0L;
        this.f30545a = view;
        this.f30547c = f7;
        this.f30546b = f7;
        this.d = f10;
    }

    public yc(ci.p6 p6Var) {
        this.e = 0L;
        this.f30545a = p6Var;
        this.f30546b = 1.5f;
        this.f30547c = 1.0f;
        this.d = 2.0f;
    }
}
