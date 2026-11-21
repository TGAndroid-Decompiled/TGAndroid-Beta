package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n11 extends AnimatorListenerAdapter {
    public final boolean f50063a;
    public final Runnable f50064b;
    public final boolean[] f50065c;
    public final boolean d;
    public final Runnable f50066e;
    public final o11 f50067f;

    public n11(o11 o11Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f50067f = o11Var;
        this.f50063a = z10;
        this.f50064b = runnable;
        this.f50065c = zArr;
        this.d = z11;
        this.f50066e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        Runnable runnable;
        o11 o11Var = this.f50067f;
        k0 k0Var = o11Var.f50401s;
        boolean z10 = this.f50063a;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        o11Var.J = f10;
        org.telegram.messenger.g0.X1(o11Var.f50396c, o11Var.d, f10, o11Var.f50397e);
        k0Var.invalidate();
        if (!z10) {
            o11Var.f50402w.setAlpha(o11Var.J);
        }
        if (o11Var.J < 0.5f && !z10 && (runnable = this.f50064b) != null) {
            boolean[] zArr = this.f50065c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                o11Var.f50394a.f46379b = false;
                o11Var.Q.f51840i0.invalidate();
            }
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25168k1, 4);
        }
        o11Var.L = null;
        k0Var.invalidate();
        Runnable runnable2 = this.f50066e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
