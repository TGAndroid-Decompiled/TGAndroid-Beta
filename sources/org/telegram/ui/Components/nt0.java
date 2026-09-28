package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class nt0 implements View.OnClickListener {
    public final int f26857a;
    public final org.telegram.ui.ActionBar.e1 f26858b;
    public final org.telegram.ui.ActionBar.e1 f26859c;
    public final pt0 d;

    public nt0(pt0 pt0Var, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, int i10) {
        this.f26857a = i10;
        this.d = pt0Var;
        this.f26858b = e1Var;
        this.f26859c = e1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26857a) {
            case 0:
                lv0 lv0Var = this.d.d;
                if (!lv0Var.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var = this.f26858b;
                    boolean z10 = e1Var.getCheckView().f27391a.f22194q;
                    org.telegram.ui.ActionBar.e1 e1Var2 = this.f26859c;
                    if (!z10 && e1Var2.getCheckView().f27391a.f22194q) {
                        float f7 = -lv0Var.f26153s1;
                        lv0Var.f26153s1 = f7;
                        AndroidUtilities.shakeViewSpring(e1Var2, f7);
                        return;
                    }
                    e1Var2.setChecked(!e1Var2.getCheckView().f27391a.f22194q);
                    if (e1Var2.getCheckView().f27391a.f22194q && e1Var.getCheckView().f27391a.f22194q) {
                        lv0Var.f26155t1[0].f22743q = 0;
                    } else {
                        lv0Var.f26155t1[0].f22743q = 2;
                    }
                    lv0.s(lv0Var);
                    return;
                }
                return;
            default:
                lv0 lv0Var2 = this.d.d;
                if (!lv0Var2.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var3 = this.f26858b;
                    boolean z11 = e1Var3.getCheckView().f27391a.f22194q;
                    org.telegram.ui.ActionBar.e1 e1Var4 = this.f26859c;
                    if (!z11 && e1Var4.getCheckView().f27391a.f22194q) {
                        float f10 = -lv0Var2.f26153s1;
                        lv0Var2.f26153s1 = f10;
                        AndroidUtilities.shakeViewSpring(e1Var4, f10);
                        return;
                    }
                    e1Var4.setChecked(!e1Var4.getCheckView().f27391a.f22194q);
                    if (e1Var3.getCheckView().f27391a.f22194q && e1Var4.getCheckView().f27391a.f22194q) {
                        lv0Var2.f26155t1[0].f22743q = 0;
                    } else {
                        lv0Var2.f26155t1[0].f22743q = 1;
                    }
                    lv0.s(lv0Var2);
                    return;
                }
                return;
        }
    }
}
