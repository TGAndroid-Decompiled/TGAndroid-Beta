package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
public final class e2 implements Animation.AnimationListener {
    public final int f18606a;
    public final Object f18607b;

    public e2(Object obj, int i10) {
        this.f18606a = i10;
        this.f18607b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.f18606a) {
            case 0:
                ((g2) this.f18607b).f18667g1.setAlpha(0.0f);
                return;
            default:
                ((w4) this.f18607b).f19641f.post(new r(this, 12));
                return;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.f18606a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.f18606a) {
            case 0:
                return;
            default:
                w4 w4Var = (w4) this.f18607b;
                w4Var.f19643i.setEnabled(false);
                w4Var.f19642g.setVisibility(0);
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
