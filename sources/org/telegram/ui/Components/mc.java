package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class mc {
    public View f37431a;
    public final float f37432b;
    public final float f37433c;
    public final float d;
    public long f37434e;
    public Runnable f37435f;
    public ValueAnimator f37436g;
    public final float h;
    public boolean f37437i;
    public float f37438j;

    public mc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f10) {
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f37438j, f10, 1.0f - f10) * this.h;
    }

    public void b() {
        View view = this.f37431a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f37435f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f10;
        if (this.f37437i != z10) {
            this.f37437i = z10;
            ValueAnimator valueAnimator = this.f37436g;
            this.f37436g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f37438j;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f37436g = ofFloat;
            ofFloat.addUpdateListener(new x(this, 8));
            this.f37436g.addListener(new org.telegram.ui.on(2, this, z10));
            if (this.f37437i) {
                this.f37436g.setInterpolator(nr.f37917f);
                this.f37436g.setDuration(this.f37432b * 60.0f);
                this.f37436g.setStartDelay(0L);
            } else {
                this.f37436g.setInterpolator(new OvershootInterpolator(this.d));
                this.f37436g.setDuration(this.f37433c * 350.0f);
                this.f37436g.setStartDelay(this.f37434e);
            }
            this.f37436g.start();
        }
    }

    public mc(View view, float f10, float f11) {
        this.f37434e = 0L;
        this.h = 1.0f;
        this.f37431a = view;
        this.f37433c = f10;
        this.f37432b = f10;
        this.d = f11;
    }

    public mc(hi.j5 j5Var) {
        this.f37434e = 0L;
        this.h = 1.0f;
        this.f37431a = j5Var;
        this.f37432b = 1.5f;
        this.f37433c = 1.0f;
        this.d = 2.0f;
    }
}
