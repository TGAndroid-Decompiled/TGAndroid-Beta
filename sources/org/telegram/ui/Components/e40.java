package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
public final class e40 implements Runnable {
    public final int f33157a;
    public final g40 f33158b;

    public e40(g40 g40Var, int i7) {
        this.f33157a = i7;
        this.f33158b = g40Var;
    }

    @Override
    public final void run() {
        org.telegram.messenger.j20 j20Var;
        int i7 = this.f33157a;
        g40 g40Var = this.f33158b;
        switch (i7) {
            case 0:
                g40Var.H0.s(false, false);
                return;
            case 1:
                o40 o40Var = g40Var.H0;
                org.telegram.messenger.j20 j20Var2 = new org.telegram.messenger.j20();
                o40Var.R = j20Var2;
                j20Var2.f23493s = true;
                j20Var2.f23475a = -1L;
                j20Var2.f23477b = -1L;
                j20Var2.f23496w = o40Var.L;
                j20Var2.f23497x = o40Var.M;
                j20Var2.f23498y = o40Var.N;
                j20Var2.f23499z = o40Var.O;
                j20Var2.f23491q = Math.max(1L, o40Var.P);
                org.telegram.messenger.j20 j20Var3 = o40Var.R;
                j20Var3.f23488n = 25;
                j20Var3.h = 360;
                j20Var3.f23485k = 360;
                j20Var3.f23483i = 360;
                j20Var3.f23486l = 360;
                j20Var3.f23489o = o40Var.f36486f0.getAbsolutePath();
                g40Var.h(o40Var.f36486f0);
                o40Var.R.f23492r = o40Var.f36494j0;
                org.telegram.messenger.qs.f(o40Var.f36482e).k(162, Integer.valueOf(o40Var.U), o40Var.R, o40Var.f36486f0.getAbsolutePath(), g40Var.A0);
                return;
            case 2:
                if (g40Var.G0 && (j20Var = g40Var.H0.R) != null) {
                    j20Var.P = false;
                }
                g40Var.c(g40Var.f33762a, 0L, true);
                MediaController.B().Y(false);
                return;
            case 3:
                g40Var.H0.f36491h1 = null;
                return;
            case 4:
                g40Var.H0.f36503q0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                g40Var.H0.f36503q0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
