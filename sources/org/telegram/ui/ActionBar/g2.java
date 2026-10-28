package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
public final class g2 implements Animation.AnimationListener {
    public final int f22647a;
    public final Object f22648b;

    public g2(Object obj, int i10) {
        this.f22647a = i10;
        this.f22648b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.f22647a) {
            case 0:
                ((i2) this.f22648b).f22710p1.setAlpha(0.0f);
                return;
            default:
                ((a5) this.f22648b).f22401f.post(new q(this, 12));
                return;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.f22647a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.f22647a) {
            case 0:
                return;
            default:
                a5 a5Var = (a5) this.f22648b;
                a5Var.f22403i.setEnabled(false);
                a5Var.f22402g.setVisibility(0);
                a5Var.h.setVisibility(0);
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
