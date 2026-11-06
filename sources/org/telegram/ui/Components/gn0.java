package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.ui.PhotoViewer;
public final class gn0 implements View.OnClickListener {
    public final int f33955a;
    public final mo0 f33956b;

    public gn0(mo0 mo0Var, int i7) {
        this.f33955a = i7;
        this.f33956b = mo0Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f33955a;
        mo0 mo0Var = this.f33956b;
        switch (i7) {
            case 0:
                mo0Var.V0(true);
                return;
            case 1:
                wo woVar = mo0Var.W1;
                woVar.a(!woVar.f40058a.f31259q, true);
                mo0Var.a1();
                return;
            case 2:
                org.telegram.ui.ActionBar.g1 g1Var = mo0Var.B2;
                if (g1Var != null && g1Var.isShowing()) {
                    mo0Var.B2.d(true);
                }
                mo0Var.V0(false);
                return;
            case 3:
                org.telegram.ui.ActionBar.g1 g1Var2 = mo0Var.B2;
                if (g1Var2 != null && g1Var2.isShowing()) {
                    mo0Var.B2.d(true);
                }
                mo0Var.V0(true);
                return;
            case 4:
                String[] strArr = mo0Var.f36013g2;
                if (mo0Var.M1.m() == 0) {
                    if (mo0Var.f36012f2 || strArr[0] != null) {
                        mo0Var.dismiss();
                        PhotoViewer.p1().z0(true, false);
                        if (strArr[0] == null && mo0Var.d2) {
                            mo0Var.f36011e2 = true;
                            Toast.makeText(mo0Var.getContext(), org.telegram.messenger.hd.M0(2131748778, null), 0).show();
                            return;
                        }
                        mo0Var.getContext();
                        mo0Var.M0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                String[] strArr2 = mo0Var.f36013g2;
                if (mo0Var.M1.m() == 0) {
                    if (mo0Var.f36012f2 || strArr2[0] != null) {
                        mo0Var.dismiss();
                        if (strArr2[0] == null && mo0Var.d2) {
                            mo0Var.f36011e2 = true;
                            Toast.makeText(mo0Var.getContext(), org.telegram.messenger.hd.M0(2131748778, null), 0).show();
                            return;
                        }
                        mo0Var.getContext();
                        mo0Var.M0();
                        return;
                    }
                    return;
                }
                return;
            default:
                String[] strArr3 = mo0Var.f36013g2;
                if (mo0Var.M1.m() == 0) {
                    if (mo0Var.f36012f2 || strArr3[0] != null) {
                        mo0Var.dismiss();
                        if (strArr3[0] == null && mo0Var.d2) {
                            mo0Var.f36011e2 = true;
                            Toast.makeText(mo0Var.getContext(), org.telegram.messenger.hd.M0(2131748778, null), 0).show();
                            return;
                        }
                        mo0Var.getContext();
                        mo0Var.M0();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
