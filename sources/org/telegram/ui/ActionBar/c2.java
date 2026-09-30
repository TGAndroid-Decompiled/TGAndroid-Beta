package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
public final class c2 implements Animation.AnimationListener {
    public final int f18773a;
    public final Object f18774b;

    public c2(Object obj, int i10) {
        this.f18773a = i10;
        this.f18774b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.f18773a) {
            case 0:
                ((e2) this.f18774b).f18848g1.setAlpha(0.0f);
                return;
            default:
                ((t4) this.f18774b).f19763f.post(new p(this, 12));
                return;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.f18773a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.f18773a) {
            case 0:
                return;
            default:
                t4 t4Var = (t4) this.f18774b;
                t4Var.f19765i.setEnabled(false);
                t4Var.f19764g.setVisibility(0);
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
