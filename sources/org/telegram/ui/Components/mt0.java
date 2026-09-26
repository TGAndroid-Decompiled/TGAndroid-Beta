package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class mt0 implements View.OnClickListener {
    public final int f26508a;
    public final org.telegram.ui.ActionBar.e1 f26509b;
    public final org.telegram.ui.ActionBar.e1 f26510c;
    public final ot0 d;

    public mt0(ot0 ot0Var, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, int i10) {
        this.f26508a = i10;
        this.d = ot0Var;
        this.f26509b = e1Var;
        this.f26510c = e1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26508a) {
            case 0:
                kv0 kv0Var = this.d.d;
                if (!kv0Var.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var = this.f26509b;
                    boolean z10 = e1Var.getCheckView().f27472a.f22194q;
                    org.telegram.ui.ActionBar.e1 e1Var2 = this.f26510c;
                    if (!z10 && e1Var2.getCheckView().f27472a.f22194q) {
                        float f7 = -kv0Var.f25860s1;
                        kv0Var.f25860s1 = f7;
                        AndroidUtilities.shakeViewSpring(e1Var2, f7);
                        return;
                    }
                    e1Var2.setChecked(!e1Var2.getCheckView().f27472a.f22194q);
                    if (e1Var2.getCheckView().f27472a.f22194q && e1Var.getCheckView().f27472a.f22194q) {
                        kv0Var.f25862t1[0].f30982q = 0;
                    } else {
                        kv0Var.f25862t1[0].f30982q = 2;
                    }
                    kv0.s(kv0Var);
                    return;
                }
                return;
            default:
                kv0 kv0Var2 = this.d.d;
                if (!kv0Var2.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var3 = this.f26509b;
                    boolean z11 = e1Var3.getCheckView().f27472a.f22194q;
                    org.telegram.ui.ActionBar.e1 e1Var4 = this.f26510c;
                    if (!z11 && e1Var4.getCheckView().f27472a.f22194q) {
                        float f10 = -kv0Var2.f25860s1;
                        kv0Var2.f25860s1 = f10;
                        AndroidUtilities.shakeViewSpring(e1Var4, f10);
                        return;
                    }
                    e1Var4.setChecked(!e1Var4.getCheckView().f27472a.f22194q);
                    if (e1Var3.getCheckView().f27472a.f22194q && e1Var4.getCheckView().f27472a.f22194q) {
                        kv0Var2.f25862t1[0].f30982q = 0;
                    } else {
                        kv0Var2.f25862t1[0].f30982q = 1;
                    }
                    kv0.s(kv0Var2);
                    return;
                }
                return;
        }
    }
}
