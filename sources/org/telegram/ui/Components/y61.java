package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class y61 implements Runnable {
    public final int f30135a;
    public final Object f30136b;

    public y61(Object obj, int i10) {
        this.f30135a = i10;
        this.f30136b = obj;
    }

    @Override
    public final void run() {
        switch (this.f30135a) {
            case 0:
                h71 h71Var = (h71) this.f30136b;
                i2.e0 e0Var = h71Var.d;
                if (e0Var != null) {
                    TextureView textureView = h71Var.f24540n;
                    e0Var.B1();
                    if (textureView != null && textureView == e0Var.V) {
                        e0Var.B1();
                        e0Var.o1();
                        e0Var.t1(null);
                        e0Var.m1(0, 0);
                    }
                    h71Var.d.v1(h71Var.f24540n);
                    ArrayList arrayList = h71Var.N;
                    if (arrayList != null) {
                        h71Var.F(arrayList, h71Var.O);
                    } else if (h71Var.U) {
                        h71Var.G(h71Var.Q, h71Var.S, h71Var.R, h71Var.T);
                    } else {
                        h71Var.D(h71Var.Q, h71Var.S);
                    }
                    h71Var.C();
                    return;
                }
                return;
            case 1:
                h71 h71Var2 = ((g71) this.f30136b).f24111f;
                h71Var2.f24528a0.removeCallbacksAndMessages(null);
                h71Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 2:
                ((j71) this.f30136b).f25158g = false;
                return;
            case 3:
                ((d91) ((j50) ((org.telegram.ui.Cells.fa) this.f30136b).f20124b).f25120b).v.b();
                return;
            default:
                ((z81) this.f30136b).d(false, true);
                return;
        }
    }
}
