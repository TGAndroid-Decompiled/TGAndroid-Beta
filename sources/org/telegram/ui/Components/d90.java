package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class d90 implements DialogInterface.OnDismissListener {
    public final int f25697a;
    public final Object f25698b;
    public final boolean f25699c;

    public d90(int i10, Object obj, boolean z10) {
        this.f25697a = i10;
        this.f25698b = obj;
        this.f25699c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f25697a) {
            case 0:
                i90 i90Var = (i90) this.f25698b;
                i90.y(i90Var.getContext(), i90Var.f27374c, i90Var.f27377n, this.f25699c);
                return;
            case 1:
                i90 i90Var2 = (i90) this.f25698b;
                i90.y(i90Var2.getContext(), i90Var2.f27374c, i90Var2.f27377n, this.f25699c);
                return;
            default:
                ci.lc lcVar = (ci.lc) this.f25698b;
                lcVar.f5542z2 = false;
                lcVar.X0.x(7, true);
                if (this.f25699c) {
                    lcVar.p(true);
                    return;
                }
                return;
        }
    }
}
