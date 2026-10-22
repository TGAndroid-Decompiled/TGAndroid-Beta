package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nx extends AnimatorListenerAdapter {
    public final int f28893a;
    public final boolean f28894b;
    public final tz f28895c;

    public nx(tz tzVar, boolean z10, int i10) {
        this.f28893a = i10;
        this.f28895c = tzVar;
        this.f28894b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28893a) {
            case 0:
                if (!this.f28894b) {
                    this.f28895c.f30791x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f28894b) {
                    this.f28895c.f30795y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
