package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class h71 implements Runnable {
    public final int f24693a;
    public final Object f24694b;

    public h71(Object obj, int i10) {
        this.f24693a = i10;
        this.f24694b = obj;
    }

    @Override
    public final void run() {
        switch (this.f24693a) {
            case 0:
                xz xzVar = ((j71) this.f24694b).f25279b;
                if (xzVar != null) {
                    xzVar.e(false, true, false);
                    return;
                }
                return;
            case 1:
                t71 t71Var = (t71) this.f24694b;
                i2.f0 f0Var = t71Var.d;
                if (f0Var != null) {
                    TextureView textureView = t71Var.f28497n;
                    f0Var.B1();
                    if (textureView != null && textureView == f0Var.V) {
                        f0Var.B1();
                        f0Var.o1();
                        f0Var.t1(null);
                        f0Var.m1(0, 0);
                    }
                    t71Var.d.v1(t71Var.f28497n);
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
            case 2:
                t71 t71Var2 = ((s71) this.f24694b).f28193f;
                t71Var2.f28485a0.removeCallbacksAndMessages(null);
                t71Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 3:
                ((v71) this.f24694b).f29022g = false;
                return;
            case 4:
                ((p91) ((ki.d) ((org.telegram.ui.Cells.fa) this.f24694b).f20316b).f13671b).v.b();
                return;
            default:
                ((l91) this.f24694b).d(false, true);
                return;
        }
    }
}
