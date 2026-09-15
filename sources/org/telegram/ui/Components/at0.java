package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class at0 implements View.OnClickListener {
    public final int f22483a;
    public final org.telegram.ui.ActionBar.f1 f22484b;
    public final org.telegram.ui.ActionBar.f1 f22485c;
    public final ct0 d;

    public at0(ct0 ct0Var, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2, int i10) {
        this.f22483a = i10;
        this.d = ct0Var;
        this.f22484b = f1Var;
        this.f22485c = f1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22483a) {
            case 0:
                yu0 yu0Var = this.d.d;
                if (!yu0Var.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var = this.f22484b;
                    boolean z10 = f1Var.getCheckView().f26547a.f21972q;
                    org.telegram.ui.ActionBar.f1 f1Var2 = this.f22485c;
                    if (!z10 && f1Var2.getCheckView().f26547a.f21972q) {
                        float f7 = -yu0Var.f30386s1;
                        yu0Var.f30386s1 = f7;
                        AndroidUtilities.shakeViewSpring(f1Var2, f7);
                        return;
                    }
                    f1Var2.setChecked(!f1Var2.getCheckView().f26547a.f21972q);
                    if (f1Var2.getCheckView().f26547a.f21972q && f1Var.getCheckView().f26547a.f21972q) {
                        yu0Var.f30388t1[0].f26589q = 0;
                    } else {
                        yu0Var.f30388t1[0].f26589q = 2;
                    }
                    yu0.s(yu0Var);
                    return;
                }
                return;
            default:
                yu0 yu0Var2 = this.d.d;
                if (!yu0Var2.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var3 = this.f22484b;
                    boolean z11 = f1Var3.getCheckView().f26547a.f21972q;
                    org.telegram.ui.ActionBar.f1 f1Var4 = this.f22485c;
                    if (!z11 && f1Var4.getCheckView().f26547a.f21972q) {
                        float f10 = -yu0Var2.f30386s1;
                        yu0Var2.f30386s1 = f10;
                        AndroidUtilities.shakeViewSpring(f1Var4, f10);
                        return;
                    }
                    f1Var4.setChecked(!f1Var4.getCheckView().f26547a.f21972q);
                    if (f1Var3.getCheckView().f26547a.f21972q && f1Var4.getCheckView().f26547a.f21972q) {
                        yu0Var2.f30388t1[0].f26589q = 0;
                    } else {
                        yu0Var2.f30388t1[0].f26589q = 1;
                    }
                    yu0.s(yu0Var2);
                    return;
                }
                return;
        }
    }
}
