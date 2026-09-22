package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class j71 implements Runnable {
    public final int f25302a;
    public final Object f25303b;

    public j71(Object obj, int i10) {
        this.f25302a = i10;
        this.f25303b = obj;
    }

    @Override
    public final void run() {
        switch (this.f25302a) {
            case 0:
                vz vzVar = ((l71) this.f25303b).f26011b;
                if (vzVar != null) {
                    vzVar.e(false, true, false);
                    return;
                }
                return;
            case 1:
                v71 v71Var = (v71) this.f25303b;
                i2.e0 e0Var = v71Var.d;
                if (e0Var != null) {
                    TextureView textureView = v71Var.f29014n;
                    e0Var.B1();
                    if (textureView != null && textureView == e0Var.V) {
                        e0Var.B1();
                        e0Var.o1();
                        e0Var.t1(null);
                        e0Var.m1(0, 0);
                    }
                    v71Var.d.v1(v71Var.f29014n);
                    ArrayList arrayList = v71Var.N;
                    if (arrayList != null) {
                        v71Var.F(arrayList, v71Var.O);
                    } else if (v71Var.U) {
                        v71Var.G(v71Var.Q, v71Var.S, v71Var.R, v71Var.T);
                    } else {
                        v71Var.D(v71Var.Q, v71Var.S);
                    }
                    v71Var.C();
                    return;
                }
                return;
            case 2:
                v71 v71Var2 = ((u71) this.f25303b).f28692f;
                v71Var2.f29002a0.removeCallbacksAndMessages(null);
                v71Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 3:
                ((x71) this.f25303b).f30256g = false;
                return;
            case 4:
                ((r91) ((ki.c) ((org.telegram.ui.Cells.ga) this.f25303b).f20368b).f13660b).v.b();
                return;
            default:
                ((n91) this.f25303b).d(false, true);
                return;
        }
    }
}
