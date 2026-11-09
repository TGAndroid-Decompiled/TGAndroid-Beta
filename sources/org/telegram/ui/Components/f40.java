package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
public final class f40 implements Runnable {
    public final int f33578a;
    public final h40 f33579b;

    public f40(h40 h40Var, int i7) {
        this.f33578a = i7;
        this.f33579b = h40Var;
    }

    @Override
    public final void run() {
        org.telegram.messenger.j20 j20Var;
        int i7 = this.f33578a;
        h40 h40Var = this.f33579b;
        switch (i7) {
            case 0:
                h40Var.H0.s(false, false);
                return;
            case 1:
                p40 p40Var = h40Var.H0;
                org.telegram.messenger.j20 j20Var2 = new org.telegram.messenger.j20();
                p40Var.R = j20Var2;
                j20Var2.f23489s = true;
                j20Var2.f23471a = -1L;
                j20Var2.f23473b = -1L;
                j20Var2.f23492w = p40Var.L;
                j20Var2.f23493x = p40Var.M;
                j20Var2.f23494y = p40Var.N;
                j20Var2.f23495z = p40Var.O;
                j20Var2.f23487q = Math.max(1L, p40Var.P);
                org.telegram.messenger.j20 j20Var3 = p40Var.R;
                j20Var3.f23484n = 25;
                j20Var3.h = 360;
                j20Var3.f23481k = 360;
                j20Var3.f23479i = 360;
                j20Var3.f23482l = 360;
                j20Var3.f23485o = p40Var.f36895f0.getAbsolutePath();
                h40Var.h(p40Var.f36895f0);
                p40Var.R.f23488r = p40Var.f36903j0;
                org.telegram.messenger.qs.f(p40Var.f36891e).k(162, Integer.valueOf(p40Var.U), p40Var.R, p40Var.f36895f0.getAbsolutePath(), h40Var.A0);
                return;
            case 2:
                if (h40Var.G0 && (j20Var = h40Var.H0.R) != null) {
                    j20Var.P = false;
                }
                h40Var.c(h40Var.f34168a, 0L, true);
                MediaController.B().Y(false);
                return;
            case 3:
                h40Var.H0.f36900h1 = null;
                return;
            case 4:
                h40Var.H0.f36912q0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                h40Var.H0.f36912q0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
