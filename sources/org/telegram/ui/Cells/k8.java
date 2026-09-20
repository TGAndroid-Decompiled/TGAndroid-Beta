package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k8 extends AnimatorListenerAdapter {
    public final int f20575a;
    public final boolean f20576b;
    public final n8 f20577c;

    public k8(n8 n8Var, boolean z10, int i10) {
        this.f20575a = i10;
        this.f20577c = n8Var;
        this.f20576b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20575a) {
            case 0:
                if (!this.f20576b) {
                    this.f20577c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f20576b) {
                    this.f20577c.f20707x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f20575a) {
            case 0:
                if (this.f20576b) {
                    this.f20577c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f20576b) {
                    this.f20577c.f20707x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
