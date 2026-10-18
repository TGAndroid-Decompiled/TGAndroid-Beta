package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class s71 implements Runnable {
    public final int f30220a;
    public final Object f30221b;

    public s71(Object obj, int i10) {
        this.f30220a = i10;
        this.f30221b = obj;
    }

    @Override
    public final void run() {
        switch (this.f30220a) {
            case 0:
                a81 a81Var = (a81) this.f30221b;
                i2.h0 h0Var = a81Var.d;
                if (h0Var != null) {
                    TextureView textureView = a81Var.f24542n;
                    h0Var.F1();
                    if (textureView != null && textureView == h0Var.X) {
                        h0Var.F1();
                        h0Var.s1();
                        h0Var.x1(null);
                        h0Var.q1(0, 0);
                    }
                    a81Var.d.z1(a81Var.f24542n);
                    ArrayList arrayList = a81Var.N;
                    if (arrayList != null) {
                        a81Var.F(arrayList, a81Var.O);
                    } else if (a81Var.U) {
                        a81Var.G(a81Var.Q, a81Var.S, a81Var.R, a81Var.T);
                    } else {
                        a81Var.D(a81Var.Q, a81Var.S);
                    }
                    a81Var.C();
                    return;
                }
                return;
            case 1:
                a81 a81Var2 = ((z71) this.f30221b).f32864f;
                a81Var2.f24530a0.removeCallbacksAndMessages(null);
                a81Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 2:
                ((c81) this.f30221b).f25144g = false;
                return;
            case 3:
                ((u91) ((t50) ((org.telegram.ui.Cells.ca) this.f30221b).f22115b).f30476b).v.b();
                return;
            default:
                ((q91) this.f30221b).d(false, true);
                return;
        }
    }
}
