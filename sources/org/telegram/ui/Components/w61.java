package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class w61 implements Runnable {
    public final int f29556a;
    public final Object f29557b;

    public w61(Object obj, int i10) {
        this.f29556a = i10;
        this.f29557b = obj;
    }

    @Override
    public final void run() {
        switch (this.f29556a) {
            case 0:
                f71 f71Var = (f71) this.f29557b;
                i2.f0 f0Var = f71Var.d;
                if (f0Var != null) {
                    TextureView textureView = f71Var.f23894n;
                    f0Var.B1();
                    if (textureView != null && textureView == f0Var.V) {
                        f0Var.B1();
                        f0Var.o1();
                        f0Var.t1(null);
                        f0Var.m1(0, 0);
                    }
                    f71Var.d.v1(f71Var.f23894n);
                    ArrayList arrayList = f71Var.N;
                    if (arrayList != null) {
                        f71Var.F(arrayList, f71Var.O);
                    } else if (f71Var.U) {
                        f71Var.G(f71Var.Q, f71Var.S, f71Var.R, f71Var.T);
                    } else {
                        f71Var.D(f71Var.Q, f71Var.S);
                    }
                    f71Var.C();
                    return;
                }
                return;
            case 1:
                f71 f71Var2 = ((e71) this.f29557b).f23592f;
                f71Var2.f23882a0.removeCallbacksAndMessages(null);
                f71Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 2:
                ((h71) this.f29557b).f24542g = false;
                return;
            case 3:
                ((b91) ((k50) ((org.telegram.ui.Cells.ga) this.f29557b).f20122b).f25517b).v.b();
                return;
            default:
                ((x81) this.f29557b).d(false, true);
                return;
        }
    }
}
