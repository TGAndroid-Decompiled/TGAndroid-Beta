package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class a61 extends AnimatorListenerAdapter {
    public final boolean f37699a;
    public final Runnable f37700b;
    public final boolean[] f37701c;
    public final boolean d;
    public final Runnable e;
    public final b61 f37702f;

    public a61(b61 b61Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f37702f = b61Var;
        this.f37699a = z10;
        this.f37700b = runnable;
        this.f37701c = zArr;
        this.d = z11;
        this.e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        b61 b61Var = this.f37702f;
        k0 k0Var = b61Var.f37900s;
        boolean z10 = this.f37699a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        b61Var.I = f7;
        AndroidUtilities.lerp(b61Var.f37896c, b61Var.d, f7, b61Var.e);
        k0Var.invalidate();
        if (!z10) {
            b61Var.v.setAlpha(b61Var.I);
        }
        if (b61Var.I < 0.5f && !z10 && (runnable = this.f37700b) != null) {
            boolean[] zArr = this.f37701c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                b61Var.f37894a.f41975b = false;
                b61Var.P.f39202h0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        b61Var.K = null;
        k0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
