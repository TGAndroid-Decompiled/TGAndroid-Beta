package org.telegram.ui.Components;

import android.view.View;
public final class k7 implements al0 {
    public final int f25572a;

    public k7(int i10) {
        this.f25572a = i10;
    }

    @Override
    public final void d(int i10, View view) {
        switch (this.f25572a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.x) {
                    ((org.telegram.ui.Cells.x) view).a();
                    return;
                }
                return;
            case 1:
                boolean z10 = ChatAttachAlertPhotoLayout.f21908q1;
                if (view instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
                    s5Var.f20966w.b(s5Var);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                int i11 = xh.c.f45835a0;
                return;
            default:
                int i12 = xh.m.A0;
                return;
        }
    }

    private final void a(int i10, View view) {
    }
}
