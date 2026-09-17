package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class zc {
    public View f33119a;
    public final float f33120b;
    public final float f33121c;
    public final float d;
    public long f33122e;
    public Runnable f33123f;
    public ValueAnimator f33124g;
    public boolean h;
    public float f33125i;

    public zc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f33125i, f7, 1.0f - f7);
    }

    public void b() {
        View view = this.f33119a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f33123f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.h != z10) {
            this.h = z10;
            ValueAnimator valueAnimator = this.f33124g;
            this.f33124g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f33125i;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f33124g = ofFloat;
            ofFloat.addUpdateListener(new l6(this, 7));
            this.f33124g.addListener(new org.telegram.ui.to(2, this, z10));
            if (this.h) {
                this.f33124g.setInterpolator(pr.f29467f);
                this.f33124g.setDuration(this.f33120b * 60.0f);
                this.f33124g.setStartDelay(0L);
            } else {
                this.f33124g.setInterpolator(new OvershootInterpolator(this.d));
                this.f33124g.setDuration(this.f33121c * 350.0f);
                this.f33124g.setStartDelay(this.f33122e);
            }
            this.f33124g.start();
        }
    }

    public zc(View view, float f7, float f10) {
        this.f33122e = 0L;
        this.f33119a = view;
        this.f33121c = f7;
        this.f33120b = f7;
        this.d = f10;
    }

    public zc(di.o6 o6Var) {
        this.f33122e = 0L;
        this.f33119a = o6Var;
        this.f33120b = 1.5f;
        this.f33121c = 1.0f;
        this.d = 2.0f;
    }
}
