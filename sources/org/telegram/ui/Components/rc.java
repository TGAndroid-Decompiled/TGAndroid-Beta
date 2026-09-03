package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class rc {
    public View f28450a;
    public final float f28451b;
    public final float f28452c;
    public final float d;
    public long e;
    public Runnable f28453f;
    public ValueAnimator f28454g;
    public boolean h;
    public float f28455i;

    public rc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f10) {
        return e2.c.w(1.0f, this.f28455i, f10, 1.0f - f10);
    }

    public void b() {
        View view = this.f28450a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f28453f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z4) {
        float f10;
        if (this.h != z4) {
            this.h = z4;
            ValueAnimator valueAnimator = this.f28454g;
            this.f28454g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f28455i;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f28454g = ofFloat;
            ofFloat.addUpdateListener(new f6(this, 7));
            this.f28454g.addListener(new dg.w2(23, this, z4));
            if (this.h) {
                this.f28454g.setInterpolator(mr.f27122f);
                this.f28454g.setDuration(this.f28451b * 60.0f);
                this.f28454g.setStartDelay(0L);
            } else {
                this.f28454g.setInterpolator(new OvershootInterpolator(this.d));
                this.f28454g.setDuration(this.f28452c * 350.0f);
                this.f28454g.setStartDelay(this.e);
            }
            this.f28454g.start();
        }
    }

    public rc(View view, float f10, float f11) {
        this.e = 0L;
        this.f28450a = view;
        this.f28452c = f10;
        this.f28451b = f10;
        this.d = f11;
    }

    public rc(ph.b5 b5Var) {
        this.e = 0L;
        this.f28450a = b5Var;
        this.f28451b = 1.5f;
        this.f28452c = 1.0f;
        this.d = 2.0f;
    }
}
