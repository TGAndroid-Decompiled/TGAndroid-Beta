package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class lt0 implements View.OnClickListener {
    public final int f26233a;
    public final org.telegram.ui.ActionBar.f1 f26234b;
    public final org.telegram.ui.ActionBar.f1 f26235c;
    public final nt0 d;

    public lt0(nt0 nt0Var, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2, int i10) {
        this.f26233a = i10;
        this.d = nt0Var;
        this.f26234b = f1Var;
        this.f26235c = f1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26233a) {
            case 0:
                jv0 jv0Var = this.d.d;
                if (!jv0Var.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var = this.f26234b;
                    boolean z10 = f1Var.getCheckView().f26710a.f22193q;
                    org.telegram.ui.ActionBar.f1 f1Var2 = this.f26235c;
                    if (!z10 && f1Var2.getCheckView().f26710a.f22193q) {
                        float f7 = -jv0Var.f25522s1;
                        jv0Var.f25522s1 = f7;
                        AndroidUtilities.shakeViewSpring(f1Var2, f7);
                        return;
                    }
                    f1Var2.setChecked(!f1Var2.getCheckView().f26710a.f22193q);
                    if (f1Var2.getCheckView().f26710a.f22193q && f1Var.getCheckView().f26710a.f22193q) {
                        jv0Var.f25524t1[0].f30625q = 0;
                    } else {
                        jv0Var.f25524t1[0].f30625q = 2;
                    }
                    jv0.s(jv0Var);
                    return;
                }
                return;
            default:
                jv0 jv0Var2 = this.d.d;
                if (!jv0Var2.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var3 = this.f26234b;
                    boolean z11 = f1Var3.getCheckView().f26710a.f22193q;
                    org.telegram.ui.ActionBar.f1 f1Var4 = this.f26235c;
                    if (!z11 && f1Var4.getCheckView().f26710a.f22193q) {
                        float f10 = -jv0Var2.f25522s1;
                        jv0Var2.f25522s1 = f10;
                        AndroidUtilities.shakeViewSpring(f1Var4, f10);
                        return;
                    }
                    f1Var4.setChecked(!f1Var4.getCheckView().f26710a.f22193q);
                    if (f1Var3.getCheckView().f26710a.f22193q && f1Var4.getCheckView().f26710a.f22193q) {
                        jv0Var2.f25524t1[0].f30625q = 0;
                    } else {
                        jv0Var2.f25524t1[0].f30625q = 1;
                    }
                    jv0.s(jv0Var2);
                    return;
                }
                return;
        }
    }
}
