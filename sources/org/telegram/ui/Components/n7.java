package org.telegram.ui.Components;

import android.view.View;
public final class n7 implements am0 {
    public final int f28888a;

    public n7(int i10) {
        this.f28888a = i10;
    }

    @Override
    public final void d(int i10, View view) {
        switch (this.f28888a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.w) {
                    ((org.telegram.ui.Cells.w) view).a();
                    return;
                }
                return;
            case 1:
                boolean z10 = ChatAttachAlertPhotoLayout.f24222q1;
                if (view instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
                    s5Var.f23254w.b(s5Var);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                int i11 = yh.c.f50627a0;
                return;
            default:
                int i12 = yh.m.A0;
                return;
        }
    }

    private final void a(int i10, View view) {
    }
}
