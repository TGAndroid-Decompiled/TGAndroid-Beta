package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l11 extends AnimatorListenerAdapter {
    public final boolean f49566a;
    public final Runnable f49567b;
    public final boolean[] f49568c;
    public final boolean d;
    public final Runnable f49569e;
    public final m11 f49570f;

    public l11(m11 m11Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f49570f = m11Var;
        this.f49566a = z10;
        this.f49567b = runnable;
        this.f49568c = zArr;
        this.d = z11;
        this.f49569e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        Runnable runnable;
        m11 m11Var = this.f49570f;
        k0 k0Var = m11Var.f49931s;
        boolean z10 = this.f49566a;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        m11Var.J = f10;
        org.telegram.messenger.g0.X1(m11Var.f49926c, m11Var.d, f10, m11Var.f49927e);
        k0Var.invalidate();
        if (!z10) {
            m11Var.f49932w.setAlpha(m11Var.J);
        }
        if (m11Var.J < 0.5f && !z10 && (runnable = this.f49567b) != null) {
            boolean[] zArr = this.f49568c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                m11Var.f49924a.f45547b = false;
                m11Var.Q.f51247i0.invalidate();
            }
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25239k1, 4);
        }
        m11Var.L = null;
        k0Var.invalidate();
        Runnable runnable2 = this.f49569e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
