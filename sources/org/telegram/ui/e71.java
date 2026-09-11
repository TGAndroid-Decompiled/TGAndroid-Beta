package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class e71 extends AnimatorListenerAdapter {
    public final boolean f35957a;
    public final Runnable f35958b;
    public final boolean[] f35959c;
    public final boolean d;
    public final Runnable f35960e;
    public final f71 f35961f;

    public e71(f71 f71Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f35961f = f71Var;
        this.f35957a = z10;
        this.f35958b = runnable;
        this.f35959c = zArr;
        this.d = z11;
        this.f35960e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        f71 f71Var = this.f35961f;
        j0 j0Var = f71Var.f36316s;
        boolean z10 = this.f35957a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        f71Var.I = f7;
        AndroidUtilities.lerp(f71Var.f36311c, f71Var.d, f7, f71Var.f36312e);
        j0Var.invalidate();
        if (!z10) {
            f71Var.v.setAlpha(f71Var.I);
        }
        if (f71Var.I < 0.5f && !z10 && (runnable = this.f35958b) != null) {
            boolean[] zArr = this.f35959c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                f71Var.f36309a.f40316b = false;
                f71Var.P.f37646h0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        f71Var.K = null;
        j0Var.invalidate();
        Runnable runnable2 = this.f35960e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
