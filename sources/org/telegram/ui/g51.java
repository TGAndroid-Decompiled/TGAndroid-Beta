package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class g51 implements r0.n, org.telegram.ui.ActionBar.z1 {
    public final int f37900a;
    public final j51 f37901b;

    public g51(j51 j51Var, int i10) {
        this.f37900a = i10;
        this.f37901b = j51Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        j51 j51Var = this.f37901b;
        j51Var.f38882e = defaultWindowInsets;
        j51Var.f38879c.setPadding(defaultWindowInsets.f11575a, defaultWindowInsets.f11576b, defaultWindowInsets.f11577c, defaultWindowInsets.d);
        j51Var.f38877b.requestLayout();
        return r0.k1.f46900b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f37900a) {
            case 1:
                org.telegram.ui.ActionBar.a2 a2Var2 = this.f37901b.f38880c0;
                if (a2Var2 != null) {
                    a2Var2.dismiss();
                    return;
                }
                return;
            default:
                j51 j51Var = this.f37901b;
                org.telegram.ui.ActionBar.a2 a2Var3 = j51Var.f38880c0;
                if (a2Var3 != null) {
                    a2Var3.dismiss();
                    j51Var.f38880c0 = null;
                }
                j51Var.dismiss();
                return;
        }
    }
}
