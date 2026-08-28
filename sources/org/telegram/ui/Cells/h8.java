package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h8 extends AnimatorListenerAdapter {
    public final int f24489a;
    public final boolean f24490b;
    public final k8 f24491c;

    public h8(k8 k8Var, boolean z10, int i9) {
        this.f24489a = i9;
        this.f24491c = k8Var;
        this.f24490b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24489a) {
            case 0:
                if (!this.f24490b) {
                    this.f24491c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f24490b) {
                    this.f24491c.f24625x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f24489a) {
            case 0:
                if (this.f24490b) {
                    this.f24491c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f24490b) {
                    this.f24491c.f24625x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
