package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n11 extends AnimatorListenerAdapter {
    public final boolean f50067a;
    public final Runnable f50068b;
    public final boolean[] f50069c;
    public final boolean d;
    public final Runnable f50070e;
    public final o11 f50071f;

    public n11(o11 o11Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f50071f = o11Var;
        this.f50067a = z10;
        this.f50068b = runnable;
        this.f50069c = zArr;
        this.d = z11;
        this.f50070e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        Runnable runnable;
        o11 o11Var = this.f50071f;
        k0 k0Var = o11Var.f50405s;
        boolean z10 = this.f50067a;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        o11Var.J = f10;
        org.telegram.messenger.g0.X1(o11Var.f50400c, o11Var.d, f10, o11Var.f50401e);
        k0Var.invalidate();
        if (!z10) {
            o11Var.f50406w.setAlpha(o11Var.J);
        }
        if (o11Var.J < 0.5f && !z10 && (runnable = this.f50068b) != null) {
            boolean[] zArr = this.f50069c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                o11Var.f50398a.f46382b = false;
                o11Var.Q.f51844i0.invalidate();
            }
            org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25334k1, 4);
        }
        o11Var.L = null;
        k0Var.invalidate();
        Runnable runnable2 = this.f50070e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
