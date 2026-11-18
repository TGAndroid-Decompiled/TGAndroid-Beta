package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class mc {
    public View f37428a;
    public final float f37429b;
    public final float f37430c;
    public final float d;
    public long f37431e;
    public Runnable f37432f;
    public ValueAnimator f37433g;
    public final float h;
    public boolean f37434i;
    public float f37435j;

    public mc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f10) {
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f37435j, f10, 1.0f - f10) * this.h;
    }

    public void b() {
        View view = this.f37428a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f37432f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f10;
        if (this.f37434i != z10) {
            this.f37434i = z10;
            ValueAnimator valueAnimator = this.f37433g;
            this.f37433g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f37435j;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f37433g = ofFloat;
            ofFloat.addUpdateListener(new w(this, 8));
            this.f37433g.addListener(new org.telegram.ui.on(2, this, z10));
            if (this.f37434i) {
                this.f37433g.setInterpolator(lr.f37208f);
                this.f37433g.setDuration(this.f37429b * 60.0f);
                this.f37433g.setStartDelay(0L);
            } else {
                this.f37433g.setInterpolator(new OvershootInterpolator(this.d));
                this.f37433g.setDuration(this.f37430c * 350.0f);
                this.f37433g.setStartDelay(this.f37431e);
            }
            this.f37433g.start();
        }
    }

    public mc(View view, float f10, float f11) {
        this.f37431e = 0L;
        this.h = 1.0f;
        this.f37428a = view;
        this.f37430c = f10;
        this.f37429b = f10;
        this.d = f11;
    }

    public mc(hi.j5 j5Var) {
        this.f37431e = 0L;
        this.h = 1.0f;
        this.f37428a = j5Var;
        this.f37429b = 1.5f;
        this.f37430c = 1.0f;
        this.d = 2.0f;
    }
}
