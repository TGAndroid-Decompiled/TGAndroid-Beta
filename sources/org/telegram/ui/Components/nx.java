package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nx extends AnimatorListenerAdapter {
    public final int f28894a;
    public final boolean f28895b;
    public final tz f28896c;

    public nx(tz tzVar, boolean z10, int i10) {
        this.f28894a = i10;
        this.f28896c = tzVar;
        this.f28895b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28894a) {
            case 0:
                if (!this.f28895b) {
                    this.f28896c.f30792x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f28895b) {
                    this.f28896c.f30796y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
