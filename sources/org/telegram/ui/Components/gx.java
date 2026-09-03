package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gx extends AnimatorListenerAdapter {
    public final int f27290a;
    public final boolean f27291b;
    public final mz f27292c;

    public gx(mz mzVar, boolean z4, int i10) {
        this.f27290a = i10;
        this.f27292c = mzVar;
        this.f27291b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27290a) {
            case 0:
                if (!this.f27291b) {
                    this.f27292c.f29340x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f27291b) {
                    this.f27292c.f29344y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
