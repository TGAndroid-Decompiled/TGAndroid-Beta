package org.telegram.ui.ActionBar;

import android.view.animation.Animation;

public final class d2 implements Animation.AnimationListener {

    public final int f22837a;

    public final Object f22838b;

    public d2(Object obj, int i10) {
        this.f22837a = i10;
        this.f22838b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.f22837a) {
            case 0:
                ((f2) this.f22838b).f22925c1.setAlpha(0.0f);
                break;
            default:
                ((t4) this.f22838b).f23786f.post(new p(this, 12));
                break;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.f22837a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.f22837a) {
            case 0:
                break;
            default:
                t4 t4Var = (t4) this.f22838b;
                t4Var.f23788i.setEnabled(false);
                t4Var.f23787g.setVisibility(0);
                t4Var.h.setVisibility(0);
                break;
        }
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }
}
