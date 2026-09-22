package org.telegram.ui.Components;

import android.view.View;
public final class l7 implements ml0 {
    public final int f26006a;

    public l7(int i10) {
        this.f26006a = i10;
    }

    @Override
    public final void d(int i10, View view) {
        switch (this.f26006a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.x) {
                    ((org.telegram.ui.Cells.x) view).a();
                    return;
                }
                return;
            case 1:
                boolean z10 = ChatAttachAlertPhotoLayout.f22135q1;
                if (view instanceof org.telegram.ui.Cells.u5) {
                    org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                    u5Var.f21629w.b(u5Var);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                int i11 = xh.c.f46134a0;
                return;
            default:
                int i12 = xh.m.A0;
                return;
        }
    }

    private final void a(int i10, View view) {
    }
}
