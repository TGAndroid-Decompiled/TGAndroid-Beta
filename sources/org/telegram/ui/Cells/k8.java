package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k8 extends AnimatorListenerAdapter {
    public final int f20590a;
    public final boolean f20591b;
    public final n8 f20592c;

    public k8(n8 n8Var, boolean z10, int i10) {
        this.f20590a = i10;
        this.f20592c = n8Var;
        this.f20591b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20590a) {
            case 0:
                if (!this.f20591b) {
                    this.f20592c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f20591b) {
                    this.f20592c.f20722x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f20590a) {
            case 0:
                if (this.f20591b) {
                    this.f20592c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f20591b) {
                    this.f20592c.f20722x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
