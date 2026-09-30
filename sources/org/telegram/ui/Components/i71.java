package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class i71 implements Runnable {
    public final int f24999a;
    public final Object f25000b;

    public i71(Object obj, int i10) {
        this.f24999a = i10;
        this.f25000b = obj;
    }

    @Override
    public final void run() {
        switch (this.f24999a) {
            case 0:
                xz xzVar = ((k71) this.f25000b).f25618b;
                if (xzVar != null) {
                    xzVar.e(false, true, false);
                    return;
                }
                return;
            case 1:
                u71 u71Var = (u71) this.f25000b;
                i2.f0 f0Var = u71Var.d;
                if (f0Var != null) {
                    TextureView textureView = u71Var.f28777n;
                    f0Var.B1();
                    if (textureView != null && textureView == f0Var.V) {
                        f0Var.B1();
                        f0Var.o1();
                        f0Var.t1(null);
                        f0Var.m1(0, 0);
                    }
                    u71Var.d.v1(u71Var.f28777n);
                    ArrayList arrayList = u71Var.N;
                    if (arrayList != null) {
                        u71Var.F(arrayList, u71Var.O);
                    } else if (u71Var.U) {
                        u71Var.G(u71Var.Q, u71Var.S, u71Var.R, u71Var.T);
                    } else {
                        u71Var.D(u71Var.Q, u71Var.S);
                    }
                    u71Var.C();
                    return;
                }
                return;
            case 2:
                u71 u71Var2 = ((t71) this.f25000b).f28491f;
                u71Var2.f28765a0.removeCallbacksAndMessages(null);
                u71Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 3:
                ((w71) this.f25000b).f29847g = false;
                return;
            case 4:
                ((q91) ((ki.d) ((org.telegram.ui.Cells.fa) this.f25000b).f20318b).f13671b).v.b();
                return;
            default:
                ((m91) this.f25000b).d(false, true);
                return;
        }
    }
}
