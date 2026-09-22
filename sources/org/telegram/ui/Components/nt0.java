package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class nt0 implements View.OnClickListener {
    public final int f26885a;
    public final org.telegram.ui.ActionBar.f1 f26886b;
    public final org.telegram.ui.ActionBar.f1 f26887c;
    public final pt0 d;

    public nt0(pt0 pt0Var, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2, int i10) {
        this.f26885a = i10;
        this.d = pt0Var;
        this.f26886b = f1Var;
        this.f26887c = f1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26885a) {
            case 0:
                lv0 lv0Var = this.d.d;
                if (!lv0Var.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var = this.f26886b;
                    boolean z10 = f1Var.getCheckView().f26861a.f22209q;
                    org.telegram.ui.ActionBar.f1 f1Var2 = this.f26887c;
                    if (!z10 && f1Var2.getCheckView().f26861a.f22209q) {
                        float f7 = -lv0Var.f26228s1;
                        lv0Var.f26228s1 = f7;
                        AndroidUtilities.shakeViewSpring(f1Var2, f7);
                        return;
                    }
                    f1Var2.setChecked(!f1Var2.getCheckView().f26861a.f22209q);
                    if (f1Var2.getCheckView().f26861a.f22209q && f1Var.getCheckView().f26861a.f22209q) {
                        lv0Var.f26230t1[0].f22757q = 0;
                    } else {
                        lv0Var.f26230t1[0].f22757q = 2;
                    }
                    lv0.s(lv0Var);
                    return;
                }
                return;
            default:
                lv0 lv0Var2 = this.d.d;
                if (!lv0Var2.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var3 = this.f26886b;
                    boolean z11 = f1Var3.getCheckView().f26861a.f22209q;
                    org.telegram.ui.ActionBar.f1 f1Var4 = this.f26887c;
                    if (!z11 && f1Var4.getCheckView().f26861a.f22209q) {
                        float f10 = -lv0Var2.f26228s1;
                        lv0Var2.f26228s1 = f10;
                        AndroidUtilities.shakeViewSpring(f1Var4, f10);
                        return;
                    }
                    f1Var4.setChecked(!f1Var4.getCheckView().f26861a.f22209q);
                    if (f1Var3.getCheckView().f26861a.f22209q && f1Var4.getCheckView().f26861a.f22209q) {
                        lv0Var2.f26230t1[0].f22757q = 0;
                    } else {
                        lv0Var2.f26230t1[0].f22757q = 1;
                    }
                    lv0.s(lv0Var2);
                    return;
                }
                return;
        }
    }
}
