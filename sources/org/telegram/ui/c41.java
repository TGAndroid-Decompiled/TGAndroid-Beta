package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c41 implements r0.o, org.telegram.ui.ActionBar.b2 {
    public final int f36989a;
    public final f41 f36990b;

    public c41(f41 f41Var, int i10) {
        this.f36989a = i10;
        this.f36990b = f41Var;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        f41 f41Var = this.f36990b;
        f41Var.f37991e = defaultWindowInsets;
        f41Var.f37990c.setPadding(defaultWindowInsets.f8186a, defaultWindowInsets.f8187b, defaultWindowInsets.f8188c, defaultWindowInsets.d);
        f41Var.f37989b.requestLayout();
        return r0.m1.f46842b;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f36989a) {
            case 1:
                org.telegram.ui.ActionBar.c2 c2Var2 = this.f36990b.Y;
                if (c2Var2 != null) {
                    c2Var2.dismiss();
                    return;
                }
                return;
            default:
                f41 f41Var = this.f36990b;
                org.telegram.ui.ActionBar.c2 c2Var3 = f41Var.Y;
                if (c2Var3 != null) {
                    c2Var3.dismiss();
                    f41Var.Y = null;
                }
                f41Var.dismiss();
                return;
        }
    }
}
