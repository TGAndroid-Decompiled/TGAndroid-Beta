package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class a50 extends AnimatorListenerAdapter {
    public final int f24235a;
    public final c50 f24236b;

    public a50(c50 c50Var, int i10) {
        this.f24235a = i10;
        this.f24236b = c50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        long j3;
        switch (this.f24235a) {
            case 0:
                c50 c50Var = this.f24236b;
                c50Var.f24823f = null;
                if (!c50Var.H) {
                    pq pqVar = new pq(this, 21);
                    c50Var.h = pqVar;
                    if (c50Var.f24824n == 0) {
                        j3 = 10000;
                    } else {
                        j3 = 2000;
                    }
                    AndroidUtilities.runOnUIThread(pqVar, j3);
                    return;
                }
                return;
            case 1:
                c50 c50Var2 = this.f24236b;
                c50Var2.f24823f = null;
                if (!c50Var2.H) {
                    pq pqVar2 = new pq(this, 22);
                    c50Var2.h = pqVar2;
                    AndroidUtilities.runOnUIThread(pqVar2, c50Var2.E);
                    return;
                }
                return;
            default:
                c50 c50Var3 = this.f24236b;
                c50Var3.setVisibility(4);
                c50Var3.getClass();
                c50Var3.f24822e = null;
                c50Var3.d = null;
                c50Var3.f24823f = null;
                return;
        }
    }
}
