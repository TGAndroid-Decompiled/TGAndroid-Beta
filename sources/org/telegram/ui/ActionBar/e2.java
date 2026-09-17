package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
public final class e2 implements Animation.AnimationListener {
    public final int f18605a;
    public final Object f18606b;

    public e2(Object obj, int i10) {
        this.f18605a = i10;
        this.f18606b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.f18605a) {
            case 0:
                ((g2) this.f18606b).f18666g1.setAlpha(0.0f);
                return;
            default:
                ((w4) this.f18606b).f19640f.post(new r(this, 12));
                return;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.f18605a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.f18605a) {
            case 0:
                return;
            default:
                w4 w4Var = (w4) this.f18606b;
                w4Var.f19642i.setEnabled(false);
                w4Var.f19641g.setVisibility(0);
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
