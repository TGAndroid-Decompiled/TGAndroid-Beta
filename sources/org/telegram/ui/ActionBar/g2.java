package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
public final class g2 implements Animation.AnimationListener {
    public final int f22646a;
    public final Object f22647b;

    public g2(Object obj, int i10) {
        this.f22646a = i10;
        this.f22647b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.f22646a) {
            case 0:
                ((i2) this.f22647b).f22709p1.setAlpha(0.0f);
                return;
            default:
                ((a5) this.f22647b).f22400f.post(new q(this, 12));
                return;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.f22646a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.f22646a) {
            case 0:
                return;
            default:
                a5 a5Var = (a5) this.f22647b;
                a5Var.f22402i.setEnabled(false);
                a5Var.f22401g.setVisibility(0);
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
