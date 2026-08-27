package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

public final class d61 implements Runnable {

    public final int f27658a;

    public final Object f27659b;

    public d61(Object obj, int i10) {
        this.f27658a = i10;
        this.f27659b = obj;
    }

    @Override
    public final void run() {
        switch (this.f27658a) {
            case 0:
                m61 m61Var = (m61) this.f27659b;
                h3.k0 k0Var = m61Var.d;
                if (k0Var != null) {
                    TextureView textureView = m61Var.f30600n;
                    k0Var.q0();
                    if (textureView != null && textureView == k0Var.V) {
                        k0Var.q0();
                        k0Var.b0();
                        k0Var.g0(null);
                        k0Var.a0(0, 0);
                    }
                    m61Var.d.j0(m61Var.f30600n);
                    ArrayList arrayList = m61Var.J;
                    if (arrayList != null) {
                        m61Var.G(arrayList, m61Var.K);
                    } else if (m61Var.Q) {
                        m61Var.H(m61Var.M, m61Var.O, m61Var.N, m61Var.P);
                    } else {
                        m61Var.E(m61Var.M, m61Var.O);
                    }
                    m61Var.D();
                }
                break;
            case 1:
                m61 m61Var2 = ((l61) this.f27659b).f30310f;
                m61Var2.W.removeCallbacksAndMessages(null);
                m61Var2.G.onVisualizerUpdate(false, true, null);
                break;
            case 2:
                ((o61) this.f27659b).f31182g = false;
                break;
            case 3:
                ((i81) ((eh.h) ((org.telegram.ui.Cells.y9) this.f27659b).f26013b).f5487b).v.b();
                break;
            default:
                ((e81) this.f27659b).d(false, true);
                break;
        }
    }
}
