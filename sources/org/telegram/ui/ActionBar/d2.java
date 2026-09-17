package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
public final class d2 implements Animation.AnimationListener {
    public final int f20376a;
    public final Object f20377b;

    public d2(Object obj, int i10) {
        this.f20376a = i10;
        this.f20377b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.f20376a) {
            case 0:
                ((f2) this.f20377b).f20444g1.setAlpha(0.0f);
                return;
            default:
                ((v4) this.f20377b).f21443f.post(new q(this, 12));
                return;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.f20376a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.f20376a) {
            case 0:
                return;
            default:
                v4 v4Var = (v4) this.f20377b;
                v4Var.f21445i.setEnabled(false);
                v4Var.f21444g.setVisibility(0);
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
