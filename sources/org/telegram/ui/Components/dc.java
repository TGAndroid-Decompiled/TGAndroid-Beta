package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class dc {
    public View f25385a;
    public final float f25386b;
    public final float f25387c;
    public final float d;
    public long e;
    public Runnable f25388f;
    public ValueAnimator f25389g;
    public final float h;
    public boolean f25390i;
    public float f25391j;

    public dc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return c3.i0.z(1.0f, this.f25391j, f7, 1.0f - f7) * this.h;
    }

    public void b() {
        View view = this.f25385a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f25388f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.f25390i != z10) {
            this.f25390i = z10;
            ValueAnimator valueAnimator = this.f25389g;
            this.f25389g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f25391j;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f25389g = ofFloat;
            ofFloat.addUpdateListener(new a6(this, 7));
            this.f25389g.addListener(new eg.m(17, this, z10));
            if (this.f25390i) {
                this.f25389g.setInterpolator(gr.f26495f);
                this.f25389g.setDuration(this.f25386b * 60.0f);
                this.f25389g.setStartDelay(0L);
            } else {
                this.f25389g.setInterpolator(new OvershootInterpolator(this.d));
                this.f25389g.setDuration(this.f25387c * 350.0f);
                this.f25389g.setStartDelay(this.e);
            }
            this.f25389g.start();
        }
    }

    public dc(View view, float f7, float f10) {
        this.e = 0L;
        this.h = 1.0f;
        this.f25385a = view;
        this.f25387c = f7;
        this.f25386b = f7;
        this.d = f10;
    }

    public dc(vh.a4 a4Var) {
        this.e = 0L;
        this.h = 1.0f;
        this.f25385a = a4Var;
        this.f25386b = 1.5f;
        this.f25387c = 1.0f;
        this.d = 2.0f;
    }
}
