package org.telegram.ui.Wallet;

import android.view.View;
public final class h3 implements o1.g {
    public final int f34282a;
    public final n3 f34283b;

    public h3(n3 n3Var, int i10) {
        this.f34282a = i10;
        this.f34283b = n3Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f34282a) {
            case 0:
                n3 n3Var = this.f34283b;
                n3Var.C = f7;
                n3Var.f34555a.invalidate();
                return;
            case 1:
                n3 n3Var2 = this.f34283b;
                n3Var2.f34560c0 = f7;
                org.telegram.ui.Cells.w0 w0Var = n3Var2.f34555a;
                w0Var.invalidate();
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                n3 n3Var3 = this.f34283b;
                n3Var3.f34556a0 = f7;
                org.telegram.ui.Cells.w0 w0Var2 = n3Var3.f34555a;
                w0Var2.invalidate();
                if (w0Var2.getParent() instanceof View) {
                    ((View) w0Var2.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
