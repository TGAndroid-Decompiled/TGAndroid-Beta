package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class i40 extends AnimatorListenerAdapter {
    public final int f25552a;
    public final k40 f25553b;

    public i40(k40 k40Var, int i10) {
        this.f25552a = i10;
        this.f25553b = k40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        long j10;
        switch (this.f25552a) {
            case 0:
                k40 k40Var = this.f25553b;
                k40Var.f26148f = null;
                if (!k40Var.E) {
                    vp vpVar = new vp(this, 21);
                    k40Var.h = vpVar;
                    if (k40Var.f26149n == 0) {
                        j10 = 10000;
                    } else {
                        j10 = 2000;
                    }
                    AndroidUtilities.runOnUIThread(vpVar, j10);
                    return;
                }
                return;
            case 1:
                k40 k40Var2 = this.f25553b;
                k40Var2.f26148f = null;
                if (!k40Var2.E) {
                    vp vpVar2 = new vp(this, 22);
                    k40Var2.h = vpVar2;
                    AndroidUtilities.runOnUIThread(vpVar2, k40Var2.B);
                    return;
                }
                return;
            default:
                k40 k40Var3 = this.f25553b;
                k40Var3.setVisibility(4);
                k40Var3.getClass();
                k40Var3.e = null;
                k40Var3.d = null;
                k40Var3.f26148f = null;
                return;
        }
    }
}
