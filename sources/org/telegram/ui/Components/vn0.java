package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.ui.PhotoViewer;
public final class vn0 implements View.OnClickListener {
    public final int f40874a;
    public final ap0 f40875b;

    public vn0(ap0 ap0Var, int i7) {
        this.f40874a = i7;
        this.f40875b = ap0Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f40874a;
        ap0 ap0Var = this.f40875b;
        switch (i7) {
            case 0:
                ap0Var.W0(true);
                return;
            case 1:
                op opVar = ap0Var.f33549a2;
                opVar.a(!opVar.f38327a.f32871q, true);
                ap0Var.b1();
                return;
            case 2:
                org.telegram.ui.ActionBar.g1 g1Var = ap0Var.F2;
                if (g1Var != null && g1Var.isShowing()) {
                    ap0Var.F2.d(true);
                }
                ap0Var.W0(false);
                return;
            case 3:
                org.telegram.ui.ActionBar.g1 g1Var2 = ap0Var.F2;
                if (g1Var2 != null && g1Var2.isShowing()) {
                    ap0Var.F2.d(true);
                }
                ap0Var.W0(true);
                return;
            case 4:
                String[] strArr = ap0Var.f33558k2;
                if (ap0Var.Q1.m() == 0) {
                    if (ap0Var.f33557j2 || strArr[0] != null) {
                        ap0Var.dismiss();
                        PhotoViewer.p1().z0(true, false);
                        if (strArr[0] == null && ap0Var.f33555h2) {
                            ap0Var.f33556i2 = true;
                            Toast.makeText(ap0Var.getContext(), org.telegram.messenger.gd.N0(2131748586, null), 0).show();
                            return;
                        }
                        ap0Var.getContext();
                        ap0Var.N0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                String[] strArr2 = ap0Var.f33558k2;
                if (ap0Var.Q1.m() == 0) {
                    if (ap0Var.f33557j2 || strArr2[0] != null) {
                        ap0Var.dismiss();
                        if (strArr2[0] == null && ap0Var.f33555h2) {
                            ap0Var.f33556i2 = true;
                            Toast.makeText(ap0Var.getContext(), org.telegram.messenger.gd.N0(2131748586, null), 0).show();
                            return;
                        }
                        ap0Var.getContext();
                        ap0Var.N0();
                        return;
                    }
                    return;
                }
                return;
            default:
                String[] strArr3 = ap0Var.f33558k2;
                if (ap0Var.Q1.m() == 0) {
                    if (ap0Var.f33557j2 || strArr3[0] != null) {
                        ap0Var.dismiss();
                        if (strArr3[0] == null && ap0Var.f33555h2) {
                            ap0Var.f33556i2 = true;
                            Toast.makeText(ap0Var.getContext(), org.telegram.messenger.gd.N0(2131748586, null), 0).show();
                            return;
                        }
                        ap0Var.getContext();
                        ap0Var.N0();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
