package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class lt0 implements View.OnClickListener {
    public final int f26189a;
    public final org.telegram.ui.ActionBar.e1 f26190b;
    public final org.telegram.ui.ActionBar.e1 f26191c;
    public final nt0 d;

    public lt0(nt0 nt0Var, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, int i10) {
        this.f26189a = i10;
        this.d = nt0Var;
        this.f26190b = e1Var;
        this.f26191c = e1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26189a) {
            case 0:
                jv0 jv0Var = this.d.d;
                if (!jv0Var.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var = this.f26190b;
                    boolean z10 = e1Var.getCheckView().f27163a.f22180q;
                    org.telegram.ui.ActionBar.e1 e1Var2 = this.f26191c;
                    if (!z10 && e1Var2.getCheckView().f27163a.f22180q) {
                        float f7 = -jv0Var.f25537s1;
                        jv0Var.f25537s1 = f7;
                        AndroidUtilities.shakeViewSpring(e1Var2, f7);
                        return;
                    }
                    e1Var2.setChecked(!e1Var2.getCheckView().f27163a.f22180q);
                    if (e1Var2.getCheckView().f27163a.f22180q && e1Var.getCheckView().f27163a.f22180q) {
                        jv0Var.f25539t1[0].f30695q = 0;
                    } else {
                        jv0Var.f25539t1[0].f30695q = 2;
                    }
                    jv0.s(jv0Var);
                    return;
                }
                return;
            default:
                jv0 jv0Var2 = this.d.d;
                if (!jv0Var2.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var3 = this.f26190b;
                    boolean z11 = e1Var3.getCheckView().f27163a.f22180q;
                    org.telegram.ui.ActionBar.e1 e1Var4 = this.f26191c;
                    if (!z11 && e1Var4.getCheckView().f27163a.f22180q) {
                        float f10 = -jv0Var2.f25537s1;
                        jv0Var2.f25537s1 = f10;
                        AndroidUtilities.shakeViewSpring(e1Var4, f10);
                        return;
                    }
                    e1Var4.setChecked(!e1Var4.getCheckView().f27163a.f22180q);
                    if (e1Var3.getCheckView().f27163a.f22180q && e1Var4.getCheckView().f27163a.f22180q) {
                        jv0Var2.f25539t1[0].f30695q = 0;
                    } else {
                        jv0Var2.f25539t1[0].f30695q = 1;
                    }
                    jv0.s(jv0Var2);
                    return;
                }
                return;
        }
    }
}
