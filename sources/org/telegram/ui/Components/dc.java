package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class dc {
    public View f33898a;
    public final float f33899b;
    public final float f33900c;
    public final float d;
    public long f33901e;
    public Runnable f33902f;
    public ValueAnimator f33903g;
    public final float h;
    public boolean f33904i;
    public float f33905j;

    public dc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f10) {
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f33905j, f10, 1.0f - f10) * this.h;
    }

    public void b() {
        View view = this.f33898a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f33902f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f10;
        if (this.f33904i != z10) {
            this.f33904i = z10;
            ValueAnimator valueAnimator = this.f33903g;
            this.f33903g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f33905j;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f33903g = ofFloat;
            ofFloat.addUpdateListener(new c6(this, 7));
            this.f33903g.addListener(new org.telegram.ui.nn(2, this, z10));
            if (this.f33904i) {
                this.f33903g.setInterpolator(er.f34419f);
                this.f33903g.setDuration(this.f33899b * 60.0f);
                this.f33903g.setStartDelay(0L);
            } else {
                this.f33903g.setInterpolator(new OvershootInterpolator(this.d));
                this.f33903g.setDuration(this.f33900c * 350.0f);
                this.f33903g.setStartDelay(this.f33901e);
            }
            this.f33903g.start();
        }
    }

    public dc(View view, float f10, float f11) {
        this.f33901e = 0L;
        this.h = 1.0f;
        this.f33898a = view;
        this.f33900c = f10;
        this.f33899b = f10;
        this.d = f11;
    }

    public dc(hi.k5 k5Var) {
        this.f33901e = 0L;
        this.h = 1.0f;
        this.f33898a = k5Var;
        this.f33899b = 1.5f;
        this.f33900c = 1.0f;
        this.d = 2.0f;
    }
}
