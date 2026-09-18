package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class g40 extends AnimatorListenerAdapter {
    public final int f24303a;
    public final i40 f24304b;

    public g40(i40 i40Var, int i10) {
        this.f24303a = i10;
        this.f24304b = i40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        long j3;
        switch (this.f24303a) {
            case 0:
                i40 i40Var = this.f24304b;
                i40Var.f24838f = null;
                if (!i40Var.H) {
                    xp xpVar = new xp(this, 21);
                    i40Var.h = xpVar;
                    if (i40Var.f24839n == 0) {
                        j3 = 10000;
                    } else {
                        j3 = 2000;
                    }
                    AndroidUtilities.runOnUIThread(xpVar, j3);
                    return;
                }
                return;
            case 1:
                i40 i40Var2 = this.f24304b;
                i40Var2.f24838f = null;
                if (!i40Var2.H) {
                    xp xpVar2 = new xp(this, 22);
                    i40Var2.h = xpVar2;
                    AndroidUtilities.runOnUIThread(xpVar2, i40Var2.E);
                    return;
                }
                return;
            default:
                i40 i40Var3 = this.f24304b;
                i40Var3.setVisibility(4);
                i40Var3.getClass();
                i40Var3.e = null;
                i40Var3.d = null;
                i40Var3.f24838f = null;
                return;
        }
    }
}
