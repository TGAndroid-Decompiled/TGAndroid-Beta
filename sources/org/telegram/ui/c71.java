package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class c71 extends AnimatorListenerAdapter {
    public final boolean f32700a;
    public final Runnable f32701b;
    public final boolean[] f32702c;
    public final boolean d;
    public final Runnable e;
    public final d71 f32703f;

    public c71(d71 d71Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f32703f = d71Var;
        this.f32700a = z10;
        this.f32701b = runnable;
        this.f32702c = zArr;
        this.d = z11;
        this.e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        d71 d71Var = this.f32703f;
        j0 j0Var = d71Var.f32961s;
        boolean z10 = this.f32700a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        d71Var.I = f7;
        AndroidUtilities.lerp(d71Var.f32957c, d71Var.d, f7, d71Var.e);
        j0Var.invalidate();
        if (!z10) {
            d71Var.v.setAlpha(d71Var.I);
        }
        if (d71Var.I < 0.5f && !z10 && (runnable = this.f32701b) != null) {
            boolean[] zArr = this.f32702c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                d71Var.f32955a.f36769b = false;
                d71Var.P.f34132h0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        d71Var.K = null;
        j0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
