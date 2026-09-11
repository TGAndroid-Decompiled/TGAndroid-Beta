package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class g40 extends AnimatorListenerAdapter {
    public final int f26249a;
    public final i40 f26250b;

    public g40(i40 i40Var, int i10) {
        this.f26249a = i10;
        this.f26250b = i40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        long j3;
        switch (this.f26249a) {
            case 0:
                i40 i40Var = this.f26250b;
                i40Var.f26960f = null;
                if (!i40Var.H) {
                    wp wpVar = new wp(this, 21);
                    i40Var.h = wpVar;
                    if (i40Var.f26961n == 0) {
                        j3 = 10000;
                    } else {
                        j3 = 2000;
                    }
                    AndroidUtilities.runOnUIThread(wpVar, j3);
                    return;
                }
                return;
            case 1:
                i40 i40Var2 = this.f26250b;
                i40Var2.f26960f = null;
                if (!i40Var2.H) {
                    wp wpVar2 = new wp(this, 22);
                    i40Var2.h = wpVar2;
                    AndroidUtilities.runOnUIThread(wpVar2, i40Var2.E);
                    return;
                }
                return;
            default:
                i40 i40Var3 = this.f26250b;
                i40Var3.setVisibility(4);
                i40Var3.getClass();
                i40Var3.f26959e = null;
                i40Var3.d = null;
                i40Var3.f26960f = null;
                return;
        }
    }
}
