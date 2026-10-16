package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
public final class c2 implements Animation.AnimationListener {
    public final int f19358a;
    public final Object f19359b;

    public c2(Object obj, int i10) {
        this.f19358a = i10;
        this.f19359b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.f19358a) {
            case 0:
                ((e2) this.f19359b).f19433g1.setAlpha(0.0f);
                return;
            default:
                ((t4) this.f19359b).f20348f.post(new p(this, 12));
                return;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.f19358a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.f19358a) {
            case 0:
                return;
            default:
                t4 t4Var = (t4) this.f19359b;
                t4Var.f20350i.setEnabled(false);
                t4Var.f20349g.setVisibility(0);
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
