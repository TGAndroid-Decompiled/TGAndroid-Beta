package org.telegram.ui.Wallet;

import android.view.View;
public final class g3 implements o1.g {
    public final int f34220a;
    public final m3 f34221b;

    public g3(m3 m3Var, int i10) {
        this.f34220a = i10;
        this.f34221b = m3Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f34220a) {
            case 0:
                m3 m3Var = this.f34221b;
                m3Var.C = f7;
                m3Var.f34482a.invalidate();
                return;
            case 1:
                m3 m3Var2 = this.f34221b;
                m3Var2.f34487c0 = f7;
                org.telegram.ui.Cells.w0 w0Var = m3Var2.f34482a;
                w0Var.invalidate();
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                m3 m3Var3 = this.f34221b;
                m3Var3.f34483a0 = f7;
                org.telegram.ui.Cells.w0 w0Var2 = m3Var3.f34482a;
                w0Var2.invalidate();
                if (w0Var2.getParent() instanceof View) {
                    ((View) w0Var2.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
