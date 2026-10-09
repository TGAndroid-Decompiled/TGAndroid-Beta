package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class x40 extends AnimatorListenerAdapter {
    public final int f32744a;
    public final z40 f32745b;

    public x40(z40 z40Var, int i10) {
        this.f32744a = i10;
        this.f32745b = z40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        long j3;
        switch (this.f32744a) {
            case 0:
                z40 z40Var = this.f32745b;
                z40Var.f33460f = null;
                if (!z40Var.H) {
                    nq nqVar = new nq(this, 21);
                    z40Var.h = nqVar;
                    if (z40Var.f33461n == 0) {
                        j3 = 10000;
                    } else {
                        j3 = 2000;
                    }
                    AndroidUtilities.runOnUIThread(nqVar, j3);
                    return;
                }
                return;
            case 1:
                z40 z40Var2 = this.f32745b;
                z40Var2.f33460f = null;
                if (!z40Var2.H) {
                    nq nqVar2 = new nq(this, 22);
                    z40Var2.h = nqVar2;
                    AndroidUtilities.runOnUIThread(nqVar2, z40Var2.E);
                    return;
                }
                return;
            default:
                z40 z40Var3 = this.f32745b;
                z40Var3.setVisibility(4);
                z40Var3.getClass();
                z40Var3.f33459e = null;
                z40Var3.d = null;
                z40Var3.f33460f = null;
                return;
        }
    }
}
