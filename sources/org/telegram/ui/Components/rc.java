package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class rc {
    public View f30673a;
    public final float f30674b;
    public final float f30675c;
    public final float d;
    public long f30676e;
    public Runnable f30677f;
    public ValueAnimator f30678g;
    public boolean h;
    public float f30679i;

    public rc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f10) {
        return e2.c.w(1.0f, this.f30679i, f10, 1.0f - f10);
    }

    public void b() {
        View view = this.f30673a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f30677f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z4) {
        float f10;
        if (this.h != z4) {
            this.h = z4;
            ValueAnimator valueAnimator = this.f30678g;
            this.f30678g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f30679i;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f30678g = ofFloat;
            ofFloat.addUpdateListener(new f6(this, 7));
            this.f30678g.addListener(new eg.u2(21, this, z4));
            if (this.h) {
                this.f30678g.setInterpolator(pr.f30183f);
                this.f30678g.setDuration(this.f30674b * 60.0f);
                this.f30678g.setStartDelay(0L);
            } else {
                this.f30678g.setInterpolator(new OvershootInterpolator(this.d));
                this.f30678g.setDuration(this.f30675c * 350.0f);
                this.f30678g.setStartDelay(this.f30676e);
            }
            this.f30678g.start();
        }
    }

    public rc(View view, float f10, float f11) {
        this.f30676e = 0L;
        this.f30673a = view;
        this.f30675c = f10;
        this.f30674b = f10;
        this.d = f11;
    }

    public rc(qh.a5 a5Var) {
        this.f30676e = 0L;
        this.f30673a = a5Var;
        this.f30674b = 1.5f;
        this.f30675c = 1.0f;
        this.d = 2.0f;
    }
}
