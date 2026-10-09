package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class du0 implements View.OnClickListener {
    public final int f25815a;
    public final org.telegram.ui.ActionBar.f1 f25816b;
    public final org.telegram.ui.ActionBar.f1 f25817c;
    public final fu0 d;

    public du0(fu0 fu0Var, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2, int i10) {
        this.f25815a = i10;
        this.d = fu0Var;
        this.f25816b = f1Var;
        this.f25817c = f1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25815a) {
            case 0:
                bw0 bw0Var = this.d.d;
                if (!bw0Var.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var = this.f25816b;
                    boolean z10 = f1Var.getCheckView().f25790a.f24097q;
                    org.telegram.ui.ActionBar.f1 f1Var2 = this.f25817c;
                    if (!z10 && f1Var2.getCheckView().f25790a.f24097q) {
                        float f7 = -bw0Var.f25160s1;
                        bw0Var.f25160s1 = f7;
                        AndroidUtilities.shakeViewSpring(f1Var2, f7);
                        return;
                    }
                    f1Var2.setChecked(!f1Var2.getCheckView().f25790a.f24097q);
                    if (f1Var2.getCheckView().f25790a.f24097q && f1Var.getCheckView().f25790a.f24097q) {
                        bw0Var.f25162t1[0].f30288q = 0;
                    } else {
                        bw0Var.f25162t1[0].f30288q = 2;
                    }
                    bw0.s(bw0Var);
                    return;
                }
                return;
            default:
                bw0 bw0Var2 = this.d.d;
                if (!bw0Var2.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var3 = this.f25816b;
                    boolean z11 = f1Var3.getCheckView().f25790a.f24097q;
                    org.telegram.ui.ActionBar.f1 f1Var4 = this.f25817c;
                    if (!z11 && f1Var4.getCheckView().f25790a.f24097q) {
                        float f10 = -bw0Var2.f25160s1;
                        bw0Var2.f25160s1 = f10;
                        AndroidUtilities.shakeViewSpring(f1Var4, f10);
                        return;
                    }
                    f1Var4.setChecked(!f1Var4.getCheckView().f25790a.f24097q);
                    if (f1Var3.getCheckView().f25790a.f24097q && f1Var4.getCheckView().f25790a.f24097q) {
                        bw0Var2.f25162t1[0].f30288q = 0;
                    } else {
                        bw0Var2.f25162t1[0].f30288q = 1;
                    }
                    bw0.s(bw0Var2);
                    return;
                }
                return;
        }
    }
}
