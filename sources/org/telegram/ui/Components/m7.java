package org.telegram.ui.Components;

import android.view.View;
public final class m7 implements jl0 {
    public final int f25174a;

    public m7(int i10) {
        this.f25174a = i10;
    }

    @Override
    public final void d(int i10, View view) {
        switch (this.f25174a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.x) {
                    ((org.telegram.ui.Cells.x) view).a();
                    return;
                }
                return;
            case 1:
                boolean z10 = ChatAttachAlertPhotoLayout.f20983q1;
                if (view instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                    t5Var.f20441w.a(t5Var);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                int i11 = wh.c.f44036a0;
                return;
            default:
                int i12 = wh.m.A0;
                return;
        }
    }

    private final void a(int i10, View view) {
    }
}
