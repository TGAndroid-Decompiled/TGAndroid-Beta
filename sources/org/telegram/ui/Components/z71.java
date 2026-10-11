package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class z71 implements Runnable {
    public final int f33572a;
    public final Object f33573b;

    public z71(Object obj, int i10) {
        this.f33572a = i10;
        this.f33573b = obj;
    }

    @Override
    public final void run() {
        switch (this.f33572a) {
            case 0:
                m00 m00Var = ((b81) this.f33573b).f24935b;
                if (m00Var != null) {
                    m00Var.e(false, true, false);
                    return;
                }
                return;
            case 1:
                l81 l81Var = (l81) this.f33573b;
                i2.f0 f0Var = l81Var.d;
                if (f0Var != null) {
                    TextureView textureView = l81Var.f28282n;
                    f0Var.D1();
                    if (textureView != null && textureView == f0Var.V) {
                        f0Var.D1();
                        f0Var.q1();
                        f0Var.v1(null);
                        f0Var.o1(0, 0);
                    }
                    l81Var.d.x1(l81Var.f28282n);
                    ArrayList arrayList = l81Var.N;
                    if (arrayList != null) {
                        l81Var.F(arrayList, l81Var.O);
                    } else if (l81Var.U) {
                        l81Var.G(l81Var.Q, l81Var.S, l81Var.R, l81Var.T);
                    } else {
                        l81Var.D(l81Var.Q, l81Var.S);
                    }
                    l81Var.C();
                    return;
                }
                return;
            case 2:
                l81 l81Var2 = ((k81) this.f33573b).f27988f;
                l81Var2.f28269a0.removeCallbacksAndMessages(null);
                l81Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 3:
                ((n81) this.f33573b).f29101g = false;
                return;
            case 4:
                ((ha1) ((ki.e) ((org.telegram.ui.Cells.da) this.f33573b).f22024b).f14918b).v.b();
                return;
            default:
                ((da1) this.f33573b).d(false, true);
                return;
        }
    }
}
