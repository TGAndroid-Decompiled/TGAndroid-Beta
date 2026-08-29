package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class e40 extends AnimatorListenerAdapter {
    public final int f27921a;
    public final g40 f27922b;

    public e40(g40 g40Var, int i10) {
        this.f27921a = i10;
        this.f27922b = g40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        long j10;
        switch (this.f27921a) {
            case 0:
                g40 g40Var = this.f27922b;
                g40Var.f28749f = null;
                if (!g40Var.D) {
                    rp rpVar = new rp(this, 21);
                    g40Var.h = rpVar;
                    if (g40Var.f28750n == 0) {
                        j10 = 10000;
                    } else {
                        j10 = 2000;
                    }
                    AndroidUtilities.runOnUIThread(rpVar, j10);
                    return;
                }
                return;
            case 1:
                g40 g40Var2 = this.f27922b;
                g40Var2.f28749f = null;
                if (!g40Var2.D) {
                    rp rpVar2 = new rp(this, 22);
                    g40Var2.h = rpVar2;
                    AndroidUtilities.runOnUIThread(rpVar2, g40Var2.A);
                    return;
                }
                return;
            default:
                g40 g40Var3 = this.f27922b;
                g40Var3.setVisibility(4);
                g40Var3.getClass();
                g40Var3.f28748e = null;
                g40Var3.d = null;
                g40Var3.f28749f = null;
                return;
        }
    }
}
