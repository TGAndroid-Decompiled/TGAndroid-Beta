package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class w80 implements DialogInterface.OnDismissListener {
    public final int f32036a;
    public final Object f32037b;
    public final boolean f32038c;

    public w80(int i10, Object obj, boolean z10) {
        this.f32036a = i10;
        this.f32037b = obj;
        this.f32038c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f32036a) {
            case 0:
                a90 a90Var = (a90) this.f32037b;
                a90.y(a90Var.getContext(), a90Var.f24554c, a90Var.f24556n, this.f32038c);
                return;
            case 1:
                a90 a90Var2 = (a90) this.f32037b;
                a90.y(a90Var2.getContext(), a90Var2.f24554c, a90Var2.f24556n, this.f32038c);
                return;
            default:
                ei.vb vbVar = (ei.vb) this.f32037b;
                vbVar.f10034z2 = false;
                vbVar.X0.x(7, true);
                if (this.f32038c) {
                    vbVar.p(true);
                    return;
                }
                return;
        }
    }
}
