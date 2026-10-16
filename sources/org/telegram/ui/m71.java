package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class m71 extends AnimatorListenerAdapter {
    public final boolean f37926a;
    public final Runnable f37927b;
    public final boolean[] f37928c;
    public final boolean d;
    public final Runnable e;
    public final n71 f37929f;

    public m71(n71 n71Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f37929f = n71Var;
        this.f37926a = z10;
        this.f37927b = runnable;
        this.f37928c = zArr;
        this.d = z11;
        this.e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        n71 n71Var = this.f37929f;
        l0 l0Var = n71Var.f38276s;
        boolean z10 = this.f37926a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        n71Var.I = f7;
        AndroidUtilities.lerp(n71Var.f38272c, n71Var.d, f7, n71Var.e);
        l0Var.invalidate();
        if (!z10) {
            n71Var.v.setAlpha(n71Var.I);
        }
        if (n71Var.I < 0.5f && !z10 && (runnable = this.f37927b) != null) {
            boolean[] zArr = this.f37928c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                n71Var.f38270a.f33767b = false;
                n71Var.P.f39330h0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        n71Var.K = null;
        l0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
