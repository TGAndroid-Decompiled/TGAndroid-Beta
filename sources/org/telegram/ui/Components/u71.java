package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class u71 implements Runnable {
    public final int f30875a;
    public final Object f30876b;

    public u71(Object obj, int i10) {
        this.f30875a = i10;
        this.f30876b = obj;
    }

    @Override
    public final void run() {
        switch (this.f30875a) {
            case 0:
                c81 c81Var = (c81) this.f30876b;
                i2.i0 i0Var = c81Var.d;
                if (i0Var != null) {
                    TextureView textureView = c81Var.f25144n;
                    i0Var.F1();
                    if (textureView != null && textureView == i0Var.X) {
                        i0Var.F1();
                        i0Var.s1();
                        i0Var.x1(null);
                        i0Var.q1(0, 0);
                    }
                    c81Var.d.z1(c81Var.f25144n);
                    ArrayList arrayList = c81Var.N;
                    if (arrayList != null) {
                        c81Var.F(arrayList, c81Var.O);
                    } else if (c81Var.U) {
                        c81Var.G(c81Var.Q, c81Var.S, c81Var.R, c81Var.T);
                    } else {
                        c81Var.D(c81Var.Q, c81Var.S);
                    }
                    c81Var.C();
                    return;
                }
                return;
            case 1:
                c81 c81Var2 = ((b81) this.f30876b).f24833f;
                c81Var2.f25132a0.removeCallbacksAndMessages(null);
                c81Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 2:
                ((e81) this.f30876b).f25826g = false;
                return;
            case 3:
                ((w91) ((t50) ((org.telegram.ui.Cells.ca) this.f30876b).f22116b).f30447b).v.b();
                return;
            default:
                ((s91) this.f30876b).d(false, true);
                return;
        }
    }
}
