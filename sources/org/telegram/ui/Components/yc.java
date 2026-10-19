package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class yc {
    public View f32593a;
    public final float f32594b;
    public final float f32595c;
    public final float d;
    public long e;
    public Runnable f32596f;
    public ValueAnimator f32597g;
    public final float h;
    public boolean f32598i;
    public float f32599j;

    public yc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f32599j, f7, 1.0f - f7) * this.h;
    }

    public void b() {
        View view = this.f32593a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f32596f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.f32598i != z10) {
            this.f32598i = z10;
            ValueAnimator valueAnimator = this.f32597g;
            this.f32597g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f32599j;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f32597g = ofFloat;
            ofFloat.addUpdateListener(new l6(this, 7));
            this.f32597g.addListener(new org.telegram.ui.fo(2, this, z10));
            if (this.f32598i) {
                this.f32597g.setInterpolator(bs.f25012f);
                this.f32597g.setDuration(this.f32594b * 60.0f);
                this.f32597g.setStartDelay(0L);
            } else {
                this.f32597g.setInterpolator(new OvershootInterpolator(this.d));
                this.f32597g.setDuration(this.f32595c * 350.0f);
                this.f32597g.setStartDelay(this.e);
            }
            this.f32597g.start();
        }
    }

    public yc(View view, float f7, float f10) {
        this.e = 0L;
        this.h = 1.0f;
        this.f32593a = view;
        this.f32595c = f7;
        this.f32594b = f7;
        this.d = f10;
    }

    public yc(ei.d6 d6Var) {
        this.e = 0L;
        this.h = 1.0f;
        this.f32593a = d6Var;
        this.f32594b = 1.5f;
        this.f32595c = 1.0f;
        this.d = 2.0f;
    }
}
