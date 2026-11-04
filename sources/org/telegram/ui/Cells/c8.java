package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c8 extends AnimatorListenerAdapter {
    public final int f29063a;
    public final boolean f29064b;
    public final f8 f29065c;

    public c8(f8 f8Var, boolean z10, int i3) {
        this.f29063a = i3;
        this.f29065c = f8Var;
        this.f29064b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29063a) {
            case 0:
                if (!this.f29064b) {
                    this.f29065c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f29064b) {
                    this.f29065c.f29245y.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f29063a) {
            case 0:
                if (this.f29064b) {
                    this.f29065c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f29064b) {
                    this.f29065c.f29245y.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
