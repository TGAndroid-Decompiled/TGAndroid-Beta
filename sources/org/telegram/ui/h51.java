package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h51 implements r0.n, org.telegram.ui.ActionBar.a2 {
    public final int f36915a;
    public final k51 f36916b;

    public h51(k51 k51Var, int i10) {
        this.f36915a = i10;
        this.f36916b = k51Var;
    }

    @Override
    public r0.l1 T0(View view, r0.l1 l1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        k51 k51Var = this.f36916b;
        k51Var.f37951e = defaultWindowInsets;
        k51Var.f37948c.setPadding(defaultWindowInsets.f11451a, defaultWindowInsets.f11452b, defaultWindowInsets.f11453c, defaultWindowInsets.d);
        k51Var.f37946b.requestLayout();
        return r0.l1.f44738b;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36915a) {
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.f36916b.f37949c0;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                    return;
                }
                return;
            default:
                k51 k51Var = this.f36916b;
                org.telegram.ui.ActionBar.b2 b2Var3 = k51Var.f37949c0;
                if (b2Var3 != null) {
                    b2Var3.dismiss();
                    k51Var.f37949c0 = null;
                }
                k51Var.dismiss();
                return;
        }
    }
}
