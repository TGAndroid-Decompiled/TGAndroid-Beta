package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class f51 implements r0.n, org.telegram.ui.ActionBar.a2 {
    public final int f33503a;
    public final i51 f33504b;

    public f51(i51 i51Var, int i10) {
        this.f33503a = i10;
        this.f33504b = i51Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        i51 i51Var = this.f33504b;
        i51Var.e = defaultWindowInsets;
        i51Var.f34416c.setPadding(defaultWindowInsets.f10590a, defaultWindowInsets.f10591b, defaultWindowInsets.f10592c, defaultWindowInsets.d);
        i51Var.f34414b.requestLayout();
        return r0.l1.f41850b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f33503a) {
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.f33504b.f34417c0;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                    return;
                }
                return;
            default:
                i51 i51Var = this.f33504b;
                org.telegram.ui.ActionBar.b2 b2Var3 = i51Var.f34417c0;
                if (b2Var3 != null) {
                    b2Var3.dismiss();
                    i51Var.f34417c0 = null;
                }
                i51Var.dismiss();
                return;
        }
    }
}
