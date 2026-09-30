package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class j71 implements Runnable {
    public final int f25311a;
    public final Object f25312b;

    public j71(Object obj, int i10) {
        this.f25311a = i10;
        this.f25312b = obj;
    }

    @Override
    public final void run() {
        switch (this.f25311a) {
            case 0:
                yz yzVar = ((l71) this.f25312b).f25931b;
                if (yzVar != null) {
                    yzVar.e(false, true, false);
                    return;
                }
                return;
            case 1:
                v71 v71Var = (v71) this.f25312b;
                i2.f0 f0Var = v71Var.d;
                if (f0Var != null) {
                    TextureView textureView = v71Var.f29073n;
                    f0Var.B1();
                    if (textureView != null && textureView == f0Var.V) {
                        f0Var.B1();
                        f0Var.o1();
                        f0Var.t1(null);
                        f0Var.m1(0, 0);
                    }
                    v71Var.d.v1(v71Var.f29073n);
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
                v71 v71Var2 = ((u71) this.f25312b).f28792f;
                v71Var2.f29061a0.removeCallbacksAndMessages(null);
                v71Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 3:
                ((x71) this.f25312b).f30157g = false;
                return;
            case 4:
                ((r91) ((ki.d) ((org.telegram.ui.Cells.fa) this.f25312b).f20333b).f13686b).v.b();
                return;
            default:
                ((n91) this.f25312b).d(false, true);
                return;
        }
    }
}
