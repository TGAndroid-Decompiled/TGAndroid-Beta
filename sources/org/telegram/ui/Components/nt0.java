package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class nt0 implements View.OnClickListener {
    public final int f26892a;
    public final org.telegram.ui.ActionBar.g1 f26893b;
    public final org.telegram.ui.ActionBar.g1 f26894c;
    public final pt0 d;

    public nt0(pt0 pt0Var, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2, int i10) {
        this.f26892a = i10;
        this.d = pt0Var;
        this.f26893b = g1Var;
        this.f26894c = g1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26892a) {
            case 0:
                lv0 lv0Var = this.d.d;
                if (!lv0Var.H1) {
                    org.telegram.ui.ActionBar.g1 g1Var = this.f26893b;
                    boolean z10 = g1Var.getCheckView().f27437a.f22197q;
                    org.telegram.ui.ActionBar.g1 g1Var2 = this.f26894c;
                    if (!z10 && g1Var2.getCheckView().f27437a.f22197q) {
                        float f7 = -lv0Var.f26206s1;
                        lv0Var.f26206s1 = f7;
                        AndroidUtilities.shakeViewSpring(g1Var2, f7);
                        return;
                    }
                    g1Var2.setChecked(!g1Var2.getCheckView().f27437a.f22197q);
                    if (g1Var2.getCheckView().f27437a.f22197q && g1Var.getCheckView().f27437a.f22197q) {
                        lv0Var.f26208t1[0].f22780q = 0;
                    } else {
                        lv0Var.f26208t1[0].f22780q = 2;
                    }
                    lv0.s(lv0Var);
                    return;
                }
                return;
            default:
                lv0 lv0Var2 = this.d.d;
                if (!lv0Var2.H1) {
                    org.telegram.ui.ActionBar.g1 g1Var3 = this.f26893b;
                    boolean z11 = g1Var3.getCheckView().f27437a.f22197q;
                    org.telegram.ui.ActionBar.g1 g1Var4 = this.f26894c;
                    if (!z11 && g1Var4.getCheckView().f27437a.f22197q) {
                        float f10 = -lv0Var2.f26206s1;
                        lv0Var2.f26206s1 = f10;
                        AndroidUtilities.shakeViewSpring(g1Var4, f10);
                        return;
                    }
                    g1Var4.setChecked(!g1Var4.getCheckView().f27437a.f22197q);
                    if (g1Var3.getCheckView().f27437a.f22197q && g1Var4.getCheckView().f27437a.f22197q) {
                        lv0Var2.f26208t1[0].f22780q = 0;
                    } else {
                        lv0Var2.f26208t1[0].f22780q = 1;
                    }
                    lv0.s(lv0Var2);
                    return;
                }
                return;
        }
    }
}
