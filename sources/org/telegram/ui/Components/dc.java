package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class dc {
    public View f33911a;
    public final float f33912b;
    public final float f33913c;
    public final float d;
    public long f33914e;
    public Runnable f33915f;
    public ValueAnimator f33916g;
    public final float h;
    public boolean f33917i;
    public float f33918j;

    public dc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f10) {
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f33918j, f10, 1.0f - f10) * this.h;
    }

    public void b() {
        View view = this.f33911a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f33915f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f10;
        if (this.f33917i != z10) {
            this.f33917i = z10;
            ValueAnimator valueAnimator = this.f33916g;
            this.f33916g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f33918j;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f33916g = ofFloat;
            ofFloat.addUpdateListener(new c6(this, 7));
            this.f33916g.addListener(new org.telegram.ui.nn(2, this, z10));
            if (this.f33917i) {
                this.f33916g.setInterpolator(er.f34420f);
                this.f33916g.setDuration(this.f33912b * 60.0f);
                this.f33916g.setStartDelay(0L);
            } else {
                this.f33916g.setInterpolator(new OvershootInterpolator(this.d));
                this.f33916g.setDuration(this.f33913c * 350.0f);
                this.f33916g.setStartDelay(this.f33914e);
            }
            this.f33916g.start();
        }
    }

    public dc(View view, float f10, float f11) {
        this.f33914e = 0L;
        this.h = 1.0f;
        this.f33911a = view;
        this.f33913c = f10;
        this.f33912b = f10;
        this.d = f11;
    }

    public dc(hi.k5 k5Var) {
        this.f33914e = 0L;
        this.h = 1.0f;
        this.f33911a = k5Var;
        this.f33912b = 1.5f;
        this.f33913c = 1.0f;
        this.d = 2.0f;
    }
}
