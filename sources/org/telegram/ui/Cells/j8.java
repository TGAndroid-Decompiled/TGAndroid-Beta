package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j8 extends AnimatorListenerAdapter {
    public final int f22358a;
    public final boolean f22359b;
    public final m8 f22360c;

    public j8(m8 m8Var, boolean z10, int i10) {
        this.f22358a = i10;
        this.f22360c = m8Var;
        this.f22359b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22358a) {
            case 0:
                if (!this.f22359b) {
                    this.f22360c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f22359b) {
                    this.f22360c.f22480x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f22358a) {
            case 0:
                if (this.f22359b) {
                    this.f22360c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f22359b) {
                    this.f22360c.f22480x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
