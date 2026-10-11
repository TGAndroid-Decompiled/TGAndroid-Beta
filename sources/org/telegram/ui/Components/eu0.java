package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class eu0 implements View.OnClickListener {
    public final int f26211a;
    public final org.telegram.ui.ActionBar.e1 f26212b;
    public final org.telegram.ui.ActionBar.e1 f26213c;
    public final gu0 d;

    public eu0(gu0 gu0Var, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, int i10) {
        this.f26211a = i10;
        this.d = gu0Var;
        this.f26212b = e1Var;
        this.f26213c = e1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26211a) {
            case 0:
                cw0 cw0Var = this.d.d;
                if (!cw0Var.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var = this.f26212b;
                    boolean z10 = e1Var.getCheckView().f25859a.f24125q;
                    org.telegram.ui.ActionBar.e1 e1Var2 = this.f26213c;
                    if (!z10 && e1Var2.getCheckView().f25859a.f24125q) {
                        float f7 = -cw0Var.f25530s1;
                        cw0Var.f25530s1 = f7;
                        AndroidUtilities.shakeViewSpring(e1Var2, f7);
                        return;
                    }
                    e1Var2.setChecked(!e1Var2.getCheckView().f25859a.f24125q);
                    if (e1Var2.getCheckView().f25859a.f24125q && e1Var.getCheckView().f25859a.f24125q) {
                        cw0Var.f25532t1[0].f30651q = 0;
                    } else {
                        cw0Var.f25532t1[0].f30651q = 2;
                    }
                    cw0.s(cw0Var);
                    return;
                }
                return;
            default:
                cw0 cw0Var2 = this.d.d;
                if (!cw0Var2.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var3 = this.f26212b;
                    boolean z11 = e1Var3.getCheckView().f25859a.f24125q;
                    org.telegram.ui.ActionBar.e1 e1Var4 = this.f26213c;
                    if (!z11 && e1Var4.getCheckView().f25859a.f24125q) {
                        float f10 = -cw0Var2.f25530s1;
                        cw0Var2.f25530s1 = f10;
                        AndroidUtilities.shakeViewSpring(e1Var4, f10);
                        return;
                    }
                    e1Var4.setChecked(!e1Var4.getCheckView().f25859a.f24125q);
                    if (e1Var3.getCheckView().f25859a.f24125q && e1Var4.getCheckView().f25859a.f24125q) {
                        cw0Var2.f25532t1[0].f30651q = 0;
                    } else {
                        cw0Var2.f25532t1[0].f30651q = 1;
                    }
                    cw0.s(cw0Var2);
                    return;
                }
                return;
        }
    }
}
