package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nx extends AnimatorListenerAdapter {
    public final int f28848a;
    public final boolean f28849b;
    public final tz f28850c;

    public nx(tz tzVar, boolean z10, int i10) {
        this.f28848a = i10;
        this.f28850c = tzVar;
        this.f28849b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28848a) {
            case 0:
                if (!this.f28849b) {
                    this.f28850c.f30833x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f28849b) {
                    this.f28850c.f30837y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
