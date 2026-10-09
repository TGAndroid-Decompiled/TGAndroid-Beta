package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
public final class d2 implements Animation.AnimationListener {
    public final int f20529a;
    public final Object f20530b;

    public d2(Object obj, int i10) {
        this.f20529a = i10;
        this.f20530b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.f20529a) {
            case 0:
                ((f2) this.f20530b).f20590g1.setAlpha(0.0f);
                return;
            default:
                ((u4) this.f20530b).f21554f.post(new q(this, 12));
                return;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.f20529a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.f20529a) {
            case 0:
                return;
            default:
                u4 u4Var = (u4) this.f20530b;
                u4Var.f21556i.setEnabled(false);
                u4Var.f21555g.setVisibility(0);
                u4Var.h.setVisibility(0);
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
