package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qw extends AnimatorListenerAdapter {
    public final int f39009a;
    public final boolean f39010b;
    public final ty f39011c;

    public qw(ty tyVar, boolean z10, int i7) {
        this.f39009a = i7;
        this.f39011c = tyVar;
        this.f39010b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39009a) {
            case 0:
                if (!this.f39010b) {
                    this.f39011c.f40164y.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f39010b) {
                    this.f39011c.E.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
