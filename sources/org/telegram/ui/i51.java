package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class i51 implements r0.n, org.telegram.ui.ActionBar.a2 {
    public final int f34357a;
    public final l51 f34358b;

    public i51(l51 l51Var, int i10) {
        this.f34357a = i10;
        this.f34358b = l51Var;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        l51 l51Var = this.f34358b;
        l51Var.e = defaultWindowInsets;
        l51Var.f35311c.setPadding(defaultWindowInsets.f10592a, defaultWindowInsets.f10593b, defaultWindowInsets.f10594c, defaultWindowInsets.d);
        l51Var.f35309b.requestLayout();
        return r0.l1.f42153b;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f34357a) {
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.f34358b.f35312c0;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                    return;
                }
                return;
            default:
                l51 l51Var = this.f34358b;
                org.telegram.ui.ActionBar.b2 b2Var3 = l51Var.f35312c0;
                if (b2Var3 != null) {
                    b2Var3.dismiss();
                    l51Var.f35312c0 = null;
                }
                l51Var.dismiss();
                return;
        }
    }
}
