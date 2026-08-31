package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class at0 implements View.OnClickListener {
    public final int f25346a;
    public final org.telegram.ui.ActionBar.g1 f25347b;
    public final org.telegram.ui.ActionBar.g1 f25348c;
    public final ct0 d;

    public at0(ct0 ct0Var, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2, int i10) {
        this.f25346a = i10;
        this.d = ct0Var;
        this.f25347b = g1Var;
        this.f25348c = g1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25346a) {
            case 0:
                zu0 zu0Var = this.d.d;
                if (!zu0Var.E1) {
                    org.telegram.ui.ActionBar.g1 g1Var = this.f25347b;
                    boolean z4 = g1Var.getCheckView().f29606a.f24809q;
                    org.telegram.ui.ActionBar.g1 g1Var2 = this.f25348c;
                    if (!z4 && g1Var2.getCheckView().f29606a.f24809q) {
                        float f10 = -zu0Var.f33996p1;
                        zu0Var.f33996p1 = f10;
                        AndroidUtilities.shakeViewSpring(g1Var2, f10);
                        return;
                    }
                    g1Var2.setChecked(!g1Var2.getCheckView().f29606a.f24809q);
                    if (g1Var2.getCheckView().f29606a.f24809q && g1Var.getCheckView().f29606a.f24809q) {
                        zu0Var.f33998q1[0].f29865q = 0;
                    } else {
                        zu0Var.f33998q1[0].f29865q = 2;
                    }
                    zu0.s(zu0Var);
                    return;
                }
                return;
            default:
                zu0 zu0Var2 = this.d.d;
                if (!zu0Var2.E1) {
                    org.telegram.ui.ActionBar.g1 g1Var3 = this.f25347b;
                    boolean z10 = g1Var3.getCheckView().f29606a.f24809q;
                    org.telegram.ui.ActionBar.g1 g1Var4 = this.f25348c;
                    if (!z10 && g1Var4.getCheckView().f29606a.f24809q) {
                        float f11 = -zu0Var2.f33996p1;
                        zu0Var2.f33996p1 = f11;
                        AndroidUtilities.shakeViewSpring(g1Var4, f11);
                        return;
                    }
                    g1Var4.setChecked(!g1Var4.getCheckView().f29606a.f24809q);
                    if (g1Var3.getCheckView().f29606a.f24809q && g1Var4.getCheckView().f29606a.f24809q) {
                        zu0Var2.f33998q1[0].f29865q = 0;
                    } else {
                        zu0Var2.f33998q1[0].f29865q = 1;
                    }
                    zu0.s(zu0Var2);
                    return;
                }
                return;
        }
    }
}
