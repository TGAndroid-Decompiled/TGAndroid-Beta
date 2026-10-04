package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class zc {
    public View f33474a;
    public final float f33475b;
    public final float f33476c;
    public final float d;
    public long f33477e;
    public Runnable f33478f;
    public ValueAnimator f33479g;
    public boolean h;
    public float f33480i;

    public zc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f33480i, f7, 1.0f - f7);
    }

    public void b() {
        View view = this.f33474a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f33478f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.h != z10) {
            this.h = z10;
            ValueAnimator valueAnimator = this.f33479g;
            this.f33479g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f33480i;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f33479g = ofFloat;
            ofFloat.addUpdateListener(new k6(this, 7));
            this.f33479g.addListener(new da(1, this, z10));
            if (this.h) {
                this.f33479g.setInterpolator(tr.f31147f);
                this.f33479g.setDuration(this.f33475b * 60.0f);
                this.f33479g.setStartDelay(0L);
            } else {
                this.f33479g.setInterpolator(new OvershootInterpolator(this.d));
                this.f33479g.setDuration(this.f33476c * 350.0f);
                this.f33479g.setStartDelay(this.f33477e);
            }
            this.f33479g.start();
        }
    }

    public zc(View view, float f7, float f10) {
        this.f33477e = 0L;
        this.f33474a = view;
        this.f33476c = f7;
        this.f33475b = f7;
        this.d = f10;
    }

    public zc(ci.o6 o6Var) {
        this.f33477e = 0L;
        this.f33474a = o6Var;
        this.f33475b = 1.5f;
        this.f33476c = 1.0f;
        this.d = 2.0f;
    }
}
