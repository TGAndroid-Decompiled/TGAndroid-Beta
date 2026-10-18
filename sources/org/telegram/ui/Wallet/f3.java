package org.telegram.ui.Wallet;

import android.view.View;
public final class f3 implements o1.g {
    public final int f34228a;
    public final l3 f34229b;

    public f3(l3 l3Var, int i10) {
        this.f34228a = i10;
        this.f34229b = l3Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f34228a) {
            case 0:
                l3 l3Var = this.f34229b;
                l3Var.C = f7;
                l3Var.f34446a.invalidate();
                return;
            case 1:
                l3 l3Var2 = this.f34229b;
                l3Var2.f34451c0 = f7;
                org.telegram.ui.Cells.w0 w0Var = l3Var2.f34446a;
                w0Var.invalidate();
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                l3 l3Var3 = this.f34229b;
                l3Var3.f34447a0 = f7;
                org.telegram.ui.Cells.w0 w0Var2 = l3Var3.f34446a;
                w0Var2.invalidate();
                if (w0Var2.getParent() instanceof View) {
                    ((View) w0Var2.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
