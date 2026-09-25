package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
public final class c2 implements Animation.AnimationListener {
    public final int f18772a;
    public final Object f18773b;

    public c2(Object obj, int i10) {
        this.f18772a = i10;
        this.f18773b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.f18772a) {
            case 0:
                ((e2) this.f18773b).f18847g1.setAlpha(0.0f);
                return;
            default:
                ((t4) this.f18773b).f19762f.post(new p(this, 12));
                return;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.f18772a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.f18772a) {
            case 0:
                return;
            default:
                t4 t4Var = (t4) this.f18773b;
                t4Var.f19764i.setEnabled(false);
                t4Var.f19763g.setVisibility(0);
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
