package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class bd {
    public View f24971a;
    public final float f24972b;
    public final float f24973c;
    public final float d;
    public long f24974e;
    public Runnable f24975f;
    public ValueAnimator f24976g;
    public final float h;
    public boolean f24977i;
    public float f24978j;

    public bd(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.vision.e2.y(1.0f, this.f24978j, f7, 1.0f - f7) * this.h;
    }

    public void b() {
        View view = this.f24971a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f24975f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.f24977i != z10) {
            this.f24977i = z10;
            ValueAnimator valueAnimator = this.f24976g;
            this.f24976g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f24978j;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f24976g = ofFloat;
            ofFloat.addUpdateListener(new m6(this, 7));
            this.f24976g.addListener(new fa(1, this, z10));
            if (this.f24977i) {
                this.f24976g.setInterpolator(hs.f27118f);
                this.f24976g.setDuration(this.f24972b * 60.0f);
                this.f24976g.setStartDelay(0L);
            } else {
                this.f24976g.setInterpolator(new OvershootInterpolator(this.d));
                this.f24976g.setDuration(this.f24973c * 350.0f);
                this.f24976g.setStartDelay(this.f24974e);
            }
            this.f24976g.start();
        }
    }

    public bd(View view, float f7, float f10) {
        this.f24974e = 0L;
        this.h = 1.0f;
        this.f24971a = view;
        this.f24973c = f7;
        this.f24972b = f7;
        this.d = f10;
    }

    public bd(ci.o6 o6Var) {
        this.f24974e = 0L;
        this.h = 1.0f;
        this.f24971a = o6Var;
        this.f24972b = 1.5f;
        this.f24973c = 1.0f;
        this.d = 2.0f;
    }
}
