package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nx extends AnimatorListenerAdapter {
    public final int f28835a;
    public final boolean f28836b;
    public final tz f28837c;

    public nx(tz tzVar, boolean z10, int i10) {
        this.f28835a = i10;
        this.f28837c = tzVar;
        this.f28836b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28835a) {
            case 0:
                if (!this.f28836b) {
                    this.f28837c.f30812x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f28836b) {
                    this.f28837c.f30816y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
