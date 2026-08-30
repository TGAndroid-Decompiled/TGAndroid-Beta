package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
public final class f2 implements Animation.AnimationListener {
    public final int f19678a;
    public final Object f19679b;

    public f2(Object obj, int i10) {
        this.f19678a = i10;
        this.f19679b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.f19678a) {
            case 0:
                ((h2) this.f19679b).f19748d1.setAlpha(0.0f);
                return;
            default:
                ((w4) this.f19679b).f20699f.post(new p(this, 12));
                return;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.f19678a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.f19678a) {
            case 0:
                return;
            default:
                w4 w4Var = (w4) this.f19679b;
                w4Var.f20701i.setEnabled(false);
                w4Var.f20700g.setVisibility(0);
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
