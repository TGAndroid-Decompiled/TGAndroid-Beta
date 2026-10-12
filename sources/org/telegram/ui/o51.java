package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class o51 implements r0.o, org.telegram.ui.ActionBar.z1 {
    public final int f38869a;
    public final r51 f38870b;

    public o51(r51 r51Var, int i10) {
        this.f38869a = i10;
        this.f38870b = r51Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        r51 r51Var = this.f38870b;
        r51Var.e = defaultWindowInsets;
        r51Var.f39600c.setPadding(defaultWindowInsets.f10888a, defaultWindowInsets.f10889b, defaultWindowInsets.f10890c, defaultWindowInsets.d);
        r51Var.f39598b.requestLayout();
        return r0.l1.f43740b;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f38869a) {
            case 1:
                org.telegram.ui.ActionBar.a2 a2Var2 = this.f38870b.f39601c0;
                if (a2Var2 != null) {
                    a2Var2.dismiss();
                    return;
                }
                return;
            default:
                r51 r51Var = this.f38870b;
                org.telegram.ui.ActionBar.a2 a2Var3 = r51Var.f39601c0;
                if (a2Var3 != null) {
                    a2Var3.dismiss();
                    r51Var.f39601c0 = null;
                }
                r51Var.dismiss();
                return;
        }
    }
}
