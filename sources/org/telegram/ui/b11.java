package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b11 extends AnimatorListenerAdapter {
    public final boolean f43885a;
    public final Runnable f43886b;
    public final boolean[] f43887c;
    public final boolean d;
    public final Runnable f43888e;
    public final c11 f43889f;

    public b11(c11 c11Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f43889f = c11Var;
        this.f43885a = z10;
        this.f43886b = runnable;
        this.f43887c = zArr;
        this.d = z11;
        this.f43888e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        Runnable runnable;
        c11 c11Var = this.f43889f;
        l0 l0Var = c11Var.f44197s;
        boolean z10 = this.f43885a;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        c11Var.J = f10;
        org.telegram.messenger.g0.X1(c11Var.f44192c, c11Var.d, f10, c11Var.f44193e);
        l0Var.invalidate();
        if (!z10) {
            c11Var.f44198w.setAlpha(c11Var.J);
        }
        if (c11Var.J < 0.5f && !z10 && (runnable = this.f43886b) != null) {
            boolean[] zArr = this.f43887c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                c11Var.f44190a.f48718b = false;
                c11Var.Q.f45456i0.invalidate();
            }
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.k1, 4);
        }
        c11Var.L = null;
        l0Var.invalidate();
        Runnable runnable2 = this.f43888e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
