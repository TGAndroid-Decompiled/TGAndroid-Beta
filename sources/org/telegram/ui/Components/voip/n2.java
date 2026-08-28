package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n2 extends AnimatorListenerAdapter {
    public final int f33697a;
    public final o2 f33698b;

    public n2(o2 o2Var, int i9) {
        this.f33697a = i9;
        this.f33698b = o2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33697a) {
            case 0:
                this.f33698b.f33734b.setVisibility(8);
                return;
            default:
                this.f33698b.f33735c.setVisibility(8);
                return;
        }
    }
}
