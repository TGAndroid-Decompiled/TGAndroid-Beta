package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class m71 extends AnimatorListenerAdapter {
    public final boolean f38180a;
    public final Runnable f38181b;
    public final boolean[] f38182c;
    public final boolean d;
    public final Runnable e;
    public final n71 f38183f;

    public m71(n71 n71Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f38183f = n71Var;
        this.f38180a = z10;
        this.f38181b = runnable;
        this.f38182c = zArr;
        this.d = z11;
        this.e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        n71 n71Var = this.f38183f;
        l0 l0Var = n71Var.f38561s;
        boolean z10 = this.f38180a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        n71Var.I = f7;
        AndroidUtilities.lerp(n71Var.f38557c, n71Var.d, f7, n71Var.e);
        l0Var.invalidate();
        if (!z10) {
            n71Var.v.setAlpha(n71Var.I);
        }
        if (n71Var.I < 0.5f && !z10 && (runnable = this.f38181b) != null) {
            boolean[] zArr = this.f38182c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                n71Var.f38555a.f34064b = false;
                n71Var.P.f39637h0.invalidate();
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
