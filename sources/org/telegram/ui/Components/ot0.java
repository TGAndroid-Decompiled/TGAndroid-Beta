package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ot0 implements View.OnClickListener {
    public final int f27174a;
    public final org.telegram.ui.ActionBar.e1 f27175b;
    public final org.telegram.ui.ActionBar.e1 f27176c;
    public final qt0 d;

    public ot0(qt0 qt0Var, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, int i10) {
        this.f27174a = i10;
        this.d = qt0Var;
        this.f27175b = e1Var;
        this.f27176c = e1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27174a) {
            case 0:
                mv0 mv0Var = this.d.d;
                if (!mv0Var.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var = this.f27175b;
                    boolean z10 = e1Var.getCheckView().f27697a.f22216q;
                    org.telegram.ui.ActionBar.e1 e1Var2 = this.f27176c;
                    if (!z10 && e1Var2.getCheckView().f27697a.f22216q) {
                        float f7 = -mv0Var.f26443s1;
                        mv0Var.f26443s1 = f7;
                        AndroidUtilities.shakeViewSpring(e1Var2, f7);
                        return;
                    }
                    e1Var2.setChecked(!e1Var2.getCheckView().f27697a.f22216q);
                    if (e1Var2.getCheckView().f27697a.f22216q && e1Var.getCheckView().f27697a.f22216q) {
                        mv0Var.f26445t1[0].f23028q = 0;
                    } else {
                        mv0Var.f26445t1[0].f23028q = 2;
                    }
                    mv0.s(mv0Var);
                    return;
                }
                return;
            default:
                mv0 mv0Var2 = this.d.d;
                if (!mv0Var2.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var3 = this.f27175b;
                    boolean z11 = e1Var3.getCheckView().f27697a.f22216q;
                    org.telegram.ui.ActionBar.e1 e1Var4 = this.f27176c;
                    if (!z11 && e1Var4.getCheckView().f27697a.f22216q) {
                        float f10 = -mv0Var2.f26443s1;
                        mv0Var2.f26443s1 = f10;
                        AndroidUtilities.shakeViewSpring(e1Var4, f10);
                        return;
                    }
                    e1Var4.setChecked(!e1Var4.getCheckView().f27697a.f22216q);
                    if (e1Var3.getCheckView().f27697a.f22216q && e1Var4.getCheckView().f27697a.f22216q) {
                        mv0Var2.f26445t1[0].f23028q = 0;
                    } else {
                        mv0Var2.f26445t1[0].f23028q = 1;
                    }
                    mv0.s(mv0Var2);
                    return;
                }
                return;
        }
    }
}
