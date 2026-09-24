package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class m80 implements DialogInterface.OnDismissListener {
    public final int f26396a;
    public final Object f26397b;
    public final boolean f26398c;

    public m80(int i10, Object obj, boolean z10) {
        this.f26396a = i10;
        this.f26397b = obj;
        this.f26398c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f26396a) {
            case 0:
                r80 r80Var = (r80) this.f26397b;
                r80.w(r80Var.getContext(), r80Var.f27897c, r80Var.f27899n, this.f26398c);
                return;
            case 1:
                r80 r80Var2 = (r80) this.f26397b;
                r80.w(r80Var2.getContext(), r80Var2.f27897c, r80Var2.f27899n, this.f26398c);
                return;
            default:
                ci.lc lcVar = (ci.lc) this.f26397b;
                lcVar.f5110z2 = false;
                lcVar.X0.x(7, true);
                if (this.f26398c) {
                    lcVar.q(true);
                    return;
                }
                return;
        }
    }
}
