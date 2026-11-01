package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class o70 implements DialogInterface.OnDismissListener {
    public final int f29036a;
    public final Object f29037b;
    public final boolean f29038c;

    public o70(int i10, Object obj, boolean z10) {
        this.f29036a = i10;
        this.f29037b = obj;
        this.f29038c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29036a) {
            case 0:
                u70 u70Var = (u70) this.f29037b;
                u70.J0(u70Var.getContext(), u70Var.f30886k1, u70Var.f30890p1, this.f29038c);
                return;
            case 1:
                u70 u70Var2 = (u70) this.f29037b;
                u70.J0(u70Var2.getContext(), u70Var2.f30886k1, u70Var2.f30890p1, this.f29038c);
                return;
            default:
                vh.o8 o8Var = (vh.o8) this.f29037b;
                o8Var.f51703z2 = false;
                o8Var.X0.x(7, true);
                if (this.f29038c) {
                    o8Var.p(true);
                    return;
                }
                return;
        }
    }
}
