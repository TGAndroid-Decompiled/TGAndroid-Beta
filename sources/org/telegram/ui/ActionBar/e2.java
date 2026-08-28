package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
public final class e2 implements Animation.AnimationListener {
    public final int f22895a;
    public final Object f22896b;

    public e2(Object obj, int i9) {
        this.f22895a = i9;
        this.f22896b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.f22895a) {
            case 0:
                ((g2) this.f22896b).f23417c1.setAlpha(0.0f);
                return;
            default:
                ((t4) this.f22896b).f23774f.post(new p(this, 12));
                return;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        int i9 = this.f22895a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.f22895a) {
            case 0:
                return;
            default:
                t4 t4Var = (t4) this.f22896b;
                t4Var.f23776i.setEnabled(false);
                t4Var.f23775g.setVisibility(0);
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
