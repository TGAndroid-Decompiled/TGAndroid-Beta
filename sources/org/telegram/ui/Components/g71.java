package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class g71 implements Runnable {
    public final int f24385a;
    public final Object f24386b;

    public g71(Object obj, int i10) {
        this.f24385a = i10;
        this.f24386b = obj;
    }

    @Override
    public final void run() {
        switch (this.f24385a) {
            case 0:
                wz wzVar = ((i71) this.f24386b).f24962b;
                if (wzVar != null) {
                    wzVar.e(false, true, false);
                    return;
                }
                return;
            case 1:
                s71 s71Var = (s71) this.f24386b;
                i2.f0 f0Var = s71Var.d;
                if (f0Var != null) {
                    TextureView textureView = s71Var.f28195n;
                    f0Var.B1();
                    if (textureView != null && textureView == f0Var.V) {
                        f0Var.B1();
                        f0Var.o1();
                        f0Var.t1(null);
                        f0Var.m1(0, 0);
                    }
                    s71Var.d.v1(s71Var.f28195n);
                    ArrayList arrayList = s71Var.N;
                    if (arrayList != null) {
                        s71Var.F(arrayList, s71Var.O);
                    } else if (s71Var.U) {
                        s71Var.G(s71Var.Q, s71Var.S, s71Var.R, s71Var.T);
                    } else {
                        s71Var.D(s71Var.Q, s71Var.S);
                    }
                    s71Var.C();
                    return;
                }
                return;
            case 2:
                s71 s71Var2 = ((r71) this.f24386b).f27901f;
                s71Var2.f28183a0.removeCallbacksAndMessages(null);
                s71Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 3:
                ((u71) this.f24386b).f28740g = false;
                return;
            case 4:
                ((o91) ((ki.d) ((org.telegram.ui.Cells.fa) this.f24386b).f20317b).f13671b).v.b();
                return;
            default:
                ((k91) this.f24386b).d(false, true);
                return;
        }
    }
}
