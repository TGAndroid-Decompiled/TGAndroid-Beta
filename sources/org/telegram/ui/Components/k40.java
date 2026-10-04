package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class k40 extends AnimatorListenerAdapter {
    public final int f27955a;
    public final m40 f27956b;

    public k40(m40 m40Var, int i10) {
        this.f27955a = i10;
        this.f27956b = m40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        long j3;
        switch (this.f27955a) {
            case 0:
                m40 m40Var = this.f27956b;
                m40Var.f28526f = null;
                if (!m40Var.H) {
                    aq aqVar = new aq(this, 21);
                    m40Var.h = aqVar;
                    if (m40Var.f28527n == 0) {
                        j3 = 10000;
                    } else {
                        j3 = 2000;
                    }
                    AndroidUtilities.runOnUIThread(aqVar, j3);
                    return;
                }
                return;
            case 1:
                m40 m40Var2 = this.f27956b;
                m40Var2.f28526f = null;
                if (!m40Var2.H) {
                    aq aqVar2 = new aq(this, 22);
                    m40Var2.h = aqVar2;
                    AndroidUtilities.runOnUIThread(aqVar2, m40Var2.E);
                    return;
                }
                return;
            default:
                m40 m40Var3 = this.f27956b;
                m40Var3.setVisibility(4);
                m40Var3.getClass();
                m40Var3.f28525e = null;
                m40Var3.d = null;
                m40Var3.f28526f = null;
                return;
        }
    }
}
