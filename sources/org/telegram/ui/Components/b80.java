package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class b80 implements DialogInterface.OnDismissListener {
    public final int f24595a;
    public final Object f24596b;
    public final boolean f24597c;

    public b80(int i10, Object obj, boolean z10) {
        this.f24595a = i10;
        this.f24596b = obj;
        this.f24597c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f24595a) {
            case 0:
                g80 g80Var = (g80) this.f24596b;
                g80.w(g80Var.getContext(), g80Var.f26322c, g80Var.f26325n, this.f24597c);
                return;
            case 1:
                g80 g80Var2 = (g80) this.f24596b;
                g80.w(g80Var2.getContext(), g80Var2.f26322c, g80Var2.f26325n, this.f24597c);
                return;
            default:
                di.pc pcVar = (di.pc) this.f24596b;
                pcVar.f7926z2 = false;
                pcVar.X0.x(7, true);
                if (this.f24597c) {
                    pcVar.q(true);
                    return;
                }
                return;
        }
    }
}
