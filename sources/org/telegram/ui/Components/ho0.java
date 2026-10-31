package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.ui.PhotoViewer;
public final class ho0 implements View.OnClickListener {
    public final int f26785a;
    public final op0 f26786b;

    public ho0(op0 op0Var, int i10) {
        this.f26785a = i10;
        this.f26786b = op0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f26785a;
        op0 op0Var = this.f26786b;
        switch (i10) {
            case 0:
                op0Var.V0(true);
                return;
            case 1:
                ep epVar = op0Var.W1;
                epVar.a(!epVar.f25836a.f23919q, true);
                op0Var.a1();
                return;
            case 2:
                org.telegram.ui.ActionBar.k1 k1Var = op0Var.B2;
                if (k1Var != null && k1Var.isShowing()) {
                    op0Var.B2.d(true);
                }
                op0Var.V0(false);
                return;
            case 3:
                org.telegram.ui.ActionBar.k1 k1Var2 = op0Var.B2;
                if (k1Var2 != null && k1Var2.isShowing()) {
                    op0Var.B2.d(true);
                }
                op0Var.V0(true);
                return;
            case 4:
                String[] strArr = op0Var.f29118g2;
                if (op0Var.M1.m() == 0) {
                    if (op0Var.f29117f2 || strArr[0] != null) {
                        op0Var.dismiss();
                        PhotoViewer.v1().H0(true, false);
                        if (strArr[0] == null && op0Var.f29115d2) {
                            op0Var.f29116e2 = true;
                            Toast.makeText(op0Var.getContext(), org.telegram.messenger.cd.L0(2131748789, null), 0).show();
                            return;
                        }
                        op0Var.getContext();
                        op0Var.M0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                String[] strArr2 = op0Var.f29118g2;
                if (op0Var.M1.m() == 0) {
                    if (op0Var.f29117f2 || strArr2[0] != null) {
                        op0Var.dismiss();
                        if (strArr2[0] == null && op0Var.f29115d2) {
                            op0Var.f29116e2 = true;
                            Toast.makeText(op0Var.getContext(), org.telegram.messenger.cd.L0(2131748789, null), 0).show();
                            return;
                        }
                        op0Var.getContext();
                        op0Var.M0();
                        return;
                    }
                    return;
                }
                return;
            default:
                String[] strArr3 = op0Var.f29118g2;
                if (op0Var.M1.m() == 0) {
                    if (op0Var.f29117f2 || strArr3[0] != null) {
                        op0Var.dismiss();
                        if (strArr3[0] == null && op0Var.f29115d2) {
                            op0Var.f29116e2 = true;
                            Toast.makeText(op0Var.getContext(), org.telegram.messenger.cd.L0(2131748789, null), 0).show();
                            return;
                        }
                        op0Var.getContext();
                        op0Var.M0();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
