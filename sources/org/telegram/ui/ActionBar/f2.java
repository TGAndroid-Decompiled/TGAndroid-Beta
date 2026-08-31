package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
public final class f2 implements Animation.AnimationListener {
    public final int f21345a;
    public final Object f21346b;

    public f2(Object obj, int i10) {
        this.f21345a = i10;
        this.f21346b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.f21345a) {
            case 0:
                ((h2) this.f21346b).f21410d1.setAlpha(0.0f);
                return;
            default:
                ((x4) this.f21346b).f22427f.post(new p(this, 12));
                return;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.f21345a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.f21345a) {
            case 0:
                return;
            default:
                x4 x4Var = (x4) this.f21346b;
                x4Var.f22429i.setEnabled(false);
                x4Var.f22428g.setVisibility(0);
                x4Var.h.setVisibility(0);
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
