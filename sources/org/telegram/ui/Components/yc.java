package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class yc {
    public View f32595a;
    public final float f32596b;
    public final float f32597c;
    public final float d;
    public long e;
    public Runnable f32598f;
    public ValueAnimator f32599g;
    public final float h;
    public boolean f32600i;
    public float f32601j;

    public yc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f32601j, f7, 1.0f - f7) * this.h;
    }

    public void b() {
        View view = this.f32595a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f32598f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.f32600i != z10) {
            this.f32600i = z10;
            ValueAnimator valueAnimator = this.f32599g;
            this.f32599g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f32601j;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f32599g = ofFloat;
            ofFloat.addUpdateListener(new l6(this, 7));
            this.f32599g.addListener(new org.telegram.ui.fo(2, this, z10));
            if (this.f32600i) {
                this.f32599g.setInterpolator(bs.f25014f);
                this.f32599g.setDuration(this.f32596b * 60.0f);
                this.f32599g.setStartDelay(0L);
            } else {
                this.f32599g.setInterpolator(new OvershootInterpolator(this.d));
                this.f32599g.setDuration(this.f32597c * 350.0f);
                this.f32599g.setStartDelay(this.e);
            }
            this.f32599g.start();
        }
    }

    public yc(View view, float f7, float f10) {
        this.e = 0L;
        this.h = 1.0f;
        this.f32595a = view;
        this.f32597c = f7;
        this.f32596b = f7;
        this.d = f10;
    }

    public yc(ei.d6 d6Var) {
        this.e = 0L;
        this.h = 1.0f;
        this.f32595a = d6Var;
        this.f32596b = 1.5f;
        this.f32597c = 1.0f;
        this.d = 2.0f;
    }
}
