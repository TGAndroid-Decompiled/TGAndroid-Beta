package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class j40 extends AnimatorListenerAdapter {
    public final int f25824a;
    public final l40 f25825b;

    public j40(l40 l40Var, int i10) {
        this.f25824a = i10;
        this.f25825b = l40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        long j10;
        switch (this.f25824a) {
            case 0:
                l40 l40Var = this.f25825b;
                l40Var.f26564f = null;
                if (!l40Var.E) {
                    up upVar = new up(this, 21);
                    l40Var.h = upVar;
                    if (l40Var.f26565n == 0) {
                        j10 = 10000;
                    } else {
                        j10 = 2000;
                    }
                    AndroidUtilities.runOnUIThread(upVar, j10);
                    return;
                }
                return;
            case 1:
                l40 l40Var2 = this.f25825b;
                l40Var2.f26564f = null;
                if (!l40Var2.E) {
                    up upVar2 = new up(this, 22);
                    l40Var2.h = upVar2;
                    AndroidUtilities.runOnUIThread(upVar2, l40Var2.B);
                    return;
                }
                return;
            default:
                l40 l40Var3 = this.f25825b;
                l40Var3.setVisibility(4);
                l40Var3.getClass();
                l40Var3.e = null;
                l40Var3.d = null;
                l40Var3.f26564f = null;
                return;
        }
    }
}
