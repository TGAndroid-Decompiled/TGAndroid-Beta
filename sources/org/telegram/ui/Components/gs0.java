package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class gs0 implements View.OnClickListener {
    public final int f28862a;
    public final org.telegram.ui.ActionBar.g1 f28863b;
    public final org.telegram.ui.ActionBar.g1 f28864c;
    public final is0 d;

    public gs0(is0 is0Var, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2, int i9) {
        this.f28862a = i9;
        this.d = is0Var;
        this.f28863b = g1Var;
        this.f28864c = g1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28862a) {
            case 0:
                eu0 eu0Var = this.d.d;
                if (!eu0Var.D1) {
                    org.telegram.ui.ActionBar.g1 g1Var = this.f28863b;
                    boolean z10 = g1Var.getCheckView().f27781a.f26313q;
                    org.telegram.ui.ActionBar.g1 g1Var2 = this.f28864c;
                    if (!z10 && g1Var2.getCheckView().f27781a.f26313q) {
                        float f10 = -eu0Var.f28153o1;
                        eu0Var.f28153o1 = f10;
                        AndroidUtilities.shakeViewSpring(g1Var2, f10);
                        return;
                    }
                    g1Var2.setChecked(!g1Var2.getCheckView().f27781a.f26313q);
                    if (g1Var2.getCheckView().f27781a.f26313q && g1Var.getCheckView().f27781a.f26313q) {
                        eu0Var.f28155p1[0].f32802q = 0;
                    } else {
                        eu0Var.f28155p1[0].f32802q = 2;
                    }
                    eu0.s(eu0Var);
                    return;
                }
                return;
            default:
                eu0 eu0Var2 = this.d.d;
                if (!eu0Var2.D1) {
                    org.telegram.ui.ActionBar.g1 g1Var3 = this.f28863b;
                    boolean z11 = g1Var3.getCheckView().f27781a.f26313q;
                    org.telegram.ui.ActionBar.g1 g1Var4 = this.f28864c;
                    if (!z11 && g1Var4.getCheckView().f27781a.f26313q) {
                        float f11 = -eu0Var2.f28153o1;
                        eu0Var2.f28153o1 = f11;
                        AndroidUtilities.shakeViewSpring(g1Var4, f11);
                        return;
                    }
                    g1Var4.setChecked(!g1Var4.getCheckView().f27781a.f26313q);
                    if (g1Var3.getCheckView().f27781a.f26313q && g1Var4.getCheckView().f27781a.f26313q) {
                        eu0Var2.f28155p1[0].f32802q = 0;
                    } else {
                        eu0Var2.f28155p1[0].f32802q = 1;
                    }
                    eu0.s(eu0Var2);
                    return;
                }
                return;
        }
    }
}
