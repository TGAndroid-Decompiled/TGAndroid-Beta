package org.telegram.ui.Wallet;

import android.view.View;
public final class g4 implements r1.d {
    public final int f44269a;
    public final m4 f44270b;

    public g4(m4 m4Var, int i7) {
        this.f44269a = i7;
        this.f44270b = m4Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f44269a) {
            case 0:
                m4 m4Var = this.f44270b;
                m4Var.C = f10;
                m4Var.f44525a.invalidate();
                return;
            case 1:
                m4 m4Var2 = this.f44270b;
                m4Var2.f44530c0 = f10;
                org.telegram.ui.Cells.v0 v0Var = m4Var2.f44525a;
                v0Var.invalidate();
                if (v0Var.getParent() instanceof View) {
                    ((View) v0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                m4 m4Var3 = this.f44270b;
                m4Var3.f44526a0 = f10;
                org.telegram.ui.Cells.v0 v0Var2 = m4Var3.f44525a;
                v0Var2.invalidate();
                if (v0Var2.getParent() instanceof View) {
                    ((View) v0Var2.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
