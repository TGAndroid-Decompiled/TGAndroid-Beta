package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class k61 extends AnimatorListenerAdapter {
    public final boolean f35581a;
    public final Runnable f35582b;
    public final boolean[] f35583c;
    public final boolean d;
    public final Runnable e;
    public final m61 f35584f;

    public k61(m61 m61Var, boolean z4, Runnable runnable, boolean[] zArr, boolean z10, Runnable runnable2) {
        this.f35584f = m61Var;
        this.f35581a = z4;
        this.f35582b = runnable;
        this.f35583c = zArr;
        this.d = z10;
        this.e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        Runnable runnable;
        m61 m61Var = this.f35584f;
        l0 l0Var = m61Var.f36208s;
        boolean z4 = this.f35581a;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        m61Var.F = f10;
        AndroidUtilities.lerp(m61Var.f36204c, m61Var.d, f10, m61Var.e);
        l0Var.invalidate();
        if (!z4) {
            m61Var.v.setAlpha(m61Var.F);
        }
        if (m61Var.F < 0.5f && !z4 && (runnable = this.f35582b) != null) {
            boolean[] zArr = this.f35583c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z4) {
            if (this.d) {
                m61Var.f36202a.f40400b = false;
                m61Var.M.f37605e0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        m61Var.H = null;
        l0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
