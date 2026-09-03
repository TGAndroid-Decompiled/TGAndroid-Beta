package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class zs0 implements View.OnClickListener {
    public final int f31464a;
    public final org.telegram.ui.ActionBar.g1 f31465b;
    public final org.telegram.ui.ActionBar.g1 f31466c;
    public final bt0 d;

    public zs0(bt0 bt0Var, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2, int i10) {
        this.f31464a = i10;
        this.d = bt0Var;
        this.f31465b = g1Var;
        this.f31466c = g1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31464a) {
            case 0:
                yu0 yu0Var = this.d.d;
                if (!yu0Var.E1) {
                    org.telegram.ui.ActionBar.g1 g1Var = this.f31465b;
                    boolean z4 = g1Var.getCheckView().f26377a.f22938q;
                    org.telegram.ui.ActionBar.g1 g1Var2 = this.f31466c;
                    if (!z4 && g1Var2.getCheckView().f26377a.f22938q) {
                        float f10 = -yu0Var.f31147p1;
                        yu0Var.f31147p1 = f10;
                        AndroidUtilities.shakeViewSpring(g1Var2, f10);
                        return;
                    }
                    g1Var2.setChecked(!g1Var2.getCheckView().f26377a.f22938q);
                    if (g1Var2.getCheckView().f26377a.f22938q && g1Var.getCheckView().f26377a.f22938q) {
                        yu0Var.f31149q1[0].f27381q = 0;
                    } else {
                        yu0Var.f31149q1[0].f27381q = 2;
                    }
                    yu0.s(yu0Var);
                    return;
                }
                return;
            default:
                yu0 yu0Var2 = this.d.d;
                if (!yu0Var2.E1) {
                    org.telegram.ui.ActionBar.g1 g1Var3 = this.f31465b;
                    boolean z10 = g1Var3.getCheckView().f26377a.f22938q;
                    org.telegram.ui.ActionBar.g1 g1Var4 = this.f31466c;
                    if (!z10 && g1Var4.getCheckView().f26377a.f22938q) {
                        float f11 = -yu0Var2.f31147p1;
                        yu0Var2.f31147p1 = f11;
                        AndroidUtilities.shakeViewSpring(g1Var4, f11);
                        return;
                    }
                    g1Var4.setChecked(!g1Var4.getCheckView().f26377a.f22938q);
                    if (g1Var3.getCheckView().f26377a.f22938q && g1Var4.getCheckView().f26377a.f22938q) {
                        yu0Var2.f31149q1[0].f27381q = 0;
                    } else {
                        yu0Var2.f31149q1[0].f27381q = 1;
                    }
                    yu0.s(yu0Var2);
                    return;
                }
                return;
        }
    }
}
