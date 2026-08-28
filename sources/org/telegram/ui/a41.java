package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class a41 implements r0.o, org.telegram.ui.ActionBar.b2 {
    public final int f36360a;
    public final d41 f36361b;

    public a41(d41 d41Var, int i9) {
        this.f36360a = i9;
        this.f36361b = d41Var;
    }

    @Override
    public r0.m1 L0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        d41 d41Var = this.f36361b;
        d41Var.f37407e = defaultWindowInsets;
        d41Var.f37406c.setPadding(defaultWindowInsets.f10848a, defaultWindowInsets.f10849b, defaultWindowInsets.f10850c, defaultWindowInsets.d);
        d41Var.f37405b.requestLayout();
        return r0.m1.f46928b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f36360a) {
            case 1:
                org.telegram.ui.ActionBar.c2 c2Var2 = this.f36361b.Y;
                if (c2Var2 != null) {
                    c2Var2.dismiss();
                    return;
                }
                return;
            default:
                d41 d41Var = this.f36361b;
                org.telegram.ui.ActionBar.c2 c2Var3 = d41Var.Y;
                if (c2Var3 != null) {
                    c2Var3.dismiss();
                    d41Var.Y = null;
                }
                d41Var.dismiss();
                return;
        }
    }
}
