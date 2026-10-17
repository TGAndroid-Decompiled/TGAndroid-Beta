package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class p40 extends AnimatorListenerAdapter {
    public final int f29168a;
    public final r40 f29169b;

    public p40(r40 r40Var, int i10) {
        this.f29168a = i10;
        this.f29169b = r40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        long j10;
        switch (this.f29168a) {
            case 0:
                r40 r40Var = this.f29169b;
                r40Var.f29812f = null;
                if (!r40Var.H) {
                    hq hqVar = new hq(this, 21);
                    r40Var.h = hqVar;
                    if (r40Var.f29813n == 0) {
                        j10 = 10000;
                    } else {
                        j10 = 2000;
                    }
                    AndroidUtilities.runOnUIThread(hqVar, j10);
                    return;
                }
                return;
            case 1:
                r40 r40Var2 = this.f29169b;
                r40Var2.f29812f = null;
                if (!r40Var2.H) {
                    hq hqVar2 = new hq(this, 22);
                    r40Var2.h = hqVar2;
                    AndroidUtilities.runOnUIThread(hqVar2, r40Var2.E);
                    return;
                }
                return;
            default:
                r40 r40Var3 = this.f29169b;
                r40Var3.setVisibility(4);
                r40Var3.getClass();
                r40Var3.e = null;
                r40Var3.d = null;
                r40Var3.f29812f = null;
                return;
        }
    }
}
