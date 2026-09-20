package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class l71 implements Runnable {
    public final int f26047a;
    public final Object f26048b;

    public l71(Object obj, int i10) {
        this.f26047a = i10;
        this.f26048b = obj;
    }

    @Override
    public final void run() {
        switch (this.f26047a) {
            case 0:
                t71 t71Var = (t71) this.f26048b;
                i2.e0 e0Var = t71Var.d;
                if (e0Var != null) {
                    TextureView textureView = t71Var.f28331n;
                    e0Var.B1();
                    if (textureView != null && textureView == e0Var.V) {
                        e0Var.B1();
                        e0Var.o1();
                        e0Var.t1(null);
                        e0Var.m1(0, 0);
                    }
                    t71Var.d.v1(t71Var.f28331n);
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
                t71 t71Var2 = ((s71) this.f26048b).f28073f;
                t71Var2.f28319a0.removeCallbacksAndMessages(null);
                t71Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 2:
                ((v71) this.f26048b).f29005g = false;
                return;
            case 3:
                ((p91) ((ki.c) ((org.telegram.ui.Cells.ga) this.f26048b).f20353b).f13662b).v.b();
                return;
            default:
                ((l91) this.f26048b).d(false, true);
                return;
        }
    }
}
