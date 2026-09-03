package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class zs0 implements View.OnClickListener {
    public final int f34013a;
    public final org.telegram.ui.ActionBar.g1 f34014b;
    public final org.telegram.ui.ActionBar.g1 f34015c;
    public final bt0 d;

    public zs0(bt0 bt0Var, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2, int i10) {
        this.f34013a = i10;
        this.d = bt0Var;
        this.f34014b = g1Var;
        this.f34015c = g1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34013a) {
            case 0:
                yu0 yu0Var = this.d.d;
                if (!yu0Var.E1) {
                    org.telegram.ui.ActionBar.g1 g1Var = this.f34014b;
                    boolean z4 = g1Var.getCheckView().f29560a.f24811q;
                    org.telegram.ui.ActionBar.g1 g1Var2 = this.f34015c;
                    if (!z4 && g1Var2.getCheckView().f29560a.f24811q) {
                        float f10 = -yu0Var.f33641p1;
                        yu0Var.f33641p1 = f10;
                        AndroidUtilities.shakeViewSpring(g1Var2, f10);
                        return;
                    }
                    g1Var2.setChecked(!g1Var2.getCheckView().f29560a.f24811q);
                    if (g1Var2.getCheckView().f29560a.f24811q && g1Var.getCheckView().f29560a.f24811q) {
                        yu0Var.f33643q1[0].f29594q = 0;
                    } else {
                        yu0Var.f33643q1[0].f29594q = 2;
                    }
                    yu0.s(yu0Var);
                    return;
                }
                return;
            default:
                yu0 yu0Var2 = this.d.d;
                if (!yu0Var2.E1) {
                    org.telegram.ui.ActionBar.g1 g1Var3 = this.f34014b;
                    boolean z10 = g1Var3.getCheckView().f29560a.f24811q;
                    org.telegram.ui.ActionBar.g1 g1Var4 = this.f34015c;
                    if (!z10 && g1Var4.getCheckView().f29560a.f24811q) {
                        float f11 = -yu0Var2.f33641p1;
                        yu0Var2.f33641p1 = f11;
                        AndroidUtilities.shakeViewSpring(g1Var4, f11);
                        return;
                    }
                    g1Var4.setChecked(!g1Var4.getCheckView().f29560a.f24811q);
                    if (g1Var3.getCheckView().f29560a.f24811q && g1Var4.getCheckView().f29560a.f24811q) {
                        yu0Var2.f33643q1[0].f29594q = 0;
                    } else {
                        yu0Var2.f33643q1[0].f29594q = 1;
                    }
                    yu0.s(yu0Var2);
                    return;
                }
                return;
        }
    }
}
