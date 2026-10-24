package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class wc {
    public View f32180a;
    public final float f32181b;
    public final float f32182c;
    public final float d;
    public long e;
    public Runnable f32183f;
    public ValueAnimator f32184g;
    public final float h;
    public boolean f32185i;
    public float f32186j;

    public wc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f32186j, f7, 1.0f - f7) * this.h;
    }

    public void b() {
        View view = this.f32180a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f32183f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.f32185i != z10) {
            this.f32185i = z10;
            ValueAnimator valueAnimator = this.f32184g;
            this.f32184g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f32186j;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f32184g = ofFloat;
            ofFloat.addUpdateListener(new j6(this, 7));
            this.f32184g.addListener(new org.telegram.ui.ho(2, this, z10));
            if (this.f32185i) {
                this.f32184g.setInterpolator(zr.f33337f);
                this.f32184g.setDuration(this.f32181b * 60.0f);
                this.f32184g.setStartDelay(0L);
            } else {
                this.f32184g.setInterpolator(new OvershootInterpolator(this.d));
                this.f32184g.setDuration(this.f32182c * 350.0f);
                this.f32184g.setStartDelay(this.e);
            }
            this.f32184g.start();
        }
    }

    public wc(View view, float f7, float f10) {
        this.e = 0L;
        this.h = 1.0f;
        this.f32180a = view;
        this.f32182c = f7;
        this.f32181b = f7;
        this.d = f10;
    }

    public wc(ei.d6 d6Var) {
        this.e = 0L;
        this.h = 1.0f;
        this.f32180a = d6Var;
        this.f32181b = 1.5f;
        this.f32182c = 1.0f;
        this.d = 2.0f;
    }
}
