package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class w61 implements Runnable {
    public final int f29859a;
    public final Object f29860b;

    public w61(Object obj, int i10) {
        this.f29859a = i10;
        this.f29860b = obj;
    }

    @Override
    public final void run() {
        switch (this.f29859a) {
            case 0:
                ((x61) this.f29860b).invalidateSelf();
                return;
            case 1:
                xz xzVar = ((k71) this.f29860b).f25646b;
                if (xzVar != null) {
                    xzVar.e(false, true, false);
                    return;
                }
                return;
            case 2:
                u71 u71Var = (u71) this.f29860b;
                i2.f0 f0Var = u71Var.d;
                if (f0Var != null) {
                    TextureView textureView = u71Var.f28838n;
                    f0Var.B1();
                    if (textureView != null && textureView == f0Var.V) {
                        f0Var.B1();
                        f0Var.o1();
                        f0Var.t1(null);
                        f0Var.m1(0, 0);
                    }
                    u71Var.d.v1(u71Var.f28838n);
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
            case 3:
                u71 u71Var2 = ((t71) this.f29860b).f28509f;
                u71Var2.f28826a0.removeCallbacksAndMessages(null);
                u71Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 4:
                ((w71) this.f29860b).f29869g = false;
                return;
            case 5:
                ((q91) ((ki.d) ((org.telegram.ui.Cells.fa) this.f29860b).f20318b).f13673b).v.b();
                return;
            default:
                ((m91) this.f29860b).d(false, true);
                return;
        }
    }
}
