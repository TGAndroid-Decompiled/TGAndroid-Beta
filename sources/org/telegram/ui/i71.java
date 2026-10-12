package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class i71 extends AnimatorListenerAdapter {
    public final boolean f38791a;
    public final Runnable f38792b;
    public final boolean[] f38793c;
    public final boolean d;
    public final Runnable f38794e;
    public final j71 f38795f;

    public i71(j71 j71Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f38795f = j71Var;
        this.f38791a = z10;
        this.f38792b = runnable;
        this.f38793c = zArr;
        this.d = z11;
        this.f38794e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        j71 j71Var = this.f38795f;
        k0 k0Var = j71Var.f39120s;
        boolean z10 = this.f38791a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        j71Var.I = f7;
        AndroidUtilities.lerp(j71Var.f39115c, j71Var.d, f7, j71Var.f39116e);
        k0Var.invalidate();
        if (!z10) {
            j71Var.v.setAlpha(j71Var.I);
        }
        if (j71Var.I < 0.5f && !z10 && (runnable = this.f38792b) != null) {
            boolean[] zArr = this.f38793c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                j71Var.f39113a.f43053b = false;
                j71Var.P.f40272h0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        j71Var.K = null;
        k0Var.invalidate();
        Runnable runnable2 = this.f38794e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
