package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class i40 extends AnimatorListenerAdapter {
    public final int f24976a;
    public final k40 f24977b;

    public i40(k40 k40Var, int i10) {
        this.f24976a = i10;
        this.f24977b = k40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        long j3;
        switch (this.f24976a) {
            case 0:
                k40 k40Var = this.f24977b;
                k40Var.f25624f = null;
                if (!k40Var.H) {
                    zp zpVar = new zp(this, 21);
                    k40Var.h = zpVar;
                    if (k40Var.f25625n == 0) {
                        j3 = 10000;
                    } else {
                        j3 = 2000;
                    }
                    AndroidUtilities.runOnUIThread(zpVar, j3);
                    return;
                }
                return;
            case 1:
                k40 k40Var2 = this.f24977b;
                k40Var2.f25624f = null;
                if (!k40Var2.H) {
                    zp zpVar2 = new zp(this, 22);
                    k40Var2.h = zpVar2;
                    AndroidUtilities.runOnUIThread(zpVar2, k40Var2.E);
                    return;
                }
                return;
            default:
                k40 k40Var3 = this.f24977b;
                k40Var3.setVisibility(4);
                k40Var3.getClass();
                k40Var3.e = null;
                k40Var3.d = null;
                k40Var3.f25624f = null;
                return;
        }
    }
}
