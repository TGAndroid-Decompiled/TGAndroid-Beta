package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class j51 implements Runnable {
    public final int f27235a;
    public final Object f27236b;

    public j51(Object obj, int i10) {
        this.f27235a = i10;
        this.f27236b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f27235a;
        Object obj = this.f27236b;
        switch (i10) {
            case 0:
                UndoView undoView = (UndoView) obj;
                int i11 = UndoView.f24237i0;
                undoView.getClass();
                try {
                    undoView.f24246f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                ((x51) obj).invalidateSelf();
                return;
            case 2:
                gz gzVar = ((k61) obj).f27647b;
                if (gzVar != null) {
                    gzVar.c(false, true, false);
                    return;
                }
                return;
            case 3:
                u61 u61Var = (u61) obj;
                i2.i0 i0Var = u61Var.d;
                if (i0Var != null) {
                    TextureView textureView = u61Var.f30846n;
                    i0Var.F1();
                    if (textureView != null && textureView == i0Var.X) {
                        i0Var.F1();
                        i0Var.s1();
                        i0Var.x1(null);
                        i0Var.q1(0, 0);
                    }
                    u61Var.d.z1(u61Var.f30846n);
                    ArrayList arrayList = u61Var.N;
                    if (arrayList != null) {
                        u61Var.k0(arrayList, u61Var.O);
                    } else if (u61Var.U) {
                        u61Var.l0(u61Var.Q, u61Var.S, u61Var.R, u61Var.T);
                    } else {
                        u61Var.j0(u61Var.Q, u61Var.S);
                    }
                    u61Var.h0();
                    return;
                }
                return;
            case 4:
                u61 u61Var2 = (u61) ((bi.r6) obj).f3333f;
                u61Var2.f30834a0.removeCallbacksAndMessages(null);
                u61Var2.K.B(false, null);
                return;
            case 5:
                ((w61) obj).f32026g = false;
                return;
            case 6:
                ((m81) ((li.e) ((org.telegram.ui.ActionBar.l1) obj).f20531b).f12041b).f28377w.b();
                return;
            default:
                ((i81) obj).d(false, true);
                return;
        }
    }
}
