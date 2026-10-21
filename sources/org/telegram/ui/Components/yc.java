package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class yc {
    public View f32627a;
    public final float f32628b;
    public final float f32629c;
    public final float d;
    public long e;
    public Runnable f32630f;
    public ValueAnimator f32631g;
    public final float h;
    public boolean f32632i;
    public float f32633j;

    public yc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f32633j, f7, 1.0f - f7) * this.h;
    }

    public void b() {
        View view = this.f32627a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f32630f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.f32632i != z10) {
            this.f32632i = z10;
            ValueAnimator valueAnimator = this.f32631g;
            this.f32631g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f32633j;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f32631g = ofFloat;
            ofFloat.addUpdateListener(new l6(this, 7));
            this.f32631g.addListener(new org.telegram.ui.fo(2, this, z10));
            if (this.f32632i) {
                this.f32631g.setInterpolator(bs.f25021f);
                this.f32631g.setDuration(this.f32628b * 60.0f);
                this.f32631g.setStartDelay(0L);
            } else {
                this.f32631g.setInterpolator(new OvershootInterpolator(this.d));
                this.f32631g.setDuration(this.f32629c * 350.0f);
                this.f32631g.setStartDelay(this.e);
            }
            this.f32631g.start();
        }
    }

    public yc(View view, float f7, float f10) {
        this.e = 0L;
        this.h = 1.0f;
        this.f32627a = view;
        this.f32629c = f7;
        this.f32628b = f7;
        this.d = f10;
    }

    public yc(ei.d6 d6Var) {
        this.e = 0L;
        this.h = 1.0f;
        this.f32627a = d6Var;
        this.f32628b = 1.5f;
        this.f32629c = 1.0f;
        this.d = 2.0f;
    }
}
