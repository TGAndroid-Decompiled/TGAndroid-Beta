package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
public final class s40 implements Runnable {
    public final int f39488a;
    public final u40 f39489b;

    public s40(u40 u40Var, int i7) {
        this.f39488a = i7;
        this.f39489b = u40Var;
    }

    @Override
    public final void run() {
        org.telegram.messenger.e20 e20Var;
        int i7 = this.f39488a;
        u40 u40Var = this.f39489b;
        switch (i7) {
            case 0:
                u40Var.I0.s(false, false);
                return;
            case 1:
                c50 c50Var = u40Var.I0;
                org.telegram.messenger.e20 e20Var2 = new org.telegram.messenger.e20();
                c50Var.S = e20Var2;
                e20Var2.f23680s = true;
                e20Var2.f23662a = -1L;
                e20Var2.f23664b = -1L;
                e20Var2.f23683w = c50Var.M;
                e20Var2.f23684x = c50Var.N;
                e20Var2.f23685y = c50Var.O;
                e20Var2.f23686z = c50Var.P;
                e20Var2.f23678q = Math.max(1L, c50Var.Q);
                org.telegram.messenger.e20 e20Var3 = c50Var.S;
                e20Var3.f23675n = 25;
                e20Var3.h = 360;
                e20Var3.f23672k = 360;
                e20Var3.f23670i = 360;
                e20Var3.f23673l = 360;
                e20Var3.f23676o = c50Var.f34035g0.getAbsolutePath();
                u40Var.h(c50Var.f34035g0);
                c50Var.S.f23679r = c50Var.f34043k0;
                org.telegram.messenger.ks.f(c50Var.f34029e).k(162, Integer.valueOf(c50Var.V), c50Var.S, c50Var.f34035g0.getAbsolutePath(), u40Var.B0);
                return;
            case 2:
                if (u40Var.H0 && (e20Var = u40Var.I0.S) != null) {
                    e20Var.P = false;
                }
                u40Var.c(u40Var.f40231a, 0L, true);
                MediaController.B().Y(false);
                return;
            case 3:
                u40Var.I0.f34040i1 = null;
                return;
            case 4:
                u40Var.I0.f34052r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                u40Var.I0.f34052r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
