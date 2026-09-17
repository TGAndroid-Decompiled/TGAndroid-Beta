package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class bt0 implements View.OnClickListener {
    public final int f22800a;
    public final org.telegram.ui.ActionBar.g1 f22801b;
    public final org.telegram.ui.ActionBar.g1 f22802c;
    public final dt0 d;

    public bt0(dt0 dt0Var, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2, int i10) {
        this.f22800a = i10;
        this.d = dt0Var;
        this.f22801b = g1Var;
        this.f22802c = g1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22800a) {
            case 0:
                zu0 zu0Var = this.d.d;
                if (!zu0Var.H1) {
                    org.telegram.ui.ActionBar.g1 g1Var = this.f22801b;
                    boolean z10 = g1Var.getCheckView().f26508a.f21982q;
                    org.telegram.ui.ActionBar.g1 g1Var2 = this.f22802c;
                    if (!z10 && g1Var2.getCheckView().f26508a.f21982q) {
                        float f7 = -zu0Var.f30650s1;
                        zu0Var.f30650s1 = f7;
                        AndroidUtilities.shakeViewSpring(g1Var2, f7);
                        return;
                    }
                    g1Var2.setChecked(!g1Var2.getCheckView().f26508a.f21982q);
                    if (g1Var2.getCheckView().f26508a.f21982q && g1Var.getCheckView().f26508a.f21982q) {
                        zu0Var.f30652t1[0].f26862q = 0;
                    } else {
                        zu0Var.f30652t1[0].f26862q = 2;
                    }
                    zu0.s(zu0Var);
                    return;
                }
                return;
            default:
                zu0 zu0Var2 = this.d.d;
                if (!zu0Var2.H1) {
                    org.telegram.ui.ActionBar.g1 g1Var3 = this.f22801b;
                    boolean z11 = g1Var3.getCheckView().f26508a.f21982q;
                    org.telegram.ui.ActionBar.g1 g1Var4 = this.f22802c;
                    if (!z11 && g1Var4.getCheckView().f26508a.f21982q) {
                        float f10 = -zu0Var2.f30650s1;
                        zu0Var2.f30650s1 = f10;
                        AndroidUtilities.shakeViewSpring(g1Var4, f10);
                        return;
                    }
                    g1Var4.setChecked(!g1Var4.getCheckView().f26508a.f21982q);
                    if (g1Var3.getCheckView().f26508a.f21982q && g1Var4.getCheckView().f26508a.f21982q) {
                        zu0Var2.f30652t1[0].f26862q = 0;
                    } else {
                        zu0Var2.f30652t1[0].f26862q = 1;
                    }
                    zu0.s(zu0Var2);
                    return;
                }
                return;
        }
    }
}
