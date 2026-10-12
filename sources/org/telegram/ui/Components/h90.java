package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class h90 implements DialogInterface.OnDismissListener {
    public final int f26701a;
    public final Object f26702b;
    public final boolean f26703c;

    public h90(int i10, Object obj, boolean z10) {
        this.f26701a = i10;
        this.f26702b = obj;
        this.f26703c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f26701a) {
            case 0:
                m90 m90Var = (m90) this.f26702b;
                m90.y(m90Var.getContext(), m90Var.f28450c, m90Var.f28453n, this.f26703c);
                return;
            case 1:
                m90 m90Var2 = (m90) this.f26702b;
                m90.y(m90Var2.getContext(), m90Var2.f28450c, m90Var2.f28453n, this.f26703c);
                return;
            default:
                ci.lc lcVar = (ci.lc) this.f26702b;
                lcVar.f5541z2 = false;
                lcVar.X0.x(7, true);
                if (this.f26703c) {
                    lcVar.p(true);
                    return;
                }
                return;
        }
    }
}
