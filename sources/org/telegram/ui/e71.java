package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class e71 extends AnimatorListenerAdapter {
    public final boolean f33295a;
    public final Runnable f33296b;
    public final boolean[] f33297c;
    public final boolean d;
    public final Runnable e;
    public final f71 f33298f;

    public e71(f71 f71Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f33298f = f71Var;
        this.f33295a = z10;
        this.f33296b = runnable;
        this.f33297c = zArr;
        this.d = z11;
        this.e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        f71 f71Var = this.f33298f;
        j0 j0Var = f71Var.f33552s;
        boolean z10 = this.f33295a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        f71Var.I = f7;
        AndroidUtilities.lerp(f71Var.f33548c, f71Var.d, f7, f71Var.e);
        j0Var.invalidate();
        if (!z10) {
            f71Var.v.setAlpha(f71Var.I);
        }
        if (f71Var.I < 0.5f && !z10 && (runnable = this.f33296b) != null) {
            boolean[] zArr = this.f33297c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                f71Var.f33546a.f37329b = false;
                f71Var.P.f34817h0.invalidate();
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
