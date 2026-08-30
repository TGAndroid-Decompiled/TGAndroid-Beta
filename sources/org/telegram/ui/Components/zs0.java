package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class zs0 implements View.OnClickListener {
    public final int f31439a;
    public final org.telegram.ui.ActionBar.g1 f31440b;
    public final org.telegram.ui.ActionBar.g1 f31441c;
    public final bt0 d;

    public zs0(bt0 bt0Var, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2, int i10) {
        this.f31439a = i10;
        this.d = bt0Var;
        this.f31440b = g1Var;
        this.f31441c = g1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31439a) {
            case 0:
                yu0 yu0Var = this.d.d;
                if (!yu0Var.E1) {
                    org.telegram.ui.ActionBar.g1 g1Var = this.f31440b;
                    boolean z4 = g1Var.getCheckView().f26837a.f22965q;
                    org.telegram.ui.ActionBar.g1 g1Var2 = this.f31441c;
                    if (!z4 && g1Var2.getCheckView().f26837a.f22965q) {
                        float f10 = -yu0Var.f31136p1;
                        yu0Var.f31136p1 = f10;
                        AndroidUtilities.shakeViewSpring(g1Var2, f10);
                        return;
                    }
                    g1Var2.setChecked(!g1Var2.getCheckView().f26837a.f22965q);
                    if (g1Var2.getCheckView().f26837a.f22965q && g1Var.getCheckView().f26837a.f22965q) {
                        yu0Var.f31138q1[0].f27377q = 0;
                    } else {
                        yu0Var.f31138q1[0].f27377q = 2;
                    }
                    yu0.s(yu0Var);
                    return;
                }
                return;
            default:
                yu0 yu0Var2 = this.d.d;
                if (!yu0Var2.E1) {
                    org.telegram.ui.ActionBar.g1 g1Var3 = this.f31440b;
                    boolean z10 = g1Var3.getCheckView().f26837a.f22965q;
                    org.telegram.ui.ActionBar.g1 g1Var4 = this.f31441c;
                    if (!z10 && g1Var4.getCheckView().f26837a.f22965q) {
                        float f11 = -yu0Var2.f31136p1;
                        yu0Var2.f31136p1 = f11;
                        AndroidUtilities.shakeViewSpring(g1Var4, f11);
                        return;
                    }
                    g1Var4.setChecked(!g1Var4.getCheckView().f26837a.f22965q);
                    if (g1Var3.getCheckView().f26837a.f22965q && g1Var4.getCheckView().f26837a.f22965q) {
                        yu0Var2.f31138q1[0].f27377q = 0;
                    } else {
                        yu0Var2.f31138q1[0].f27377q = 1;
                    }
                    yu0.s(yu0Var2);
                    return;
                }
                return;
        }
    }
}
