package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
public final class c2 implements Animation.AnimationListener {
    public final int f19658a;
    public final Object f19659b;

    public c2(Object obj, int i10) {
        this.f19658a = i10;
        this.f19659b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.f19658a) {
            case 0:
                ((e2) this.f19659b).f19733g1.setAlpha(0.0f);
                return;
            default:
                ((t4) this.f19659b).f20648f.post(new p(this, 12));
                return;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.f19658a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.f19658a) {
            case 0:
                return;
            default:
                t4 t4Var = (t4) this.f19659b;
                t4Var.f20650i.setEnabled(false);
                t4Var.f20649g.setVisibility(0);
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
