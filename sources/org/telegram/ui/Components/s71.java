package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class s71 implements Runnable {
    public final int f30214a;
    public final Object f30215b;

    public s71(Object obj, int i10) {
        this.f30214a = i10;
        this.f30215b = obj;
    }

    @Override
    public final void run() {
        switch (this.f30214a) {
            case 0:
                a81 a81Var = (a81) this.f30215b;
                i2.h0 h0Var = a81Var.d;
                if (h0Var != null) {
                    TextureView textureView = a81Var.f24535n;
                    h0Var.F1();
                    if (textureView != null && textureView == h0Var.X) {
                        h0Var.F1();
                        h0Var.s1();
                        h0Var.x1(null);
                        h0Var.q1(0, 0);
                    }
                    a81Var.d.z1(a81Var.f24535n);
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
                a81 a81Var2 = ((z71) this.f30215b).f32857f;
                a81Var2.f24523a0.removeCallbacksAndMessages(null);
                a81Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 2:
                ((c81) this.f30215b).f25137g = false;
                return;
            case 3:
                ((u91) ((t50) ((org.telegram.ui.Cells.ca) this.f30215b).f22108b).f30469b).v.b();
                return;
            default:
                ((q91) this.f30215b).d(false, true);
                return;
        }
    }
}
