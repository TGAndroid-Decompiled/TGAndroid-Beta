package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class d71 extends AnimatorListenerAdapter {
    public final boolean f33030a;
    public final Runnable f33031b;
    public final boolean[] f33032c;
    public final boolean d;
    public final Runnable e;
    public final e71 f33033f;

    public d71(e71 e71Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f33033f = e71Var;
        this.f33030a = z10;
        this.f33031b = runnable;
        this.f33032c = zArr;
        this.d = z11;
        this.e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        e71 e71Var = this.f33033f;
        j0 j0Var = e71Var.f33317s;
        boolean z10 = this.f33030a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e71Var.I = f7;
        AndroidUtilities.lerp(e71Var.f33313c, e71Var.d, f7, e71Var.e);
        j0Var.invalidate();
        if (!z10) {
            e71Var.v.setAlpha(e71Var.I);
        }
        if (e71Var.I < 0.5f && !z10 && (runnable = this.f33031b) != null) {
            boolean[] zArr = this.f33032c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                e71Var.f33311a.f37094b = false;
                e71Var.P.f34461h0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        e71Var.K = null;
        j0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
