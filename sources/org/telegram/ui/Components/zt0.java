package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class zt0 implements View.OnClickListener {
    public final int f31982a;
    public final org.telegram.ui.ActionBar.e1 f31983b;
    public final org.telegram.ui.ActionBar.e1 f31984c;
    public final bu0 d;

    public zt0(bu0 bu0Var, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, int i10) {
        this.f31982a = i10;
        this.d = bu0Var;
        this.f31983b = e1Var;
        this.f31984c = e1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31982a) {
            case 0:
                xv0 xv0Var = this.d.d;
                if (!xv0Var.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var = this.f31983b;
                    boolean z10 = e1Var.getCheckView().f23604a.f23092q;
                    org.telegram.ui.ActionBar.e1 e1Var2 = this.f31984c;
                    if (!z10 && e1Var2.getCheckView().f23604a.f23092q) {
                        float f7 = -xv0Var.f31382s1;
                        xv0Var.f31382s1 = f7;
                        AndroidUtilities.shakeViewSpring(e1Var2, f7);
                        return;
                    }
                    e1Var2.setChecked(!e1Var2.getCheckView().f23604a.f23092q);
                    if (e1Var2.getCheckView().f23604a.f23092q && e1Var.getCheckView().f23604a.f23092q) {
                        xv0Var.f31384t1[0].f27521q = 0;
                    } else {
                        xv0Var.f31384t1[0].f27521q = 2;
                    }
                    xv0.s(xv0Var);
                    return;
                }
                return;
            default:
                xv0 xv0Var2 = this.d.d;
                if (!xv0Var2.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var3 = this.f31983b;
                    boolean z11 = e1Var3.getCheckView().f23604a.f23092q;
                    org.telegram.ui.ActionBar.e1 e1Var4 = this.f31984c;
                    if (!z11 && e1Var4.getCheckView().f23604a.f23092q) {
                        float f10 = -xv0Var2.f31382s1;
                        xv0Var2.f31382s1 = f10;
                        AndroidUtilities.shakeViewSpring(e1Var4, f10);
                        return;
                    }
                    e1Var4.setChecked(!e1Var4.getCheckView().f23604a.f23092q);
                    if (e1Var3.getCheckView().f23604a.f23092q && e1Var4.getCheckView().f23604a.f23092q) {
                        xv0Var2.f31384t1[0].f27521q = 0;
                    } else {
                        xv0Var2.f31384t1[0].f27521q = 1;
                    }
                    xv0.s(xv0Var2);
                    return;
                }
                return;
        }
    }
}
