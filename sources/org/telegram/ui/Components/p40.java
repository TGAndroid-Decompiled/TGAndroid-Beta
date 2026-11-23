package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
public final class p40 implements Runnable {
    public final int f38382a;
    public final r40 f38383b;

    public p40(r40 r40Var, int i7) {
        this.f38382a = i7;
        this.f38383b = r40Var;
    }

    @Override
    public final void run() {
        org.telegram.messenger.d20 d20Var;
        int i7 = this.f38382a;
        r40 r40Var = this.f38383b;
        switch (i7) {
            case 0:
                r40Var.I0.s(false, false);
                return;
            case 1:
                z40 z40Var = r40Var.I0;
                org.telegram.messenger.d20 d20Var2 = new org.telegram.messenger.d20();
                z40Var.S = d20Var2;
                d20Var2.f23605s = true;
                d20Var2.f23587a = -1L;
                d20Var2.f23589b = -1L;
                d20Var2.f23608w = z40Var.M;
                d20Var2.f23609x = z40Var.N;
                d20Var2.f23610y = z40Var.O;
                d20Var2.f23611z = z40Var.P;
                d20Var2.f23603q = Math.max(1L, z40Var.Q);
                org.telegram.messenger.d20 d20Var3 = z40Var.S;
                d20Var3.f23600n = 25;
                d20Var3.h = 360;
                d20Var3.f23597k = 360;
                d20Var3.f23595i = 360;
                d20Var3.f23598l = 360;
                d20Var3.f23601o = z40Var.f42671g0.getAbsolutePath();
                r40Var.h(z40Var.f42671g0);
                z40Var.S.f23604r = z40Var.f42679k0;
                org.telegram.messenger.ks.f(z40Var.f42665e).k(162, Integer.valueOf(z40Var.V), z40Var.S, z40Var.f42671g0.getAbsolutePath(), r40Var.B0);
                return;
            case 2:
                if (r40Var.H0 && (d20Var = r40Var.I0.S) != null) {
                    d20Var.P = false;
                }
                r40Var.c(r40Var.f39180a, 0L, true);
                MediaController.B().Y(false);
                return;
            case 3:
                r40Var.I0.f42676i1 = null;
                return;
            case 4:
                r40Var.I0.f42688r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                r40Var.I0.f42688r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
