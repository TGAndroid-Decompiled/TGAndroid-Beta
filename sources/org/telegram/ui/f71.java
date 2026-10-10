package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class f71 extends AnimatorListenerAdapter {
    public final boolean f37516a;
    public final Runnable f37517b;
    public final boolean[] f37518c;
    public final boolean d;
    public final Runnable f37519e;
    public final g71 f37520f;

    public f71(g71 g71Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f37520f = g71Var;
        this.f37516a = z10;
        this.f37517b = runnable;
        this.f37518c = zArr;
        this.d = z11;
        this.f37519e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        g71 g71Var = this.f37520f;
        k0 k0Var = g71Var.f37953s;
        boolean z10 = this.f37516a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        g71Var.I = f7;
        AndroidUtilities.lerp(g71Var.f37948c, g71Var.d, f7, g71Var.f37949e);
        k0Var.invalidate();
        if (!z10) {
            g71Var.v.setAlpha(g71Var.I);
        }
        if (g71Var.I < 0.5f && !z10 && (runnable = this.f37517b) != null) {
            boolean[] zArr = this.f37518c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                g71Var.f37946a.f41915b = false;
                g71Var.P.f39176h0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        g71Var.K = null;
        k0Var.invalidate();
        Runnable runnable2 = this.f37519e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
