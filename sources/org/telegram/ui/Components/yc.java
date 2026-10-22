package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class yc {
    public View f32630a;
    public final float f32631b;
    public final float f32632c;
    public final float d;
    public long e;
    public Runnable f32633f;
    public ValueAnimator f32634g;
    public final float h;
    public boolean f32635i;
    public float f32636j;

    public yc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f32636j, f7, 1.0f - f7) * this.h;
    }

    public void b() {
        View view = this.f32630a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f32633f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.f32635i != z10) {
            this.f32635i = z10;
            ValueAnimator valueAnimator = this.f32634g;
            this.f32634g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f32636j;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f32634g = ofFloat;
            ofFloat.addUpdateListener(new l6(this, 7));
            this.f32634g.addListener(new org.telegram.ui.fo(2, this, z10));
            if (this.f32635i) {
                this.f32634g.setInterpolator(bs.f25024f);
                this.f32634g.setDuration(this.f32631b * 60.0f);
                this.f32634g.setStartDelay(0L);
            } else {
                this.f32634g.setInterpolator(new OvershootInterpolator(this.d));
                this.f32634g.setDuration(this.f32632c * 350.0f);
                this.f32634g.setStartDelay(this.e);
            }
            this.f32634g.start();
        }
    }

    public yc(View view, float f7, float f10) {
        this.e = 0L;
        this.h = 1.0f;
        this.f32630a = view;
        this.f32632c = f7;
        this.f32631b = f7;
        this.d = f10;
    }

    public yc(ei.d6 d6Var) {
        this.e = 0L;
        this.h = 1.0f;
        this.f32630a = d6Var;
        this.f32631b = 1.5f;
        this.f32632c = 1.0f;
        this.d = 2.0f;
    }
}
