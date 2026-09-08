package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class x61 implements Runnable {
    public final int f32465a;
    public final Object f32466b;

    public x61(Object obj, int i10) {
        this.f32465a = i10;
        this.f32466b = obj;
    }

    @Override
    public final void run() {
        switch (this.f32465a) {
            case 0:
                g71 g71Var = (g71) this.f32466b;
                i2.f0 f0Var = g71Var.d;
                if (f0Var != null) {
                    TextureView textureView = g71Var.f26339n;
                    f0Var.B1();
                    if (textureView != null && textureView == f0Var.V) {
                        f0Var.B1();
                        f0Var.o1();
                        f0Var.t1(null);
                        f0Var.m1(0, 0);
                    }
                    g71Var.d.v1(g71Var.f26339n);
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
                g71 g71Var2 = ((f71) this.f32466b).f25978f;
                g71Var2.f26326a0.removeCallbacksAndMessages(null);
                g71Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 2:
                ((i71) this.f32466b).f27017g = false;
                return;
            case 3:
                ((b91) ((j50) ((org.telegram.ui.Cells.fa) this.f32466b).f21982b).f27382b).v.b();
                return;
            default:
                ((x81) this.f32466b).d(false, true);
                return;
        }
    }
}
