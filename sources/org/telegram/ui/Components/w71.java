package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class w71 implements Runnable {
    public final int f32142a;
    public final Object f32143b;

    public w71(Object obj, int i10) {
        this.f32142a = i10;
        this.f32143b = obj;
    }

    @Override
    public final void run() {
        switch (this.f32142a) {
            case 0:
                c00 c00Var = ((y71) this.f32143b).f32834b;
                if (c00Var != null) {
                    c00Var.d(false, true, false);
                    return;
                }
                return;
            case 1:
                j81 j81Var = (j81) this.f32143b;
                i2.h0 h0Var = j81Var.d;
                if (h0Var != null) {
                    TextureView textureView = j81Var.f27638n;
                    h0Var.F1();
                    if (textureView != null && textureView == h0Var.X) {
                        h0Var.F1();
                        h0Var.s1();
                        h0Var.x1(null);
                        h0Var.q1(0, 0);
                    }
                    j81Var.d.z1(j81Var.f27638n);
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
                j81 j81Var2 = ((i81) this.f32143b).f27368f;
                j81Var2.f27626a0.removeCallbacksAndMessages(null);
                j81Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 3:
                ((l81) this.f32143b).f28254g = false;
                return;
            case 4:
                ((da1) ((r50) ((org.telegram.ui.Cells.da) this.f32143b).f22295b).f30069b).v.b();
                return;
            default:
                ((z91) this.f32143b).d(false, true);
                return;
        }
    }
}
