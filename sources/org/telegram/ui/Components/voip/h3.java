package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h3 extends AnimatorListenerAdapter {
    public final int f29351a;
    public final j3 f29352b;

    public h3(j3 j3Var, int i10) {
        this.f29351a = i10;
        this.f29352b = j3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29351a) {
            case 0:
                j3 j3Var = this.f29352b;
                j3Var.f29388r = 0;
                j3Var.invalidate();
                return;
            default:
                j3 j3Var2 = this.f29352b;
                j3Var2.f29389s = 0;
                j3Var2.invalidate();
                return;
        }
    }
}
