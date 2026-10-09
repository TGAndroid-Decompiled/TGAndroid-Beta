package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h51 implements r0.n, org.telegram.ui.ActionBar.a2 {
    public final int f38214a;
    public final k51 f38215b;

    public h51(k51 k51Var, int i10) {
        this.f38214a = i10;
        this.f38215b = k51Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        k51 k51Var = this.f38215b;
        k51Var.f39094e = defaultWindowInsets;
        k51Var.f39091c.setPadding(defaultWindowInsets.f11576a, defaultWindowInsets.f11577b, defaultWindowInsets.f11578c, defaultWindowInsets.d);
        k51Var.f39089b.requestLayout();
        return r0.k1.f46776b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38214a) {
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.f38215b.f39092c0;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                    return;
                }
                return;
            default:
                k51 k51Var = this.f38215b;
                org.telegram.ui.ActionBar.b2 b2Var3 = k51Var.f39092c0;
                if (b2Var3 != null) {
                    b2Var3.dismiss();
                    k51Var.f39092c0 = null;
                }
                k51Var.dismiss();
                return;
        }
    }
}
