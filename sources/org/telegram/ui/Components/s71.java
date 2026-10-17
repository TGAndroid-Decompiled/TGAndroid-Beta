package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class s71 implements Runnable {
    public final int f30213a;
    public final Object f30214b;

    public s71(Object obj, int i10) {
        this.f30213a = i10;
        this.f30214b = obj;
    }

    @Override
    public final void run() {
        switch (this.f30213a) {
            case 0:
                a81 a81Var = (a81) this.f30214b;
                i2.g0 g0Var = a81Var.d;
                if (g0Var != null) {
                    TextureView textureView = a81Var.f24535n;
                    g0Var.F1();
                    if (textureView != null && textureView == g0Var.X) {
                        g0Var.F1();
                        g0Var.s1();
                        g0Var.x1(null);
                        g0Var.q1(0, 0);
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
                a81 a81Var2 = ((z71) this.f30214b).f32857f;
                a81Var2.f24523a0.removeCallbacksAndMessages(null);
                a81Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 2:
                ((c81) this.f30214b).f25137g = false;
                return;
            case 3:
                ((u91) ((t50) ((org.telegram.ui.Cells.ca) this.f30214b).f22111b).f30469b).v.b();
                return;
            default:
                ((q91) this.f30214b).d(false, true);
                return;
        }
    }
}
