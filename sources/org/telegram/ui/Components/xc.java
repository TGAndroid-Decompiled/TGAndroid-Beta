package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class xc {
    public View f34685a;
    public final float f34686b;
    public final float f34687c;
    public final float d;
    public long e;
    public Runnable f34688f;
    public ValueAnimator f34689g;
    public final float h;
    public boolean f34690i;
    public float f34691j;

    public xc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return c3.h0.z(1.0f, this.f34691j, f7, 1.0f - f7) * this.h;
    }

    public void b() {
        View view = this.f34685a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f34688f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.f34690i != z10) {
            this.f34690i = z10;
            ValueAnimator valueAnimator = this.f34689g;
            this.f34689g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f34691j;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f34689g = ofFloat;
            ofFloat.addUpdateListener(new n6(this, 7));
            this.f34689g.addListener(new org.telegram.ui.jo(2, this, z10));
            if (this.f34690i) {
                this.f34689g.setInterpolator(ds.f27586f);
                this.f34689g.setDuration(this.f34686b * 60.0f);
                this.f34689g.setStartDelay(0L);
            } else {
                this.f34689g.setInterpolator(new OvershootInterpolator(this.d));
                this.f34689g.setDuration(this.f34687c * 350.0f);
                this.f34689g.setStartDelay(this.e);
            }
            this.f34689g.start();
        }
    }

    public xc(View view, float f7, float f10) {
        this.e = 0L;
        this.h = 1.0f;
        this.f34685a = view;
        this.f34687c = f7;
        this.f34686b = f7;
        this.d = f10;
    }

    public xc(fi.c6 c6Var) {
        this.e = 0L;
        this.h = 1.0f;
        this.f34685a = c6Var;
        this.f34686b = 1.5f;
        this.f34687c = 1.0f;
        this.d = 2.0f;
    }
}
