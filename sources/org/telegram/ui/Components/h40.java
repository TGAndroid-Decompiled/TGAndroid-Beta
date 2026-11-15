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
                g20Var2.f23650s = true;
                g20Var2.f23632a = -1L;
                g20Var2.f23634b = -1L;
                g20Var2.f23653w = r40Var.M;
                g20Var2.f23654x = r40Var.N;
                g20Var2.f23655y = r40Var.O;
                g20Var2.f23656z = r40Var.P;
                g20Var2.f23648q = Math.max(1L, r40Var.Q);
                org.telegram.messenger.g20 g20Var3 = r40Var.S;
                g20Var3.f23645n = 25;
                g20Var3.h = 360;
                g20Var3.f23642k = 360;
                g20Var3.f23640i = 360;
                g20Var3.f23643l = 360;
                g20Var3.f23646o = r40Var.f38852g0.getAbsolutePath();
                j40Var.h(r40Var.f38852g0);
                r40Var.S.f23649r = r40Var.f38860k0;
                org.telegram.messenger.ns.f(r40Var.f38846e).k(162, Integer.valueOf(r40Var.V), r40Var.S, r40Var.f38852g0.getAbsolutePath(), j40Var.B0);
                return;
            case 2:
                if (j40Var.H0 && (g20Var = j40Var.I0.S) != null) {
                    g20Var.P = false;
                }
                j40Var.c(j40Var.f35852a, 0L, true);
                MediaController.B().Y(false);
                return;
            case 3:
                j40Var.I0.f38857i1 = null;
                return;
            case 4:
                j40Var.I0.f38869r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                j40Var.I0.f38869r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
