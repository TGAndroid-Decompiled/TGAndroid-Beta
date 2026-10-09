package org.telegram.ui.Components;

import android.view.View;
public final class o7 implements em0 {
    public final int f29403a;

    public o7(int i10) {
        this.f29403a = i10;
    }

    @Override
    public final void d(int i10, View view) {
        switch (this.f29403a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.x) {
                    ((org.telegram.ui.Cells.x) view).a();
                    return;
                }
                return;
            case 1:
                boolean z10 = ChatAttachAlertPhotoLayout.f24021q1;
                if (view instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                    t5Var.f23056w.b(t5Var);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                int i11 = xh.d.f51199a0;
                return;
            default:
                int i12 = xh.o.A0;
                return;
        }
    }

    private final void a(int i10, View view) {
    }
}
