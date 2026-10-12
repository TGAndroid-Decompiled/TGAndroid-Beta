package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class d81 implements Runnable {
    public final int f25265a;
    public final Object f25266b;

    public d81(Object obj, int i10) {
        this.f25265a = i10;
        this.f25266b = obj;
    }

    @Override
    public final void run() {
        switch (this.f25265a) {
            case 0:
                o00 o00Var = ((f81) this.f25266b).f25964b;
                if (o00Var != null) {
                    o00Var.e(false, true, false);
                    return;
                }
                return;
            case 1:
                q81 q81Var = (q81) this.f25266b;
                i2.f0 f0Var = q81Var.d;
                if (f0Var != null) {
                    TextureView textureView = q81Var.f29792n;
                    f0Var.D1();
                    if (textureView != null && textureView == f0Var.V) {
                        f0Var.D1();
                        f0Var.q1();
                        f0Var.v1(null);
                        f0Var.o1(0, 0);
                    }
                    q81Var.d.x1(q81Var.f29792n);
                    ArrayList arrayList = q81Var.N;
                    if (arrayList != null) {
                        q81Var.F(arrayList, q81Var.O);
                    } else if (q81Var.U) {
                        q81Var.G(q81Var.Q, q81Var.S, q81Var.R, q81Var.T);
                    } else {
                        q81Var.D(q81Var.Q, q81Var.S);
                    }
                    q81Var.C();
                    return;
                }
                return;
            case 2:
                q81 q81Var2 = ((p81) this.f25266b).f29446f;
                q81Var2.f29779a0.removeCallbacksAndMessages(null);
                q81Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 3:
                ((s81) this.f25266b).f30484g = false;
                return;
            case 4:
                ((ma1) ((e60) ((org.telegram.ui.Cells.da) this.f25266b).f21757b).f25608b).v.b();
                return;
            default:
                ((ia1) this.f25266b).d(false, true);
                return;
        }
    }
}
