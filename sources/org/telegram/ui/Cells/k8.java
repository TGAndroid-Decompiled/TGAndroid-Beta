package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k8 extends AnimatorListenerAdapter {
    public final int f20338a;
    public final boolean f20339b;
    public final n8 f20340c;

    public k8(n8 n8Var, boolean z10, int i10) {
        this.f20338a = i10;
        this.f20340c = n8Var;
        this.f20339b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20338a) {
            case 0:
                if (!this.f20339b) {
                    this.f20340c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f20339b) {
                    this.f20340c.f20478x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f20338a) {
            case 0:
                if (this.f20339b) {
                    this.f20340c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f20339b) {
                    this.f20340c.f20478x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
