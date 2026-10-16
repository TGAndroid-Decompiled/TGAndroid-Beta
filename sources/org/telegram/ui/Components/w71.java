package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class w71 implements Runnable {
    public final int f30490a;
    public final Object f30491b;

    public w71(Object obj, int i10) {
        this.f30490a = i10;
        this.f30491b = obj;
    }

    @Override
    public final void run() {
        switch (this.f30490a) {
            case 0:
                h00 h00Var = ((y71) this.f30491b).f31176b;
                if (h00Var != null) {
                    h00Var.d(false, true, false);
                    return;
                }
                return;
            case 1:
                i81 i81Var = (i81) this.f30491b;
                i2.h0 h0Var = i81Var.d;
                if (h0Var != null) {
                    TextureView textureView = i81Var.f25596n;
                    h0Var.F1();
                    if (textureView != null && textureView == h0Var.X) {
                        h0Var.F1();
                        h0Var.s1();
                        h0Var.x1(null);
                        h0Var.q1(0, 0);
                    }
                    i81Var.d.z1(i81Var.f25596n);
                    ArrayList arrayList = i81Var.N;
                    if (arrayList != null) {
                        i81Var.F(arrayList, i81Var.O);
                    } else if (i81Var.U) {
                        i81Var.G(i81Var.Q, i81Var.S, i81Var.R, i81Var.T);
                    } else {
                        i81Var.D(i81Var.Q, i81Var.S);
                    }
                    i81Var.C();
                    return;
                }
                return;
            case 2:
                i81 i81Var2 = ((h81) this.f30491b).f25206f;
                i81Var2.f25584a0.removeCallbacksAndMessages(null);
                i81Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 3:
                ((k81) this.f30491b).f26262g = false;
                return;
            case 4:
                ((da1) ((x50) ((org.telegram.ui.Cells.da) this.f30491b).f20785b).f30877b).v.b();
                return;
            default:
                ((z91) this.f30491b).d(false, true);
                return;
        }
    }
}
