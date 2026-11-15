package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class w41 implements Runnable {
    public final int f41258a;
    public final Object f41259b;

    public w41(Object obj, int i7) {
        this.f41258a = i7;
        this.f41259b = obj;
    }

    @Override
    public final void run() {
        switch (this.f41258a) {
            case 0:
                ((x41) this.f41259b).invalidateSelf();
                return;
            case 1:
                wy wyVar = ((k51) this.f41259b).f36280b;
                if (wyVar != null) {
                    wyVar.c(false, true, false);
                    return;
                }
                return;
            case 2:
                u51 u51Var = (u51) this.f41259b;
                l2.f0 f0Var = u51Var.d;
                if (f0Var != null) {
                    TextureView textureView = u51Var.f39927n;
                    f0Var.F1();
                    if (textureView != null && textureView == f0Var.X) {
                        f0Var.F1();
                        f0Var.s1();
                        f0Var.x1(null);
                        f0Var.q1(0, 0);
                    }
                    u51Var.d.z1(u51Var.f39927n);
                    ArrayList arrayList = u51Var.O;
                    if (arrayList != null) {
                        u51Var.k0(arrayList, u51Var.P);
                    } else if (u51Var.V) {
                        u51Var.l0(u51Var.R, u51Var.T, u51Var.S, u51Var.U);
                    } else {
                        u51Var.j0(u51Var.R, u51Var.T);
                    }
                    u51Var.h0();
                    return;
                }
                return;
            case 3:
                u51 u51Var2 = (u51) ((oi.z5) this.f41259b).f22202f;
                u51Var2.f39915b0.removeCallbacksAndMessages(null);
                u51Var2.L.A(false, null);
                return;
            case 4:
                ((w51) this.f41259b).f41275g = false;
                return;
            case 5:
                ((m71) ((z30) ((org.telegram.ui.ActionBar.h1) this.f41259b).f28631b).f42230b).f37158w.b();
                return;
            default:
                ((i71) this.f41259b).d(false, true);
                return;
        }
    }
}
