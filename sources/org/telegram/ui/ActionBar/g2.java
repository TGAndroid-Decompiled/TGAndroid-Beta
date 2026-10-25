package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
public final class g2 implements Animation.AnimationListener {
    public final int f22644a;
    public final Object f22645b;

    public g2(Object obj, int i10) {
        this.f22644a = i10;
        this.f22645b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.f22644a) {
            case 0:
                ((i2) this.f22645b).f22707p1.setAlpha(0.0f);
                return;
            default:
                ((a5) this.f22645b).f22398f.post(new q(this, 12));
                return;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.f22644a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.f22644a) {
            case 0:
                return;
            default:
                a5 a5Var = (a5) this.f22645b;
                a5Var.f22400i.setEnabled(false);
                a5Var.f22399g.setVisibility(0);
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
