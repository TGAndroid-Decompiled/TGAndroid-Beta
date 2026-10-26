package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m8 extends AnimatorListenerAdapter {
    public final int f24485a;
    public final boolean f24486b;
    public final p8 f24487c;

    public m8(p8 p8Var, boolean z10, int i10) {
        this.f24485a = i10;
        this.f24487c = p8Var;
        this.f24486b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24485a) {
            case 0:
                if (!this.f24486b) {
                    this.f24487c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f24486b) {
                    this.f24487c.f24778x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f24485a) {
            case 0:
                if (this.f24486b) {
                    this.f24487c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f24486b) {
                    this.f24487c.f24778x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
