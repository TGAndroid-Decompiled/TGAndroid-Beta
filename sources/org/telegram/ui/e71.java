package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class e71 extends AnimatorListenerAdapter {
    public final boolean f37259a;
    public final Runnable f37260b;
    public final boolean[] f37261c;
    public final boolean d;
    public final Runnable f37262e;
    public final f71 f37263f;

    public e71(f71 f71Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f37263f = f71Var;
        this.f37259a = z10;
        this.f37260b = runnable;
        this.f37261c = zArr;
        this.d = z11;
        this.f37262e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        f71 f71Var = this.f37263f;
        j0 j0Var = f71Var.f37605s;
        boolean z10 = this.f37259a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        f71Var.I = f7;
        AndroidUtilities.lerp(f71Var.f37600c, f71Var.d, f7, f71Var.f37601e);
        j0Var.invalidate();
        if (!z10) {
            f71Var.v.setAlpha(f71Var.I);
        }
        if (f71Var.I < 0.5f && !z10 && (runnable = this.f37260b) != null) {
            boolean[] zArr = this.f37261c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                f71Var.f37598a.f41635b = false;
                f71Var.P.f38928h0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        f71Var.K = null;
        j0Var.invalidate();
        Runnable runnable2 = this.f37262e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
