package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bw extends AnimatorListenerAdapter {
    public final int f32410a;
    public final boolean f32411b;
    public final ey f32412c;

    public bw(ey eyVar, boolean z10, int i3) {
        this.f32410a = i3;
        this.f32412c = eyVar;
        this.f32411b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32410a) {
            case 0:
                if (!this.f32411b) {
                    this.f32412c.f33595y.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f32411b) {
                    this.f32412c.E.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
