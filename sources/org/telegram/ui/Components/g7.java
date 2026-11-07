package org.telegram.ui.Components;

import android.view.View;
public final class g7 implements bj0 {
    public final int f33835a;

    public g7(int i7) {
        this.f33835a = i7;
    }

    @Override
    public final void c(int i7, View view) {
        switch (this.f33835a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.w) {
                    ((org.telegram.ui.Cells.w) view).a();
                    return;
                }
                return;
            case 1:
                boolean z9 = ChatAttachAlertPhotoLayout.f31184q1;
                if (view instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
                    q5Var.f30139y.d(q5Var);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                int i10 = zh.d.S1;
                return;
            default:
                int i11 = zh.m.f60347s2;
                return;
        }
    }

    private final void a(int i7, View view) {
    }
}
