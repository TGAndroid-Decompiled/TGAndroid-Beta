package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class k71 implements Runnable {
    public final int f24651a;
    public final Object f24652b;

    public k71(Object obj, int i10) {
        this.f24651a = i10;
        this.f24652b = obj;
    }

    @Override
    public final void run() {
        switch (this.f24651a) {
            case 0:
                t71 t71Var = (t71) this.f24652b;
                i2.e0 e0Var = t71Var.d;
                if (e0Var != null) {
                    TextureView textureView = t71Var.f27374n;
                    e0Var.B1();
                    if (textureView != null && textureView == e0Var.V) {
                        e0Var.B1();
                        e0Var.o1();
                        e0Var.t1(null);
                        e0Var.m1(0, 0);
                    }
                    t71Var.d.v1(t71Var.f27374n);
                    ArrayList arrayList = t71Var.N;
                    if (arrayList != null) {
                        t71Var.F(arrayList, t71Var.O);
                    } else if (t71Var.U) {
                        t71Var.G(t71Var.Q, t71Var.S, t71Var.R, t71Var.T);
                    } else {
                        t71Var.D(t71Var.Q, t71Var.S);
                    }
                    t71Var.C();
                    return;
                }
                return;
            case 1:
                t71 t71Var2 = ((s71) this.f24652b).f26971f;
                t71Var2.f27362a0.removeCallbacksAndMessages(null);
                t71Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 2:
                ((v71) this.f24652b).f27853g = false;
                return;
            case 3:
                ((o91) ((t50) ((org.telegram.ui.Cells.ha) this.f24652b).f19285b).f27335b).v.b();
                return;
            default:
                ((k91) this.f24652b).d(false, true);
                return;
        }
    }
}
