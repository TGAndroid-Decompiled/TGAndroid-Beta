package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gx extends AnimatorListenerAdapter {
    public final int f24500a;
    public final boolean f24501b;
    public final kz f24502c;

    public gx(kz kzVar, boolean z10, int i10) {
        this.f24500a = i10;
        this.f24502c = kzVar;
        this.f24501b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24500a) {
            case 0:
                if (!this.f24501b) {
                    this.f24502c.f25957x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f24501b) {
                    this.f24502c.f25961y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
