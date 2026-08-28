package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class q30 extends AnimatorListenerAdapter {
    public final int f31823a;
    public final s30 f31824b;

    public q30(s30 s30Var, int i9) {
        this.f31823a = i9;
        this.f31824b = s30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        long j10;
        switch (this.f31823a) {
            case 0:
                s30 s30Var = this.f31824b;
                s30Var.f32346f = null;
                if (!s30Var.D) {
                    np npVar = new np(this, 21);
                    s30Var.h = npVar;
                    if (s30Var.f32347n == 0) {
                        j10 = 10000;
                    } else {
                        j10 = 2000;
                    }
                    AndroidUtilities.runOnUIThread(npVar, j10);
                    return;
                }
                return;
            case 1:
                s30 s30Var2 = this.f31824b;
                s30Var2.f32346f = null;
                if (!s30Var2.D) {
                    np npVar2 = new np(this, 22);
                    s30Var2.h = npVar2;
                    AndroidUtilities.runOnUIThread(npVar2, s30Var2.A);
                    return;
                }
                return;
            default:
                s30 s30Var3 = this.f31824b;
                s30Var3.setVisibility(4);
                s30Var3.getClass();
                s30Var3.f32345e = null;
                s30Var3.d = null;
                s30Var3.f32346f = null;
                return;
        }
    }
}
