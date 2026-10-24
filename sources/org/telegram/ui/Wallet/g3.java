package org.telegram.ui.Wallet;

import android.view.View;
public final class g3 implements o1.g {
    public final int f34539a;
    public final m3 f34540b;

    public g3(m3 m3Var, int i10) {
        this.f34539a = i10;
        this.f34540b = m3Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f34539a) {
            case 0:
                m3 m3Var = this.f34540b;
                m3Var.C = f7;
                m3Var.f34806a.invalidate();
                return;
            case 1:
                m3 m3Var2 = this.f34540b;
                m3Var2.f34811c0 = f7;
                org.telegram.ui.Cells.v0 v0Var = m3Var2.f34806a;
                v0Var.invalidate();
                if (v0Var.getParent() instanceof View) {
                    ((View) v0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                m3 m3Var3 = this.f34540b;
                m3Var3.f34807a0 = f7;
                org.telegram.ui.Cells.v0 v0Var2 = m3Var3.f34806a;
                v0Var2.invalidate();
                if (v0Var2.getParent() instanceof View) {
                    ((View) v0Var2.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
