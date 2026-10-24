package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
public final class e2 implements Animation.AnimationListener {
    public final int f20846a;
    public final Object f20847b;

    public e2(Object obj, int i10) {
        this.f20846a = i10;
        this.f20847b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.f20846a) {
            case 0:
                ((g2) this.f20847b).f20907p1.setAlpha(0.0f);
                return;
            default:
                ((y4) this.f20847b).f21995f.post(new p(this, 12));
                return;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.f20846a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.f20846a) {
            case 0:
                return;
            default:
                y4 y4Var = (y4) this.f20847b;
                y4Var.f21997i.setEnabled(false);
                y4Var.f21996g.setVisibility(0);
                y4Var.h.setVisibility(0);
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
