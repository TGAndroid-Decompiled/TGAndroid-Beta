package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h3 extends AnimatorListenerAdapter {
    public final int f29649a;
    public final j3 f29650b;

    public h3(j3 j3Var, int i10) {
        this.f29649a = i10;
        this.f29650b = j3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29649a) {
            case 0:
                j3 j3Var = this.f29650b;
                j3Var.f29675r = 0;
                j3Var.invalidate();
                return;
            default:
                j3 j3Var2 = this.f29650b;
                j3Var2.f29676s = 0;
                j3Var2.invalidate();
                return;
        }
    }
}
