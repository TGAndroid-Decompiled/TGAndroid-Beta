package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m11 extends AnimatorListenerAdapter {
    public final boolean f49709a;
    public final Runnable f49710b;
    public final boolean[] f49711c;
    public final boolean d;
    public final Runnable f49712e;
    public final n11 f49713f;

    public m11(n11 n11Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f49713f = n11Var;
        this.f49709a = z10;
        this.f49710b = runnable;
        this.f49711c = zArr;
        this.d = z11;
        this.f49712e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        Runnable runnable;
        n11 n11Var = this.f49713f;
        k0 k0Var = n11Var.f50054s;
        boolean z10 = this.f49709a;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        n11Var.J = f10;
        org.telegram.messenger.g0.X1(n11Var.f50049c, n11Var.d, f10, n11Var.f50050e);
        k0Var.invalidate();
        if (!z10) {
            n11Var.f50055w.setAlpha(n11Var.J);
        }
        if (n11Var.J < 0.5f && !z10 && (runnable = this.f49710b) != null) {
            boolean[] zArr = this.f49711c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                n11Var.f50047a.f45696b = false;
                n11Var.Q.f51422i0.invalidate();
            }
            org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25298k1, 4);
        }
        n11Var.L = null;
        k0Var.invalidate();
        Runnable runnable2 = this.f49712e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
