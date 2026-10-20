package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class yc {
    public View f32626a;
    public final float f32627b;
    public final float f32628c;
    public final float d;
    public long e;
    public Runnable f32629f;
    public ValueAnimator f32630g;
    public final float h;
    public boolean f32631i;
    public float f32632j;

    public yc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f32632j, f7, 1.0f - f7) * this.h;
    }

    public void b() {
        View view = this.f32626a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f32629f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.f32631i != z10) {
            this.f32631i = z10;
            ValueAnimator valueAnimator = this.f32630g;
            this.f32630g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f32632j;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f32630g = ofFloat;
            ofFloat.addUpdateListener(new l6(this, 7));
            this.f32630g.addListener(new org.telegram.ui.fo(2, this, z10));
            if (this.f32631i) {
                this.f32630g.setInterpolator(bs.f25021f);
                this.f32630g.setDuration(this.f32627b * 60.0f);
                this.f32630g.setStartDelay(0L);
            } else {
                this.f32630g.setInterpolator(new OvershootInterpolator(this.d));
                this.f32630g.setDuration(this.f32628c * 350.0f);
                this.f32630g.setStartDelay(this.e);
            }
            this.f32630g.start();
        }
    }

    public yc(View view, float f7, float f10) {
        this.e = 0L;
        this.h = 1.0f;
        this.f32626a = view;
        this.f32628c = f7;
        this.f32627b = f7;
        this.d = f10;
    }

    public yc(ei.d6 d6Var) {
        this.e = 0L;
        this.h = 1.0f;
        this.f32626a = d6Var;
        this.f32627b = 1.5f;
        this.f32628c = 1.0f;
        this.d = 2.0f;
    }
}
