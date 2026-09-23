package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class yc {
    public View f30204a;
    public final float f30205b;
    public final float f30206c;
    public final float d;
    public long e;
    public Runnable f30207f;
    public ValueAnimator f30208g;
    public boolean h;
    public float f30209i;

    public yc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f30209i, f7, 1.0f - f7);
    }

    public void b() {
        View view = this.f30204a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f30207f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.h != z10) {
            this.h = z10;
            ValueAnimator valueAnimator = this.f30208g;
            this.f30208g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f30209i;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f30208g = ofFloat;
            ofFloat.addUpdateListener(new k6(this, 7));
            this.f30208g.addListener(new ca(1, this, z10));
            if (this.h) {
                this.f30208g.setInterpolator(rr.f27701f);
                this.f30208g.setDuration(this.f30205b * 60.0f);
                this.f30208g.setStartDelay(0L);
            } else {
                this.f30208g.setInterpolator(new OvershootInterpolator(this.d));
                this.f30208g.setDuration(this.f30206c * 350.0f);
                this.f30208g.setStartDelay(this.e);
            }
            this.f30208g.start();
        }
    }

    public yc(View view, float f7, float f10) {
        this.e = 0L;
        this.f30204a = view;
        this.f30206c = f7;
        this.f30205b = f7;
        this.d = f10;
    }

    public yc(ci.o6 o6Var) {
        this.e = 0L;
        this.f30204a = o6Var;
        this.f30205b = 1.5f;
        this.f30206c = 1.0f;
        this.d = 2.0f;
    }
}
