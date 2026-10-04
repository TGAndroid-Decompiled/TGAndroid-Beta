package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class zc {
    public View f33467a;
    public final float f33468b;
    public final float f33469c;
    public final float d;
    public long f33470e;
    public Runnable f33471f;
    public ValueAnimator f33472g;
    public boolean h;
    public float f33473i;

    public zc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f33473i, f7, 1.0f - f7);
    }

    public void b() {
        View view = this.f33467a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f33471f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.h != z10) {
            this.h = z10;
            ValueAnimator valueAnimator = this.f33472g;
            this.f33472g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f33473i;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f33472g = ofFloat;
            ofFloat.addUpdateListener(new k6(this, 7));
            this.f33472g.addListener(new da(1, this, z10));
            if (this.h) {
                this.f33472g.setInterpolator(tr.f31140f);
                this.f33472g.setDuration(this.f33468b * 60.0f);
                this.f33472g.setStartDelay(0L);
            } else {
                this.f33472g.setInterpolator(new OvershootInterpolator(this.d));
                this.f33472g.setDuration(this.f33469c * 350.0f);
                this.f33472g.setStartDelay(this.f33470e);
            }
            this.f33472g.start();
        }
    }

    public zc(View view, float f7, float f10) {
        this.f33470e = 0L;
        this.f33467a = view;
        this.f33469c = f7;
        this.f33468b = f7;
        this.d = f10;
    }

    public zc(ci.o6 o6Var) {
        this.f33470e = 0L;
        this.f33467a = o6Var;
        this.f33468b = 1.5f;
        this.f33469c = 1.0f;
        this.d = 2.0f;
    }
}
