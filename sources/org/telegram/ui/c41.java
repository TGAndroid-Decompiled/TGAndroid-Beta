package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c41 implements r0.n, org.telegram.ui.ActionBar.b2 {
    public final int f38169a;
    public final f41 f38170b;

    public c41(f41 f41Var, int i10) {
        this.f38169a = i10;
        this.f38170b = f41Var;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        f41 f41Var = this.f38170b;
        f41Var.e = defaultWindowInsets;
        f41Var.f39155c.setPadding(defaultWindowInsets.f13449a, defaultWindowInsets.f13450b, defaultWindowInsets.f13451c, defaultWindowInsets.d);
        f41Var.f39153b.requestLayout();
        return r0.k1.f47152b;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f38169a) {
            case 1:
                org.telegram.ui.ActionBar.e2 e2Var2 = this.f38170b.f39156c0;
                if (e2Var2 != null) {
                    e2Var2.dismiss();
                    return;
                }
                return;
            default:
                f41 f41Var = this.f38170b;
                org.telegram.ui.ActionBar.e2 e2Var3 = f41Var.f39156c0;
                if (e2Var3 != null) {
                    e2Var3.dismiss();
                    f41Var.f39156c0 = null;
                }
                f41Var.dismiss();
                return;
        }
    }
}
