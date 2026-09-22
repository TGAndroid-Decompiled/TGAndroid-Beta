package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class x61 implements Runnable {
    public final int f29896a;
    public final Object f29897b;

    public x61(Object obj, int i10) {
        this.f29896a = i10;
        this.f29897b = obj;
    }

    @Override
    public final void run() {
        switch (this.f29896a) {
            case 0:
                g71 g71Var = (g71) this.f29897b;
                i2.e0 e0Var = g71Var.d;
                if (e0Var != null) {
                    TextureView textureView = g71Var.f24237n;
                    e0Var.B1();
                    if (textureView != null && textureView == e0Var.V) {
                        e0Var.B1();
                        e0Var.o1();
                        e0Var.t1(null);
                        e0Var.m1(0, 0);
                    }
                    g71Var.d.v1(g71Var.f24237n);
                    ArrayList arrayList = g71Var.N;
                    if (arrayList != null) {
                        g71Var.F(arrayList, g71Var.O);
                    } else if (g71Var.U) {
                        g71Var.G(g71Var.Q, g71Var.S, g71Var.R, g71Var.T);
                    } else {
                        g71Var.D(g71Var.Q, g71Var.S);
                    }
                    g71Var.C();
                    return;
                }
                return;
            case 1:
                g71 g71Var2 = ((f71) this.f29897b).f23844f;
                g71Var2.f24225a0.removeCallbacksAndMessages(null);
                g71Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 2:
                ((i71) this.f29897b).f24926g = false;
                return;
            case 3:
                ((c91) ((j50) ((org.telegram.ui.Cells.fa) this.f29897b).f20094b).f25232b).v.b();
                return;
            default:
                ((y81) this.f29897b).d(false, true);
                return;
        }
    }
}
