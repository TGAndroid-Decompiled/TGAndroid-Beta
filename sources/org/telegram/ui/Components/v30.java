package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

public final class v30 extends AnimatorListenerAdapter {

    public final int f33260a;

    public final x30 f33261b;

    public v30(x30 x30Var, int i10) {
        this.f33260a = i10;
        this.f33261b = x30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33260a) {
            case 0:
                x30 x30Var = this.f33261b;
                x30Var.f34455f = null;
                if (!x30Var.D) {
                    lp lpVar = new lp(this, 21);
                    x30Var.h = lpVar;
                    AndroidUtilities.runOnUIThread(lpVar, x30Var.f34456n == 0 ? 10000L : 2000L);
                }
                break;
            case 1:
                x30 x30Var2 = this.f33261b;
                x30Var2.f34455f = null;
                if (!x30Var2.D) {
                    lp lpVar2 = new lp(this, 22);
                    x30Var2.h = lpVar2;
                    AndroidUtilities.runOnUIThread(lpVar2, x30Var2.A);
                }
                break;
            default:
                x30 x30Var3 = this.f33261b;
                x30Var3.setVisibility(4);
                x30Var3.getClass();
                x30Var3.f34454e = null;
                x30Var3.d = null;
                x30Var3.f34455f = null;
                break;
        }
    }
}
