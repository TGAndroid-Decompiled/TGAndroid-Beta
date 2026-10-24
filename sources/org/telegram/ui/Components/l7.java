package org.telegram.ui.Components;

import android.view.View;
public final class l7 implements zl0 {
    public final int f28241a;

    public l7(int i10) {
        this.f28241a = i10;
    }

    @Override
    public final void d(int i10, View view) {
        switch (this.f28241a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.w) {
                    ((org.telegram.ui.Cells.w) view).a();
                    return;
                }
                return;
            case 1:
                boolean z10 = ChatAttachAlertPhotoLayout.f24223q1;
                if (view instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
                    s5Var.f23255w.b(s5Var);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                int i11 = yh.c.f50626a0;
                return;
            default:
                int i12 = yh.m.A0;
                return;
        }
    }

    private final void a(int i10, View view) {
    }
}
