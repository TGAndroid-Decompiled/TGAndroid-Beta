package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
public final class d2 implements Animation.AnimationListener {
    public final int f18546a;
    public final Object f18547b;

    public d2(Object obj, int i10) {
        this.f18546a = i10;
        this.f18547b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.f18546a) {
            case 0:
                ((f2) this.f18547b).f18624g1.setAlpha(0.0f);
                return;
            default:
                ((u4) this.f18547b).f19534f.post(new q(this, 12));
                return;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.f18546a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.f18546a) {
            case 0:
                return;
            default:
                u4 u4Var = (u4) this.f18547b;
                u4Var.f19536i.setEnabled(false);
                u4Var.f19535g.setVisibility(0);
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
