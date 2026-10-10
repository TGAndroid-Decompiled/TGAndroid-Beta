package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class e90 implements DialogInterface.OnDismissListener {
    public final int f25974a;
    public final Object f25975b;
    public final boolean f25976c;

    public e90(int i10, Object obj, boolean z10) {
        this.f25974a = i10;
        this.f25975b = obj;
        this.f25976c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f25974a) {
            case 0:
                j90 j90Var = (j90) this.f25975b;
                j90.y(j90Var.getContext(), j90Var.f27620c, j90Var.f27623n, this.f25976c);
                return;
            case 1:
                j90 j90Var2 = (j90) this.f25975b;
                j90.y(j90Var2.getContext(), j90Var2.f27620c, j90Var2.f27623n, this.f25976c);
                return;
            default:
                ci.lc lcVar = (ci.lc) this.f25975b;
                lcVar.f5543z2 = false;
                lcVar.X0.x(7, true);
                if (this.f25976c) {
                    lcVar.p(true);
                    return;
                }
                return;
        }
    }
}
