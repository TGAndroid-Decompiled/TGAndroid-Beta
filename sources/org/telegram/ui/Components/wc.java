package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class wc {
    public View f29629a;
    public final float f29630b;
    public final float f29631c;
    public final float d;
    public long e;
    public Runnable f29632f;
    public ValueAnimator f29633g;
    public boolean h;
    public float f29634i;

    public wc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f29634i, f7, 1.0f - f7);
    }

    public void b() {
        View view = this.f29629a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f29632f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.h != z10) {
            this.h = z10;
            ValueAnimator valueAnimator = this.f29633g;
            this.f29633g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f29634i;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f29633g = ofFloat;
            ofFloat.addUpdateListener(new i6(this, 7));
            this.f29633g.addListener(new aa(1, this, z10));
            if (this.h) {
                this.f29633g.setInterpolator(qr.f27380f);
                this.f29633g.setDuration(this.f29630b * 60.0f);
                this.f29633g.setStartDelay(0L);
            } else {
                this.f29633g.setInterpolator(new OvershootInterpolator(this.d));
                this.f29633g.setDuration(this.f29631c * 350.0f);
                this.f29633g.setStartDelay(this.e);
            }
            this.f29633g.start();
        }
    }

    public wc(View view, float f7, float f10) {
        this.e = 0L;
        this.f29629a = view;
        this.f29631c = f7;
        this.f29630b = f7;
        this.d = f10;
    }

    public wc(ci.p6 p6Var) {
        this.e = 0L;
        this.f29629a = p6Var;
        this.f29630b = 1.5f;
        this.f29631c = 1.0f;
        this.d = 2.0f;
    }
}
