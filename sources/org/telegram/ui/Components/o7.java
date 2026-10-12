package org.telegram.ui.Components;

import android.view.View;
public final class o7 implements km0 {
    public final int f29083a;

    public o7(int i10) {
        this.f29083a = i10;
    }

    @Override
    public final void d(int i10, View view) {
        switch (this.f29083a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.x) {
                    ((org.telegram.ui.Cells.x) view).a();
                    return;
                }
                return;
            case 1:
                boolean z10 = ChatAttachAlertPhotoLayout.f23799q1;
                if (view instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                    t5Var.f22820w.b(t5Var);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                int i11 = xh.d.f51426a0;
                return;
            default:
                int i12 = xh.o.A0;
                return;
        }
    }

    private final void a(int i10, View view) {
    }
}
