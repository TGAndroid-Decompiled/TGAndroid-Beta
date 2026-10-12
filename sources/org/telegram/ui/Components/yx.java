package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yx extends AnimatorListenerAdapter {
    public final int f33214a;
    public final boolean f33215b;
    public final d00 f33216c;

    public yx(d00 d00Var, boolean z10, int i10) {
        this.f33214a = i10;
        this.f33216c = d00Var;
        this.f33215b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33214a) {
            case 0:
                if (!this.f33215b) {
                    this.f33216c.f25146x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f33215b) {
                    this.f33216c.f25150y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
