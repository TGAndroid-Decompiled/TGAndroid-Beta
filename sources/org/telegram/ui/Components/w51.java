package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class w51 implements Runnable {
    public final int f41651a;
    public final Object f41652b;

    public w51(Object obj, int i7) {
        this.f41651a = i7;
        this.f41652b = obj;
    }

    @Override
    public final void run() {
        switch (this.f41651a) {
            case 0:
                ez ezVar = ((y51) this.f41652b).f42323b;
                if (ezVar != null) {
                    ezVar.c(false, true, false);
                    return;
                }
                return;
            case 1:
                i61 i61Var = (i61) this.f41652b;
                l2.f0 f0Var = i61Var.d;
                if (f0Var != null) {
                    TextureView textureView = i61Var.f36170n;
                    f0Var.F1();
                    if (textureView != null && textureView == f0Var.X) {
                        f0Var.F1();
                        f0Var.s1();
                        f0Var.x1(null);
                        f0Var.q1(0, 0);
                    }
                    i61Var.d.z1(i61Var.f36170n);
                    ArrayList arrayList = i61Var.O;
                    if (arrayList != null) {
                        i61Var.k0(arrayList, i61Var.P);
                    } else if (i61Var.V) {
                        i61Var.l0(i61Var.R, i61Var.T, i61Var.S, i61Var.U);
                    } else {
                        i61Var.j0(i61Var.R, i61Var.T);
                    }
                    i61Var.h0();
                    return;
                }
                return;
            case 2:
                i61 i61Var2 = (i61) ((oi.b6) this.f41652b).f22032f;
                i61Var2.f36158b0.removeCallbacksAndMessages(null);
                i61Var2.L.x(false, null);
                return;
            case 3:
                ((k61) this.f41652b).f36825g = false;
                return;
            case 4:
                ((z71) ((k40) ((org.telegram.ui.ActionBar.h1) this.f41652b).f28995b).f36767b).f42730w.b();
                return;
            default:
                ((v71) this.f41652b).d(false, true);
                return;
        }
    }
}
