package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class o41 implements r0.o, org.telegram.ui.ActionBar.c2 {
    public final int f39585a;
    public final r41 f39586b;

    public o41(r41 r41Var, int i10) {
        this.f39585a = i10;
        this.f39586b = r41Var;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        r41 r41Var = this.f39586b;
        r41Var.f40770e = defaultWindowInsets;
        r41Var.f40769c.setPadding(defaultWindowInsets.f7757a, defaultWindowInsets.f7758b, defaultWindowInsets.f7759c, defaultWindowInsets.d);
        r41Var.f40767b.requestLayout();
        return r0.m1.f46451b;
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f39585a) {
            case 1:
                org.telegram.ui.ActionBar.d2 d2Var2 = this.f39586b.Z;
                if (d2Var2 != null) {
                    d2Var2.dismiss();
                    return;
                }
                return;
            default:
                r41 r41Var = this.f39586b;
                org.telegram.ui.ActionBar.d2 d2Var3 = r41Var.Z;
                if (d2Var3 != null) {
                    d2Var3.dismiss();
                    r41Var.Z = null;
                }
                r41Var.dismiss();
                return;
        }
    }
}
