package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class ad {
    public View f24281a;
    public final float f24282b;
    public final float f24283c;
    public final float d;
    public long f24284e;
    public Runnable f24285f;
    public ValueAnimator f24286g;
    public final float h;
    public boolean f24287i;
    public float f24288j;

    public ad(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.vision.e2.y(1.0f, this.f24288j, f7, 1.0f - f7) * this.h;
    }

    public void b() {
        View view = this.f24281a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f24285f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.f24287i != z10) {
            this.f24287i = z10;
            ValueAnimator valueAnimator = this.f24286g;
            this.f24286g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f24288j;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f24286g = ofFloat;
            ofFloat.addUpdateListener(new m6(this, 7));
            this.f24286g.addListener(new ea(1, this, z10));
            if (this.f24287i) {
                this.f24286g.setInterpolator(js.f27634f);
                this.f24286g.setDuration(this.f24282b * 60.0f);
                this.f24286g.setStartDelay(0L);
            } else {
                this.f24286g.setInterpolator(new OvershootInterpolator(this.d));
                this.f24286g.setDuration(this.f24283c * 350.0f);
                this.f24286g.setStartDelay(this.f24284e);
            }
            this.f24286g.start();
        }
    }

    public ad(View view, float f7, float f10) {
        this.f24284e = 0L;
        this.h = 1.0f;
        this.f24281a = view;
        this.f24283c = f7;
        this.f24282b = f7;
        this.d = f10;
    }

    public ad(ci.o6 o6Var) {
        this.f24284e = 0L;
        this.h = 1.0f;
        this.f24281a = o6Var;
        this.f24282b = 1.5f;
        this.f24283c = 1.0f;
        this.d = 2.0f;
    }
}
