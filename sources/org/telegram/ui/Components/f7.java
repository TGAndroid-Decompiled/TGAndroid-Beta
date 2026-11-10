package org.telegram.ui.Components;

import android.view.View;
public final class f7 implements bj0 {
    public final int f33484a;

    public f7(int i7) {
        this.f33484a = i7;
    }

    @Override
    public final void c(int i7, View view) {
        switch (this.f33484a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.w) {
                    ((org.telegram.ui.Cells.w) view).a();
                    return;
                }
                return;
            case 1:
                boolean z9 = ChatAttachAlertPhotoLayout.f31204q1;
                if (view instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
                    q5Var.f30158y.d(q5Var);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                int i10 = zh.d.V1;
                return;
            default:
                int i11 = zh.l.f60432v2;
                return;
        }
    }

    private final void a(int i7, View view) {
    }
}
