package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class b80 implements DialogInterface.OnDismissListener {
    public final int f22707a;
    public final Object f22708b;
    public final boolean f22709c;

    public b80(int i10, Object obj, boolean z10) {
        this.f22707a = i10;
        this.f22708b = obj;
        this.f22709c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f22707a) {
            case 0:
                g80 g80Var = (g80) this.f22708b;
                g80.w(g80Var.getContext(), g80Var.f24251c, g80Var.f24253n, this.f22709c);
                return;
            case 1:
                g80 g80Var2 = (g80) this.f22708b;
                g80.w(g80Var2.getContext(), g80Var2.f24251c, g80Var2.f24253n, this.f22709c);
                return;
            default:
                ci.oc ocVar = (ci.oc) this.f22708b;
                ocVar.f5283z2 = false;
                ocVar.X0.x(7, true);
                if (this.f22709c) {
                    ocVar.q(true);
                    return;
                }
                return;
        }
    }
}
