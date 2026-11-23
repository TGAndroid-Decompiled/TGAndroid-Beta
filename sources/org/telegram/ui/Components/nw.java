package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nw extends AnimatorListenerAdapter {
    public final int f37926a;
    public final boolean f37927b;
    public final qy f37928c;

    public nw(qy qyVar, boolean z10, int i7) {
        this.f37926a = i7;
        this.f37928c = qyVar;
        this.f37927b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37926a) {
            case 0:
                if (!this.f37927b) {
                    this.f37928c.f39112y.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f37927b) {
                    this.f37928c.E.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
