package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gx extends AnimatorListenerAdapter {
    public final int f24638a;
    public final boolean f24639b;
    public final kz f24640c;

    public gx(kz kzVar, boolean z10, int i10) {
        this.f24638a = i10;
        this.f24640c = kzVar;
        this.f24639b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24638a) {
            case 0:
                if (!this.f24639b) {
                    this.f24640c.f25923x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f24639b) {
                    this.f24640c.f25927y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
