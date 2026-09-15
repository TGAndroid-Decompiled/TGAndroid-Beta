package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e51 implements r0.n, org.telegram.ui.ActionBar.a2 {
    public final int f33219a;
    public final h51 f33220b;

    public e51(h51 h51Var, int i10) {
        this.f33219a = i10;
        this.f33220b = h51Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        h51 h51Var = this.f33220b;
        h51Var.e = defaultWindowInsets;
        h51Var.f34163c.setPadding(defaultWindowInsets.f10588a, defaultWindowInsets.f10589b, defaultWindowInsets.f10590c, defaultWindowInsets.d);
        h51Var.f34161b.requestLayout();
        return r0.l1.f41854b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f33219a) {
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.f33220b.f34164c0;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                    return;
                }
                return;
            default:
                h51 h51Var = this.f33220b;
                org.telegram.ui.ActionBar.b2 b2Var3 = h51Var.f34164c0;
                if (b2Var3 != null) {
                    b2Var3.dismiss();
                    h51Var.f34164c0 = null;
                }
                h51Var.dismiss();
                return;
        }
    }
}
