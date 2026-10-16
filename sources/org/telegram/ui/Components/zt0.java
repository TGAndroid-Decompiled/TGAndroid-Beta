package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class zt0 implements View.OnClickListener {
    public final int f31684a;
    public final org.telegram.ui.ActionBar.e1 f31685b;
    public final org.telegram.ui.ActionBar.e1 f31686c;
    public final bu0 d;

    public zt0(bu0 bu0Var, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, int i10) {
        this.f31684a = i10;
        this.d = bu0Var;
        this.f31685b = e1Var;
        this.f31686c = e1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31684a) {
            case 0:
                xv0 xv0Var = this.d.d;
                if (!xv0Var.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var = this.f31685b;
                    boolean z10 = e1Var.getCheckView().f23281a.f22792q;
                    org.telegram.ui.ActionBar.e1 e1Var2 = this.f31686c;
                    if (!z10 && e1Var2.getCheckView().f23281a.f22792q) {
                        float f7 = -xv0Var.f31063s1;
                        xv0Var.f31063s1 = f7;
                        AndroidUtilities.shakeViewSpring(e1Var2, f7);
                        return;
                    }
                    e1Var2.setChecked(!e1Var2.getCheckView().f23281a.f22792q);
                    if (e1Var2.getCheckView().f23281a.f22792q && e1Var.getCheckView().f23281a.f22792q) {
                        xv0Var.f31065t1[0].f27224q = 0;
                    } else {
                        xv0Var.f31065t1[0].f27224q = 2;
                    }
                    xv0.s(xv0Var);
                    return;
                }
                return;
            default:
                xv0 xv0Var2 = this.d.d;
                if (!xv0Var2.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var3 = this.f31685b;
                    boolean z11 = e1Var3.getCheckView().f23281a.f22792q;
                    org.telegram.ui.ActionBar.e1 e1Var4 = this.f31686c;
                    if (!z11 && e1Var4.getCheckView().f23281a.f22792q) {
                        float f10 = -xv0Var2.f31063s1;
                        xv0Var2.f31063s1 = f10;
                        AndroidUtilities.shakeViewSpring(e1Var4, f10);
                        return;
                    }
                    e1Var4.setChecked(!e1Var4.getCheckView().f23281a.f22792q);
                    if (e1Var3.getCheckView().f23281a.f22792q && e1Var4.getCheckView().f23281a.f22792q) {
                        xv0Var2.f31065t1[0].f27224q = 0;
                    } else {
                        xv0Var2.f31065t1[0].f27224q = 1;
                    }
                    xv0.s(xv0Var2);
                    return;
                }
                return;
        }
    }
}
