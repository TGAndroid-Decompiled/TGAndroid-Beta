package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
public final class f2 implements Animation.AnimationListener {
    public final int f17702a;
    public final Object f17703b;

    public f2(Object obj, int i10) {
        this.f17702a = i10;
        this.f17703b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.f17702a) {
            case 0:
                ((h2) this.f17703b).f17762g1.setAlpha(0.0f);
                return;
            default:
                ((x4) this.f17703b).f18735f.post(new q(this, 12));
                return;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.f17702a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.f17702a) {
            case 0:
                return;
            default:
                x4 x4Var = (x4) this.f17703b;
                x4Var.f18737i.setEnabled(false);
                x4Var.f18736g.setVisibility(0);
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
