package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class k51 implements r0.n, org.telegram.ui.ActionBar.c2 {
    public final int f34231a;
    public final n51 f34232b;

    public k51(n51 n51Var, int i10) {
        this.f34231a = i10;
        this.f34232b = n51Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        n51 n51Var = this.f34232b;
        n51Var.e = defaultWindowInsets;
        n51Var.f35124c.setPadding(defaultWindowInsets.f10074a, defaultWindowInsets.f10075b, defaultWindowInsets.f10076c, defaultWindowInsets.d);
        n51Var.f35122b.requestLayout();
        return r0.l1.f41073b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f34231a) {
            case 1:
                org.telegram.ui.ActionBar.d2 d2Var2 = this.f34232b.f35125c0;
                if (d2Var2 != null) {
                    d2Var2.dismiss();
                    return;
                }
                return;
            default:
                n51 n51Var = this.f34232b;
                org.telegram.ui.ActionBar.d2 d2Var3 = n51Var.f35125c0;
                if (d2Var3 != null) {
                    d2Var3.dismiss();
                    n51Var.f35125c0 = null;
                }
                n51Var.dismiss();
                return;
        }
    }
}
