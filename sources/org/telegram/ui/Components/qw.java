package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qw extends AnimatorListenerAdapter {
    public final int f39002a;
    public final boolean f39003b;
    public final ty f39004c;

    public qw(ty tyVar, boolean z10, int i7) {
        this.f39002a = i7;
        this.f39004c = tyVar;
        this.f39003b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39002a) {
            case 0:
                if (!this.f39003b) {
                    this.f39004c.f40156y.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f39003b) {
                    this.f39004c.E.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
