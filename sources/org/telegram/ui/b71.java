package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class b71 extends AnimatorListenerAdapter {
    public final boolean f32071a;
    public final Runnable f32072b;
    public final boolean[] f32073c;
    public final boolean d;
    public final Runnable e;
    public final c71 f32074f;

    public b71(c71 c71Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f32074f = c71Var;
        this.f32071a = z10;
        this.f32072b = runnable;
        this.f32073c = zArr;
        this.d = z11;
        this.e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        c71 c71Var = this.f32074f;
        j0 j0Var = c71Var.f32704s;
        boolean z10 = this.f32071a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        c71Var.I = f7;
        AndroidUtilities.lerp(c71Var.f32700c, c71Var.d, f7, c71Var.e);
        j0Var.invalidate();
        if (!z10) {
            c71Var.v.setAlpha(c71Var.I);
        }
        if (c71Var.I < 0.5f && !z10 && (runnable = this.f32072b) != null) {
            boolean[] zArr = this.f32073c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                c71Var.f32698a.f36445b = false;
                c71Var.P.f33796h0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        c71Var.K = null;
        j0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
