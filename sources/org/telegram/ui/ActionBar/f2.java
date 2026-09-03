package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
public final class f2 implements Animation.AnimationListener {
    public final int f21347a;
    public final Object f21348b;

    public f2(Object obj, int i10) {
        this.f21347a = i10;
        this.f21348b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.f21347a) {
            case 0:
                ((h2) this.f21348b).f21412d1.setAlpha(0.0f);
                return;
            default:
                ((x4) this.f21348b).f22429f.post(new p(this, 12));
                return;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.f21347a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.f21347a) {
            case 0:
                return;
            default:
                x4 x4Var = (x4) this.f21348b;
                x4Var.f22431i.setEnabled(false);
                x4Var.f22430g.setVisibility(0);
                x4Var.h.setVisibility(0);
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
