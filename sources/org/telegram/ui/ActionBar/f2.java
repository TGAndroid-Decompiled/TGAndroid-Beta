package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
public final class f2 implements Animation.AnimationListener {
    public final int f19653a;
    public final Object f19654b;

    public f2(Object obj, int i10) {
        this.f19653a = i10;
        this.f19654b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.f19653a) {
            case 0:
                ((h2) this.f19654b).f19723d1.setAlpha(0.0f);
                return;
            default:
                ((w4) this.f19654b).f20674f.post(new p(this, 12));
                return;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.f19653a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.f19653a) {
            case 0:
                return;
            default:
                w4 w4Var = (w4) this.f19654b;
                w4Var.f20676i.setEnabled(false);
                w4Var.f20675g.setVisibility(0);
                w4Var.h.setVisibility(0);
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
