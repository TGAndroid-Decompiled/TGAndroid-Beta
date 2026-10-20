package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nx extends AnimatorListenerAdapter {
    public final int f28889a;
    public final boolean f28890b;
    public final tz f28891c;

    public nx(tz tzVar, boolean z10, int i10) {
        this.f28889a = i10;
        this.f28891c = tzVar;
        this.f28890b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28889a) {
            case 0:
                if (!this.f28890b) {
                    this.f28891c.f30787x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f28890b) {
                    this.f28891c.f30791y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
