package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.ui.PhotoViewer;
public final class jn0 implements View.OnClickListener {
    public final int f35156a;
    public final oo0 f35157b;

    public jn0(oo0 oo0Var, int i3) {
        this.f35156a = i3;
        this.f35157b = oo0Var;
    }

    @Override
    public final void onClick(View view) {
        int i3 = this.f35156a;
        oo0 oo0Var = this.f35157b;
        switch (i3) {
            case 0:
                oo0Var.V0(true);
                return;
            case 1:
                wo woVar = oo0Var.X1;
                woVar.a(!woVar.f40035a.f31334q, true);
                oo0Var.a1();
                return;
            case 2:
                org.telegram.ui.ActionBar.f1 f1Var = oo0Var.C2;
                if (f1Var != null && f1Var.isShowing()) {
                    oo0Var.C2.d(true);
                }
                oo0Var.V0(false);
                return;
            case 3:
                org.telegram.ui.ActionBar.f1 f1Var2 = oo0Var.C2;
                if (f1Var2 != null && f1Var2.isShowing()) {
                    oo0Var.C2.d(true);
                }
                oo0Var.V0(true);
                return;
            case 4:
                String[] strArr = oo0Var.f36881h2;
                if (oo0Var.N1.m() == 0) {
                    if (oo0Var.f36880g2 || strArr[0] != null) {
                        oo0Var.dismiss();
                        PhotoViewer.v1().H0(true, false);
                        if (strArr[0] == null && oo0Var.f36878e2) {
                            oo0Var.f36879f2 = true;
                            Toast.makeText(oo0Var.getContext(), org.telegram.messenger.bd.M0(2131748787, null), 0).show();
                            return;
                        }
                        oo0Var.getContext();
                        oo0Var.M0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                String[] strArr2 = oo0Var.f36881h2;
                if (oo0Var.N1.m() == 0) {
                    if (oo0Var.f36880g2 || strArr2[0] != null) {
                        oo0Var.dismiss();
                        if (strArr2[0] == null && oo0Var.f36878e2) {
                            oo0Var.f36879f2 = true;
                            Toast.makeText(oo0Var.getContext(), org.telegram.messenger.bd.M0(2131748787, null), 0).show();
                            return;
                        }
                        oo0Var.getContext();
                        oo0Var.M0();
                        return;
                    }
                    return;
                }
                return;
            default:
                String[] strArr3 = oo0Var.f36881h2;
                if (oo0Var.N1.m() == 0) {
                    if (oo0Var.f36880g2 || strArr3[0] != null) {
                        oo0Var.dismiss();
                        if (strArr3[0] == null && oo0Var.f36878e2) {
                            oo0Var.f36879f2 = true;
                            Toast.makeText(oo0Var.getContext(), org.telegram.messenger.bd.M0(2131748787, null), 0).show();
                            return;
                        }
                        oo0Var.getContext();
                        oo0Var.M0();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
