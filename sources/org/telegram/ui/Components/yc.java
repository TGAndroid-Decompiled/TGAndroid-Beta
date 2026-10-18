package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class yc {
    public View f32608a;
    public final float f32609b;
    public final float f32610c;
    public final float d;
    public long e;
    public Runnable f32611f;
    public ValueAnimator f32612g;
    public final float h;
    public boolean f32613i;
    public float f32614j;

    public yc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f32614j, f7, 1.0f - f7) * this.h;
    }

    public void b() {
        View view = this.f32608a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f32611f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.f32613i != z10) {
            this.f32613i = z10;
            ValueAnimator valueAnimator = this.f32612g;
            this.f32612g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f32614j;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f32612g = ofFloat;
            ofFloat.addUpdateListener(new l6(this, 7));
            this.f32612g.addListener(new org.telegram.ui.ho(2, this, z10));
            if (this.f32613i) {
                this.f32612g.setInterpolator(bs.f25037f);
                this.f32612g.setDuration(this.f32609b * 60.0f);
                this.f32612g.setStartDelay(0L);
            } else {
                this.f32612g.setInterpolator(new OvershootInterpolator(this.d));
                this.f32612g.setDuration(this.f32610c * 350.0f);
                this.f32612g.setStartDelay(this.e);
            }
            this.f32612g.start();
        }
    }

    public yc(View view, float f7, float f10) {
        this.e = 0L;
        this.h = 1.0f;
        this.f32608a = view;
        this.f32610c = f7;
        this.f32609b = f7;
        this.d = f10;
    }

    public yc(ei.d6 d6Var) {
        this.e = 0L;
        this.h = 1.0f;
        this.f32608a = d6Var;
        this.f32609b = 1.5f;
        this.f32610c = 1.0f;
        this.d = 2.0f;
    }
}
