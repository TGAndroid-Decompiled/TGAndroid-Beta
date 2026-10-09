package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class c81 implements Runnable {
    public final int f25290a;
    public final Object f25291b;

    public c81(Object obj, int i10) {
        this.f25290a = i10;
        this.f25291b = obj;
    }

    @Override
    public final void run() {
        switch (this.f25290a) {
            case 0:
                k81 k81Var = (k81) this.f25291b;
                i2.f0 f0Var = k81Var.d;
                if (f0Var != null) {
                    TextureView textureView = k81Var.f27892n;
                    f0Var.D1();
                    if (textureView != null && textureView == f0Var.V) {
                        f0Var.D1();
                        f0Var.q1();
                        f0Var.v1(null);
                        f0Var.o1(0, 0);
                    }
                    k81Var.d.x1(k81Var.f27892n);
                    ArrayList arrayList = k81Var.N;
                    if (arrayList != null) {
                        k81Var.F(arrayList, k81Var.O);
                    } else if (k81Var.U) {
                        k81Var.G(k81Var.Q, k81Var.S, k81Var.R, k81Var.T);
                    } else {
                        k81Var.D(k81Var.Q, k81Var.S);
                    }
                    k81Var.C();
                    return;
                }
                return;
            case 1:
                k81 k81Var2 = ((j81) this.f25291b).f27638f;
                k81Var2.f27879a0.removeCallbacksAndMessages(null);
                k81Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 2:
                ((m81) this.f25291b).f28758g = false;
                return;
            case 3:
                ((ha1) ((ki.d) ((org.telegram.ui.Cells.da) this.f25291b).f21996b).f14912b).v.b();
                return;
            default:
                ((ca1) this.f25291b).d(false, true);
                return;
        }
    }
}
