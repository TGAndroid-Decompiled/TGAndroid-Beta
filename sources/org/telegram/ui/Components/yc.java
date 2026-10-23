package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class yc {
    public View f32631a;
    public final float f32632b;
    public final float f32633c;
    public final float d;
    public long e;
    public Runnable f32634f;
    public ValueAnimator f32635g;
    public final float h;
    public boolean f32636i;
    public float f32637j;

    public yc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f32637j, f7, 1.0f - f7) * this.h;
    }

    public void b() {
        View view = this.f32631a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f32634f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.f32636i != z10) {
            this.f32636i = z10;
            ValueAnimator valueAnimator = this.f32635g;
            this.f32635g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f32637j;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f32635g = ofFloat;
            ofFloat.addUpdateListener(new l6(this, 7));
            this.f32635g.addListener(new org.telegram.ui.fo(2, this, z10));
            if (this.f32636i) {
                this.f32635g.setInterpolator(bs.f25025f);
                this.f32635g.setDuration(this.f32632b * 60.0f);
                this.f32635g.setStartDelay(0L);
            } else {
                this.f32635g.setInterpolator(new OvershootInterpolator(this.d));
                this.f32635g.setDuration(this.f32633c * 350.0f);
                this.f32635g.setStartDelay(this.e);
            }
            this.f32635g.start();
        }
    }

    public yc(View view, float f7, float f10) {
        this.e = 0L;
        this.h = 1.0f;
        this.f32631a = view;
        this.f32633c = f7;
        this.f32632b = f7;
        this.d = f10;
    }

    public yc(ei.d6 d6Var) {
        this.e = 0L;
        this.h = 1.0f;
        this.f32631a = d6Var;
        this.f32632b = 1.5f;
        this.f32633c = 1.0f;
        this.d = 2.0f;
    }
}
