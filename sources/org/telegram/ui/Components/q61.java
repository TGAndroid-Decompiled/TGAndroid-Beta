package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class q61 implements Runnable {
    public final int f29962a;
    public final Object f29963b;

    public q61(Object obj, int i10) {
        this.f29962a = i10;
        this.f29963b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f29962a;
        Object obj = this.f29963b;
        switch (i10) {
            case 0:
                UndoView undoView = (UndoView) obj;
                int i11 = UndoView.f24375e0;
                undoView.getClass();
                try {
                    undoView.f24384f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                ((h71) obj).invalidateSelf();
                return;
            case 2:
                yz yzVar = ((u71) obj).f31370b;
                if (yzVar != null) {
                    yzVar.e(false, true, false);
                    return;
                }
                return;
            case 3:
                e81 e81Var = (e81) obj;
                i2.f0 f0Var = e81Var.d;
                if (f0Var != null) {
                    TextureView textureView = e81Var.f26062n;
                    f0Var.B1();
                    if (textureView != null && textureView == f0Var.V) {
                        f0Var.B1();
                        f0Var.o1();
                        f0Var.t1(null);
                        f0Var.m1(0, 0);
                    }
                    e81Var.d.v1(e81Var.f26062n);
                    ArrayList arrayList = e81Var.N;
                    if (arrayList != null) {
                        e81Var.F(arrayList, e81Var.O);
                    } else if (e81Var.U) {
                        e81Var.G(e81Var.Q, e81Var.S, e81Var.R, e81Var.T);
                    } else {
                        e81Var.D(e81Var.Q, e81Var.S);
                    }
                    e81Var.C();
                    return;
                }
                return;
            case 4:
                e81 e81Var2 = ((d81) obj).f25716f;
                e81Var2.f26049a0.removeCallbacksAndMessages(null);
                e81Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 5:
                ((g81) obj).f26736g = false;
                return;
            case 6:
                ((aa1) ((ki.d) ((org.telegram.ui.Cells.fa) obj).f22122b).f14863b).v.b();
                return;
            default:
                ((w91) obj).d(false, true);
                return;
        }
    }
}
