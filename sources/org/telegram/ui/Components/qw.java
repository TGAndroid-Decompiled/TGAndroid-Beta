package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qw extends AnimatorListenerAdapter {
    public final int f38957a;
    public final boolean f38958b;
    public final ty f38959c;

    public qw(ty tyVar, boolean z10, int i7) {
        this.f38957a = i7;
        this.f38959c = tyVar;
        this.f38958b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38957a) {
            case 0:
                if (!this.f38958b) {
                    this.f38959c.f40139y.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f38958b) {
                    this.f38959c.E.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
