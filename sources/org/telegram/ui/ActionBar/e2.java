package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
public final class e2 implements Animation.AnimationListener {
    public final int f22891a;
    public final Object f22892b;

    public e2(Object obj, int i10) {
        this.f22891a = i10;
        this.f22892b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.f22891a) {
            case 0:
                ((g2) this.f22892b).f22977c1.setAlpha(0.0f);
                return;
            default:
                ((t4) this.f22892b).f23796f.post(new q(this, 12));
                return;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.f22891a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.f22891a) {
            case 0:
                return;
            default:
                t4 t4Var = (t4) this.f22892b;
                t4Var.f23798i.setEnabled(false);
                t4Var.f23797g.setVisibility(0);
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
