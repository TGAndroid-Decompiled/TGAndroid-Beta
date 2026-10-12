package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
public final class c2 implements Animation.AnimationListener {
    public final int f20257a;
    public final Object f20258b;

    public c2(Object obj, int i10) {
        this.f20257a = i10;
        this.f20258b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.f20257a) {
            case 0:
                ((e2) this.f20258b).f20337g1.setAlpha(0.0f);
                return;
            default:
                ((t4) this.f20258b).f21281f.post(new p(this, 12));
                return;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.f20257a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.f20257a) {
            case 0:
                return;
            default:
                t4 t4Var = (t4) this.f20258b;
                t4Var.f21283i.setEnabled(false);
                t4Var.f21282g.setVisibility(0);
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
