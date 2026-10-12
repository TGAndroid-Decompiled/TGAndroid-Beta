package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class ad {
    public View f24280a;
    public final float f24281b;
    public final float f24282c;
    public final float d;
    public long f24283e;
    public Runnable f24284f;
    public ValueAnimator f24285g;
    public final float h;
    public boolean f24286i;
    public float f24287j;

    public ad(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.vision.e2.y(1.0f, this.f24287j, f7, 1.0f - f7) * this.h;
    }

    public void b() {
        View view = this.f24280a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f24284f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.f24286i != z10) {
            this.f24286i = z10;
            ValueAnimator valueAnimator = this.f24285g;
            this.f24285g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f24287j;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f24285g = ofFloat;
            ofFloat.addUpdateListener(new m6(this, 7));
            this.f24285g.addListener(new ea(1, this, z10));
            if (this.f24286i) {
                this.f24285g.setInterpolator(js.f27627f);
                this.f24285g.setDuration(this.f24281b * 60.0f);
                this.f24285g.setStartDelay(0L);
            } else {
                this.f24285g.setInterpolator(new OvershootInterpolator(this.d));
                this.f24285g.setDuration(this.f24282c * 350.0f);
                this.f24285g.setStartDelay(this.f24283e);
            }
            this.f24285g.start();
        }
    }

    public ad(View view, float f7, float f10) {
        this.f24283e = 0L;
        this.h = 1.0f;
        this.f24280a = view;
        this.f24282c = f7;
        this.f24281b = f7;
        this.d = f10;
    }

    public ad(ci.o6 o6Var) {
        this.f24283e = 0L;
        this.h = 1.0f;
        this.f24280a = o6Var;
        this.f24281b = 1.5f;
        this.f24282c = 1.0f;
        this.d = 2.0f;
    }
}
