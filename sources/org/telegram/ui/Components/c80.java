package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class c80 implements DialogInterface.OnDismissListener {
    public final int f22979a;
    public final Object f22980b;
    public final boolean f22981c;

    public c80(int i10, Object obj, boolean z10) {
        this.f22979a = i10;
        this.f22980b = obj;
        this.f22981c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f22979a) {
            case 0:
                h80 h80Var = (h80) this.f22980b;
                h80.w(h80Var.getContext(), h80Var.f24565c, h80Var.f24567n, this.f22981c);
                return;
            case 1:
                h80 h80Var2 = (h80) this.f22980b;
                h80.w(h80Var2.getContext(), h80Var2.f24565c, h80Var2.f24567n, this.f22981c);
                return;
            default:
                ci.lc lcVar = (ci.lc) this.f22980b;
                lcVar.f5110z2 = false;
                lcVar.X0.x(7, true);
                if (this.f22981c) {
                    lcVar.q(true);
                    return;
                }
                return;
        }
    }
}
