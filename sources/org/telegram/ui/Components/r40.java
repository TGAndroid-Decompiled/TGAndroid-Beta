package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class r40 extends AnimatorListenerAdapter {
    public final int f32117a;
    public final t40 f32118b;

    public r40(t40 t40Var, int i10) {
        this.f32117a = i10;
        this.f32118b = t40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        long j10;
        switch (this.f32117a) {
            case 0:
                t40 t40Var = this.f32118b;
                t40Var.f32837f = null;
                if (!t40Var.H) {
                    cp cpVar = new cp(this, 24);
                    t40Var.h = cpVar;
                    if (t40Var.f32838n == 0) {
                        j10 = 10000;
                    } else {
                        j10 = 2000;
                    }
                    AndroidUtilities.runOnUIThread(cpVar, j10);
                    return;
                }
                return;
            case 1:
                t40 t40Var2 = this.f32118b;
                t40Var2.f32837f = null;
                if (!t40Var2.H) {
                    cp cpVar2 = new cp(this, 25);
                    t40Var2.h = cpVar2;
                    AndroidUtilities.runOnUIThread(cpVar2, t40Var2.E);
                    return;
                }
                return;
            default:
                t40 t40Var3 = this.f32118b;
                t40Var3.setVisibility(4);
                t40Var3.getClass();
                t40Var3.e = null;
                t40Var3.d = null;
                t40Var3.f32837f = null;
                return;
        }
    }
}
