package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class k40 extends AnimatorListenerAdapter {
    public final int f28258a;
    public final m40 f28259b;

    public k40(m40 m40Var, int i10) {
        this.f28258a = i10;
        this.f28259b = m40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        long j10;
        switch (this.f28258a) {
            case 0:
                m40 m40Var = this.f28259b;
                m40Var.f28926f = null;
                if (!m40Var.E) {
                    xp xpVar = new xp(this, 21);
                    m40Var.h = xpVar;
                    if (m40Var.f28927n == 0) {
                        j10 = 10000;
                    } else {
                        j10 = 2000;
                    }
                    AndroidUtilities.runOnUIThread(xpVar, j10);
                    return;
                }
                return;
            case 1:
                m40 m40Var2 = this.f28259b;
                m40Var2.f28926f = null;
                if (!m40Var2.E) {
                    xp xpVar2 = new xp(this, 22);
                    m40Var2.h = xpVar2;
                    AndroidUtilities.runOnUIThread(xpVar2, m40Var2.B);
                    return;
                }
                return;
            default:
                m40 m40Var3 = this.f28259b;
                m40Var3.setVisibility(4);
                m40Var3.getClass();
                m40Var3.f28925e = null;
                m40Var3.d = null;
                m40Var3.f28926f = null;
                return;
        }
    }
}
