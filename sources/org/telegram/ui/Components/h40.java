package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class h40 extends AnimatorListenerAdapter {
    public final int f24489a;
    public final j40 f24490b;

    public h40(j40 j40Var, int i10) {
        this.f24489a = i10;
        this.f24490b = j40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        long j3;
        switch (this.f24489a) {
            case 0:
                j40 j40Var = this.f24490b;
                j40Var.f25131f = null;
                if (!j40Var.H) {
                    yp ypVar = new yp(this, 21);
                    j40Var.h = ypVar;
                    if (j40Var.f25132n == 0) {
                        j3 = 10000;
                    } else {
                        j3 = 2000;
                    }
                    AndroidUtilities.runOnUIThread(ypVar, j3);
                    return;
                }
                return;
            case 1:
                j40 j40Var2 = this.f24490b;
                j40Var2.f25131f = null;
                if (!j40Var2.H) {
                    yp ypVar2 = new yp(this, 22);
                    j40Var2.h = ypVar2;
                    AndroidUtilities.runOnUIThread(ypVar2, j40Var2.E);
                    return;
                }
                return;
            default:
                j40 j40Var3 = this.f24490b;
                j40Var3.setVisibility(4);
                j40Var3.getClass();
                j40Var3.e = null;
                j40Var3.d = null;
                j40Var3.f25131f = null;
                return;
        }
    }
}
