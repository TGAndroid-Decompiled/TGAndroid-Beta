package org.telegram.ui.Wallet;

import android.view.View;
public final class g3 implements o1.g {
    public final int f36591a;
    public final m3 f36592b;

    public g3(m3 m3Var, int i10) {
        this.f36591a = i10;
        this.f36592b = m3Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f36591a) {
            case 0:
                m3 m3Var = this.f36592b;
                m3Var.C = f7;
                m3Var.f36884a.invalidate();
                return;
            case 1:
                m3 m3Var2 = this.f36592b;
                m3Var2.f36889c0 = f7;
                org.telegram.ui.Cells.v0 v0Var = m3Var2.f36884a;
                v0Var.invalidate();
                if (v0Var.getParent() instanceof View) {
                    ((View) v0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                m3 m3Var3 = this.f36592b;
                m3Var3.f36885a0 = f7;
                org.telegram.ui.Cells.v0 v0Var2 = m3Var3.f36884a;
                v0Var2.invalidate();
                if (v0Var2.getParent() instanceof View) {
                    ((View) v0Var2.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
