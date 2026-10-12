package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ju0 implements View.OnClickListener {
    public final int f27653a;
    public final org.telegram.ui.ActionBar.e1 f27654b;
    public final org.telegram.ui.ActionBar.e1 f27655c;
    public final lu0 d;

    public ju0(lu0 lu0Var, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, int i10) {
        this.f27653a = i10;
        this.d = lu0Var;
        this.f27654b = e1Var;
        this.f27655c = e1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27653a) {
            case 0:
                hw0 hw0Var = this.d.d;
                if (!hw0Var.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var = this.f27654b;
                    boolean z10 = e1Var.getCheckView().f26152a.f23875q;
                    org.telegram.ui.ActionBar.e1 e1Var2 = this.f27655c;
                    if (!z10 && e1Var2.getCheckView().f26152a.f23875q) {
                        float f7 = -hw0Var.f26951s1;
                        hw0Var.f26951s1 = f7;
                        AndroidUtilities.shakeViewSpring(e1Var2, f7);
                        return;
                    }
                    e1Var2.setChecked(!e1Var2.getCheckView().f26152a.f23875q);
                    if (e1Var2.getCheckView().f26152a.f23875q && e1Var.getCheckView().f26152a.f23875q) {
                        hw0Var.f26953t1[0].f32566q = 0;
                    } else {
                        hw0Var.f26953t1[0].f32566q = 2;
                    }
                    hw0.s(hw0Var);
                    return;
                }
                return;
            default:
                hw0 hw0Var2 = this.d.d;
                if (!hw0Var2.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var3 = this.f27654b;
                    boolean z11 = e1Var3.getCheckView().f26152a.f23875q;
                    org.telegram.ui.ActionBar.e1 e1Var4 = this.f27655c;
                    if (!z11 && e1Var4.getCheckView().f26152a.f23875q) {
                        float f10 = -hw0Var2.f26951s1;
                        hw0Var2.f26951s1 = f10;
                        AndroidUtilities.shakeViewSpring(e1Var4, f10);
                        return;
                    }
                    e1Var4.setChecked(!e1Var4.getCheckView().f26152a.f23875q);
                    if (e1Var3.getCheckView().f26152a.f23875q && e1Var4.getCheckView().f26152a.f23875q) {
                        hw0Var2.f26953t1[0].f32566q = 0;
                    } else {
                        hw0Var2.f26953t1[0].f32566q = 1;
                    }
                    hw0.s(hw0Var2);
                    return;
                }
                return;
        }
    }
}
