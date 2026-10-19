package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nx extends AnimatorListenerAdapter {
    public final int f28850a;
    public final boolean f28851b;
    public final tz f28852c;

    public nx(tz tzVar, boolean z10, int i10) {
        this.f28850a = i10;
        this.f28852c = tzVar;
        this.f28851b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28850a) {
            case 0:
                if (!this.f28851b) {
                    this.f28852c.f30835x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f28851b) {
                    this.f28852c.f30839y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
