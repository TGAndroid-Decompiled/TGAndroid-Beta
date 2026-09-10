package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class q40 extends AnimatorListenerAdapter {
    public final int f26315a;
    public final s40 f26316b;

    public q40(s40 s40Var, int i10) {
        this.f26315a = i10;
        this.f26316b = s40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        long j3;
        switch (this.f26315a) {
            case 0:
                s40 s40Var = this.f26316b;
                s40Var.f26938f = null;
                if (!s40Var.H) {
                    dq dqVar = new dq(this, 21);
                    s40Var.h = dqVar;
                    if (s40Var.f26939n == 0) {
                        j3 = 10000;
                    } else {
                        j3 = 2000;
                    }
                    AndroidUtilities.runOnUIThread(dqVar, j3);
                    return;
                }
                return;
            case 1:
                s40 s40Var2 = this.f26316b;
                s40Var2.f26938f = null;
                if (!s40Var2.H) {
                    dq dqVar2 = new dq(this, 22);
                    s40Var2.h = dqVar2;
                    AndroidUtilities.runOnUIThread(dqVar2, s40Var2.E);
                    return;
                }
                return;
            default:
                s40 s40Var3 = this.f26316b;
                s40Var3.setVisibility(4);
                s40Var3.getClass();
                s40Var3.e = null;
                s40Var3.d = null;
                s40Var3.f26938f = null;
                return;
        }
    }
}
