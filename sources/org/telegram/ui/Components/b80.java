package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class b80 implements DialogInterface.OnDismissListener {
    public final int f24623a;
    public final Object f24624b;
    public final boolean f24625c;

    public b80(int i10, Object obj, boolean z10) {
        this.f24623a = i10;
        this.f24624b = obj;
        this.f24625c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f24623a) {
            case 0:
                g80 g80Var = (g80) this.f24624b;
                g80.w(g80Var.getContext(), g80Var.f26350c, g80Var.f26353n, this.f24625c);
                return;
            case 1:
                g80 g80Var2 = (g80) this.f24624b;
                g80.w(g80Var2.getContext(), g80Var2.f26350c, g80Var2.f26353n, this.f24625c);
                return;
            default:
                di.pc pcVar = (di.pc) this.f24624b;
                pcVar.f7954z2 = false;
                pcVar.X0.x(7, true);
                if (this.f24625c) {
                    pcVar.q(true);
                    return;
                }
                return;
        }
    }
}
