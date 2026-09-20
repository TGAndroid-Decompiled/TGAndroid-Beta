package org.telegram.ui.Components;

import android.view.View;
public final class l7 implements jl0 {
    public final int f26045a;

    public l7(int i10) {
        this.f26045a = i10;
    }

    @Override
    public final void d(int i10, View view) {
        switch (this.f26045a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.x) {
                    ((org.telegram.ui.Cells.x) view).a();
                    return;
                }
                return;
            case 1:
                boolean z10 = ChatAttachAlertPhotoLayout.f22119q1;
                if (view instanceof org.telegram.ui.Cells.u5) {
                    org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                    u5Var.f21614w.a(u5Var);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                int i11 = xh.c.f46113a0;
                return;
            default:
                int i12 = xh.m.A0;
                return;
        }
    }

    private final void a(int i10, View view) {
    }
}
