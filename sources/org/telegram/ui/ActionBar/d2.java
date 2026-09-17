package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
public final class d2 implements Animation.AnimationListener {
    public final int f20349a;
    public final Object f20350b;

    public d2(Object obj, int i10) {
        this.f20349a = i10;
        this.f20350b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.f20349a) {
            case 0:
                ((f2) this.f20350b).f20417g1.setAlpha(0.0f);
                return;
            default:
                ((v4) this.f20350b).f21416f.post(new q(this, 12));
                return;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.f20349a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.f20349a) {
            case 0:
                return;
            default:
                v4 v4Var = (v4) this.f20350b;
                v4Var.f21418i.setEnabled(false);
                v4Var.f21417g.setVisibility(0);
                v4Var.h.setVisibility(0);
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
