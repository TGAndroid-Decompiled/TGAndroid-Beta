package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class zt0 implements View.OnClickListener {
    public final int f33337a;
    public final org.telegram.ui.ActionBar.e1 f33338b;
    public final org.telegram.ui.ActionBar.e1 f33339c;
    public final bu0 d;

    public zt0(bu0 bu0Var, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, int i10) {
        this.f33337a = i10;
        this.d = bu0Var;
        this.f33338b = e1Var;
        this.f33339c = e1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33337a) {
            case 0:
                xv0 xv0Var = this.d.d;
                if (!xv0Var.I1) {
                    org.telegram.ui.ActionBar.e1 e1Var = this.f33338b;
                    boolean z10 = e1Var.getCheckView().f32618a.f24296q;
                    org.telegram.ui.ActionBar.e1 e1Var2 = this.f33339c;
                    if (!z10 && e1Var2.getCheckView().f32618a.f24296q) {
                        float f7 = -xv0Var.f32705s1;
                        xv0Var.f32705s1 = f7;
                        AndroidUtilities.shakeViewSpring(e1Var2, f7);
                        return;
                    }
                    e1Var2.setChecked(!e1Var2.getCheckView().f32618a.f24296q);
                    if (e1Var2.getCheckView().f32618a.f24296q && e1Var.getCheckView().f32618a.f24296q) {
                        xv0Var.f32707t1[0].f28770q = 0;
                    } else {
                        xv0Var.f32707t1[0].f28770q = 2;
                    }
                    xv0.t(xv0Var);
                    return;
                }
                return;
            default:
                xv0 xv0Var2 = this.d.d;
                if (!xv0Var2.I1) {
                    org.telegram.ui.ActionBar.e1 e1Var3 = this.f33338b;
                    boolean z11 = e1Var3.getCheckView().f32618a.f24296q;
                    org.telegram.ui.ActionBar.e1 e1Var4 = this.f33339c;
                    if (!z11 && e1Var4.getCheckView().f32618a.f24296q) {
                        float f10 = -xv0Var2.f32705s1;
                        xv0Var2.f32705s1 = f10;
                        AndroidUtilities.shakeViewSpring(e1Var4, f10);
                        return;
                    }
                    e1Var4.setChecked(!e1Var4.getCheckView().f32618a.f24296q);
                    if (e1Var3.getCheckView().f32618a.f24296q && e1Var4.getCheckView().f32618a.f24296q) {
                        xv0Var2.f32707t1[0].f28770q = 0;
                    } else {
                        xv0Var2.f32707t1[0].f28770q = 1;
                    }
                    xv0.t(xv0Var2);
                    return;
                }
                return;
        }
    }
}
