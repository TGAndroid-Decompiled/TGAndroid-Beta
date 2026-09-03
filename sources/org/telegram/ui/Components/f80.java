package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class f80 implements DialogInterface.OnDismissListener {
    public final int f26817a;
    public final Object f26818b;
    public final boolean f26819c;

    public f80(int i10, Object obj, boolean z4) {
        this.f26817a = i10;
        this.f26818b = obj;
        this.f26819c = z4;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f26817a) {
            case 0:
                j80 j80Var = (j80) this.f26818b;
                j80.w(j80Var.getContext(), j80Var.f28064c, j80Var.f28067n, this.f26819c);
                return;
            case 1:
                j80 j80Var2 = (j80) this.f26818b;
                j80.w(j80Var2.getContext(), j80Var2.f28064c, j80Var2.f28067n, this.f26819c);
                return;
            default:
                qh.ba baVar = (qh.ba) this.f26818b;
                baVar.f45114w2 = false;
                baVar.U0.x(7, true);
                if (this.f26819c) {
                    baVar.q(true);
                    return;
                }
                return;
        }
    }
}
