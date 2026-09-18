package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class m71 implements Runnable {
    public final int f26348a;
    public final Object f26349b;

    public m71(Object obj, int i10) {
        this.f26348a = i10;
        this.f26349b = obj;
    }

    @Override
    public final void run() {
        switch (this.f26348a) {
            case 0:
                u71 u71Var = (u71) this.f26349b;
                i2.e0 e0Var = u71Var.d;
                if (e0Var != null) {
                    TextureView textureView = u71Var.f28646n;
                    e0Var.B1();
                    if (textureView != null && textureView == e0Var.V) {
                        e0Var.B1();
                        e0Var.o1();
                        e0Var.t1(null);
                        e0Var.m1(0, 0);
                    }
                    u71Var.d.v1(u71Var.f28646n);
                    ArrayList arrayList = u71Var.N;
                    if (arrayList != null) {
                        u71Var.F(arrayList, u71Var.O);
                    } else if (u71Var.U) {
                        u71Var.G(u71Var.Q, u71Var.S, u71Var.R, u71Var.T);
                    } else {
                        u71Var.D(u71Var.Q, u71Var.S);
                    }
                    u71Var.C();
                    return;
                }
                return;
            case 1:
                u71 u71Var2 = ((t71) this.f26349b).f28344f;
                u71Var2.f28634a0.removeCallbacksAndMessages(null);
                u71Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 2:
                ((w71) this.f26349b).f29935g = false;
                return;
            case 3:
                ((q91) ((ki.c) ((org.telegram.ui.Cells.fa) this.f26349b).f20280b).f13662b).v.b();
                return;
            default:
                ((m91) this.f26349b).d(false, true);
                return;
        }
    }
}
