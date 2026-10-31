package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d31 extends AnimatorListenerAdapter {
    public final boolean f36605a;
    public final Runnable f36606b;
    public final boolean[] f36607c;
    public final boolean d;
    public final Runnable e;
    public final e31 f36608f;

    public d31(e31 e31Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f36608f = e31Var;
        this.f36605a = z10;
        this.f36606b = runnable;
        this.f36607c = zArr;
        this.d = z11;
        this.e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        e31 e31Var = this.f36608f;
        l0 l0Var = e31Var.f36909s;
        boolean z10 = this.f36605a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e31Var.I = f7;
        org.telegram.messenger.i0.X1(e31Var.f36905c, e31Var.d, f7, e31Var.e);
        l0Var.invalidate();
        if (!z10) {
            e31Var.f36910w.setAlpha(e31Var.I);
        }
        if (e31Var.I < 0.5f && !z10 && (runnable = this.f36606b) != null) {
            boolean[] zArr = this.f36607c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                e31Var.f36903a.f41357b = false;
                e31Var.P.f38129h0.invalidate();
            }
            org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19639k1, 4);
        }
        e31Var.K = null;
        l0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
