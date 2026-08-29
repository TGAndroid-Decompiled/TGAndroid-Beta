package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class o61 implements Runnable {
    public final int f31274a;
    public final Object f31275b;

    public o61(Object obj, int i10) {
        this.f31274a = i10;
        this.f31275b = obj;
    }

    @Override
    public final void run() {
        switch (this.f31274a) {
            case 0:
                x61 x61Var = (x61) this.f31275b;
                j3.k0 k0Var = x61Var.d;
                if (k0Var != null) {
                    TextureView textureView = x61Var.f34638n;
                    k0Var.q0();
                    if (textureView != null && textureView == k0Var.V) {
                        k0Var.q0();
                        k0Var.b0();
                        k0Var.g0(null);
                        k0Var.a0(0, 0);
                    }
                    x61Var.d.j0(x61Var.f34638n);
                    ArrayList arrayList = x61Var.J;
                    if (arrayList != null) {
                        x61Var.G(arrayList, x61Var.K);
                    } else if (x61Var.Q) {
                        x61Var.H(x61Var.M, x61Var.O, x61Var.N, x61Var.P);
                    } else {
                        x61Var.E(x61Var.M, x61Var.O);
                    }
                    x61Var.D();
                    return;
                }
                return;
            case 1:
                x61 x61Var2 = ((w61) this.f31275b).f34340f;
                x61Var2.W.removeCallbacksAndMessages(null);
                x61Var2.G.onVisualizerUpdate(false, true, null);
                return;
            case 2:
                ((z61) this.f31275b).f35234g = false;
                return;
            case 3:
                ((s81) ((gh.h) ((org.telegram.ui.Cells.z9) this.f31275b).f26066b).f7379b).v.b();
                return;
            default:
                ((o81) this.f31275b).d(false, true);
                return;
        }
    }
}
