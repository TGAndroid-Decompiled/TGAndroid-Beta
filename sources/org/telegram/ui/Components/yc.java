package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class yc {
    public View f30627a;
    public final float f30628b;
    public final float f30629c;
    public final float d;
    public long e;
    public Runnable f30630f;
    public ValueAnimator f30631g;
    public boolean h;
    public float f30632i;

    public yc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f30632i, f7, 1.0f - f7);
    }

    public void b() {
        View view = this.f30627a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f30630f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.h != z10) {
            this.h = z10;
            ValueAnimator valueAnimator = this.f30631g;
            this.f30631g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f30632i;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f30631g = ofFloat;
            ofFloat.addUpdateListener(new j6(this, 7));
            this.f30631g.addListener(new ba(1, this, z10));
            if (this.h) {
                this.f30631g.setInterpolator(qr.f27653f);
                this.f30631g.setDuration(this.f30628b * 60.0f);
                this.f30631g.setStartDelay(0L);
            } else {
                this.f30631g.setInterpolator(new OvershootInterpolator(this.d));
                this.f30631g.setDuration(this.f30629c * 350.0f);
                this.f30631g.setStartDelay(this.e);
            }
            this.f30631g.start();
        }
    }

    public yc(View view, float f7, float f10) {
        this.e = 0L;
        this.f30627a = view;
        this.f30629c = f7;
        this.f30628b = f7;
        this.d = f10;
    }

    public yc(ci.p6 p6Var) {
        this.e = 0L;
        this.f30627a = p6Var;
        this.f30628b = 1.5f;
        this.f30629c = 1.0f;
        this.d = 2.0f;
    }
}
