package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class w80 implements DialogInterface.OnDismissListener {
    public final int f32038a;
    public final Object f32039b;
    public final boolean f32040c;

    public w80(int i10, Object obj, boolean z10) {
        this.f32038a = i10;
        this.f32039b = obj;
        this.f32040c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f32038a) {
            case 0:
                a90 a90Var = (a90) this.f32039b;
                a90.y(a90Var.getContext(), a90Var.f24523c, a90Var.f24525n, this.f32040c);
                return;
            case 1:
                a90 a90Var2 = (a90) this.f32039b;
                a90.y(a90Var2.getContext(), a90Var2.f24523c, a90Var2.f24525n, this.f32040c);
                return;
            default:
                ei.vb vbVar = (ei.vb) this.f32039b;
                vbVar.f10033z2 = false;
                vbVar.X0.x(7, true);
                if (this.f32040c) {
                    vbVar.p(true);
                    return;
                }
                return;
        }
    }
}
