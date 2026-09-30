package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class zc {
    public View f30944a;
    public final float f30945b;
    public final float f30946c;
    public final float d;
    public long e;
    public Runnable f30947f;
    public ValueAnimator f30948g;
    public boolean h;
    public float f30949i;

    public zc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f30949i, f7, 1.0f - f7);
    }

    public void b() {
        View view = this.f30944a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f30947f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.h != z10) {
            this.h = z10;
            ValueAnimator valueAnimator = this.f30948g;
            this.f30948g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f30949i;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f30948g = ofFloat;
            ofFloat.addUpdateListener(new k6(this, 7));
            this.f30948g.addListener(new da(1, this, z10));
            if (this.h) {
                this.f30948g.setInterpolator(tr.f28636f);
                this.f30948g.setDuration(this.f30945b * 60.0f);
                this.f30948g.setStartDelay(0L);
            } else {
                this.f30948g.setInterpolator(new OvershootInterpolator(this.d));
                this.f30948g.setDuration(this.f30946c * 350.0f);
                this.f30948g.setStartDelay(this.e);
            }
            this.f30948g.start();
        }
    }

    public zc(View view, float f7, float f10) {
        this.e = 0L;
        this.f30944a = view;
        this.f30946c = f7;
        this.f30945b = f7;
        this.d = f10;
    }

    public zc(ci.o6 o6Var) {
        this.e = 0L;
        this.f30944a = o6Var;
        this.f30945b = 1.5f;
        this.f30946c = 1.0f;
        this.d = 2.0f;
    }
}
