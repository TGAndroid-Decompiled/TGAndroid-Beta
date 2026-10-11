package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class g51 implements r0.n, org.telegram.ui.ActionBar.z1 {
    public final int f37866a;
    public final j51 f37867b;

    public g51(j51 j51Var, int i10) {
        this.f37866a = i10;
        this.f37867b = j51Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        j51 j51Var = this.f37867b;
        j51Var.f38848e = defaultWindowInsets;
        j51Var.f38845c.setPadding(defaultWindowInsets.f11575a, defaultWindowInsets.f11576b, defaultWindowInsets.f11577c, defaultWindowInsets.d);
        j51Var.f38843b.requestLayout();
        return r0.k1.f46866b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f37866a) {
            case 1:
                org.telegram.ui.ActionBar.a2 a2Var2 = this.f37867b.f38846c0;
                if (a2Var2 != null) {
                    a2Var2.dismiss();
                    return;
                }
                return;
            default:
                j51 j51Var = this.f37867b;
                org.telegram.ui.ActionBar.a2 a2Var3 = j51Var.f38846c0;
                if (a2Var3 != null) {
                    a2Var3.dismiss();
                    j51Var.f38846c0 = null;
                }
                j51Var.dismiss();
                return;
        }
    }
}
