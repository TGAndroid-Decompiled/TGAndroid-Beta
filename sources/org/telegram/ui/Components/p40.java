package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class p40 extends AnimatorListenerAdapter {
    public final int f29411a;
    public final r40 f29412b;

    public p40(r40 r40Var, int i10) {
        this.f29411a = i10;
        this.f29412b = r40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        long j10;
        switch (this.f29411a) {
            case 0:
                r40 r40Var = this.f29412b;
                r40Var.f30075f = null;
                if (!r40Var.H) {
                    zp zpVar = new zp(this, 22);
                    r40Var.h = zpVar;
                    if (r40Var.f30076n == 0) {
                        j10 = 10000;
                    } else {
                        j10 = 2000;
                    }
                    AndroidUtilities.runOnUIThread(zpVar, j10);
                    return;
                }
                return;
            case 1:
                r40 r40Var2 = this.f29412b;
                r40Var2.f30075f = null;
                if (!r40Var2.H) {
                    zp zpVar2 = new zp(this, 23);
                    r40Var2.h = zpVar2;
                    AndroidUtilities.runOnUIThread(zpVar2, r40Var2.E);
                    return;
                }
                return;
            default:
                r40 r40Var3 = this.f29412b;
                r40Var3.setVisibility(4);
                r40Var3.getClass();
                r40Var3.e = null;
                r40Var3.d = null;
                r40Var3.f30075f = null;
                return;
        }
    }
}
