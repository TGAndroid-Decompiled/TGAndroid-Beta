package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class a50 extends AnimatorListenerAdapter {
    public final int f24236a;
    public final c50 f24237b;

    public a50(c50 c50Var, int i10) {
        this.f24236a = i10;
        this.f24237b = c50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        long j3;
        switch (this.f24236a) {
            case 0:
                c50 c50Var = this.f24237b;
                c50Var.f24818f = null;
                if (!c50Var.H) {
                    pq pqVar = new pq(this, 21);
                    c50Var.h = pqVar;
                    if (c50Var.f24819n == 0) {
                        j3 = 10000;
                    } else {
                        j3 = 2000;
                    }
                    AndroidUtilities.runOnUIThread(pqVar, j3);
                    return;
                }
                return;
            case 1:
                c50 c50Var2 = this.f24237b;
                c50Var2.f24818f = null;
                if (!c50Var2.H) {
                    pq pqVar2 = new pq(this, 22);
                    c50Var2.h = pqVar2;
                    AndroidUtilities.runOnUIThread(pqVar2, c50Var2.E);
                    return;
                }
                return;
            default:
                c50 c50Var3 = this.f24237b;
                c50Var3.setVisibility(4);
                c50Var3.getClass();
                c50Var3.f24817e = null;
                c50Var3.d = null;
                c50Var3.f24818f = null;
                return;
        }
    }
}
