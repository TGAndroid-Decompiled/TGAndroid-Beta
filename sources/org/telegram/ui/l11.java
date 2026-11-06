package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l11 extends AnimatorListenerAdapter {
    public final boolean f47383a;
    public final Runnable f47384b;
    public final boolean[] f47385c;
    public final boolean d;
    public final Runnable f47386e;
    public final m11 f47387f;

    public l11(m11 m11Var, boolean z9, Runnable runnable, boolean[] zArr, boolean z10, Runnable runnable2) {
        this.f47387f = m11Var;
        this.f47383a = z9;
        this.f47384b = runnable;
        this.f47385c = zArr;
        this.d = z10;
        this.f47386e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        Runnable runnable;
        m11 m11Var = this.f47387f;
        k0 k0Var = m11Var.f47629s;
        boolean z9 = this.f47383a;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        m11Var.I = f10;
        org.telegram.messenger.g0.X1(m11Var.f47624c, m11Var.d, f10, m11Var.f47625e);
        k0Var.invalidate();
        if (!z9) {
            m11Var.f47630w.setAlpha(m11Var.I);
        }
        if (m11Var.I < 0.5f && !z9 && (runnable = this.f47384b) != null) {
            boolean[] zArr = this.f47385c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z9) {
            if (this.d) {
                m11Var.f47622a.f43531b = false;
                m11Var.P.f49035h0.invalidate();
            }
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25009k1, 4);
        }
        m11Var.K = null;
        k0Var.invalidate();
        Runnable runnable2 = this.f47386e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
