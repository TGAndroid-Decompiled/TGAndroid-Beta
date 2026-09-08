package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class b80 implements DialogInterface.OnDismissListener {
    public final int f24622a;
    public final Object f24623b;
    public final boolean f24624c;

    public b80(int i10, Object obj, boolean z10) {
        this.f24622a = i10;
        this.f24623b = obj;
        this.f24624c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f24622a) {
            case 0:
                g80 g80Var = (g80) this.f24623b;
                g80.w(g80Var.getContext(), g80Var.f26349c, g80Var.f26352n, this.f24624c);
                return;
            case 1:
                g80 g80Var2 = (g80) this.f24623b;
                g80.w(g80Var2.getContext(), g80Var2.f26349c, g80Var2.f26352n, this.f24624c);
                return;
            default:
                di.pc pcVar = (di.pc) this.f24623b;
                pcVar.f7954z2 = false;
                pcVar.X0.x(7, true);
                if (this.f24624c) {
                    pcVar.q(true);
                    return;
                }
                return;
        }
    }
}
