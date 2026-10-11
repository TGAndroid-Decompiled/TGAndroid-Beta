package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class bd {
    public View f24975a;
    public final float f24976b;
    public final float f24977c;
    public final float d;
    public long f24978e;
    public Runnable f24979f;
    public ValueAnimator f24980g;
    public final float h;
    public boolean f24981i;
    public float f24982j;

    public bd(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.vision.e2.y(1.0f, this.f24982j, f7, 1.0f - f7) * this.h;
    }

    public void b() {
        View view = this.f24975a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f24979f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.f24981i != z10) {
            this.f24981i = z10;
            ValueAnimator valueAnimator = this.f24980g;
            this.f24980g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f24982j;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f24980g = ofFloat;
            ofFloat.addUpdateListener(new m6(this, 7));
            this.f24980g.addListener(new ea(1, this, z10));
            if (this.f24981i) {
                this.f24980g.setInterpolator(is.f27500f);
                this.f24980g.setDuration(this.f24976b * 60.0f);
                this.f24980g.setStartDelay(0L);
            } else {
                this.f24980g.setInterpolator(new OvershootInterpolator(this.d));
                this.f24980g.setDuration(this.f24977c * 350.0f);
                this.f24980g.setStartDelay(this.f24978e);
            }
            this.f24980g.start();
        }
    }

    public bd(View view, float f7, float f10) {
        this.f24978e = 0L;
        this.h = 1.0f;
        this.f24975a = view;
        this.f24977c = f7;
        this.f24976b = f7;
        this.d = f10;
    }

    public bd(ci.o6 o6Var) {
        this.f24978e = 0L;
        this.h = 1.0f;
        this.f24975a = o6Var;
        this.f24976b = 1.5f;
        this.f24977c = 1.0f;
        this.d = 2.0f;
    }
}
