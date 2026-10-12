package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class v71 implements Runnable {
    public final int f29913a;
    public final Object f29914b;

    public v71(Object obj, int i10) {
        this.f29913a = i10;
        this.f29914b = obj;
    }

    @Override
    public final void run() {
        switch (this.f29913a) {
            case 0:
                h00 h00Var = ((x71) this.f29914b).f31189b;
                if (h00Var != null) {
                    h00Var.d(false, true, false);
                    return;
                }
                return;
            case 1:
                h81 h81Var = (h81) this.f29914b;
                i2.h0 h0Var = h81Var.d;
                if (h0Var != null) {
                    TextureView textureView = h81Var.f25556n;
                    h0Var.F1();
                    if (textureView != null && textureView == h0Var.X) {
                        h0Var.F1();
                        h0Var.s1();
                        h0Var.x1(null);
                        h0Var.q1(0, 0);
                    }
                    h81Var.d.z1(h81Var.f25556n);
                    ArrayList arrayList = h81Var.N;
                    if (arrayList != null) {
                        h81Var.F(arrayList, h81Var.O);
                    } else if (h81Var.U) {
                        h81Var.G(h81Var.Q, h81Var.S, h81Var.R, h81Var.T);
                    } else {
                        h81Var.D(h81Var.Q, h81Var.S);
                    }
                    h81Var.C();
                    return;
                }
                return;
            case 2:
                h81 h81Var2 = ((g81) this.f29914b).f25222f;
                h81Var2.f25544a0.removeCallbacksAndMessages(null);
                h81Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 3:
                ((j81) this.f29914b).f26241g = false;
                return;
            case 4:
                ((ca1) ((li.e) ((org.telegram.ui.Cells.da) this.f29914b).f21091b).f14763b).v.b();
                return;
            default:
                ((y91) this.f29914b).d(false, true);
                return;
        }
    }
}
