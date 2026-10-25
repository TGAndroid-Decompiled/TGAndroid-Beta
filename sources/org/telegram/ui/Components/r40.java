package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class r40 extends AnimatorListenerAdapter {
    public final int f32089a;
    public final t40 f32090b;

    public r40(t40 t40Var, int i10) {
        this.f32089a = i10;
        this.f32090b = t40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        long j10;
        switch (this.f32089a) {
            case 0:
                t40 t40Var = this.f32090b;
                t40Var.f32826f = null;
                if (!t40Var.H) {
                    bq bqVar = new bq(this, 23);
                    t40Var.h = bqVar;
                    if (t40Var.f32827n == 0) {
                        j10 = 10000;
                    } else {
                        j10 = 2000;
                    }
                    AndroidUtilities.runOnUIThread(bqVar, j10);
                    return;
                }
                return;
            case 1:
                t40 t40Var2 = this.f32090b;
                t40Var2.f32826f = null;
                if (!t40Var2.H) {
                    bq bqVar2 = new bq(this, 24);
                    t40Var2.h = bqVar2;
                    AndroidUtilities.runOnUIThread(bqVar2, t40Var2.E);
                    return;
                }
                return;
            default:
                t40 t40Var3 = this.f32090b;
                t40Var3.setVisibility(4);
                t40Var3.getClass();
                t40Var3.e = null;
                t40Var3.d = null;
                t40Var3.f32826f = null;
                return;
        }
    }
}
