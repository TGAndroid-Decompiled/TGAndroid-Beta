package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class ic {
    public View f34696a;
    public final float f34697b;
    public final float f34698c;
    public final float d;
    public long f34699e;
    public Runnable f34700f;
    public ValueAnimator f34701g;
    public final float h;
    public boolean f34702i;
    public float f34703j;

    public ic(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f10) {
        return com.google.android.recaptcha.internal.a.z(1.0f, this.f34703j, f10, 1.0f - f10) * this.h;
    }

    public void b() {
        View view = this.f34696a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f34700f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z9) {
        float f10;
        if (this.f34702i != z9) {
            this.f34702i = z9;
            ValueAnimator valueAnimator = this.f34701g;
            this.f34701g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f34703j;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f34701g = ofFloat;
            ofFloat.addUpdateListener(new e6(this, 7));
            this.f34701g.addListener(new t9(1, this, z9));
            if (this.f34702i) {
                this.f34701g.setInterpolator(xq.f40458f);
                this.f34701g.setDuration(this.f34697b * 60.0f);
                this.f34701g.setStartDelay(0L);
            } else {
                this.f34701g.setInterpolator(new OvershootInterpolator(this.d));
                this.f34701g.setDuration(this.f34698c * 350.0f);
                this.f34701g.setStartDelay(this.f34699e);
            }
            this.f34701g.start();
        }
    }

    public ic(View view, float f10, float f11) {
        this.f34699e = 0L;
        this.h = 1.0f;
        this.f34696a = view;
        this.f34698c = f10;
        this.f34697b = f10;
        this.d = f11;
    }

    public ic(fi.m5 m5Var) {
        this.f34699e = 0L;
        this.h = 1.0f;
        this.f34696a = m5Var;
        this.f34697b = 1.5f;
        this.f34698c = 1.0f;
        this.d = 2.0f;
    }
}
