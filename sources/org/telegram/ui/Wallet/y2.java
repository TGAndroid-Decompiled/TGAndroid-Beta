package org.telegram.ui.Wallet;

import android.view.View;
public final class y2 implements o1.g {
    public final int f35688a;
    public final d3 f35689b;

    public y2(d3 d3Var, int i10) {
        this.f35688a = i10;
        this.f35689b = d3Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f35688a) {
            case 0:
                d3 d3Var = this.f35689b;
                d3Var.C = f7;
                d3Var.f34773a.invalidate();
                return;
            case 1:
                d3 d3Var2 = this.f35689b;
                d3Var2.f34778c0 = f7;
                org.telegram.ui.Cells.w0 w0Var = d3Var2.f34773a;
                w0Var.invalidate();
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                d3 d3Var3 = this.f35689b;
                d3Var3.f34774a0 = f7;
                org.telegram.ui.Cells.w0 w0Var2 = d3Var3.f34773a;
                w0Var2.invalidate();
                if (w0Var2.getParent() instanceof View) {
                    ((View) w0Var2.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
