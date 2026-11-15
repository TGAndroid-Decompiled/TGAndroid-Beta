package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i11 extends AnimatorListenerAdapter {
    public final boolean f47867a;
    public final Runnable f47868b;
    public final boolean[] f47869c;
    public final boolean d;
    public final Runnable f47870e;
    public final j11 f47871f;

    public i11(j11 j11Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f47871f = j11Var;
        this.f47867a = z10;
        this.f47868b = runnable;
        this.f47869c = zArr;
        this.d = z11;
        this.f47870e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        Runnable runnable;
        j11 j11Var = this.f47871f;
        k0 k0Var = j11Var.f48178s;
        boolean z10 = this.f47867a;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        j11Var.J = f10;
        org.telegram.messenger.g0.X1(j11Var.f48173c, j11Var.d, f10, j11Var.f48174e);
        k0Var.invalidate();
        if (!z10) {
            j11Var.f48179w.setAlpha(j11Var.J);
        }
        if (j11Var.J < 0.5f && !z10 && (runnable = this.f47868b) != null) {
            boolean[] zArr = this.f47869c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                j11Var.f48171a.f53054b = false;
                j11Var.Q.f49385i0.invalidate();
            }
            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25523k1, 4);
        }
        j11Var.L = null;
        k0Var.invalidate();
        Runnable runnable2 = this.f47870e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
