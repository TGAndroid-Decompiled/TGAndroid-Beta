package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class xc {
    public View f34682a;
    public final float f34683b;
    public final float f34684c;
    public final float d;
    public long e;
    public Runnable f34685f;
    public ValueAnimator f34686g;
    public final float h;
    public boolean f34687i;
    public float f34688j;

    public xc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return c3.h0.z(1.0f, this.f34688j, f7, 1.0f - f7) * this.h;
    }

    public void b() {
        View view = this.f34682a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f34685f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        float f7;
        if (this.f34687i != z10) {
            this.f34687i = z10;
            ValueAnimator valueAnimator = this.f34686g;
            this.f34686g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f34688j;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f34686g = ofFloat;
            ofFloat.addUpdateListener(new n6(this, 7));
            this.f34686g.addListener(new org.telegram.ui.jo(2, this, z10));
            if (this.f34687i) {
                this.f34686g.setInterpolator(ds.f27584f);
                this.f34686g.setDuration(this.f34683b * 60.0f);
                this.f34686g.setStartDelay(0L);
            } else {
                this.f34686g.setInterpolator(new OvershootInterpolator(this.d));
                this.f34686g.setDuration(this.f34684c * 350.0f);
                this.f34686g.setStartDelay(this.e);
            }
            this.f34686g.start();
        }
    }

    public xc(View view, float f7, float f10) {
        this.e = 0L;
        this.h = 1.0f;
        this.f34682a = view;
        this.f34684c = f7;
        this.f34683b = f7;
        this.d = f10;
    }

    public xc(fi.c6 c6Var) {
        this.e = 0L;
        this.h = 1.0f;
        this.f34682a = c6Var;
        this.f34683b = 1.5f;
        this.f34684c = 1.0f;
        this.d = 2.0f;
    }
}
