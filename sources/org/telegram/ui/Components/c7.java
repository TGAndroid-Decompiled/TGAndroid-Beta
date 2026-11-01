package org.telegram.ui.Components;

import android.view.View;
public final class c7 implements hk0 {
    public final int f25038a;

    public c7(int i10) {
        this.f25038a = i10;
    }

    @Override
    public final void f(int i10, View view) {
        switch (this.f25038a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.w) {
                    ((org.telegram.ui.Cells.w) view).a();
                    return;
                }
                return;
            case 1:
                boolean z10 = ChatAttachAlertPhotoLayout.f23846q1;
                if (view instanceof org.telegram.ui.Cells.v5) {
                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
                    v5Var.f23316x.d(v5Var);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                int i11 = ph.c.S1;
                return;
            default:
                int i12 = ph.m.f45224s2;
                return;
        }
    }

    private final void a(int i10, View view) {
    }
}
