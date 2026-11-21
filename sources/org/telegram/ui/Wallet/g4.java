package org.telegram.ui.Wallet;

import android.view.View;
public final class g4 implements r1.d {
    public final int f44299a;
    public final m4 f44300b;

    public g4(m4 m4Var, int i7) {
        this.f44299a = i7;
        this.f44300b = m4Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f44299a) {
            case 0:
                m4 m4Var = this.f44300b;
                m4Var.C = f10;
                m4Var.f44555a.invalidate();
                return;
            case 1:
                m4 m4Var2 = this.f44300b;
                m4Var2.f44560c0 = f10;
                org.telegram.ui.Cells.v0 v0Var = m4Var2.f44555a;
                v0Var.invalidate();
                if (v0Var.getParent() instanceof View) {
                    ((View) v0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                m4 m4Var3 = this.f44300b;
                m4Var3.f44556a0 = f10;
                org.telegram.ui.Cells.v0 v0Var2 = m4Var3.f44555a;
                v0Var2.invalidate();
                if (v0Var2.getParent() instanceof View) {
                    ((View) v0Var2.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
