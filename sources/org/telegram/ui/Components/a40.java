package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
public final class a40 implements Runnable {
    public final int f31721a;
    public final c40 f31722b;

    public a40(c40 c40Var, int i3) {
        this.f31721a = i3;
        this.f31722b = c40Var;
    }

    @Override
    public final void run() {
        org.telegram.messenger.b20 b20Var;
        int i3 = this.f31721a;
        c40 c40Var = this.f31722b;
        switch (i3) {
            case 0:
                c40Var.I0.r(false, false);
                return;
            case 1:
                k40 k40Var = c40Var.I0;
                org.telegram.messenger.b20 b20Var2 = new org.telegram.messenger.b20();
                k40Var.S = b20Var2;
                b20Var2.f21726s = true;
                b20Var2.f21708a = -1L;
                b20Var2.f21710b = -1L;
                b20Var2.f21729w = k40Var.M;
                b20Var2.f21730x = k40Var.N;
                b20Var2.f21731y = k40Var.O;
                b20Var2.f21732z = k40Var.P;
                b20Var2.f21724q = Math.max(1L, k40Var.Q);
                org.telegram.messenger.b20 b20Var3 = k40Var.S;
                b20Var3.f21721n = 25;
                b20Var3.h = 360;
                b20Var3.f21718k = 360;
                b20Var3.f21716i = 360;
                b20Var3.f21719l = 360;
                b20Var3.f21722o = k40Var.f35278g0.getAbsolutePath();
                c40Var.h(k40Var.f35278g0);
                k40Var.S.f21725r = k40Var.f35286k0;
                org.telegram.messenger.hs.f(k40Var.f35272e).k(162, Integer.valueOf(k40Var.V), k40Var.S, k40Var.f35278g0.getAbsolutePath(), c40Var.B0);
                return;
            case 2:
                if (c40Var.H0 && (b20Var = c40Var.I0.S) != null) {
                    b20Var.P = false;
                }
                c40Var.c(c40Var.f32523a, 0L, true);
                MediaController.B().Y(false);
                return;
            case 3:
                c40Var.I0.f35283i1 = null;
                return;
            case 4:
                c40Var.I0.f35295r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                c40Var.I0.f35295r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
