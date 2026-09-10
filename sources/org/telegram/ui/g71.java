package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class g71 extends AnimatorListenerAdapter {
    public final boolean f33031a;
    public final Runnable f33032b;
    public final boolean[] f33033c;
    public final boolean d;
    public final Runnable e;
    public final h71 f33034f;

    public g71(h71 h71Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f33034f = h71Var;
        this.f33031a = z10;
        this.f33032b = runnable;
        this.f33033c = zArr;
        this.d = z11;
        this.e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        h71 h71Var = this.f33034f;
        k0 k0Var = h71Var.f33296s;
        boolean z10 = this.f33031a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        h71Var.I = f7;
        AndroidUtilities.lerp(h71Var.f33292c, h71Var.d, f7, h71Var.e);
        k0Var.invalidate();
        if (!z10) {
            h71Var.v.setAlpha(h71Var.I);
        }
        if (h71Var.I < 0.5f && !z10 && (runnable = this.f33032b) != null) {
            boolean[] zArr = this.f33033c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                h71Var.f33290a.f37128b = false;
                h71Var.P.f34570h0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        h71Var.K = null;
        k0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
