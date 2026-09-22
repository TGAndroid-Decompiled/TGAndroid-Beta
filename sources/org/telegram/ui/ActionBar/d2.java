package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
public final class d2 implements Animation.AnimationListener {
    public final int f18575a;
    public final Object f18576b;

    public d2(Object obj, int i10) {
        this.f18575a = i10;
        this.f18576b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.f18575a) {
            case 0:
                ((f2) this.f18576b).f18635g1.setAlpha(0.0f);
                return;
            default:
                ((v4) this.f18576b).f19609f.post(new q(this, 12));
                return;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.f18575a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.f18575a) {
            case 0:
                return;
            default:
                v4 v4Var = (v4) this.f18576b;
                v4Var.f19611i.setEnabled(false);
                v4Var.f19610g.setVisibility(0);
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
