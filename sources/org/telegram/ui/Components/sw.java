package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sw extends AnimatorListenerAdapter {
    public final int f32561a;
    public final boolean f32562b;
    public final wy f32563c;

    public sw(wy wyVar, boolean z10, int i9) {
        this.f32561a = i9;
        this.f32563c = wyVar;
        this.f32562b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32561a) {
            case 0:
                if (!this.f32562b) {
                    this.f32563c.f34458x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f32562b) {
                    this.f32563c.f34462y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
