package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j8 extends AnimatorListenerAdapter {
    public final int f22221a;
    public final boolean f22222b;
    public final m8 f22223c;

    public j8(m8 m8Var, boolean z10, int i10) {
        this.f22221a = i10;
        this.f22223c = m8Var;
        this.f22222b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22221a) {
            case 0:
                if (!this.f22222b) {
                    this.f22223c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f22222b) {
                    this.f22223c.f22330x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f22221a) {
            case 0:
                if (this.f22222b) {
                    this.f22223c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f22222b) {
                    this.f22223c.f22330x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
