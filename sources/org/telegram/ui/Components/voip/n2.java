package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n2 extends AnimatorListenerAdapter {
    public final int f28290a;
    public final o2 f28291b;

    public n2(o2 o2Var, int i10) {
        this.f28290a = i10;
        this.f28291b = o2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28290a) {
            case 0:
                this.f28291b.f28308b.setVisibility(8);
                return;
            default:
                this.f28291b.f28309c.setVisibility(8);
                return;
        }
    }
}
