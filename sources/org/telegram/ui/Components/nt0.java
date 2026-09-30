package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class nt0 implements View.OnClickListener {
    public final int f26856a;
    public final org.telegram.ui.ActionBar.e1 f26857b;
    public final org.telegram.ui.ActionBar.e1 f26858c;
    public final pt0 d;

    public nt0(pt0 pt0Var, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, int i10) {
        this.f26856a = i10;
        this.d = pt0Var;
        this.f26857b = e1Var;
        this.f26858c = e1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26856a) {
            case 0:
                lv0 lv0Var = this.d.d;
                if (!lv0Var.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var = this.f26857b;
                    boolean z10 = e1Var.getCheckView().f27393a.f22196q;
                    org.telegram.ui.ActionBar.e1 e1Var2 = this.f26858c;
                    if (!z10 && e1Var2.getCheckView().f27393a.f22196q) {
                        float f7 = -lv0Var.f26148s1;
                        lv0Var.f26148s1 = f7;
                        AndroidUtilities.shakeViewSpring(e1Var2, f7);
                        return;
                    }
                    e1Var2.setChecked(!e1Var2.getCheckView().f27393a.f22196q);
                    if (e1Var2.getCheckView().f27393a.f22196q && e1Var.getCheckView().f27393a.f22196q) {
                        lv0Var.f26150t1[0].f22741q = 0;
                    } else {
                        lv0Var.f26150t1[0].f22741q = 2;
                    }
                    lv0.s(lv0Var);
                    return;
                }
                return;
            default:
                lv0 lv0Var2 = this.d.d;
                if (!lv0Var2.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var3 = this.f26857b;
                    boolean z11 = e1Var3.getCheckView().f27393a.f22196q;
                    org.telegram.ui.ActionBar.e1 e1Var4 = this.f26858c;
                    if (!z11 && e1Var4.getCheckView().f27393a.f22196q) {
                        float f10 = -lv0Var2.f26148s1;
                        lv0Var2.f26148s1 = f10;
                        AndroidUtilities.shakeViewSpring(e1Var4, f10);
                        return;
                    }
                    e1Var4.setChecked(!e1Var4.getCheckView().f27393a.f22196q);
                    if (e1Var3.getCheckView().f27393a.f22196q && e1Var4.getCheckView().f27393a.f22196q) {
                        lv0Var2.f26150t1[0].f22741q = 0;
                    } else {
                        lv0Var2.f26150t1[0].f22741q = 1;
                    }
                    lv0.s(lv0Var2);
                    return;
                }
                return;
        }
    }
}
