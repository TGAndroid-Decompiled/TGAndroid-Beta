package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class ic {
    public View f34623a;
    public final float f34624b;
    public final float f34625c;
    public final float d;
    public long f34626e;
    public Runnable f34627f;
    public ValueAnimator f34628g;
    public final float h;
    public boolean f34629i;
    public float f34630j;

    public ic(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f10) {
        return com.google.android.recaptcha.internal.a.z(1.0f, this.f34630j, f10, 1.0f - f10) * this.h;
    }

    public void b() {
        View view = this.f34623a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f34627f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z9) {
        float f10;
        if (this.f34629i != z9) {
            this.f34629i = z9;
            ValueAnimator valueAnimator = this.f34628g;
            this.f34628g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f34630j;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f34628g = ofFloat;
            ofFloat.addUpdateListener(new e6(this, 7));
            this.f34628g.addListener(new t9(1, this, z9));
            if (this.f34629i) {
                this.f34628g.setInterpolator(xq.f40366f);
                this.f34628g.setDuration(this.f34624b * 60.0f);
                this.f34628g.setStartDelay(0L);
            } else {
                this.f34628g.setInterpolator(new OvershootInterpolator(this.d));
                this.f34628g.setDuration(this.f34625c * 350.0f);
                this.f34628g.setStartDelay(this.f34626e);
            }
            this.f34628g.start();
        }
    }

    public ic(View view, float f10, float f11) {
        this.f34626e = 0L;
        this.h = 1.0f;
        this.f34623a = view;
        this.f34625c = f10;
        this.f34624b = f10;
        this.d = f11;
    }

    public ic(fi.m5 m5Var) {
        this.f34626e = 0L;
        this.h = 1.0f;
        this.f34623a = m5Var;
        this.f34624b = 1.5f;
        this.f34625c = 1.0f;
        this.d = 2.0f;
    }
}
