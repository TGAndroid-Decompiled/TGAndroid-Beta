package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class dc {
    public View f25460a;
    public final float f25461b;
    public final float f25462c;
    public final float d;
    public long e;
    public Runnable f25463f;
    public ValueAnimator f25464g;
    public final float h;
    public boolean f25465i;
    public float f25466j;

    public dc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return c3.i0.z(1.0f, this.f25466j, f7, 1.0f - f7) * this.h;
    }

    public void b() {
        View view = this.f25460a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f25463f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.f25465i != z10) {
            this.f25465i = z10;
            ValueAnimator valueAnimator = this.f25464g;
            this.f25464g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f25466j;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f25464g = ofFloat;
            ofFloat.addUpdateListener(new a6(this, 7));
            this.f25464g.addListener(new eg.m(17, this, z10));
            if (this.f25465i) {
                this.f25464g.setInterpolator(gr.f26523f);
                this.f25464g.setDuration(this.f25461b * 60.0f);
                this.f25464g.setStartDelay(0L);
            } else {
                this.f25464g.setInterpolator(new OvershootInterpolator(this.d));
                this.f25464g.setDuration(this.f25462c * 350.0f);
                this.f25464g.setStartDelay(this.e);
            }
            this.f25464g.start();
        }
    }

    public dc(View view, float f7, float f10) {
        this.e = 0L;
        this.h = 1.0f;
        this.f25460a = view;
        this.f25462c = f7;
        this.f25461b = f7;
        this.d = f10;
    }

    public dc(vh.a4 a4Var) {
        this.e = 0L;
        this.h = 1.0f;
        this.f25460a = a4Var;
        this.f25461b = 1.5f;
        this.f25462c = 1.0f;
        this.d = 2.0f;
    }
}
