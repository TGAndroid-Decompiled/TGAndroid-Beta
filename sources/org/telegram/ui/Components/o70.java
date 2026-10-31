package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class o70 implements DialogInterface.OnDismissListener {
    public final int f28982a;
    public final Object f28983b;
    public final boolean f28984c;

    public o70(int i10, Object obj, boolean z10) {
        this.f28982a = i10;
        this.f28983b = obj;
        this.f28984c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f28982a) {
            case 0:
                u70 u70Var = (u70) this.f28983b;
                u70.J0(u70Var.getContext(), u70Var.f30858k1, u70Var.f30862p1, this.f28984c);
                return;
            case 1:
                u70 u70Var2 = (u70) this.f28983b;
                u70.J0(u70Var2.getContext(), u70Var2.f30858k1, u70Var2.f30862p1, this.f28984c);
                return;
            default:
                vh.o8 o8Var = (vh.o8) this.f28983b;
                o8Var.f51688z2 = false;
                o8Var.X0.x(7, true);
                if (this.f28984c) {
                    o8Var.p(true);
                    return;
                }
                return;
        }
    }
}
