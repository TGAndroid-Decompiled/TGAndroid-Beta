package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class k40 extends AnimatorListenerAdapter {
    public final int f28052a;
    public final m40 f28053b;

    public k40(m40 m40Var, int i10) {
        this.f28052a = i10;
        this.f28053b = m40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        long j3;
        switch (this.f28052a) {
            case 0:
                m40 m40Var = this.f28053b;
                m40Var.f28601f = null;
                if (!m40Var.H) {
                    aq aqVar = new aq(this, 21);
                    m40Var.h = aqVar;
                    if (m40Var.f28602n == 0) {
                        j3 = 10000;
                    } else {
                        j3 = 2000;
                    }
                    AndroidUtilities.runOnUIThread(aqVar, j3);
                    return;
                }
                return;
            case 1:
                m40 m40Var2 = this.f28053b;
                m40Var2.f28601f = null;
                if (!m40Var2.H) {
                    aq aqVar2 = new aq(this, 22);
                    m40Var2.h = aqVar2;
                    AndroidUtilities.runOnUIThread(aqVar2, m40Var2.E);
                    return;
                }
                return;
            default:
                m40 m40Var3 = this.f28053b;
                m40Var3.setVisibility(4);
                m40Var3.getClass();
                m40Var3.f28600e = null;
                m40Var3.d = null;
                m40Var3.f28601f = null;
                return;
        }
    }
}
