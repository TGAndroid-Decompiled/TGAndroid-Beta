package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class e81 implements Runnable {
    public final int f25923a;
    public final Object f25924b;

    public e81(Object obj, int i10) {
        this.f25923a = i10;
        this.f25924b = obj;
    }

    @Override
    public final void run() {
        switch (this.f25923a) {
            case 0:
                m81 m81Var = (m81) this.f25924b;
                i2.f0 f0Var = m81Var.d;
                if (f0Var != null) {
                    TextureView textureView = m81Var.f28621n;
                    f0Var.D1();
                    if (textureView != null && textureView == f0Var.V) {
                        f0Var.D1();
                        f0Var.q1();
                        f0Var.v1(null);
                        f0Var.o1(0, 0);
                    }
                    m81Var.d.x1(m81Var.f28621n);
                    ArrayList arrayList = m81Var.N;
                    if (arrayList != null) {
                        m81Var.F(arrayList, m81Var.O);
                    } else if (m81Var.U) {
                        m81Var.G(m81Var.Q, m81Var.S, m81Var.R, m81Var.T);
                    } else {
                        m81Var.D(m81Var.Q, m81Var.S);
                    }
                    m81Var.C();
                    return;
                }
                return;
            case 1:
                m81 m81Var2 = ((l81) this.f25924b).f28237f;
                m81Var2.f28608a0.removeCallbacksAndMessages(null);
                m81Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 2:
                ((o81) this.f25924b).f29320g = false;
                return;
            case 3:
                ((ia1) ((ki.d) ((org.telegram.ui.Cells.da) this.f25924b).f21988b).f14911b).v.b();
                return;
            default:
                ((ea1) this.f25924b).d(false, true);
                return;
        }
    }
}
