package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class ic {
    public View f34586a;
    public final float f34587b;
    public final float f34588c;
    public final float d;
    public long f34589e;
    public Runnable f34590f;
    public ValueAnimator f34591g;
    public final float h;
    public boolean f34592i;
    public float f34593j;

    public ic(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f10) {
        return com.google.android.recaptcha.internal.a.z(1.0f, this.f34593j, f10, 1.0f - f10) * this.h;
    }

    public void b() {
        View view = this.f34586a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f34590f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z9) {
        float f10;
        if (this.f34592i != z9) {
            this.f34592i = z9;
            ValueAnimator valueAnimator = this.f34591g;
            this.f34591g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f34593j;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f34591g = ofFloat;
            ofFloat.addUpdateListener(new e6(this, 7));
            this.f34591g.addListener(new t9(1, this, z9));
            if (this.f34592i) {
                this.f34591g.setInterpolator(xq.f40310f);
                this.f34591g.setDuration(this.f34587b * 60.0f);
                this.f34591g.setStartDelay(0L);
            } else {
                this.f34591g.setInterpolator(new OvershootInterpolator(this.d));
                this.f34591g.setDuration(this.f34588c * 350.0f);
                this.f34591g.setStartDelay(this.f34589e);
            }
            this.f34591g.start();
        }
    }

    public ic(View view, float f10, float f11) {
        this.f34589e = 0L;
        this.h = 1.0f;
        this.f34586a = view;
        this.f34588c = f10;
        this.f34587b = f10;
        this.d = f11;
    }

    public ic(fi.m5 m5Var) {
        this.f34589e = 0L;
        this.h = 1.0f;
        this.f34586a = m5Var;
        this.f34587b = 1.5f;
        this.f34588c = 1.0f;
        this.d = 2.0f;
    }
}
