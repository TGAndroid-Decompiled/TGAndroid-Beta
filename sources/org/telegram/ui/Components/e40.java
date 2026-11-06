package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
public final class e40 implements Runnable {
    public final int f33133a;
    public final g40 f33134b;

    public e40(g40 g40Var, int i7) {
        this.f33133a = i7;
        this.f33134b = g40Var;
    }

    @Override
    public final void run() {
        org.telegram.messenger.j20 j20Var;
        int i7 = this.f33133a;
        g40 g40Var = this.f33134b;
        switch (i7) {
            case 0:
                g40Var.H0.r(false, false);
                return;
            case 1:
                o40 o40Var = g40Var.H0;
                org.telegram.messenger.j20 j20Var2 = new org.telegram.messenger.j20();
                o40Var.R = j20Var2;
                j20Var2.f23461s = true;
                j20Var2.f23443a = -1L;
                j20Var2.f23445b = -1L;
                j20Var2.f23464w = o40Var.L;
                j20Var2.f23465x = o40Var.M;
                j20Var2.f23466y = o40Var.N;
                j20Var2.f23467z = o40Var.O;
                j20Var2.f23459q = Math.max(1L, o40Var.P);
                org.telegram.messenger.j20 j20Var3 = o40Var.R;
                j20Var3.f23456n = 25;
                j20Var3.h = 360;
                j20Var3.f23453k = 360;
                j20Var3.f23451i = 360;
                j20Var3.f23454l = 360;
                j20Var3.f23457o = o40Var.f36600f0.getAbsolutePath();
                g40Var.h(o40Var.f36600f0);
                o40Var.R.f23460r = o40Var.f36608j0;
                org.telegram.messenger.qs.f(o40Var.f36596e).k(162, Integer.valueOf(o40Var.U), o40Var.R, o40Var.f36600f0.getAbsolutePath(), g40Var.A0);
                return;
            case 2:
                if (g40Var.G0 && (j20Var = g40Var.H0.R) != null) {
                    j20Var.P = false;
                }
                g40Var.c(g40Var.f33817a, 0L, true);
                MediaController.B().Y(false);
                return;
            case 3:
                g40Var.H0.f36605h1 = null;
                return;
            case 4:
                g40Var.H0.f36617q0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                g40Var.H0.f36617q0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
