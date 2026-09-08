package org.telegram.ui.Components;

import android.view.View;
public final class n7 implements zk0 {
    public final int f28654a;

    public n7(int i10) {
        this.f28654a = i10;
    }

    @Override
    public final void a(int i10, View view) {
        switch (this.f28654a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.x) {
                    ((org.telegram.ui.Cells.x) view).a();
                    return;
                }
                return;
            case 1:
                boolean z10 = ChatAttachAlertPhotoLayout.f23858q1;
                if (view instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
                    s5Var.f22866w.c(s5Var);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                int i11 = yh.c.f50242a0;
                return;
            default:
                int i12 = yh.m.A0;
                return;
        }
    }

    private final void b(int i10, View view) {
    }
}
