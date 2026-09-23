package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class at0 implements View.OnClickListener {
    public final int f22502a;
    public final org.telegram.ui.ActionBar.f1 f22503b;
    public final org.telegram.ui.ActionBar.f1 f22504c;
    public final ct0 d;

    public at0(ct0 ct0Var, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2, int i10) {
        this.f22502a = i10;
        this.d = ct0Var;
        this.f22503b = f1Var;
        this.f22504c = f1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22502a) {
            case 0:
                yu0 yu0Var = this.d.d;
                if (!yu0Var.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var = this.f22503b;
                    boolean z10 = f1Var.getCheckView().f26827a.f21943q;
                    org.telegram.ui.ActionBar.f1 f1Var2 = this.f22504c;
                    if (!z10 && f1Var2.getCheckView().f26827a.f21943q) {
                        float f7 = -yu0Var.f30444s1;
                        yu0Var.f30444s1 = f7;
                        AndroidUtilities.shakeViewSpring(f1Var2, f7);
                        return;
                    }
                    f1Var2.setChecked(!f1Var2.getCheckView().f26827a.f21943q);
                    if (f1Var2.getCheckView().f26827a.f21943q && f1Var.getCheckView().f26827a.f21943q) {
                        yu0Var.f30446t1[0].f26525q = 0;
                    } else {
                        yu0Var.f30446t1[0].f26525q = 2;
                    }
                    yu0.s(yu0Var);
                    return;
                }
                return;
            default:
                yu0 yu0Var2 = this.d.d;
                if (!yu0Var2.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var3 = this.f22503b;
                    boolean z11 = f1Var3.getCheckView().f26827a.f21943q;
                    org.telegram.ui.ActionBar.f1 f1Var4 = this.f22504c;
                    if (!z11 && f1Var4.getCheckView().f26827a.f21943q) {
                        float f10 = -yu0Var2.f30444s1;
                        yu0Var2.f30444s1 = f10;
                        AndroidUtilities.shakeViewSpring(f1Var4, f10);
                        return;
                    }
                    f1Var4.setChecked(!f1Var4.getCheckView().f26827a.f21943q);
                    if (f1Var3.getCheckView().f26827a.f21943q && f1Var4.getCheckView().f26827a.f21943q) {
                        yu0Var2.f30446t1[0].f26525q = 0;
                    } else {
                        yu0Var2.f30446t1[0].f26525q = 1;
                    }
                    yu0.s(yu0Var2);
                    return;
                }
                return;
        }
    }
}
