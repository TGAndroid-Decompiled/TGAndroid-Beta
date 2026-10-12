package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ju0 implements View.OnClickListener {
    public final int f27650a;
    public final org.telegram.ui.ActionBar.e1 f27651b;
    public final org.telegram.ui.ActionBar.e1 f27652c;
    public final lu0 d;

    public ju0(lu0 lu0Var, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, int i10) {
        this.f27650a = i10;
        this.d = lu0Var;
        this.f27651b = e1Var;
        this.f27652c = e1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27650a) {
            case 0:
                hw0 hw0Var = this.d.d;
                if (!hw0Var.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var = this.f27651b;
                    boolean z10 = e1Var.getCheckView().f26150a.f23874q;
                    org.telegram.ui.ActionBar.e1 e1Var2 = this.f27652c;
                    if (!z10 && e1Var2.getCheckView().f26150a.f23874q) {
                        float f7 = -hw0Var.f26966s1;
                        hw0Var.f26966s1 = f7;
                        AndroidUtilities.shakeViewSpring(e1Var2, f7);
                        return;
                    }
                    e1Var2.setChecked(!e1Var2.getCheckView().f26150a.f23874q);
                    if (e1Var2.getCheckView().f26150a.f23874q && e1Var.getCheckView().f26150a.f23874q) {
                        hw0Var.f26968t1[0].f32567q = 0;
                    } else {
                        hw0Var.f26968t1[0].f32567q = 2;
                    }
                    hw0.s(hw0Var);
                    return;
                }
                return;
            default:
                hw0 hw0Var2 = this.d.d;
                if (!hw0Var2.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var3 = this.f27651b;
                    boolean z11 = e1Var3.getCheckView().f26150a.f23874q;
                    org.telegram.ui.ActionBar.e1 e1Var4 = this.f27652c;
                    if (!z11 && e1Var4.getCheckView().f26150a.f23874q) {
                        float f10 = -hw0Var2.f26966s1;
                        hw0Var2.f26966s1 = f10;
                        AndroidUtilities.shakeViewSpring(e1Var4, f10);
                        return;
                    }
                    e1Var4.setChecked(!e1Var4.getCheckView().f26150a.f23874q);
                    if (e1Var3.getCheckView().f26150a.f23874q && e1Var4.getCheckView().f26150a.f23874q) {
                        hw0Var2.f26968t1[0].f32567q = 0;
                    } else {
                        hw0Var2.f26968t1[0].f32567q = 1;
                    }
                    hw0.s(hw0Var2);
                    return;
                }
                return;
        }
    }
}
