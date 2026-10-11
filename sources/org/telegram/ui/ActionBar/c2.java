package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
public final class c2 implements Animation.AnimationListener {
    public final int f20483a;
    public final Object f20484b;

    public c2(Object obj, int i10) {
        this.f20483a = i10;
        this.f20484b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.f20483a) {
            case 0:
                ((e2) this.f20484b).f20563g1.setAlpha(0.0f);
                return;
            default:
                ((t4) this.f20484b).f21506f.post(new p(this, 12));
                return;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.f20483a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.f20483a) {
            case 0:
                return;
            default:
                t4 t4Var = (t4) this.f20484b;
                t4Var.f21508i.setEnabled(false);
                t4Var.f21507g.setVisibility(0);
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
