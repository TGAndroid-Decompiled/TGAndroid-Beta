package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class b71 implements Runnable {
    public final int f25511a;
    public final Object f25512b;

    public b71(Object obj, int i10) {
        this.f25511a = i10;
        this.f25512b = obj;
    }

    @Override
    public final void run() {
        switch (this.f25511a) {
            case 0:
                k71 k71Var = (k71) this.f25512b;
                j3.f0 f0Var = k71Var.d;
                if (f0Var != null) {
                    TextureView textureView = k71Var.f28316n;
                    f0Var.j0();
                    if (textureView != null && textureView == f0Var.T) {
                        f0Var.j0();
                        f0Var.U();
                        f0Var.Z(null);
                        f0Var.T(0, 0);
                    }
                    k71Var.d.c0(k71Var.f28316n);
                    ArrayList arrayList = k71Var.K;
                    if (arrayList != null) {
                        k71Var.F(arrayList, k71Var.L);
                    } else if (k71Var.R) {
                        k71Var.G(k71Var.N, k71Var.P, k71Var.O, k71Var.Q);
                    } else {
                        k71Var.D(k71Var.N, k71Var.P);
                    }
                    k71Var.C();
                    return;
                }
                return;
            case 1:
                k71 k71Var2 = ((j71) this.f25512b).f28065f;
                k71Var2.X.removeCallbacksAndMessages(null);
                k71Var2.H.onVisualizerUpdate(false, true, null);
                return;
            case 2:
                ((m71) this.f25512b).f28962g = false;
                return;
            case 3:
                ((f91) ((jh.h) ((org.telegram.ui.Cells.ba) this.f25512b).f22621b).f10109b).v.b();
                return;
            default:
                ((b91) this.f25512b).d(false, true);
                return;
        }
    }
}
