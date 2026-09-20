package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gx extends AnimatorListenerAdapter {
    public final int f24469a;
    public final boolean f24470b;
    public final kz f24471c;

    public gx(kz kzVar, boolean z10, int i10) {
        this.f24469a = i10;
        this.f24471c = kzVar;
        this.f24470b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24469a) {
            case 0:
                if (!this.f24470b) {
                    this.f24471c.f25963x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f24470b) {
                    this.f24471c.f25967y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
