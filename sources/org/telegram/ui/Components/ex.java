package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ex extends AnimatorListenerAdapter {
    public final int f24692a;
    public final boolean f24693b;
    public final kz f24694c;

    public ex(kz kzVar, boolean z4, int i10) {
        this.f24692a = i10;
        this.f24694c = kzVar;
        this.f24693b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24692a) {
            case 0:
                if (!this.f24693b) {
                    this.f24694c.f26483x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f24693b) {
                    this.f24694c.f26487y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
