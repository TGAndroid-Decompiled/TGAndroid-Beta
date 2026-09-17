package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h51 implements r0.n, org.telegram.ui.ActionBar.b2 {
    public final int f34178a;
    public final k51 f34179b;

    public h51(k51 k51Var, int i10) {
        this.f34178a = i10;
        this.f34179b = k51Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        k51 k51Var = this.f34179b;
        k51Var.e = defaultWindowInsets;
        k51Var.f34998c.setPadding(defaultWindowInsets.f10591a, defaultWindowInsets.f10592b, defaultWindowInsets.f10593c, defaultWindowInsets.d);
        k51Var.f34996b.requestLayout();
        return r0.l1.f41876b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f34178a) {
            case 1:
                org.telegram.ui.ActionBar.c2 c2Var2 = this.f34179b.f34999c0;
                if (c2Var2 != null) {
                    c2Var2.dismiss();
                    return;
                }
                return;
            default:
                k51 k51Var = this.f34179b;
                org.telegram.ui.ActionBar.c2 c2Var3 = k51Var.f34999c0;
                if (c2Var3 != null) {
                    c2Var3.dismiss();
                    k51Var.f34999c0 = null;
                }
                k51Var.dismiss();
                return;
        }
    }
}
