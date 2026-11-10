package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o11 extends AnimatorListenerAdapter {
    public final boolean f48361a;
    public final Runnable f48362b;
    public final boolean[] f48363c;
    public final boolean d;
    public final Runnable f48364e;
    public final p11 f48365f;

    public o11(p11 p11Var, boolean z9, Runnable runnable, boolean[] zArr, boolean z10, Runnable runnable2) {
        this.f48365f = p11Var;
        this.f48361a = z9;
        this.f48362b = runnable;
        this.f48363c = zArr;
        this.d = z10;
        this.f48364e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        Runnable runnable;
        p11 p11Var = this.f48365f;
        k0 k0Var = p11Var.f48624s;
        boolean z9 = this.f48361a;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        p11Var.I = f10;
        org.telegram.messenger.g0.X1(p11Var.f48619c, p11Var.d, f10, p11Var.f48620e);
        k0Var.invalidate();
        if (!z9) {
            p11Var.f48625w.setAlpha(p11Var.I);
        }
        if (p11Var.I < 0.5f && !z9 && (runnable = this.f48362b) != null) {
            boolean[] zArr = this.f48363c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z9) {
            if (this.d) {
                p11Var.f48617a.f44872b = false;
                p11Var.P.f50036h0.invalidate();
            }
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25030k1, 4);
        }
        p11Var.K = null;
        k0Var.invalidate();
        Runnable runnable2 = this.f48364e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
