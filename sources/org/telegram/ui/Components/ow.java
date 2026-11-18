package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ow extends AnimatorListenerAdapter {
    public final int f38179a;
    public final boolean f38180b;
    public final ry f38181c;

    public ow(ry ryVar, boolean z10, int i7) {
        this.f38179a = i7;
        this.f38181c = ryVar;
        this.f38180b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38179a) {
            case 0:
                if (!this.f38180b) {
                    this.f38181c.f39410y.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f38180b) {
                    this.f38181c.E.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
