package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class j40 extends AnimatorListenerAdapter {
    public final int f25289a;
    public final l40 f25290b;

    public j40(l40 l40Var, int i10) {
        this.f25289a = i10;
        this.f25290b = l40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        long j3;
        switch (this.f25289a) {
            case 0:
                l40 l40Var = this.f25290b;
                l40Var.f25901f = null;
                if (!l40Var.H) {
                    zp zpVar = new zp(this, 21);
                    l40Var.h = zpVar;
                    if (l40Var.f25902n == 0) {
                        j3 = 10000;
                    } else {
                        j3 = 2000;
                    }
                    AndroidUtilities.runOnUIThread(zpVar, j3);
                    return;
                }
                return;
            case 1:
                l40 l40Var2 = this.f25290b;
                l40Var2.f25901f = null;
                if (!l40Var2.H) {
                    zp zpVar2 = new zp(this, 22);
                    l40Var2.h = zpVar2;
                    AndroidUtilities.runOnUIThread(zpVar2, l40Var2.E);
                    return;
                }
                return;
            default:
                l40 l40Var3 = this.f25290b;
                l40Var3.setVisibility(4);
                l40Var3.getClass();
                l40Var3.e = null;
                l40Var3.d = null;
                l40Var3.f25901f = null;
                return;
        }
    }
}
