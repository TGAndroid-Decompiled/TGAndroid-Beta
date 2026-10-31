package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
public final class v40 implements Runnable {
    public final int f31130a;
    public final x40 f31131b;

    public v40(x40 x40Var, int i10) {
        this.f31130a = i10;
        this.f31131b = x40Var;
    }

    @Override
    public final void run() {
        org.telegram.messenger.x20 x20Var;
        int i10 = this.f31130a;
        x40 x40Var = this.f31131b;
        switch (i10) {
            case 0:
                x40Var.H0.r(false, false);
                return;
            case 1:
                e50 e50Var = x40Var.H0;
                org.telegram.messenger.x20 x20Var2 = new org.telegram.messenger.x20();
                e50Var.R = x20Var2;
                x20Var2.f19200s = true;
                x20Var2.f19183a = -1L;
                x20Var2.f19185b = -1L;
                x20Var2.f19203w = e50Var.L;
                x20Var2.f19204x = e50Var.M;
                x20Var2.f19205y = e50Var.N;
                x20Var2.f19206z = e50Var.O;
                x20Var2.f19198q = Math.max(1L, e50Var.P);
                org.telegram.messenger.x20 x20Var3 = e50Var.R;
                x20Var3.f19195n = 25;
                x20Var3.h = 360;
                x20Var3.f19192k = 360;
                x20Var3.f19190i = 360;
                x20Var3.f19193l = 360;
                x20Var3.f19196o = e50Var.f25657f0.getAbsolutePath();
                x40Var.h(e50Var.f25657f0);
                e50Var.R.f19199r = e50Var.f25665j0;
                org.telegram.messenger.zs.f(e50Var.e).k(162, Integer.valueOf(e50Var.U), e50Var.R, e50Var.f25657f0.getAbsolutePath(), x40Var.A0);
                return;
            case 2:
                if (x40Var.G0 && (x20Var = x40Var.H0.R) != null) {
                    x20Var.P = false;
                }
                x40Var.c(x40Var.f32313a, 0L, true);
                MediaController.B().Y(false);
                return;
            case 3:
                x40Var.H0.f25662h1 = null;
                return;
            case 4:
                x40Var.H0.f25674q0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                x40Var.H0.f25674q0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
