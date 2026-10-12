package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class ad {
    public View f23517a;
    public final float f23518b;
    public final float f23519c;
    public final float d;
    public long e;
    public Runnable f23520f;
    public ValueAnimator f23521g;
    public final float h;
    public boolean f23522i;
    public float f23523j;

    public ad(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f23523j, f7, 1.0f - f7) * this.h;
    }

    public void b() {
        View view = this.f23517a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f23520f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.f23522i != z10) {
            this.f23522i = z10;
            ValueAnimator valueAnimator = this.f23521g;
            this.f23521g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f23523j;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f23521g = ofFloat;
            ofFloat.addUpdateListener(new n6(this, 7));
            this.f23521g.addListener(new org.telegram.ui.vo(2, this, z10));
            if (this.f23522i) {
                this.f23521g.setInterpolator(es.f24771f);
                this.f23521g.setDuration(this.f23518b * 60.0f);
                this.f23521g.setStartDelay(0L);
            } else {
                this.f23521g.setInterpolator(new OvershootInterpolator(this.d));
                this.f23521g.setDuration(this.f23519c * 350.0f);
                this.f23521g.setStartDelay(this.e);
            }
            this.f23521g.start();
        }
    }

    public ad(View view, float f7, float f10) {
        this.e = 0L;
        this.h = 1.0f;
        this.f23517a = view;
        this.f23519c = f7;
        this.f23518b = f7;
        this.d = f10;
    }

    public ad(di.m6 m6Var) {
        this.e = 0L;
        this.h = 1.0f;
        this.f23517a = m6Var;
        this.f23518b = 1.5f;
        this.f23519c = 1.0f;
        this.d = 2.0f;
    }
}
