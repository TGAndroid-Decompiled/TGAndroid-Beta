package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h3 extends AnimatorListenerAdapter {
    public final int f29282a;
    public final j3 f29283b;

    public h3(j3 j3Var, int i10) {
        this.f29282a = i10;
        this.f29283b = j3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29282a) {
            case 0:
                j3 j3Var = this.f29283b;
                j3Var.f29319r = 0;
                j3Var.invalidate();
                return;
            default:
                j3 j3Var2 = this.f29283b;
                j3Var2.f29320s = 0;
                j3Var2.invalidate();
                return;
        }
    }
}
