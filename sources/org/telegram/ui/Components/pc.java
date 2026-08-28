package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class pc {
    public View f31606a;
    public final float f31607b;
    public final float f31608c;
    public final float d;
    public long f31609e;
    public Runnable f31610f;
    public ValueAnimator f31611g;
    public boolean h;
    public float f31612i;

    public pc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f10) {
        return e2.c.z(1.0f, this.f31612i, f10, 1.0f - f10);
    }

    public void b() {
        View view = this.f31606a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f31610f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f10;
        if (this.h != z10) {
            this.h = z10;
            ValueAnimator valueAnimator = this.f31611g;
            this.f31611g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f31612i;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f31611g = ofFloat;
            ofFloat.addUpdateListener(new e6(this, 7));
            this.f31611g.addListener(new u9(1, this, z10));
            if (this.h) {
                this.f31611g.setInterpolator(gr.f28844f);
                this.f31611g.setDuration(this.f31607b * 60.0f);
                this.f31611g.setStartDelay(0L);
            } else {
                this.f31611g.setInterpolator(new OvershootInterpolator(this.d));
                this.f31611g.setDuration(this.f31608c * 350.0f);
                this.f31611g.setStartDelay(this.f31609e);
            }
            this.f31611g.start();
        }
    }

    public pc(View view, float f10, float f11) {
        this.f31609e = 0L;
        this.f31606a = view;
        this.f31608c = f10;
        this.f31607b = f10;
        this.d = f11;
    }

    public pc(kh.e6 e6Var) {
        this.f31609e = 0L;
        this.f31606a = e6Var;
        this.f31607b = 1.5f;
        this.f31608c = 1.0f;
        this.d = 2.0f;
    }
}
