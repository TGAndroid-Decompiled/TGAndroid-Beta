package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class a71 implements Runnable {
    public final int f25176a;
    public final Object f25177b;

    public a71(Object obj, int i10) {
        this.f25176a = i10;
        this.f25177b = obj;
    }

    @Override
    public final void run() {
        switch (this.f25176a) {
            case 0:
                j71 j71Var = (j71) this.f25177b;
                j3.f0 f0Var = j71Var.d;
                if (f0Var != null) {
                    TextureView textureView = j71Var.f28054n;
                    f0Var.j0();
                    if (textureView != null && textureView == f0Var.T) {
                        f0Var.j0();
                        f0Var.U();
                        f0Var.Z(null);
                        f0Var.T(0, 0);
                    }
                    j71Var.d.c0(j71Var.f28054n);
                    ArrayList arrayList = j71Var.K;
                    if (arrayList != null) {
                        j71Var.F(arrayList, j71Var.L);
                    } else if (j71Var.R) {
                        j71Var.G(j71Var.N, j71Var.P, j71Var.O, j71Var.Q);
                    } else {
                        j71Var.D(j71Var.N, j71Var.P);
                    }
                    j71Var.C();
                    return;
                }
                return;
            case 1:
                j71 j71Var2 = ((i71) this.f25177b).f27735f;
                j71Var2.X.removeCallbacksAndMessages(null);
                j71Var2.H.onVisualizerUpdate(false, true, null);
                return;
            case 2:
                ((l71) this.f25177b).f28661g = false;
                return;
            case 3:
                ((e91) ((jh.h) ((org.telegram.ui.Cells.ba) this.f25177b).f22623b).f10109b).v.b();
                return;
            default:
                ((a91) this.f25177b).d(false, true);
                return;
        }
    }
}
