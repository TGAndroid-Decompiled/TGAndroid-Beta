package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class e71 extends AnimatorListenerAdapter {
    public final boolean f35985a;
    public final Runnable f35986b;
    public final boolean[] f35987c;
    public final boolean d;
    public final Runnable f35988e;
    public final f71 f35989f;

    public e71(f71 f71Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f35989f = f71Var;
        this.f35985a = z10;
        this.f35986b = runnable;
        this.f35987c = zArr;
        this.d = z11;
        this.f35988e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        f71 f71Var = this.f35989f;
        j0 j0Var = f71Var.f36344s;
        boolean z10 = this.f35985a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        f71Var.I = f7;
        AndroidUtilities.lerp(f71Var.f36339c, f71Var.d, f7, f71Var.f36340e);
        j0Var.invalidate();
        if (!z10) {
            f71Var.v.setAlpha(f71Var.I);
        }
        if (f71Var.I < 0.5f && !z10 && (runnable = this.f35986b) != null) {
            boolean[] zArr = this.f35987c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                f71Var.f36337a.f40344b = false;
                f71Var.P.f37674h0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        f71Var.K = null;
        j0Var.invalidate();
        Runnable runnable2 = this.f35988e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
