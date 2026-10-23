package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class yc {
    public View f32867a;
    public final float f32868b;
    public final float f32869c;
    public final float d;
    public long e;
    public Runnable f32870f;
    public ValueAnimator f32871g;
    public final float h;
    public boolean f32872i;
    public float f32873j;

    public yc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f32873j, f7, 1.0f - f7) * this.h;
    }

    public void b() {
        View view = this.f32867a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f32870f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.f32872i != z10) {
            this.f32872i = z10;
            ValueAnimator valueAnimator = this.f32871g;
            this.f32871g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f32873j;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f32871g = ofFloat;
            ofFloat.addUpdateListener(new l6(this, 7));
            this.f32871g.addListener(new org.telegram.ui.ho(2, this, z10));
            if (this.f32872i) {
                this.f32871g.setInterpolator(bs.f25133f);
                this.f32871g.setDuration(this.f32868b * 60.0f);
                this.f32871g.setStartDelay(0L);
            } else {
                this.f32871g.setInterpolator(new OvershootInterpolator(this.d));
                this.f32871g.setDuration(this.f32869c * 350.0f);
                this.f32871g.setStartDelay(this.e);
            }
            this.f32871g.start();
        }
    }

    public yc(View view, float f7, float f10) {
        this.e = 0L;
        this.h = 1.0f;
        this.f32867a = view;
        this.f32869c = f7;
        this.f32868b = f7;
        this.d = f10;
    }

    public yc(ei.d6 d6Var) {
        this.e = 0L;
        this.h = 1.0f;
        this.f32867a = d6Var;
        this.f32868b = 1.5f;
        this.f32869c = 1.0f;
        this.d = 2.0f;
    }
}
