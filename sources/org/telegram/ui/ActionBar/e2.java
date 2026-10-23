package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
public final class e2 implements Animation.AnimationListener {
    public final int f20845a;
    public final Object f20846b;

    public e2(Object obj, int i10) {
        this.f20845a = i10;
        this.f20846b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.f20845a) {
            case 0:
                ((g2) this.f20846b).f20906p1.setAlpha(0.0f);
                return;
            default:
                ((y4) this.f20846b).f21994f.post(new p(this, 12));
                return;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.f20845a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.f20845a) {
            case 0:
                return;
            default:
                y4 y4Var = (y4) this.f20846b;
                y4Var.f21996i.setEnabled(false);
                y4Var.f21995g.setVisibility(0);
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
