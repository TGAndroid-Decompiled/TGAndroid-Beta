package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class uc {
    public View f33187a;
    public final float f33188b;
    public final float f33189c;
    public final float d;
    public long f33190e;
    public Runnable f33191f;
    public ValueAnimator f33192g;
    public boolean h;
    public float f33193i;

    public uc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f9) {
        return com.google.android.recaptcha.internal.a.z(1.0f, this.f33193i, f9, 1.0f - f9);
    }

    public void b() {
        View view = this.f33187a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f33191f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f9;
        if (this.h != z10) {
            this.h = z10;
            ValueAnimator valueAnimator = this.f33192g;
            this.f33192g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f33193i;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
            this.f33192g = ofFloat;
            ofFloat.addUpdateListener(new j6(this, 7));
            this.f33192g.addListener(new z9(1, this, z10));
            if (this.h) {
                this.f33192g.setInterpolator(jr.f29800f);
                this.f33192g.setDuration(this.f33188b * 60.0f);
                this.f33192g.setStartDelay(0L);
            } else {
                this.f33192g.setInterpolator(new OvershootInterpolator(this.d));
                this.f33192g.setDuration(this.f33189c * 350.0f);
                this.f33192g.setStartDelay(this.f33190e);
            }
            this.f33192g.start();
        }
    }

    public uc(View view, float f9, float f10) {
        this.f33190e = 0L;
        this.f33187a = view;
        this.f33189c = f9;
        this.f33188b = f9;
        this.d = f10;
    }

    public uc(nh.s5 s5Var) {
        this.f33190e = 0L;
        this.f33187a = s5Var;
        this.f33188b = 1.5f;
        this.f33189c = 1.0f;
        this.d = 2.0f;
    }
}
