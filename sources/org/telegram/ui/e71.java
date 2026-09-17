package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class e71 extends AnimatorListenerAdapter {
    public final boolean f35958a;
    public final Runnable f35959b;
    public final boolean[] f35960c;
    public final boolean d;
    public final Runnable f35961e;
    public final f71 f35962f;

    public e71(f71 f71Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f35962f = f71Var;
        this.f35958a = z10;
        this.f35959b = runnable;
        this.f35960c = zArr;
        this.d = z11;
        this.f35961e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        f71 f71Var = this.f35962f;
        j0 j0Var = f71Var.f36317s;
        boolean z10 = this.f35958a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        f71Var.I = f7;
        AndroidUtilities.lerp(f71Var.f36312c, f71Var.d, f7, f71Var.f36313e);
        j0Var.invalidate();
        if (!z10) {
            f71Var.v.setAlpha(f71Var.I);
        }
        if (f71Var.I < 0.5f && !z10 && (runnable = this.f35959b) != null) {
            boolean[] zArr = this.f35960c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                f71Var.f36310a.f40317b = false;
                f71Var.P.f37647h0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        f71Var.K = null;
        j0Var.invalidate();
        Runnable runnable2 = this.f35961e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
