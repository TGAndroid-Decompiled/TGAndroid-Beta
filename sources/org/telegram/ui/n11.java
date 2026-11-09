package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n11 extends AnimatorListenerAdapter {
    public final boolean f48056a;
    public final Runnable f48057b;
    public final boolean[] f48058c;
    public final boolean d;
    public final Runnable f48059e;
    public final o11 f48060f;

    public n11(o11 o11Var, boolean z9, Runnable runnable, boolean[] zArr, boolean z10, Runnable runnable2) {
        this.f48060f = o11Var;
        this.f48056a = z9;
        this.f48057b = runnable;
        this.f48058c = zArr;
        this.d = z10;
        this.f48059e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        Runnable runnable;
        o11 o11Var = this.f48060f;
        k0 k0Var = o11Var.f48289s;
        boolean z9 = this.f48056a;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        o11Var.I = f10;
        org.telegram.messenger.g0.X1(o11Var.f48284c, o11Var.d, f10, o11Var.f48285e);
        k0Var.invalidate();
        if (!z9) {
            o11Var.f48290w.setAlpha(o11Var.I);
        }
        if (o11Var.I < 0.5f && !z9 && (runnable = this.f48057b) != null) {
            boolean[] zArr = this.f48058c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z9) {
            if (this.d) {
                o11Var.f48282a.f44189b = false;
                o11Var.P.f49680h0.invalidate();
            }
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25026k1, 4);
        }
        o11Var.K = null;
        k0Var.invalidate();
        Runnable runnable2 = this.f48059e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
