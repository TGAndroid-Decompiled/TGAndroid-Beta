package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class bd {
    public View f24907a;
    public final float f24908b;
    public final float f24909c;
    public final float d;
    public long f24910e;
    public Runnable f24911f;
    public ValueAnimator f24912g;
    public final float h;
    public boolean f24913i;
    public float f24914j;

    public bd(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.vision.e2.y(1.0f, this.f24914j, f7, 1.0f - f7) * this.h;
    }

    public void b() {
        View view = this.f24907a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f24911f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.f24913i != z10) {
            this.f24913i = z10;
            ValueAnimator valueAnimator = this.f24912g;
            this.f24912g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f24914j;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f24912g = ofFloat;
            ofFloat.addUpdateListener(new m6(this, 7));
            this.f24912g.addListener(new ea(1, this, z10));
            if (this.f24913i) {
                this.f24912g.setInterpolator(is.f27451f);
                this.f24912g.setDuration(this.f24908b * 60.0f);
                this.f24912g.setStartDelay(0L);
            } else {
                this.f24912g.setInterpolator(new OvershootInterpolator(this.d));
                this.f24912g.setDuration(this.f24909c * 350.0f);
                this.f24912g.setStartDelay(this.f24910e);
            }
            this.f24912g.start();
        }
    }

    public bd(View view, float f7, float f10) {
        this.f24910e = 0L;
        this.h = 1.0f;
        this.f24907a = view;
        this.f24909c = f7;
        this.f24908b = f7;
        this.d = f10;
    }

    public bd(ci.o6 o6Var) {
        this.f24910e = 0L;
        this.h = 1.0f;
        this.f24907a = o6Var;
        this.f24908b = 1.5f;
        this.f24909c = 1.0f;
        this.d = 2.0f;
    }
}
