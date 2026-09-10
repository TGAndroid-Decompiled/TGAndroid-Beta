package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k8 extends AnimatorListenerAdapter {
    public final int f19448a;
    public final boolean f19449b;
    public final n8 f19450c;

    public k8(n8 n8Var, boolean z10, int i10) {
        this.f19448a = i10;
        this.f19450c = n8Var;
        this.f19449b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19448a) {
            case 0:
                if (!this.f19449b) {
                    this.f19450c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f19449b) {
                    this.f19450c.f19580x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f19448a) {
            case 0:
                if (this.f19449b) {
                    this.f19450c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f19449b) {
                    this.f19450c.f19580x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
