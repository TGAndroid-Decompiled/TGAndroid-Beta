package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class w51 implements Runnable {
    public final int f41657a;
    public final Object f41658b;

    public w51(Object obj, int i7) {
        this.f41657a = i7;
        this.f41658b = obj;
    }

    @Override
    public final void run() {
        switch (this.f41657a) {
            case 0:
                ez ezVar = ((y51) this.f41658b).f42330b;
                if (ezVar != null) {
                    ezVar.c(false, true, false);
                    return;
                }
                return;
            case 1:
                i61 i61Var = (i61) this.f41658b;
                l2.f0 f0Var = i61Var.d;
                if (f0Var != null) {
                    TextureView textureView = i61Var.f36176n;
                    f0Var.F1();
                    if (textureView != null && textureView == f0Var.X) {
                        f0Var.F1();
                        f0Var.s1();
                        f0Var.x1(null);
                        f0Var.q1(0, 0);
                    }
                    i61Var.d.z1(i61Var.f36176n);
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
                i61 i61Var2 = (i61) ((oi.b6) this.f41658b).f22029f;
                i61Var2.f36164b0.removeCallbacksAndMessages(null);
                i61Var2.L.x(false, null);
                return;
            case 3:
                ((k61) this.f41658b).f36822g = false;
                return;
            case 4:
                ((z71) ((k40) ((org.telegram.ui.ActionBar.h1) this.f41658b).f28992b).f36764b).f42726w.b();
                return;
            default:
                ((v71) this.f41658b).d(false, true);
                return;
        }
    }
}
