package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class f80 implements DialogInterface.OnDismissListener {
    public final int f26786a;
    public final Object f26787b;
    public final boolean f26788c;

    public f80(int i10, Object obj, boolean z4) {
        this.f26786a = i10;
        this.f26787b = obj;
        this.f26788c = z4;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f26786a) {
            case 0:
                j80 j80Var = (j80) this.f26787b;
                j80.w(j80Var.getContext(), j80Var.f28070c, j80Var.f28073n, this.f26788c);
                return;
            case 1:
                j80 j80Var2 = (j80) this.f26787b;
                j80.w(j80Var2.getContext(), j80Var2.f28070c, j80Var2.f28073n, this.f26788c);
                return;
            default:
                qh.ca caVar = (qh.ca) this.f26787b;
                caVar.f45148w2 = false;
                caVar.U0.x(7, true);
                if (this.f26788c) {
                    caVar.q(true);
                    return;
                }
                return;
        }
    }
}
