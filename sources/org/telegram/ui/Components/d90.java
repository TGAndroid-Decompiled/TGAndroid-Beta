package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class d90 implements DialogInterface.OnDismissListener {
    public final int f25646a;
    public final Object f25647b;
    public final boolean f25648c;

    public d90(int i10, Object obj, boolean z10) {
        this.f25646a = i10;
        this.f25647b = obj;
        this.f25648c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f25646a) {
            case 0:
                i90 i90Var = (i90) this.f25647b;
                i90.y(i90Var.getContext(), i90Var.f27292c, i90Var.f27295n, this.f25648c);
                return;
            case 1:
                i90 i90Var2 = (i90) this.f25647b;
                i90.y(i90Var2.getContext(), i90Var2.f27292c, i90Var2.f27295n, this.f25648c);
                return;
            default:
                ci.lc lcVar = (ci.lc) this.f25647b;
                lcVar.f5543z2 = false;
                lcVar.X0.x(7, true);
                if (this.f25648c) {
                    lcVar.p(true);
                    return;
                }
                return;
        }
    }
}
