package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ut0 implements View.OnClickListener {
    public final int f31083a;
    public final org.telegram.ui.ActionBar.e1 f31084b;
    public final org.telegram.ui.ActionBar.e1 f31085c;
    public final wt0 d;

    public ut0(wt0 wt0Var, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, int i10) {
        this.f31083a = i10;
        this.d = wt0Var;
        this.f31084b = e1Var;
        this.f31085c = e1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31083a) {
            case 0:
                sv0 sv0Var = this.d.d;
                if (!sv0Var.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var = this.f31084b;
                    boolean z10 = e1Var.getCheckView().f32428a.f24147q;
                    org.telegram.ui.ActionBar.e1 e1Var2 = this.f31085c;
                    if (!z10 && e1Var2.getCheckView().f32428a.f24147q) {
                        float f7 = -sv0Var.f30382s1;
                        sv0Var.f30382s1 = f7;
                        AndroidUtilities.shakeViewSpring(e1Var2, f7);
                        return;
                    }
                    e1Var2.setChecked(!e1Var2.getCheckView().f32428a.f24147q);
                    if (e1Var2.getCheckView().f32428a.f24147q && e1Var.getCheckView().f32428a.f24147q) {
                        sv0Var.f30384t1[0].f26955q = 0;
                    } else {
                        sv0Var.f30384t1[0].f26955q = 2;
                    }
                    sv0.t(sv0Var);
                    return;
                }
                return;
            default:
                sv0 sv0Var2 = this.d.d;
                if (!sv0Var2.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var3 = this.f31084b;
                    boolean z11 = e1Var3.getCheckView().f32428a.f24147q;
                    org.telegram.ui.ActionBar.e1 e1Var4 = this.f31085c;
                    if (!z11 && e1Var4.getCheckView().f32428a.f24147q) {
                        float f10 = -sv0Var2.f30382s1;
                        sv0Var2.f30382s1 = f10;
                        AndroidUtilities.shakeViewSpring(e1Var4, f10);
                        return;
                    }
                    e1Var4.setChecked(!e1Var4.getCheckView().f32428a.f24147q);
                    if (e1Var3.getCheckView().f32428a.f24147q && e1Var4.getCheckView().f32428a.f24147q) {
                        sv0Var2.f30384t1[0].f26955q = 0;
                    } else {
                        sv0Var2.f30384t1[0].f26955q = 1;
                    }
                    sv0.t(sv0Var2);
                    return;
                }
                return;
        }
    }
}
