package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class t40 extends AnimatorListenerAdapter {
    public final int f28969a;
    public final v40 f28970b;

    public t40(v40 v40Var, int i10) {
        this.f28969a = i10;
        this.f28970b = v40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        long j10;
        switch (this.f28969a) {
            case 0:
                v40 v40Var = this.f28970b;
                v40Var.f29555f = null;
                if (!v40Var.H) {
                    kq kqVar = new kq(this, 21);
                    v40Var.h = kqVar;
                    if (v40Var.f29556n == 0) {
                        j10 = 10000;
                    } else {
                        j10 = 2000;
                    }
                    AndroidUtilities.runOnUIThread(kqVar, j10);
                    return;
                }
                return;
            case 1:
                v40 v40Var2 = this.f28970b;
                v40Var2.f29555f = null;
                if (!v40Var2.H) {
                    kq kqVar2 = new kq(this, 22);
                    v40Var2.h = kqVar2;
                    AndroidUtilities.runOnUIThread(kqVar2, v40Var2.E);
                    return;
                }
                return;
            default:
                v40 v40Var3 = this.f28970b;
                v40Var3.setVisibility(4);
                v40Var3.getClass();
                v40Var3.e = null;
                v40Var3.d = null;
                v40Var3.f29555f = null;
                return;
        }
    }
}
