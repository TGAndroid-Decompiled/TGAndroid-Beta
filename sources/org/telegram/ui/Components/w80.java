package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class w80 implements DialogInterface.OnDismissListener {
    public final int f32029a;
    public final Object f32030b;
    public final boolean f32031c;

    public w80(int i10, Object obj, boolean z10) {
        this.f32029a = i10;
        this.f32030b = obj;
        this.f32031c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f32029a) {
            case 0:
                a90 a90Var = (a90) this.f32030b;
                a90.y(a90Var.getContext(), a90Var.f24547c, a90Var.f24549n, this.f32031c);
                return;
            case 1:
                a90 a90Var2 = (a90) this.f32030b;
                a90.y(a90Var2.getContext(), a90Var2.f24547c, a90Var2.f24549n, this.f32031c);
                return;
            default:
                ei.vb vbVar = (ei.vb) this.f32030b;
                vbVar.f10032z2 = false;
                vbVar.X0.x(7, true);
                if (this.f32031c) {
                    vbVar.p(true);
                    return;
                }
                return;
        }
    }
}
