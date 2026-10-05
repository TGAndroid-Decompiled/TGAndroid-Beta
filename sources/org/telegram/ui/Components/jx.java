package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jx extends AnimatorListenerAdapter {
    public final int f27985a;
    public final boolean f27986b;
    public final nz f27987c;

    public jx(nz nzVar, boolean z10, int i10) {
        this.f27985a = i10;
        this.f27987c = nzVar;
        this.f27986b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27985a) {
            case 0:
                if (!this.f27986b) {
                    this.f27987c.f29260x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f27986b) {
                    this.f27987c.f29264y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
