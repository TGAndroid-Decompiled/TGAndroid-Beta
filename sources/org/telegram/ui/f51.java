package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class f51 implements r0.n, org.telegram.ui.ActionBar.a2 {
    public final int f33438a;
    public final i51 f33439b;

    public f51(i51 i51Var, int i10) {
        this.f33438a = i10;
        this.f33439b = i51Var;
    }

    @Override
    public r0.m1 Q0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        i51 i51Var = this.f33439b;
        i51Var.e = defaultWindowInsets;
        i51Var.f34317c.setPadding(defaultWindowInsets.f10591a, defaultWindowInsets.f10592b, defaultWindowInsets.f10593c, defaultWindowInsets.d);
        i51Var.f34315b.requestLayout();
        return r0.m1.f42108b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f33438a) {
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.f33439b.f34318c0;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                    return;
                }
                return;
            default:
                i51 i51Var = this.f33439b;
                org.telegram.ui.ActionBar.b2 b2Var3 = i51Var.f34318c0;
                if (b2Var3 != null) {
                    b2Var3.dismiss();
                    i51Var.f34318c0 = null;
                }
                i51Var.dismiss();
                return;
        }
    }
}
