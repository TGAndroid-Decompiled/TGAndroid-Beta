package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class k51 implements r0.n, org.telegram.ui.ActionBar.z1 {
    public final int f39368a;
    public final n51 f39369b;

    public k51(n51 n51Var, int i10) {
        this.f39368a = i10;
        this.f39369b = n51Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        n51 n51Var = this.f39369b;
        n51Var.f40226e = defaultWindowInsets;
        n51Var.f40223c.setPadding(defaultWindowInsets.f11574a, defaultWindowInsets.f11575b, defaultWindowInsets.f11576c, defaultWindowInsets.d);
        n51Var.f40221b.requestLayout();
        return r0.k1.f46999b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f39368a) {
            case 1:
                org.telegram.ui.ActionBar.a2 a2Var2 = this.f39369b.f40224c0;
                if (a2Var2 != null) {
                    a2Var2.dismiss();
                    return;
                }
                return;
            default:
                n51 n51Var = this.f39369b;
                org.telegram.ui.ActionBar.a2 a2Var3 = n51Var.f40224c0;
                if (a2Var3 != null) {
                    a2Var3.dismiss();
                    n51Var.f40224c0 = null;
                }
                n51Var.dismiss();
                return;
        }
    }
}
