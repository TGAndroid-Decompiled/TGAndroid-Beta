package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class eu0 implements View.OnClickListener {
    public final int f26173a;
    public final org.telegram.ui.ActionBar.f1 f26174b;
    public final org.telegram.ui.ActionBar.f1 f26175c;
    public final gu0 d;

    public eu0(gu0 gu0Var, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2, int i10) {
        this.f26173a = i10;
        this.d = gu0Var;
        this.f26174b = f1Var;
        this.f26175c = f1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26173a) {
            case 0:
                cw0 cw0Var = this.d.d;
                if (!cw0Var.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var = this.f26174b;
                    boolean z10 = f1Var.getCheckView().f25781a.f24101q;
                    org.telegram.ui.ActionBar.f1 f1Var2 = this.f26175c;
                    if (!z10 && f1Var2.getCheckView().f25781a.f24101q) {
                        float f7 = -cw0Var.f25468s1;
                        cw0Var.f25468s1 = f7;
                        AndroidUtilities.shakeViewSpring(f1Var2, f7);
                        return;
                    }
                    f1Var2.setChecked(!f1Var2.getCheckView().f25781a.f24101q);
                    if (f1Var2.getCheckView().f25781a.f24101q && f1Var.getCheckView().f25781a.f24101q) {
                        cw0Var.f25470t1[0].f30592q = 0;
                    } else {
                        cw0Var.f25470t1[0].f30592q = 2;
                    }
                    cw0.s(cw0Var);
                    return;
                }
                return;
            default:
                cw0 cw0Var2 = this.d.d;
                if (!cw0Var2.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var3 = this.f26174b;
                    boolean z11 = f1Var3.getCheckView().f25781a.f24101q;
                    org.telegram.ui.ActionBar.f1 f1Var4 = this.f26175c;
                    if (!z11 && f1Var4.getCheckView().f25781a.f24101q) {
                        float f10 = -cw0Var2.f25468s1;
                        cw0Var2.f25468s1 = f10;
                        AndroidUtilities.shakeViewSpring(f1Var4, f10);
                        return;
                    }
                    f1Var4.setChecked(!f1Var4.getCheckView().f25781a.f24101q);
                    if (f1Var3.getCheckView().f25781a.f24101q && f1Var4.getCheckView().f25781a.f24101q) {
                        cw0Var2.f25470t1[0].f30592q = 0;
                    } else {
                        cw0Var2.f25470t1[0].f30592q = 1;
                    }
                    cw0.s(cw0Var2);
                    return;
                }
                return;
        }
    }
}
