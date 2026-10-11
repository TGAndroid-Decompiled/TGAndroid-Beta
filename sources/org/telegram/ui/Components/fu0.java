package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class fu0 implements View.OnClickListener {
    public final int f26494a;
    public final org.telegram.ui.ActionBar.e1 f26495b;
    public final org.telegram.ui.ActionBar.e1 f26496c;
    public final hu0 d;

    public fu0(hu0 hu0Var, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, int i10) {
        this.f26494a = i10;
        this.d = hu0Var;
        this.f26495b = e1Var;
        this.f26496c = e1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26494a) {
            case 0:
                dw0 dw0Var = this.d.d;
                if (!dw0Var.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var = this.f26495b;
                    boolean z10 = e1Var.getCheckView().f25656a.f24089q;
                    org.telegram.ui.ActionBar.e1 e1Var2 = this.f26496c;
                    if (!z10 && e1Var2.getCheckView().f25656a.f24089q) {
                        float f7 = -dw0Var.f25729s1;
                        dw0Var.f25729s1 = f7;
                        AndroidUtilities.shakeViewSpring(e1Var2, f7);
                        return;
                    }
                    e1Var2.setChecked(!e1Var2.getCheckView().f25656a.f24089q);
                    if (e1Var2.getCheckView().f25656a.f24089q && e1Var.getCheckView().f25656a.f24089q) {
                        dw0Var.f25731t1[0].f30881q = 0;
                    } else {
                        dw0Var.f25731t1[0].f30881q = 2;
                    }
                    dw0.s(dw0Var);
                    return;
                }
                return;
            default:
                dw0 dw0Var2 = this.d.d;
                if (!dw0Var2.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var3 = this.f26495b;
                    boolean z11 = e1Var3.getCheckView().f25656a.f24089q;
                    org.telegram.ui.ActionBar.e1 e1Var4 = this.f26496c;
                    if (!z11 && e1Var4.getCheckView().f25656a.f24089q) {
                        float f10 = -dw0Var2.f25729s1;
                        dw0Var2.f25729s1 = f10;
                        AndroidUtilities.shakeViewSpring(e1Var4, f10);
                        return;
                    }
                    e1Var4.setChecked(!e1Var4.getCheckView().f25656a.f24089q);
                    if (e1Var3.getCheckView().f25656a.f24089q && e1Var4.getCheckView().f25656a.f24089q) {
                        dw0Var2.f25731t1[0].f30881q = 0;
                    } else {
                        dw0Var2.f25731t1[0].f30881q = 1;
                    }
                    dw0.s(dw0Var2);
                    return;
                }
                return;
        }
    }
}
