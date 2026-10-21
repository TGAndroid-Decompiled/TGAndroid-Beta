package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class u71 implements Runnable {
    public final int f30871a;
    public final Object f30872b;

    public u71(Object obj, int i10) {
        this.f30871a = i10;
        this.f30872b = obj;
    }

    @Override
    public final void run() {
        switch (this.f30871a) {
            case 0:
                c81 c81Var = (c81) this.f30872b;
                i2.i0 i0Var = c81Var.d;
                if (i0Var != null) {
                    TextureView textureView = c81Var.f25140n;
                    i0Var.F1();
                    if (textureView != null && textureView == i0Var.X) {
                        i0Var.F1();
                        i0Var.s1();
                        i0Var.x1(null);
                        i0Var.q1(0, 0);
                    }
                    c81Var.d.z1(c81Var.f25140n);
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
                c81 c81Var2 = ((b81) this.f30872b).f24829f;
                c81Var2.f25128a0.removeCallbacksAndMessages(null);
                c81Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 2:
                ((e81) this.f30872b).f25822g = false;
                return;
            case 3:
                ((w91) ((t50) ((org.telegram.ui.Cells.ca) this.f30872b).f22112b).f30443b).v.b();
                return;
            default:
                ((s91) this.f30872b).d(false, true);
                return;
        }
    }
}
