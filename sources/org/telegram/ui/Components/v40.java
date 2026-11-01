package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
public final class v40 implements Runnable {
    public final int f31170a;
    public final x40 f31171b;

    public v40(x40 x40Var, int i10) {
        this.f31170a = i10;
        this.f31171b = x40Var;
    }

    @Override
    public final void run() {
        org.telegram.messenger.y20 y20Var;
        int i10 = this.f31170a;
        x40 x40Var = this.f31171b;
        switch (i10) {
            case 0:
                x40Var.H0.r(false, false);
                return;
            case 1:
                e50 e50Var = x40Var.H0;
                org.telegram.messenger.y20 y20Var2 = new org.telegram.messenger.y20();
                e50Var.R = y20Var2;
                y20Var2.f19543s = true;
                y20Var2.f19526a = -1L;
                y20Var2.f19528b = -1L;
                y20Var2.f19546w = e50Var.L;
                y20Var2.f19547x = e50Var.M;
                y20Var2.f19548y = e50Var.N;
                y20Var2.f19549z = e50Var.O;
                y20Var2.f19541q = Math.max(1L, e50Var.P);
                org.telegram.messenger.y20 y20Var3 = e50Var.R;
                y20Var3.f19538n = 25;
                y20Var3.h = 360;
                y20Var3.f19535k = 360;
                y20Var3.f19533i = 360;
                y20Var3.f19536l = 360;
                y20Var3.f19539o = e50Var.f25706f0.getAbsolutePath();
                x40Var.h(e50Var.f25706f0);
                e50Var.R.f19542r = e50Var.f25714j0;
                org.telegram.messenger.at.f(e50Var.e).k(162, Integer.valueOf(e50Var.U), e50Var.R, e50Var.f25706f0.getAbsolutePath(), x40Var.A0);
                return;
            case 2:
                if (x40Var.G0 && (y20Var = x40Var.H0.R) != null) {
                    y20Var.P = false;
                }
                x40Var.c(x40Var.f32376a, 0L, true);
                MediaController.B().Y(false);
                return;
            case 3:
                x40Var.H0.f25711h1 = null;
                return;
            case 4:
                x40Var.H0.f25723q0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                x40Var.H0.f25723q0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
