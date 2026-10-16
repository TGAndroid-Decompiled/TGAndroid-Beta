package org.telegram.ui.Components;

import android.view.View;
public final class p7 implements am0 {
    public final int f27897a;

    public p7(int i10) {
        this.f27897a = i10;
    }

    @Override
    public final void a(int i10, View view) {
        switch (this.f27897a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.x) {
                    ((org.telegram.ui.Cells.x) view).a();
                    return;
                }
                return;
            case 1:
                boolean z10 = ChatAttachAlertPhotoLayout.f22718q1;
                if (view instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                    t5Var.f21787w.c(t5Var);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                int i11 = yh.d.f48807a0;
                return;
            default:
                int i12 = yh.n.A0;
                return;
        }
    }

    private final void b(int i10, View view) {
    }
}
