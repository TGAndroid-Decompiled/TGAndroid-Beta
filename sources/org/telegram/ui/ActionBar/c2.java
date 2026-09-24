package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
public final class c2 implements Animation.AnimationListener {
    public final int f18757a;
    public final Object f18758b;

    public c2(Object obj, int i10) {
        this.f18757a = i10;
        this.f18758b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.f18757a) {
            case 0:
                ((e2) this.f18758b).f18832g1.setAlpha(0.0f);
                return;
            default:
                ((t4) this.f18758b).f19747f.post(new p(this, 12));
                return;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.f18757a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.f18757a) {
            case 0:
                return;
            default:
                t4 t4Var = (t4) this.f18758b;
                t4Var.f19749i.setEnabled(false);
                t4Var.f19748g.setVisibility(0);
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
