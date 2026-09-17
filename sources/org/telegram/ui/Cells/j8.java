package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j8 extends AnimatorListenerAdapter {
    public final int f22222a;
    public final boolean f22223b;
    public final m8 f22224c;

    public j8(m8 m8Var, boolean z10, int i10) {
        this.f22222a = i10;
        this.f22224c = m8Var;
        this.f22223b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22222a) {
            case 0:
                if (!this.f22223b) {
                    this.f22224c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f22223b) {
                    this.f22224c.f22331x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f22222a) {
            case 0:
                if (this.f22223b) {
                    this.f22224c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f22223b) {
                    this.f22224c.f22331x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
