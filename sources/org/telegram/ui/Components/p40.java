package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
public final class p40 implements Runnable {
    public final int f38267a;
    public final r40 f38268b;

    public p40(r40 r40Var, int i7) {
        this.f38267a = i7;
        this.f38268b = r40Var;
    }

    @Override
    public final void run() {
        org.telegram.messenger.e20 e20Var;
        int i7 = this.f38267a;
        r40 r40Var = this.f38268b;
        switch (i7) {
            case 0:
                r40Var.I0.s(false, false);
                return;
            case 1:
                z40 z40Var = r40Var.I0;
                org.telegram.messenger.e20 e20Var2 = new org.telegram.messenger.e20();
                z40Var.S = e20Var2;
                e20Var2.f23655s = true;
                e20Var2.f23637a = -1L;
                e20Var2.f23639b = -1L;
                e20Var2.f23658w = z40Var.M;
                e20Var2.f23659x = z40Var.N;
                e20Var2.f23660y = z40Var.O;
                e20Var2.f23661z = z40Var.P;
                e20Var2.f23653q = Math.max(1L, z40Var.Q);
                org.telegram.messenger.e20 e20Var3 = z40Var.S;
                e20Var3.f23650n = 25;
                e20Var3.h = 360;
                e20Var3.f23647k = 360;
                e20Var3.f23645i = 360;
                e20Var3.f23648l = 360;
                e20Var3.f23651o = z40Var.f42776g0.getAbsolutePath();
                r40Var.h(z40Var.f42776g0);
                z40Var.S.f23654r = z40Var.f42784k0;
                org.telegram.messenger.ks.f(z40Var.f42770e).k(162, Integer.valueOf(z40Var.V), z40Var.S, z40Var.f42776g0.getAbsolutePath(), r40Var.B0);
                return;
            case 2:
                if (r40Var.H0 && (e20Var = r40Var.I0.S) != null) {
                    e20Var.P = false;
                }
                r40Var.c(r40Var.f39002a, 0L, true);
                MediaController.B().Y(false);
                return;
            case 3:
                r40Var.I0.f42781i1 = null;
                return;
            case 4:
                r40Var.I0.f42793r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                r40Var.I0.f42793r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
