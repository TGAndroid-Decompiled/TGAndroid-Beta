package org.telegram.ui.Wallet;

import android.view.View;
public final class g4 implements r1.d {
    public final int f44303a;
    public final m4 f44304b;

    public g4(m4 m4Var, int i7) {
        this.f44303a = i7;
        this.f44304b = m4Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f44303a) {
            case 0:
                m4 m4Var = this.f44304b;
                m4Var.C = f10;
                m4Var.f44559a.invalidate();
                return;
            case 1:
                m4 m4Var2 = this.f44304b;
                m4Var2.f44564c0 = f10;
                org.telegram.ui.Cells.v0 v0Var = m4Var2.f44559a;
                v0Var.invalidate();
                if (v0Var.getParent() instanceof View) {
                    ((View) v0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                m4 m4Var3 = this.f44304b;
                m4Var3.f44560a0 = f10;
                org.telegram.ui.Cells.v0 v0Var2 = m4Var3.f44559a;
                v0Var2.invalidate();
                if (v0Var2.getParent() instanceof View) {
                    ((View) v0Var2.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
