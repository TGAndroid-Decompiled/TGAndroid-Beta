package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nx extends AnimatorListenerAdapter {
    public final int f28842a;
    public final boolean f28843b;
    public final tz f28844c;

    public nx(tz tzVar, boolean z10, int i10) {
        this.f28842a = i10;
        this.f28844c = tzVar;
        this.f28843b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28842a) {
            case 0:
                if (!this.f28843b) {
                    this.f28844c.f30819x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f28843b) {
                    this.f28844c.f30823y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
