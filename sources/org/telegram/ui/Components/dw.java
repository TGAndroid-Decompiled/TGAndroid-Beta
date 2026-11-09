package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dw extends AnimatorListenerAdapter {
    public final int f33173a;
    public final boolean f33174b;
    public final hy f33175c;

    public dw(hy hyVar, boolean z9, int i7) {
        this.f33173a = i7;
        this.f33175c = hyVar;
        this.f33174b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33173a) {
            case 0:
                if (!this.f33174b) {
                    this.f33175c.f34483y.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f33174b) {
                    this.f33175c.D.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
