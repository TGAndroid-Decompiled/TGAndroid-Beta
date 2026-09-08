package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class zc {
    public View f33145a;
    public final float f33146b;
    public final float f33147c;
    public final float d;
    public long f33148e;
    public Runnable f33149f;
    public ValueAnimator f33150g;
    public boolean h;
    public float f33151i;

    public zc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f33151i, f7, 1.0f - f7);
    }

    public void b() {
        View view = this.f33145a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f33149f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.h != z10) {
            this.h = z10;
            ValueAnimator valueAnimator = this.f33150g;
            this.f33150g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f33151i;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f33150g = ofFloat;
            ofFloat.addUpdateListener(new l6(this, 7));
            this.f33150g.addListener(new org.telegram.ui.to(2, this, z10));
            if (this.h) {
                this.f33150g.setInterpolator(pr.f29493f);
                this.f33150g.setDuration(this.f33146b * 60.0f);
                this.f33150g.setStartDelay(0L);
            } else {
                this.f33150g.setInterpolator(new OvershootInterpolator(this.d));
                this.f33150g.setDuration(this.f33147c * 350.0f);
                this.f33150g.setStartDelay(this.f33148e);
            }
            this.f33150g.start();
        }
    }

    public zc(View view, float f7, float f10) {
        this.f33148e = 0L;
        this.f33145a = view;
        this.f33147c = f7;
        this.f33146b = f7;
        this.d = f10;
    }

    public zc(di.o6 o6Var) {
        this.f33148e = 0L;
        this.f33145a = o6Var;
        this.f33146b = 1.5f;
        this.f33147c = 1.0f;
        this.d = 2.0f;
    }
}
