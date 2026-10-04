package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b51 implements r0.n, org.telegram.ui.ActionBar.a2 {
    public final int f34994a;
    public final e51 f34995b;

    public b51(e51 e51Var, int i10) {
        this.f34994a = i10;
        this.f34995b = e51Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        e51 e51Var = this.f34995b;
        e51Var.f35919e = defaultWindowInsets;
        e51Var.f35916c.setPadding(defaultWindowInsets.f11525a, defaultWindowInsets.f11526b, defaultWindowInsets.f11527c, defaultWindowInsets.d);
        e51Var.f35914b.requestLayout();
        return r0.l1.f45608b;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f34994a) {
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.f34995b.f35917c0;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                    return;
                }
                return;
            default:
                e51 e51Var = this.f34995b;
                org.telegram.ui.ActionBar.b2 b2Var3 = e51Var.f35917c0;
                if (b2Var3 != null) {
                    b2Var3.dismiss();
                    e51Var.f35917c0 = null;
                }
                e51Var.dismiss();
                return;
        }
    }
}
