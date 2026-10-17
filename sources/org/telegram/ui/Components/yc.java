package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class yc {
    public View f32601a;
    public final float f32602b;
    public final float f32603c;
    public final float d;
    public long e;
    public Runnable f32604f;
    public ValueAnimator f32605g;
    public final float h;
    public boolean f32606i;
    public float f32607j;

    public yc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.cast.a6.x(1.0f, this.f32607j, f7, 1.0f - f7) * this.h;
    }

    public void b() {
        View view = this.f32601a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f32604f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.f32606i != z10) {
            this.f32606i = z10;
            ValueAnimator valueAnimator = this.f32605g;
            this.f32605g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f32607j;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f32605g = ofFloat;
            ofFloat.addUpdateListener(new l6(this, 7));
            this.f32605g.addListener(new org.telegram.ui.ho(2, this, z10));
            if (this.f32606i) {
                this.f32605g.setInterpolator(bs.f25030f);
                this.f32605g.setDuration(this.f32602b * 60.0f);
                this.f32605g.setStartDelay(0L);
            } else {
                this.f32605g.setInterpolator(new OvershootInterpolator(this.d));
                this.f32605g.setDuration(this.f32603c * 350.0f);
                this.f32605g.setStartDelay(this.e);
            }
            this.f32605g.start();
        }
    }

    public yc(View view, float f7, float f10) {
        this.e = 0L;
        this.h = 1.0f;
        this.f32601a = view;
        this.f32603c = f7;
        this.f32602b = f7;
        this.d = f10;
    }

    public yc(ei.d6 d6Var) {
        this.e = 0L;
        this.h = 1.0f;
        this.f32601a = d6Var;
        this.f32602b = 1.5f;
        this.f32603c = 1.0f;
        this.d = 2.0f;
    }
}
