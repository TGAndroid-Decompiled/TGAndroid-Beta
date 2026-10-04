package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class f71 implements Runnable {
    public final int f26358a;
    public final Object f26359b;

    public f71(Object obj, int i10) {
        this.f26358a = i10;
        this.f26359b = obj;
    }

    @Override
    public final void run() {
        switch (this.f26358a) {
            case 0:
                ((g71) this.f26359b).invalidateSelf();
                return;
            case 1:
                yz yzVar = ((t71) this.f26359b).f30983b;
                if (yzVar != null) {
                    yzVar.e(false, true, false);
                    return;
                }
                return;
            case 2:
                d81 d81Var = (d81) this.f26359b;
                i2.f0 f0Var = d81Var.d;
                if (f0Var != null) {
                    TextureView textureView = d81Var.f25646n;
                    f0Var.B1();
                    if (textureView != null && textureView == f0Var.V) {
                        f0Var.B1();
                        f0Var.o1();
                        f0Var.t1(null);
                        f0Var.m1(0, 0);
                    }
                    d81Var.d.v1(d81Var.f25646n);
                    ArrayList arrayList = d81Var.N;
                    if (arrayList != null) {
                        d81Var.F(arrayList, d81Var.O);
                    } else if (d81Var.U) {
                        d81Var.G(d81Var.Q, d81Var.S, d81Var.R, d81Var.T);
                    } else {
                        d81Var.D(d81Var.Q, d81Var.S);
                    }
                    d81Var.C();
                    return;
                }
                return;
            case 3:
                d81 d81Var2 = ((c81) this.f26359b).f25264f;
                d81Var2.f25633a0.removeCallbacksAndMessages(null);
                d81Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 4:
                ((f81) this.f26359b).f26368g = false;
                return;
            case 5:
                ((z91) ((ki.d) ((org.telegram.ui.Cells.fa) this.f26359b).f22113b).f14862b).v.b();
                return;
            default:
                ((v91) this.f26359b).d(false, true);
                return;
        }
    }
}
