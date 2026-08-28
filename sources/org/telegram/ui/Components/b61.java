package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class b61 implements Runnable {
    public final int f27056a;
    public final Object f27057b;

    public b61(Object obj, int i9) {
        this.f27056a = i9;
        this.f27057b = obj;
    }

    @Override
    public final void run() {
        switch (this.f27056a) {
            case 0:
                k61 k61Var = (k61) this.f27057b;
                h3.k0 k0Var = k61Var.d;
                if (k0Var != null) {
                    TextureView textureView = k61Var.f30008n;
                    k0Var.q0();
                    if (textureView != null && textureView == k0Var.V) {
                        k0Var.q0();
                        k0Var.b0();
                        k0Var.g0(null);
                        k0Var.a0(0, 0);
                    }
                    k61Var.d.j0(k61Var.f30008n);
                    ArrayList arrayList = k61Var.J;
                    if (arrayList != null) {
                        k61Var.G(arrayList, k61Var.K);
                    } else if (k61Var.Q) {
                        k61Var.H(k61Var.M, k61Var.O, k61Var.N, k61Var.P);
                    } else {
                        k61Var.E(k61Var.M, k61Var.O);
                    }
                    k61Var.D();
                    return;
                }
                return;
            case 1:
                k61 k61Var2 = ((j61) this.f27057b).f29660f;
                k61Var2.W.removeCallbacksAndMessages(null);
                k61Var2.G.onVisualizerUpdate(false, true, null);
                return;
            case 2:
                ((m61) this.f27057b).f30712g = false;
                return;
            case 3:
                ((g81) ((dh.i) ((org.telegram.ui.Cells.ca) this.f27057b).f24211b).f4589b).v.b();
                return;
            default:
                ((c81) this.f27057b).d(false, true);
                return;
        }
    }
}
