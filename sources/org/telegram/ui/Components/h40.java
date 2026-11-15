package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
public final class h40 implements Runnable {
    public final int f35162a;
    public final j40 f35163b;

    public h40(j40 j40Var, int i7) {
        this.f35162a = i7;
        this.f35163b = j40Var;
    }

    @Override
    public final void run() {
        org.telegram.messenger.g20 g20Var;
        int i7 = this.f35162a;
        j40 j40Var = this.f35163b;
        switch (i7) {
            case 0:
                j40Var.I0.s(false, false);
                return;
            case 1:
                r40 r40Var = j40Var.I0;
                org.telegram.messenger.g20 g20Var2 = new org.telegram.messenger.g20();
                r40Var.S = g20Var2;
                g20Var2.f23652s = true;
                g20Var2.f23634a = -1L;
                g20Var2.f23636b = -1L;
                g20Var2.f23655w = r40Var.M;
                g20Var2.f23656x = r40Var.N;
                g20Var2.f23657y = r40Var.O;
                g20Var2.f23658z = r40Var.P;
                g20Var2.f23650q = Math.max(1L, r40Var.Q);
                org.telegram.messenger.g20 g20Var3 = r40Var.S;
                g20Var3.f23647n = 25;
                g20Var3.h = 360;
                g20Var3.f23644k = 360;
                g20Var3.f23642i = 360;
                g20Var3.f23645l = 360;
                g20Var3.f23648o = r40Var.f38850g0.getAbsolutePath();
                j40Var.h(r40Var.f38850g0);
                r40Var.S.f23651r = r40Var.f38858k0;
                org.telegram.messenger.ns.f(r40Var.f38844e).k(162, Integer.valueOf(r40Var.V), r40Var.S, r40Var.f38850g0.getAbsolutePath(), j40Var.B0);
                return;
            case 2:
                if (j40Var.H0 && (g20Var = j40Var.I0.S) != null) {
                    g20Var.P = false;
                }
                j40Var.c(j40Var.f35839a, 0L, true);
                MediaController.B().Y(false);
                return;
            case 3:
                j40Var.I0.f38855i1 = null;
                return;
            case 4:
                j40Var.I0.f38867r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                j40Var.I0.f38867r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
