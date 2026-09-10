package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class xc {
    public View f29003a;
    public final float f29004b;
    public final float f29005c;
    public final float d;
    public long e;
    public Runnable f29006f;
    public ValueAnimator f29007g;
    public boolean h;
    public float f29008i;

    public xc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f29008i, f7, 1.0f - f7);
    }

    public void b() {
        View view = this.f29003a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f29006f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.h != z10) {
            this.h = z10;
            ValueAnimator valueAnimator = this.f29007g;
            this.f29007g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f29008i;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f29007g = ofFloat;
            ofFloat.addUpdateListener(new j6(this, 7));
            this.f29007g.addListener(new ai.e(27, this, z10));
            if (this.h) {
                this.f29007g.setInterpolator(wr.f28819f);
                this.f29007g.setDuration(this.f29004b * 60.0f);
                this.f29007g.setStartDelay(0L);
            } else {
                this.f29007g.setInterpolator(new OvershootInterpolator(this.d));
                this.f29007g.setDuration(this.f29005c * 350.0f);
                this.f29007g.setStartDelay(this.e);
            }
            this.f29007g.start();
        }
    }

    public xc(View view, float f7, float f10) {
        this.e = 0L;
        this.f29003a = view;
        this.f29005c = f7;
        this.f29004b = f7;
        this.d = f10;
    }

    public xc(bi.p7 p7Var) {
        this.e = 0L;
        this.f29003a = p7Var;
        this.f29004b = 1.5f;
        this.f29005c = 1.0f;
        this.d = 2.0f;
    }
}
