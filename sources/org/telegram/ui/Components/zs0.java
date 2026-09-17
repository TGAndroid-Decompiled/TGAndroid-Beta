package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class zs0 implements View.OnClickListener {
    public final int f33228a;
    public final org.telegram.ui.ActionBar.f1 f33229b;
    public final org.telegram.ui.ActionBar.f1 f33230c;
    public final bt0 d;

    public zs0(bt0 bt0Var, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2, int i10) {
        this.f33228a = i10;
        this.d = bt0Var;
        this.f33229b = f1Var;
        this.f33230c = f1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33228a) {
            case 0:
                xu0 xu0Var = this.d.d;
                if (!xu0Var.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var = this.f33229b;
                    boolean z10 = f1Var.getCheckView().f28478a.f23908q;
                    org.telegram.ui.ActionBar.f1 f1Var2 = this.f33230c;
                    if (!z10 && f1Var2.getCheckView().f28478a.f23908q) {
                        float f7 = -xu0Var.f32721s1;
                        xu0Var.f32721s1 = f7;
                        AndroidUtilities.shakeViewSpring(f1Var2, f7);
                        return;
                    }
                    f1Var2.setChecked(!f1Var2.getCheckView().f28478a.f23908q);
                    if (f1Var2.getCheckView().f28478a.f23908q && f1Var.getCheckView().f28478a.f23908q) {
                        xu0Var.f32723t1[0].f28531q = 0;
                    } else {
                        xu0Var.f32723t1[0].f28531q = 2;
                    }
                    xu0.s(xu0Var);
                    return;
                }
                return;
            default:
                xu0 xu0Var2 = this.d.d;
                if (!xu0Var2.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var3 = this.f33229b;
                    boolean z11 = f1Var3.getCheckView().f28478a.f23908q;
                    org.telegram.ui.ActionBar.f1 f1Var4 = this.f33230c;
                    if (!z11 && f1Var4.getCheckView().f28478a.f23908q) {
                        float f10 = -xu0Var2.f32721s1;
                        xu0Var2.f32721s1 = f10;
                        AndroidUtilities.shakeViewSpring(f1Var4, f10);
                        return;
                    }
                    f1Var4.setChecked(!f1Var4.getCheckView().f28478a.f23908q);
                    if (f1Var3.getCheckView().f28478a.f23908q && f1Var4.getCheckView().f28478a.f23908q) {
                        xu0Var2.f32723t1[0].f28531q = 0;
                    } else {
                        xu0Var2.f32723t1[0].f28531q = 1;
                    }
                    xu0.s(xu0Var2);
                    return;
                }
                return;
        }
    }
}
