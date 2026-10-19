package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class vt0 implements View.OnClickListener {
    public final int f31914a;
    public final org.telegram.ui.ActionBar.e1 f31915b;
    public final org.telegram.ui.ActionBar.e1 f31916c;
    public final xt0 d;

    public vt0(xt0 xt0Var, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, int i10) {
        this.f31914a = i10;
        this.d = xt0Var;
        this.f31915b = e1Var;
        this.f31916c = e1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31914a) {
            case 0:
                tv0 tv0Var = this.d.d;
                if (!tv0Var.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var = this.f31915b;
                    boolean z10 = e1Var.getCheckView().f32430a.f24148q;
                    org.telegram.ui.ActionBar.e1 e1Var2 = this.f31916c;
                    if (!z10 && e1Var2.getCheckView().f32430a.f24148q) {
                        float f7 = -tv0Var.f30726s1;
                        tv0Var.f30726s1 = f7;
                        AndroidUtilities.shakeViewSpring(e1Var2, f7);
                        return;
                    }
                    e1Var2.setChecked(!e1Var2.getCheckView().f32430a.f24148q);
                    if (e1Var2.getCheckView().f32430a.f24148q && e1Var.getCheckView().f32430a.f24148q) {
                        tv0Var.f30728t1[0].f27374q = 0;
                    } else {
                        tv0Var.f30728t1[0].f27374q = 2;
                    }
                    tv0.t(tv0Var);
                    return;
                }
                return;
            default:
                tv0 tv0Var2 = this.d.d;
                if (!tv0Var2.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var3 = this.f31915b;
                    boolean z11 = e1Var3.getCheckView().f32430a.f24148q;
                    org.telegram.ui.ActionBar.e1 e1Var4 = this.f31916c;
                    if (!z11 && e1Var4.getCheckView().f32430a.f24148q) {
                        float f10 = -tv0Var2.f30726s1;
                        tv0Var2.f30726s1 = f10;
                        AndroidUtilities.shakeViewSpring(e1Var4, f10);
                        return;
                    }
                    e1Var4.setChecked(!e1Var4.getCheckView().f32430a.f24148q);
                    if (e1Var3.getCheckView().f32430a.f24148q && e1Var4.getCheckView().f32430a.f24148q) {
                        tv0Var2.f30728t1[0].f27374q = 0;
                    } else {
                        tv0Var2.f30728t1[0].f27374q = 1;
                    }
                    tv0.t(tv0Var2);
                    return;
                }
                return;
        }
    }
}
