package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class b80 implements DialogInterface.OnDismissListener {
    public final int f24596a;
    public final Object f24597b;
    public final boolean f24598c;

    public b80(int i10, Object obj, boolean z10) {
        this.f24596a = i10;
        this.f24597b = obj;
        this.f24598c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f24596a) {
            case 0:
                g80 g80Var = (g80) this.f24597b;
                g80.w(g80Var.getContext(), g80Var.f26323c, g80Var.f26326n, this.f24598c);
                return;
            case 1:
                g80 g80Var2 = (g80) this.f24597b;
                g80.w(g80Var2.getContext(), g80Var2.f26323c, g80Var2.f26326n, this.f24598c);
                return;
            default:
                di.pc pcVar = (di.pc) this.f24597b;
                pcVar.f7926z2 = false;
                pcVar.X0.x(7, true);
                if (this.f24598c) {
                    pcVar.q(true);
                    return;
                }
                return;
        }
    }
}
