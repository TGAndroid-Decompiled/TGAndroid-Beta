package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
public final class e2 implements Animation.AnimationListener {
    public final int f18815a;
    public final Object f18816b;

    public e2(Object obj, int i10) {
        this.f18815a = i10;
        this.f18816b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.f18815a) {
            case 0:
                ((g2) this.f18816b).f18894g1.setAlpha(0.0f);
                return;
            default:
                ((v4) this.f18816b).f19811f.post(new r(this, 12));
                return;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.f18815a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.f18815a) {
            case 0:
                return;
            default:
                v4 v4Var = (v4) this.f18816b;
                v4Var.f19813i.setEnabled(false);
                v4Var.f19812g.setVisibility(0);
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
