package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class v80 implements DialogInterface.OnDismissListener {
    public final int f31376a;
    public final Object f31377b;
    public final boolean f31378c;

    public v80(int i10, Object obj, boolean z10) {
        this.f31376a = i10;
        this.f31377b = obj;
        this.f31378c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f31376a) {
            case 0:
                z80 z80Var = (z80) this.f31377b;
                z80.x(z80Var.getContext(), z80Var.d, z80Var.f33178r, this.f31378c);
                return;
            case 1:
                z80 z80Var2 = (z80) this.f31377b;
                z80.x(z80Var2.getContext(), z80Var2.d, z80Var2.f33178r, this.f31378c);
                return;
            default:
                ei.vb vbVar = (ei.vb) this.f31377b;
                vbVar.f10048z2 = false;
                vbVar.X0.x(7, true);
                if (this.f31378c) {
                    vbVar.p(true);
                    return;
                }
                return;
        }
    }
}
