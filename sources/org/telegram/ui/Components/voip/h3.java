package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h3 extends AnimatorListenerAdapter {
    public final int f31977a;
    public final j3 f31978b;

    public h3(j3 j3Var, int i10) {
        this.f31977a = i10;
        this.f31978b = j3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31977a) {
            case 0:
                j3 j3Var = this.f31978b;
                j3Var.f32017r = 0;
                j3Var.invalidate();
                return;
            default:
                j3 j3Var2 = this.f31978b;
                j3Var2.f32018s = 0;
                j3Var2.invalidate();
                return;
        }
    }
}
