package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class zc {
    public View f33146a;
    public final float f33147b;
    public final float f33148c;
    public final float d;
    public long f33149e;
    public Runnable f33150f;
    public ValueAnimator f33151g;
    public boolean h;
    public float f33152i;

    public zc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f33152i, f7, 1.0f - f7);
    }

    public void b() {
        View view = this.f33146a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f33150f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.h != z10) {
            this.h = z10;
            ValueAnimator valueAnimator = this.f33151g;
            this.f33151g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f33152i;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f33151g = ofFloat;
            ofFloat.addUpdateListener(new l6(this, 7));
            this.f33151g.addListener(new org.telegram.ui.to(2, this, z10));
            if (this.h) {
                this.f33151g.setInterpolator(pr.f29494f);
                this.f33151g.setDuration(this.f33147b * 60.0f);
                this.f33151g.setStartDelay(0L);
            } else {
                this.f33151g.setInterpolator(new OvershootInterpolator(this.d));
                this.f33151g.setDuration(this.f33148c * 350.0f);
                this.f33151g.setStartDelay(this.f33149e);
            }
            this.f33151g.start();
        }
    }

    public zc(View view, float f7, float f10) {
        this.f33149e = 0L;
        this.f33146a = view;
        this.f33148c = f7;
        this.f33147b = f7;
        this.d = f10;
    }

    public zc(di.o6 o6Var) {
        this.f33149e = 0L;
        this.f33146a = o6Var;
        this.f33147b = 1.5f;
        this.f33148c = 1.0f;
        this.d = 2.0f;
    }
}
