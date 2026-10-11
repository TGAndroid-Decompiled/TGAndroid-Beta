package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class e71 extends AnimatorListenerAdapter {
    public final boolean f37225a;
    public final Runnable f37226b;
    public final boolean[] f37227c;
    public final boolean d;
    public final Runnable f37228e;
    public final f71 f37229f;

    public e71(f71 f71Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f37229f = f71Var;
        this.f37225a = z10;
        this.f37226b = runnable;
        this.f37227c = zArr;
        this.d = z11;
        this.f37228e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        f71 f71Var = this.f37229f;
        j0 j0Var = f71Var.f37571s;
        boolean z10 = this.f37225a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        f71Var.I = f7;
        AndroidUtilities.lerp(f71Var.f37566c, f71Var.d, f7, f71Var.f37567e);
        j0Var.invalidate();
        if (!z10) {
            f71Var.v.setAlpha(f71Var.I);
        }
        if (f71Var.I < 0.5f && !z10 && (runnable = this.f37226b) != null) {
            boolean[] zArr = this.f37227c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                f71Var.f37564a.f41601b = false;
                f71Var.P.f38894h0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        f71Var.K = null;
        j0Var.invalidate();
        Runnable runnable2 = this.f37228e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
