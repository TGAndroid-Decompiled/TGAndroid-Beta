package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i11 extends AnimatorListenerAdapter {
    public final boolean f47877a;
    public final Runnable f47878b;
    public final boolean[] f47879c;
    public final boolean d;
    public final Runnable f47880e;
    public final j11 f47881f;

    public i11(j11 j11Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f47881f = j11Var;
        this.f47877a = z10;
        this.f47878b = runnable;
        this.f47879c = zArr;
        this.d = z11;
        this.f47880e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        Runnable runnable;
        j11 j11Var = this.f47881f;
        k0 k0Var = j11Var.f48193s;
        boolean z10 = this.f47877a;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        j11Var.J = f10;
        org.telegram.messenger.g0.X1(j11Var.f48188c, j11Var.d, f10, j11Var.f48189e);
        k0Var.invalidate();
        if (!z10) {
            j11Var.f48194w.setAlpha(j11Var.J);
        }
        if (j11Var.J < 0.5f && !z10 && (runnable = this.f47878b) != null) {
            boolean[] zArr = this.f47879c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                j11Var.f48186a.f53055b = false;
                j11Var.Q.f49386i0.invalidate();
            }
            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25522k1, 4);
        }
        j11Var.L = null;
        k0Var.invalidate();
        Runnable runnable2 = this.f47880e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
