package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class k51 implements Runnable {
    public final int f27733a;
    public final Object f27734b;

    public k51(Object obj, int i10) {
        this.f27733a = i10;
        this.f27734b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f27733a;
        Object obj = this.f27734b;
        switch (i10) {
            case 0:
                UndoView undoView = (UndoView) obj;
                int i11 = UndoView.f24238i0;
                undoView.getClass();
                try {
                    undoView.f24247f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                ((y51) obj).invalidateSelf();
                return;
            case 2:
                gz gzVar = ((l61) obj).f28063b;
                if (gzVar != null) {
                    gzVar.c(false, true, false);
                    return;
                }
                return;
            case 3:
                v61 v61Var = (v61) obj;
                i2.i0 i0Var = v61Var.d;
                if (i0Var != null) {
                    TextureView textureView = v61Var.f31211n;
                    i0Var.F1();
                    if (textureView != null && textureView == i0Var.X) {
                        i0Var.F1();
                        i0Var.s1();
                        i0Var.x1(null);
                        i0Var.q1(0, 0);
                    }
                    v61Var.d.z1(v61Var.f31211n);
                    ArrayList arrayList = v61Var.N;
                    if (arrayList != null) {
                        v61Var.k0(arrayList, v61Var.O);
                    } else if (v61Var.U) {
                        v61Var.l0(v61Var.Q, v61Var.S, v61Var.R, v61Var.T);
                    } else {
                        v61Var.j0(v61Var.Q, v61Var.S);
                    }
                    v61Var.h0();
                    return;
                }
                return;
            case 4:
                v61 v61Var2 = (v61) ((bi.r6) obj).f3333f;
                v61Var2.f31199a0.removeCallbacksAndMessages(null);
                v61Var2.K.B(false, null);
                return;
            case 5:
                ((x61) obj).f32456g = false;
                return;
            case 6:
                ((n81) ((li.e) ((org.telegram.ui.ActionBar.l1) obj).f20532b).f12042b).f28743w.b();
                return;
            default:
                ((j81) obj).d(false, true);
                return;
        }
    }
}
