package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class z61 implements Runnable {
    public final int f31255a;
    public final Object f31256b;

    public z61(Object obj, int i10) {
        this.f31255a = i10;
        this.f31256b = obj;
    }

    @Override
    public final void run() {
        switch (this.f31255a) {
            case 0:
                i71 i71Var = (i71) this.f31256b;
                j3.f0 f0Var = i71Var.d;
                if (f0Var != null) {
                    TextureView textureView = i71Var.f25611n;
                    f0Var.j0();
                    if (textureView != null && textureView == f0Var.T) {
                        f0Var.j0();
                        f0Var.U();
                        f0Var.Z(null);
                        f0Var.T(0, 0);
                    }
                    i71Var.d.c0(i71Var.f25611n);
                    ArrayList arrayList = i71Var.K;
                    if (arrayList != null) {
                        i71Var.F(arrayList, i71Var.L);
                    } else if (i71Var.R) {
                        i71Var.G(i71Var.N, i71Var.P, i71Var.O, i71Var.Q);
                    } else {
                        i71Var.D(i71Var.N, i71Var.P);
                    }
                    i71Var.C();
                    return;
                }
                return;
            case 1:
                i71 i71Var2 = ((h71) this.f31256b).f25345f;
                i71Var2.X.removeCallbacksAndMessages(null);
                i71Var2.H.onVisualizerUpdate(false, true, null);
                return;
            case 2:
                ((k71) this.f31256b).f26183g = false;
                return;
            case 3:
                ((e91) ((ih.h) ((org.telegram.ui.Cells.ba) this.f31256b).f20891b).f7581b).v.b();
                return;
            default:
                ((a91) this.f31256b).d(false, true);
                return;
        }
    }
}
