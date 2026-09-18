package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class wc {
    public View f29632a;
    public final float f29633b;
    public final float f29634c;
    public final float d;
    public long e;
    public Runnable f29635f;
    public ValueAnimator f29636g;
    public boolean h;
    public float f29637i;

    public wc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f29637i, f7, 1.0f - f7);
    }

    public void b() {
        View view = this.f29632a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f29635f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.h != z10) {
            this.h = z10;
            ValueAnimator valueAnimator = this.f29636g;
            this.f29636g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f29637i;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f29636g = ofFloat;
            ofFloat.addUpdateListener(new i6(this, 7));
            this.f29636g.addListener(new aa(1, this, z10));
            if (this.h) {
                this.f29636g.setInterpolator(qr.f27383f);
                this.f29636g.setDuration(this.f29633b * 60.0f);
                this.f29636g.setStartDelay(0L);
            } else {
                this.f29636g.setInterpolator(new OvershootInterpolator(this.d));
                this.f29636g.setDuration(this.f29634c * 350.0f);
                this.f29636g.setStartDelay(this.e);
            }
            this.f29636g.start();
        }
    }

    public wc(View view, float f7, float f10) {
        this.e = 0L;
        this.f29632a = view;
        this.f29634c = f7;
        this.f29633b = f7;
        this.d = f10;
    }

    public wc(ci.p6 p6Var) {
        this.e = 0L;
        this.f29632a = p6Var;
        this.f29633b = 1.5f;
        this.f29634c = 1.0f;
        this.d = 2.0f;
    }
}
