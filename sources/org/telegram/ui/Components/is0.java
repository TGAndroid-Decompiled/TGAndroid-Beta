package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class is0 implements View.OnClickListener {

    public final int f29481a;

    public final org.telegram.ui.ActionBar.f1 f29482b;

    public final org.telegram.ui.ActionBar.f1 f29483c;
    public final ks0 d;

    public is0(ks0 ks0Var, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2, int i10) {
        this.f29481a = i10;
        this.d = ks0Var;
        this.f29482b = f1Var;
        this.f29483c = f1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29481a) {
            case 0:
                hu0 hu0Var = this.d.d;
                if (!hu0Var.D1) {
                    org.telegram.ui.ActionBar.f1 f1Var = this.f29482b;
                    boolean z10 = f1Var.getCheckView().f27188a.f26309q;
                    org.telegram.ui.ActionBar.f1 f1Var2 = this.f29483c;
                    if (!z10 && f1Var2.getCheckView().f27188a.f26309q) {
                        float f10 = -hu0Var.f29138o1;
                        hu0Var.f29138o1 = f10;
                        AndroidUtilities.shakeViewSpring(f1Var2, f10);
                    } else {
                        f1Var2.setChecked(!f1Var2.getCheckView().f27188a.f26309q);
                        if (f1Var2.getCheckView().f27188a.f26309q && f1Var.getCheckView().f27188a.f26309q) {
                            hu0Var.f29140p1[0].f34339q = 0;
                        } else {
                            hu0Var.f29140p1[0].f34339q = 2;
                        }
                        hu0.s(hu0Var);
                    }
                    break;
                }
                break;
            default:
                hu0 hu0Var2 = this.d.d;
                if (!hu0Var2.D1) {
                    org.telegram.ui.ActionBar.f1 f1Var3 = this.f29482b;
                    boolean z11 = f1Var3.getCheckView().f27188a.f26309q;
                    org.telegram.ui.ActionBar.f1 f1Var4 = this.f29483c;
                    if (!z11 && f1Var4.getCheckView().f27188a.f26309q) {
                        float f11 = -hu0Var2.f29138o1;
                        hu0Var2.f29138o1 = f11;
                        AndroidUtilities.shakeViewSpring(f1Var4, f11);
                    } else {
                        f1Var4.setChecked(!f1Var4.getCheckView().f27188a.f26309q);
                        if (f1Var3.getCheckView().f27188a.f26309q && f1Var4.getCheckView().f27188a.f26309q) {
                            hu0Var2.f29140p1[0].f34339q = 0;
                        } else {
                            hu0Var2.f29140p1[0].f34339q = 1;
                        }
                        hu0.s(hu0Var2);
                    }
                    break;
                }
                break;
        }
    }
}
