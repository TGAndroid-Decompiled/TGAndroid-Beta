package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class yc {
    public View f30496a;
    public final float f30497b;
    public final float f30498c;
    public final float d;
    public long e;
    public Runnable f30499f;
    public ValueAnimator f30500g;
    public boolean h;
    public float f30501i;

    public yc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f30501i, f7, 1.0f - f7);
    }

    public void b() {
        View view = this.f30496a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f30499f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.h != z10) {
            this.h = z10;
            ValueAnimator valueAnimator = this.f30500g;
            this.f30500g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f30501i;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f30500g = ofFloat;
            ofFloat.addUpdateListener(new j6(this, 7));
            this.f30500g.addListener(new ba(1, this, z10));
            if (this.h) {
                this.f30500g.setInterpolator(qr.f27642f);
                this.f30500g.setDuration(this.f30497b * 60.0f);
                this.f30500g.setStartDelay(0L);
            } else {
                this.f30500g.setInterpolator(new OvershootInterpolator(this.d));
                this.f30500g.setDuration(this.f30498c * 350.0f);
                this.f30500g.setStartDelay(this.e);
            }
            this.f30500g.start();
        }
    }

    public yc(View view, float f7, float f10) {
        this.e = 0L;
        this.f30496a = view;
        this.f30498c = f7;
        this.f30497b = f7;
        this.d = f10;
    }

    public yc(ci.p6 p6Var) {
        this.e = 0L;
        this.f30496a = p6Var;
        this.f30497b = 1.5f;
        this.f30498c = 1.0f;
        this.d = 2.0f;
    }
}
