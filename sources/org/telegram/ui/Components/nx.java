package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nx extends AnimatorListenerAdapter {
    public final int f28890a;
    public final boolean f28891b;
    public final tz f28892c;

    public nx(tz tzVar, boolean z10, int i10) {
        this.f28890a = i10;
        this.f28892c = tzVar;
        this.f28891b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28890a) {
            case 0:
                if (!this.f28891b) {
                    this.f28892c.f30788x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f28891b) {
                    this.f28892c.f30792y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
