package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
public final class s40 implements Runnable {
    public final int f39481a;
    public final u40 f39482b;

    public s40(u40 u40Var, int i7) {
        this.f39481a = i7;
        this.f39482b = u40Var;
    }

    @Override
    public final void run() {
        org.telegram.messenger.f20 f20Var;
        int i7 = this.f39481a;
        u40 u40Var = this.f39482b;
        switch (i7) {
            case 0:
                u40Var.I0.s(false, false);
                return;
            case 1:
                c50 c50Var = u40Var.I0;
                org.telegram.messenger.f20 f20Var2 = new org.telegram.messenger.f20();
                c50Var.S = f20Var2;
                f20Var2.f23844s = true;
                f20Var2.f23826a = -1L;
                f20Var2.f23828b = -1L;
                f20Var2.f23847w = c50Var.M;
                f20Var2.f23848x = c50Var.N;
                f20Var2.f23849y = c50Var.O;
                f20Var2.f23850z = c50Var.P;
                f20Var2.f23842q = Math.max(1L, c50Var.Q);
                org.telegram.messenger.f20 f20Var3 = c50Var.S;
                f20Var3.f23839n = 25;
                f20Var3.h = 360;
                f20Var3.f23836k = 360;
                f20Var3.f23834i = 360;
                f20Var3.f23837l = 360;
                f20Var3.f23840o = c50Var.f34029g0.getAbsolutePath();
                u40Var.h(c50Var.f34029g0);
                c50Var.S.f23843r = c50Var.f34037k0;
                org.telegram.messenger.ls.f(c50Var.f34023e).k(162, Integer.valueOf(c50Var.V), c50Var.S, c50Var.f34029g0.getAbsolutePath(), u40Var.B0);
                return;
            case 2:
                if (u40Var.H0 && (f20Var = u40Var.I0.S) != null) {
                    f20Var.P = false;
                }
                u40Var.c(u40Var.f40224a, 0L, true);
                MediaController.B().Y(false);
                return;
            case 3:
                u40Var.I0.f34034i1 = null;
                return;
            case 4:
                u40Var.I0.f34046r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                u40Var.I0.f34046r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
