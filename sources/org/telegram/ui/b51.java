package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b51 implements r0.n, org.telegram.ui.ActionBar.a2 {
    public final int f34995a;
    public final e51 f34996b;

    public b51(e51 e51Var, int i10) {
        this.f34995a = i10;
        this.f34996b = e51Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        e51 e51Var = this.f34996b;
        e51Var.f35920e = defaultWindowInsets;
        e51Var.f35917c.setPadding(defaultWindowInsets.f11525a, defaultWindowInsets.f11526b, defaultWindowInsets.f11527c, defaultWindowInsets.d);
        e51Var.f35915b.requestLayout();
        return r0.l1.f45609b;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f34995a) {
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.f34996b.f35918c0;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                    return;
                }
                return;
            default:
                e51 e51Var = this.f34996b;
                org.telegram.ui.ActionBar.b2 b2Var3 = e51Var.f35918c0;
                if (b2Var3 != null) {
                    b2Var3.dismiss();
                    e51Var.f35918c0 = null;
                }
                e51Var.dismiss();
                return;
        }
    }
}
