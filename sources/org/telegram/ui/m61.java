package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class m61 extends AnimatorListenerAdapter {
    public final boolean f38975a;
    public final Runnable f38976b;
    public final boolean[] f38977c;
    public final boolean d;
    public final Runnable f38978e;
    public final n61 f38979f;

    public m61(n61 n61Var, boolean z4, Runnable runnable, boolean[] zArr, boolean z10, Runnable runnable2) {
        this.f38979f = n61Var;
        this.f38975a = z4;
        this.f38976b = runnable;
        this.f38977c = zArr;
        this.d = z10;
        this.f38978e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        Runnable runnable;
        n61 n61Var = this.f38979f;
        l0 l0Var = n61Var.f39325s;
        boolean z4 = this.f38975a;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        n61Var.F = f10;
        AndroidUtilities.lerp(n61Var.f39320c, n61Var.d, f10, n61Var.f39321e);
        l0Var.invalidate();
        if (!z4) {
            n61Var.v.setAlpha(n61Var.F);
        }
        if (n61Var.F < 0.5f && !z4 && (runnable = this.f38976b) != null) {
            boolean[] zArr = this.f38977c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z4) {
            if (this.d) {
                n61Var.f39318a.f35038b = false;
                n61Var.M.f40791e0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        n61Var.H = null;
        l0Var.invalidate();
        Runnable runnable2 = this.f38978e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
