package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class e71 extends AnimatorListenerAdapter {
    public final boolean f33275a;
    public final Runnable f33276b;
    public final boolean[] f33277c;
    public final boolean d;
    public final Runnable e;
    public final f71 f33278f;

    public e71(f71 f71Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f33278f = f71Var;
        this.f33275a = z10;
        this.f33276b = runnable;
        this.f33277c = zArr;
        this.d = z11;
        this.e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        f71 f71Var = this.f33278f;
        j0 j0Var = f71Var.f33527s;
        boolean z10 = this.f33275a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        f71Var.I = f7;
        AndroidUtilities.lerp(f71Var.f33523c, f71Var.d, f7, f71Var.e);
        j0Var.invalidate();
        if (!z10) {
            f71Var.v.setAlpha(f71Var.I);
        }
        if (f71Var.I < 0.5f && !z10 && (runnable = this.f33276b) != null) {
            boolean[] zArr = this.f33277c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                f71Var.f33521a.f37307b = false;
                f71Var.P.f34792h0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        f71Var.K = null;
        j0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
