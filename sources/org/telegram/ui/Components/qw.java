package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qw extends AnimatorListenerAdapter {
    public final int f39003a;
    public final boolean f39004b;
    public final ty f39005c;

    public qw(ty tyVar, boolean z10, int i7) {
        this.f39003a = i7;
        this.f39005c = tyVar;
        this.f39004b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39003a) {
            case 0:
                if (!this.f39004b) {
                    this.f39005c.f40157y.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f39004b) {
                    this.f39005c.E.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
