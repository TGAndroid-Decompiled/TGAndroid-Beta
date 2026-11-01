package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zd0 extends AnimatorListenerAdapter {
    public final int f33120a;
    public final be0 f33121b;

    public zd0(be0 be0Var, int i10) {
        this.f33120a = i10;
        this.f33121b = be0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33120a) {
            case 0:
                this.f33121b.f24720s = null;
                return;
            default:
                this.f33121b.f24721w = null;
                return;
        }
    }
}
