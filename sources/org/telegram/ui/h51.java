package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h51 implements r0.n, org.telegram.ui.ActionBar.b2 {
    public final int f34183a;
    public final k51 f34184b;

    public h51(k51 k51Var, int i10) {
        this.f34183a = i10;
        this.f34184b = k51Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        k51 k51Var = this.f34184b;
        k51Var.e = defaultWindowInsets;
        k51Var.f35003c.setPadding(defaultWindowInsets.f10591a, defaultWindowInsets.f10592b, defaultWindowInsets.f10593c, defaultWindowInsets.d);
        k51Var.f35001b.requestLayout();
        return r0.l1.f41881b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f34183a) {
            case 1:
                org.telegram.ui.ActionBar.c2 c2Var2 = this.f34184b.f35004c0;
                if (c2Var2 != null) {
                    c2Var2.dismiss();
                    return;
                }
                return;
            default:
                k51 k51Var = this.f34184b;
                org.telegram.ui.ActionBar.c2 c2Var3 = k51Var.f35004c0;
                if (c2Var3 != null) {
                    c2Var3.dismiss();
                    k51Var.f35004c0 = null;
                }
                k51Var.dismiss();
                return;
        }
    }
}
