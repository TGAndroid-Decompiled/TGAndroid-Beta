package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hx extends AnimatorListenerAdapter {
    public final int f24924a;
    public final boolean f24925b;
    public final mz f24926c;

    public hx(mz mzVar, boolean z10, int i10) {
        this.f24924a = i10;
        this.f24926c = mzVar;
        this.f24925b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24924a) {
            case 0:
                if (!this.f24925b) {
                    this.f24926c.f26639x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f24925b) {
                    this.f24926c.f26643y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
