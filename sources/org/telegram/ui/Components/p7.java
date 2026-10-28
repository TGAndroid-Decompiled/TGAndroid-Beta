package org.telegram.ui.Components;

import android.view.View;
public final class p7 implements am0 {
    public final int f31517a;

    public p7(int i10) {
        this.f31517a = i10;
    }

    @Override
    public final void c(int i10, View view) {
        switch (this.f31517a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.w) {
                    ((org.telegram.ui.Cells.w) view).a();
                    return;
                }
                return;
            case 1:
                boolean z10 = ChatAttachAlertPhotoLayout.f26017q1;
                if (view instanceof org.telegram.ui.Cells.x5) {
                    org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) view;
                    x5Var.f25708w.b(x5Var);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                int i11 = zh.c.f52970a0;
                return;
            default:
                int i12 = zh.m.A0;
                return;
        }
    }

    private final void a(int i10, View view) {
    }
}
