package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class st0 implements View.OnClickListener {
    public final int f30947a;
    public final org.telegram.ui.ActionBar.f1 f30948b;
    public final org.telegram.ui.ActionBar.f1 f30949c;
    public final ut0 d;

    public st0(ut0 ut0Var, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2, int i10) {
        this.f30947a = i10;
        this.d = ut0Var;
        this.f30948b = f1Var;
        this.f30949c = f1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30947a) {
            case 0:
                qv0 qv0Var = this.d.d;
                if (!qv0Var.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var = this.f30948b;
                    boolean z10 = f1Var.getCheckView().f30169a.f24101q;
                    org.telegram.ui.ActionBar.f1 f1Var2 = this.f30949c;
                    if (!z10 && f1Var2.getCheckView().f30169a.f24101q) {
                        float f7 = -qv0Var.f30257s1;
                        qv0Var.f30257s1 = f7;
                        AndroidUtilities.shakeViewSpring(f1Var2, f7);
                        return;
                    }
                    f1Var2.setChecked(!f1Var2.getCheckView().f30169a.f24101q);
                    if (f1Var2.getCheckView().f30169a.f24101q && f1Var.getCheckView().f30169a.f24101q) {
                        qv0Var.f30259t1[0].f26605q = 0;
                    } else {
                        qv0Var.f30259t1[0].f26605q = 2;
                    }
                    qv0.s(qv0Var);
                    return;
                }
                return;
            default:
                qv0 qv0Var2 = this.d.d;
                if (!qv0Var2.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var3 = this.f30948b;
                    boolean z11 = f1Var3.getCheckView().f30169a.f24101q;
                    org.telegram.ui.ActionBar.f1 f1Var4 = this.f30949c;
                    if (!z11 && f1Var4.getCheckView().f30169a.f24101q) {
                        float f10 = -qv0Var2.f30257s1;
                        qv0Var2.f30257s1 = f10;
                        AndroidUtilities.shakeViewSpring(f1Var4, f10);
                        return;
                    }
                    f1Var4.setChecked(!f1Var4.getCheckView().f30169a.f24101q);
                    if (f1Var3.getCheckView().f30169a.f24101q && f1Var4.getCheckView().f30169a.f24101q) {
                        qv0Var2.f30259t1[0].f26605q = 0;
                    } else {
                        qv0Var2.f30259t1[0].f26605q = 1;
                    }
                    qv0.s(qv0Var2);
                    return;
                }
                return;
        }
    }
}
