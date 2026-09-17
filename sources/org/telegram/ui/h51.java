package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h51 implements r0.n, org.telegram.ui.ActionBar.a2 {
    public final int f36889a;
    public final k51 f36890b;

    public h51(k51 k51Var, int i10) {
        this.f36889a = i10;
        this.f36890b = k51Var;
    }

    @Override
    public r0.l1 T0(View view, r0.l1 l1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        k51 k51Var = this.f36890b;
        k51Var.f37925e = defaultWindowInsets;
        k51Var.f37922c.setPadding(defaultWindowInsets.f11425a, defaultWindowInsets.f11426b, defaultWindowInsets.f11427c, defaultWindowInsets.d);
        k51Var.f37920b.requestLayout();
        return r0.l1.f44711b;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36889a) {
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.f36890b.f37923c0;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                    return;
                }
                return;
            default:
                k51 k51Var = this.f36890b;
                org.telegram.ui.ActionBar.b2 b2Var3 = k51Var.f37923c0;
                if (b2Var3 != null) {
                    b2Var3.dismiss();
                    k51Var.f37923c0 = null;
                }
                k51Var.dismiss();
                return;
        }
    }
}
