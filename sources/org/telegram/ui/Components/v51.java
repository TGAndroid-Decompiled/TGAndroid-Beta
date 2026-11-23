package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class v51 implements Runnable {
    public final int f40565a;
    public final Object f40566b;

    public v51(Object obj, int i7) {
        this.f40565a = i7;
        this.f40566b = obj;
    }

    @Override
    public final void run() {
        switch (this.f40565a) {
            case 0:
                bz bzVar = ((x51) this.f40566b).f41850b;
                if (bzVar != null) {
                    bzVar.c(false, true, false);
                    return;
                }
                return;
            case 1:
                h61 h61Var = (h61) this.f40566b;
                l2.g0 g0Var = h61Var.d;
                if (g0Var != null) {
                    TextureView textureView = h61Var.f35666n;
                    g0Var.F1();
                    if (textureView != null && textureView == g0Var.X) {
                        g0Var.F1();
                        g0Var.s1();
                        g0Var.x1(null);
                        g0Var.q1(0, 0);
                    }
                    h61Var.d.z1(h61Var.f35666n);
                    ArrayList arrayList = h61Var.O;
                    if (arrayList != null) {
                        h61Var.k0(arrayList, h61Var.P);
                    } else if (h61Var.V) {
                        h61Var.l0(h61Var.R, h61Var.T, h61Var.S, h61Var.U);
                    } else {
                        h61Var.j0(h61Var.R, h61Var.T);
                    }
                    h61Var.h0();
                    return;
                }
                return;
            case 2:
                h61 h61Var2 = (h61) ((oi.b6) this.f40566b).f22098f;
                h61Var2.f35654b0.removeCallbacksAndMessages(null);
                h61Var2.L.w(false, null);
                return;
            case 3:
                ((l61) this.f40566b).f37054g = false;
                return;
            case 4:
                ((a81) ((h40) ((org.telegram.ui.ActionBar.h1) this.f40566b).f29053b).f35630b).f33417w.b();
                return;
            default:
                ((w71) this.f40566b).d(false, true);
                return;
        }
    }
}
