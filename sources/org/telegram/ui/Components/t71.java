package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class t71 implements Runnable {
    public final int f30450a;
    public final Object f30451b;

    public t71(Object obj, int i10) {
        this.f30450a = i10;
        this.f30451b = obj;
    }

    @Override
    public final void run() {
        switch (this.f30450a) {
            case 0:
                b81 b81Var = (b81) this.f30451b;
                i2.i0 i0Var = b81Var.d;
                if (i0Var != null) {
                    TextureView textureView = b81Var.f24847n;
                    i0Var.F1();
                    if (textureView != null && textureView == i0Var.X) {
                        i0Var.F1();
                        i0Var.s1();
                        i0Var.x1(null);
                        i0Var.q1(0, 0);
                    }
                    b81Var.d.z1(b81Var.f24847n);
                    ArrayList arrayList = b81Var.N;
                    if (arrayList != null) {
                        b81Var.F(arrayList, b81Var.O);
                    } else if (b81Var.U) {
                        b81Var.G(b81Var.Q, b81Var.S, b81Var.R, b81Var.T);
                    } else {
                        b81Var.D(b81Var.Q, b81Var.S);
                    }
                    b81Var.C();
                    return;
                }
                return;
            case 1:
                b81 b81Var2 = ((a81) this.f30451b).f24516f;
                b81Var2.f24835a0.removeCallbacksAndMessages(null);
                b81Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 2:
                ((d81) this.f30451b).f25469g = false;
                return;
            case 3:
                ((v91) ((t50) ((org.telegram.ui.Cells.ca) this.f30451b).f22111b).f30428b).v.b();
                return;
            default:
                ((r91) this.f30451b).d(false, true);
                return;
        }
    }
}
