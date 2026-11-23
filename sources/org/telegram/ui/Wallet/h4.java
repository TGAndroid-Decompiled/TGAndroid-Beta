package org.telegram.ui.Wallet;

import android.view.View;
public final class h4 implements r1.d {
    public final int f44431a;
    public final n4 f44432b;

    public h4(n4 n4Var, int i7) {
        this.f44431a = i7;
        this.f44432b = n4Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f44431a) {
            case 0:
                n4 n4Var = this.f44432b;
                n4Var.C = f10;
                n4Var.f44695a.invalidate();
                return;
            case 1:
                n4 n4Var2 = this.f44432b;
                n4Var2.f44700c0 = f10;
                org.telegram.ui.Cells.v0 v0Var = n4Var2.f44695a;
                v0Var.invalidate();
                if (v0Var.getParent() instanceof View) {
                    ((View) v0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                n4 n4Var3 = this.f44432b;
                n4Var3.f44696a0 = f10;
                org.telegram.ui.Cells.v0 v0Var2 = n4Var3.f44695a;
                v0Var2.invalidate();
                if (v0Var2.getParent() instanceof View) {
                    ((View) v0Var2.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
