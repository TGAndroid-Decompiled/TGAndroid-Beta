package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
public final class c2 implements Animation.AnimationListener {
    public final int f20256a;
    public final Object f20257b;

    public c2(Object obj, int i10) {
        this.f20256a = i10;
        this.f20257b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.f20256a) {
            case 0:
                ((e2) this.f20257b).f20336g1.setAlpha(0.0f);
                return;
            default:
                ((t4) this.f20257b).f21280f.post(new p(this, 12));
                return;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.f20256a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.f20256a) {
            case 0:
                return;
            default:
                t4 t4Var = (t4) this.f20257b;
                t4Var.f21282i.setEnabled(false);
                t4Var.f21281g.setVisibility(0);
                t4Var.h.setVisibility(0);
                return;
        }
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }
}
