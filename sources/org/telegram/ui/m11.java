package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m11 extends AnimatorListenerAdapter {
    public final boolean f49688a;
    public final Runnable f49689b;
    public final boolean[] f49690c;
    public final boolean d;
    public final Runnable f49691e;
    public final n11 f49692f;

    public m11(n11 n11Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f49692f = n11Var;
        this.f49688a = z10;
        this.f49689b = runnable;
        this.f49690c = zArr;
        this.d = z11;
        this.f49691e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        Runnable runnable;
        n11 n11Var = this.f49692f;
        k0 k0Var = n11Var.f50035s;
        boolean z10 = this.f49688a;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        n11Var.J = f10;
        org.telegram.messenger.g0.X1(n11Var.f50030c, n11Var.d, f10, n11Var.f50031e);
        k0Var.invalidate();
        if (!z10) {
            n11Var.f50036w.setAlpha(n11Var.J);
        }
        if (n11Var.J < 0.5f && !z10 && (runnable = this.f49689b) != null) {
            boolean[] zArr = this.f49690c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                n11Var.f50028a.f45712b = false;
                n11Var.Q.f51398i0.invalidate();
            }
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25140k1, 4);
        }
        n11Var.L = null;
        k0Var.invalidate();
        Runnable runnable2 = this.f49691e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
