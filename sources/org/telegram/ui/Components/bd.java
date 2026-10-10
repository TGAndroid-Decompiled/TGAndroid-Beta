package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class bd {
    public View f24922a;
    public final float f24923b;
    public final float f24924c;
    public final float d;
    public long f24925e;
    public Runnable f24926f;
    public ValueAnimator f24927g;
    public final float h;
    public boolean f24928i;
    public float f24929j;

    public bd(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.vision.e2.y(1.0f, this.f24929j, f7, 1.0f - f7) * this.h;
    }

    public void b() {
        View view = this.f24922a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f24926f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.f24928i != z10) {
            this.f24928i = z10;
            ValueAnimator valueAnimator = this.f24927g;
            this.f24927g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f24929j;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f24927g = ofFloat;
            ofFloat.addUpdateListener(new m6(this, 7));
            this.f24927g.addListener(new fa(1, this, z10));
            if (this.f24928i) {
                this.f24927g.setInterpolator(is.f27443f);
                this.f24927g.setDuration(this.f24923b * 60.0f);
                this.f24927g.setStartDelay(0L);
            } else {
                this.f24927g.setInterpolator(new OvershootInterpolator(this.d));
                this.f24927g.setDuration(this.f24924c * 350.0f);
                this.f24927g.setStartDelay(this.f24925e);
            }
            this.f24927g.start();
        }
    }

    public bd(View view, float f7, float f10) {
        this.f24925e = 0L;
        this.h = 1.0f;
        this.f24922a = view;
        this.f24924c = f7;
        this.f24923b = f7;
        this.d = f10;
    }

    public bd(ci.o6 o6Var) {
        this.f24925e = 0L;
        this.h = 1.0f;
        this.f24922a = o6Var;
        this.f24923b = 1.5f;
        this.f24924c = 1.0f;
        this.d = 2.0f;
    }
}
