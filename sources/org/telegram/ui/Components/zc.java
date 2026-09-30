package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class zc {
    public View f30863a;
    public final float f30864b;
    public final float f30865c;
    public final float d;
    public long e;
    public Runnable f30866f;
    public ValueAnimator f30867g;
    public boolean h;
    public float f30868i;

    public zc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f30868i, f7, 1.0f - f7);
    }

    public void b() {
        View view = this.f30863a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f30866f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.h != z10) {
            this.h = z10;
            ValueAnimator valueAnimator = this.f30867g;
            this.f30867g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f30868i;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f30867g = ofFloat;
            ofFloat.addUpdateListener(new k6(this, 7));
            this.f30867g.addListener(new ca(1, this, z10));
            if (this.h) {
                this.f30867g.setInterpolator(sr.f28346f);
                this.f30867g.setDuration(this.f30864b * 60.0f);
                this.f30867g.setStartDelay(0L);
            } else {
                this.f30867g.setInterpolator(new OvershootInterpolator(this.d));
                this.f30867g.setDuration(this.f30865c * 350.0f);
                this.f30867g.setStartDelay(this.e);
            }
            this.f30867g.start();
        }
    }

    public zc(View view, float f7, float f10) {
        this.e = 0L;
        this.f30863a = view;
        this.f30865c = f7;
        this.f30864b = f7;
        this.d = f10;
    }

    public zc(ci.o6 o6Var) {
        this.e = 0L;
        this.f30863a = o6Var;
        this.f30864b = 1.5f;
        this.f30865c = 1.0f;
        this.d = 2.0f;
    }
}
