package org.telegram.ui.Wallet;

import android.view.View;
public final class g3 implements o1.g {
    public final int f34537a;
    public final m3 f34538b;

    public g3(m3 m3Var, int i10) {
        this.f34537a = i10;
        this.f34538b = m3Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f34537a) {
            case 0:
                m3 m3Var = this.f34538b;
                m3Var.C = f7;
                m3Var.f34804a.invalidate();
                return;
            case 1:
                m3 m3Var2 = this.f34538b;
                m3Var2.f34809c0 = f7;
                org.telegram.ui.Cells.v0 v0Var = m3Var2.f34804a;
                v0Var.invalidate();
                if (v0Var.getParent() instanceof View) {
                    ((View) v0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                m3 m3Var3 = this.f34538b;
                m3Var3.f34805a0 = f7;
                org.telegram.ui.Cells.v0 v0Var2 = m3Var3.f34804a;
                v0Var2.invalidate();
                if (v0Var2.getParent() instanceof View) {
                    ((View) v0Var2.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
