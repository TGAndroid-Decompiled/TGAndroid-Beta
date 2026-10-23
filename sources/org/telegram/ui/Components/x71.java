package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class x71 implements Runnable {
    public final int f32476a;
    public final Object f32477b;

    public x71(Object obj, int i10) {
        this.f32476a = i10;
        this.f32477b = obj;
    }

    @Override
    public final void run() {
        switch (this.f32476a) {
            case 0:
                e00 e00Var = ((z71) this.f32477b).f33158b;
                if (e00Var != null) {
                    e00Var.d(false, true, false);
                    return;
                }
                return;
            case 1:
                j81 j81Var = (j81) this.f32477b;
                i2.h0 h0Var = j81Var.d;
                if (h0Var != null) {
                    TextureView textureView = j81Var.f27603n;
                    h0Var.F1();
                    if (textureView != null && textureView == h0Var.X) {
                        h0Var.F1();
                        h0Var.s1();
                        h0Var.x1(null);
                        h0Var.q1(0, 0);
                    }
                    j81Var.d.z1(j81Var.f27603n);
                    ArrayList arrayList = j81Var.N;
                    if (arrayList != null) {
                        j81Var.F(arrayList, j81Var.O);
                    } else if (j81Var.U) {
                        j81Var.G(j81Var.Q, j81Var.S, j81Var.R, j81Var.T);
                    } else {
                        j81Var.D(j81Var.Q, j81Var.S);
                    }
                    j81Var.C();
                    return;
                }
                return;
            case 2:
                j81 j81Var2 = ((i81) this.f32477b).f27241f;
                j81Var2.f27591a0.removeCallbacksAndMessages(null);
                j81Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 3:
                ((l81) this.f32477b).f28282g = false;
                return;
            case 4:
                ((da1) ((t50) ((org.telegram.ui.Cells.da) this.f32477b).f22294b).f30644b).v.b();
                return;
            default:
                ((z91) this.f32477b).d(false, true);
                return;
        }
    }
}
