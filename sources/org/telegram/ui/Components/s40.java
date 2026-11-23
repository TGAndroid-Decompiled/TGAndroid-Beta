package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
public final class s40 implements Runnable {
    public final int f39436a;
    public final u40 f39437b;

    public s40(u40 u40Var, int i7) {
        this.f39436a = i7;
        this.f39437b = u40Var;
    }

    @Override
    public final void run() {
        org.telegram.messenger.f20 f20Var;
        int i7 = this.f39436a;
        u40 u40Var = this.f39437b;
        switch (i7) {
            case 0:
                u40Var.I0.s(false, false);
                return;
            case 1:
                c50 c50Var = u40Var.I0;
                org.telegram.messenger.f20 f20Var2 = new org.telegram.messenger.f20();
                c50Var.S = f20Var2;
                f20Var2.f23808s = true;
                f20Var2.f23790a = -1L;
                f20Var2.f23792b = -1L;
                f20Var2.f23811w = c50Var.M;
                f20Var2.f23812x = c50Var.N;
                f20Var2.f23813y = c50Var.O;
                f20Var2.f23814z = c50Var.P;
                f20Var2.f23806q = Math.max(1L, c50Var.Q);
                org.telegram.messenger.f20 f20Var3 = c50Var.S;
                f20Var3.f23803n = 25;
                f20Var3.h = 360;
                f20Var3.f23800k = 360;
                f20Var3.f23798i = 360;
                f20Var3.f23801l = 360;
                f20Var3.f23804o = c50Var.f33993g0.getAbsolutePath();
                u40Var.h(c50Var.f33993g0);
                c50Var.S.f23807r = c50Var.f34001k0;
                org.telegram.messenger.ls.f(c50Var.f33987e).k(162, Integer.valueOf(c50Var.V), c50Var.S, c50Var.f33993g0.getAbsolutePath(), u40Var.B0);
                return;
            case 2:
                if (u40Var.H0 && (f20Var = u40Var.I0.S) != null) {
                    f20Var.P = false;
                }
                u40Var.c(u40Var.f40206a, 0L, true);
                MediaController.B().Y(false);
                return;
            case 3:
                u40Var.I0.f33998i1 = null;
                return;
            case 4:
                u40Var.I0.f34010r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                u40Var.I0.f34010r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
