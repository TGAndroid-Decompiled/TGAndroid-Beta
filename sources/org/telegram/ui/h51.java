package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h51 implements r0.n, org.telegram.ui.ActionBar.a2 {
    public final int f38258a;
    public final k51 f38259b;

    public h51(k51 k51Var, int i10) {
        this.f38258a = i10;
        this.f38259b = k51Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        k51 k51Var = this.f38259b;
        k51Var.f39138e = defaultWindowInsets;
        k51Var.f39135c.setPadding(defaultWindowInsets.f11576a, defaultWindowInsets.f11577b, defaultWindowInsets.f11578c, defaultWindowInsets.d);
        k51Var.f39133b.requestLayout();
        return r0.k1.f46820b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38258a) {
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.f38259b.f39136c0;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                    return;
                }
                return;
            default:
                k51 k51Var = this.f38259b;
                org.telegram.ui.ActionBar.b2 b2Var3 = k51Var.f39136c0;
                if (b2Var3 != null) {
                    b2Var3.dismiss();
                    k51Var.f39136c0 = null;
                }
                k51Var.dismiss();
                return;
        }
    }
}
