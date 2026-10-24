package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class n40 extends AnimatorListenerAdapter {
    public final int f28777a;
    public final p40 f28778b;

    public n40(p40 p40Var, int i10) {
        this.f28777a = i10;
        this.f28778b = p40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        long j10;
        switch (this.f28777a) {
            case 0:
                p40 p40Var = this.f28778b;
                p40Var.f29464f = null;
                if (!p40Var.H) {
                    xp xpVar = new xp(this, 22);
                    p40Var.h = xpVar;
                    if (p40Var.f29465n == 0) {
                        j10 = 10000;
                    } else {
                        j10 = 2000;
                    }
                    AndroidUtilities.runOnUIThread(xpVar, j10);
                    return;
                }
                return;
            case 1:
                p40 p40Var2 = this.f28778b;
                p40Var2.f29464f = null;
                if (!p40Var2.H) {
                    xp xpVar2 = new xp(this, 23);
                    p40Var2.h = xpVar2;
                    AndroidUtilities.runOnUIThread(xpVar2, p40Var2.E);
                    return;
                }
                return;
            default:
                p40 p40Var3 = this.f28778b;
                p40Var3.setVisibility(4);
                p40Var3.getClass();
                p40Var3.e = null;
                p40Var3.d = null;
                p40Var3.f29464f = null;
                return;
        }
    }
}
