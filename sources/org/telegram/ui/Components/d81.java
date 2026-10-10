package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class d81 implements Runnable {
    public final int f25597a;
    public final Object f25598b;

    public d81(Object obj, int i10) {
        this.f25597a = i10;
        this.f25598b = obj;
    }

    @Override
    public final void run() {
        switch (this.f25597a) {
            case 0:
                l81 l81Var = (l81) this.f25598b;
                i2.f0 f0Var = l81Var.d;
                if (f0Var != null) {
                    TextureView textureView = l81Var.f28243n;
                    f0Var.D1();
                    if (textureView != null && textureView == f0Var.V) {
                        f0Var.D1();
                        f0Var.q1();
                        f0Var.v1(null);
                        f0Var.o1(0, 0);
                    }
                    l81Var.d.x1(l81Var.f28243n);
                    ArrayList arrayList = l81Var.N;
                    if (arrayList != null) {
                        l81Var.F(arrayList, l81Var.O);
                    } else if (l81Var.U) {
                        l81Var.G(l81Var.Q, l81Var.S, l81Var.R, l81Var.T);
                    } else {
                        l81Var.D(l81Var.Q, l81Var.S);
                    }
                    l81Var.C();
                    return;
                }
                return;
            case 1:
                l81 l81Var2 = ((k81) this.f25598b).f27934f;
                l81Var2.f28230a0.removeCallbacksAndMessages(null);
                l81Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 2:
                ((n81) this.f25598b).f29051g = false;
                return;
            case 3:
                ((ia1) ((ki.d) ((org.telegram.ui.Cells.da) this.f25598b).f22000b).f14912b).v.b();
                return;
            default:
                ((da1) this.f25598b).d(false, true);
                return;
        }
    }
}
