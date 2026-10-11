package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class y40 extends AnimatorListenerAdapter {
    public final int f33087a;
    public final a50 f33088b;

    public y40(a50 a50Var, int i10) {
        this.f33087a = i10;
        this.f33088b = a50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        long j3;
        switch (this.f33087a) {
            case 0:
                a50 a50Var = this.f33088b;
                a50Var.f24440f = null;
                if (!a50Var.H) {
                    nq nqVar = new nq(this, 21);
                    a50Var.h = nqVar;
                    if (a50Var.f24441n == 0) {
                        j3 = 10000;
                    } else {
                        j3 = 2000;
                    }
                    AndroidUtilities.runOnUIThread(nqVar, j3);
                    return;
                }
                return;
            case 1:
                a50 a50Var2 = this.f33088b;
                a50Var2.f24440f = null;
                if (!a50Var2.H) {
                    nq nqVar2 = new nq(this, 22);
                    a50Var2.h = nqVar2;
                    AndroidUtilities.runOnUIThread(nqVar2, a50Var2.E);
                    return;
                }
                return;
            default:
                a50 a50Var3 = this.f33088b;
                a50Var3.setVisibility(4);
                a50Var3.getClass();
                a50Var3.f24439e = null;
                a50Var3.d = null;
                a50Var3.f24440f = null;
                return;
        }
    }
}
