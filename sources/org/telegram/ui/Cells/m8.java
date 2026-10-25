package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m8 extends AnimatorListenerAdapter {
    public final int f24483a;
    public final boolean f24484b;
    public final p8 f24485c;

    public m8(p8 p8Var, boolean z10, int i10) {
        this.f24483a = i10;
        this.f24485c = p8Var;
        this.f24484b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24483a) {
            case 0:
                if (!this.f24484b) {
                    this.f24485c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f24484b) {
                    this.f24485c.f24776x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f24483a) {
            case 0:
                if (this.f24484b) {
                    this.f24485c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f24484b) {
                    this.f24485c.f24776x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
