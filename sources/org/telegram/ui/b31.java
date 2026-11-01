package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b31 extends AnimatorListenerAdapter {
    public final boolean f35930a;
    public final Runnable f35931b;
    public final boolean[] f35932c;
    public final boolean d;
    public final Runnable e;
    public final c31 f35933f;

    public b31(c31 c31Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f35933f = c31Var;
        this.f35930a = z10;
        this.f35931b = runnable;
        this.f35932c = zArr;
        this.d = z11;
        this.e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        c31 c31Var = this.f35933f;
        l0 l0Var = c31Var.f36177s;
        boolean z10 = this.f35930a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        c31Var.I = f7;
        org.telegram.messenger.i0.X1(c31Var.f36173c, c31Var.d, f7, c31Var.e);
        l0Var.invalidate();
        if (!z10) {
            c31Var.f36178w.setAlpha(c31Var.I);
        }
        if (c31Var.I < 0.5f && !z10 && (runnable = this.f35931b) != null) {
            boolean[] zArr = this.f35932c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                c31Var.f36171a.f40663b = false;
                c31Var.P.f37305h0.invalidate();
            }
            org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14735k1, 4);
        }
        c31Var.K = null;
        l0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
