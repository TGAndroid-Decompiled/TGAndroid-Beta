package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dw extends AnimatorListenerAdapter {
    public final int f33101a;
    public final boolean f33102b;
    public final hy f33103c;

    public dw(hy hyVar, boolean z9, int i7) {
        this.f33101a = i7;
        this.f33103c = hyVar;
        this.f33102b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33101a) {
            case 0:
                if (!this.f33102b) {
                    this.f33103c.f34468y.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f33102b) {
                    this.f33103c.D.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
