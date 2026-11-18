package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class t51 implements Runnable {
    public final int f39910a;
    public final Object f39911b;

    public t51(Object obj, int i7) {
        this.f39910a = i7;
        this.f39911b = obj;
    }

    @Override
    public final void run() {
        switch (this.f39910a) {
            case 0:
                cz czVar = ((v51) this.f39911b).f40501b;
                if (czVar != null) {
                    czVar.c(false, true, false);
                    return;
                }
                return;
            case 1:
                f61 f61Var = (f61) this.f39911b;
                l2.f0 f0Var = f61Var.d;
                if (f0Var != null) {
                    TextureView textureView = f61Var.f34976n;
                    f0Var.F1();
                    if (textureView != null && textureView == f0Var.X) {
                        f0Var.F1();
                        f0Var.s1();
                        f0Var.x1(null);
                        f0Var.q1(0, 0);
                    }
                    f61Var.d.z1(f61Var.f34976n);
                    ArrayList arrayList = f61Var.O;
                    if (arrayList != null) {
                        f61Var.k0(arrayList, f61Var.P);
                    } else if (f61Var.V) {
                        f61Var.l0(f61Var.R, f61Var.T, f61Var.S, f61Var.U);
                    } else {
                        f61Var.j0(f61Var.R, f61Var.T);
                    }
                    f61Var.h0();
                    return;
                }
                return;
            case 2:
                f61 f61Var2 = (f61) ((oi.a6) this.f39911b).f21940f;
                f61Var2.f34964b0.removeCallbacksAndMessages(null);
                f61Var2.L.x(false, null);
                return;
            case 3:
                ((h61) this.f39911b).f35765g = false;
                return;
            case 4:
                ((w71) ((h40) ((org.telegram.ui.ActionBar.i1) this.f39911b).f29008b).f35713b).f41612w.b();
                return;
            default:
                ((s71) this.f39911b).d(false, true);
                return;
        }
    }
}
