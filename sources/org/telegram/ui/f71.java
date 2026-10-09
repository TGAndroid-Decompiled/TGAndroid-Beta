package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class f71 extends AnimatorListenerAdapter {
    public final boolean f37472a;
    public final Runnable f37473b;
    public final boolean[] f37474c;
    public final boolean d;
    public final Runnable f37475e;
    public final g71 f37476f;

    public f71(g71 g71Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f37476f = g71Var;
        this.f37472a = z10;
        this.f37473b = runnable;
        this.f37474c = zArr;
        this.d = z11;
        this.f37475e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        g71 g71Var = this.f37476f;
        k0 k0Var = g71Var.f37909s;
        boolean z10 = this.f37472a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        g71Var.I = f7;
        AndroidUtilities.lerp(g71Var.f37904c, g71Var.d, f7, g71Var.f37905e);
        k0Var.invalidate();
        if (!z10) {
            g71Var.v.setAlpha(g71Var.I);
        }
        if (g71Var.I < 0.5f && !z10 && (runnable = this.f37473b) != null) {
            boolean[] zArr = this.f37474c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                g71Var.f37902a.f41871b = false;
                g71Var.P.f39132h0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        g71Var.K = null;
        k0Var.invalidate();
        Runnable runnable2 = this.f37475e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
