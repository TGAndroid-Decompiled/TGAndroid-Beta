package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.ui.PhotoViewer;
public final class io0 implements View.OnClickListener {
    public final int f27134a;
    public final pp0 f27135b;

    public io0(pp0 pp0Var, int i10) {
        this.f27134a = i10;
        this.f27135b = pp0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f27134a;
        pp0 pp0Var = this.f27135b;
        switch (i10) {
            case 0:
                pp0Var.V0(true);
                return;
            case 1:
                ep epVar = pp0Var.W1;
                epVar.a(!epVar.f25895a.f23920q, true);
                pp0Var.a1();
                return;
            case 2:
                org.telegram.ui.ActionBar.k1 k1Var = pp0Var.B2;
                if (k1Var != null && k1Var.isShowing()) {
                    pp0Var.B2.d(true);
                }
                pp0Var.V0(false);
                return;
            case 3:
                org.telegram.ui.ActionBar.k1 k1Var2 = pp0Var.B2;
                if (k1Var2 != null && k1Var2.isShowing()) {
                    pp0Var.B2.d(true);
                }
                pp0Var.V0(true);
                return;
            case 4:
                String[] strArr = pp0Var.f29473g2;
                if (pp0Var.M1.m() == 0) {
                    if (pp0Var.f29472f2 || strArr[0] != null) {
                        pp0Var.dismiss();
                        PhotoViewer.v1().H0(true, false);
                        if (strArr[0] == null && pp0Var.f29470d2) {
                            pp0Var.f29471e2 = true;
                            Toast.makeText(pp0Var.getContext(), org.telegram.messenger.dd.L0(2131748789, null), 0).show();
                            return;
                        }
                        pp0Var.getContext();
                        pp0Var.M0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                String[] strArr2 = pp0Var.f29473g2;
                if (pp0Var.M1.m() == 0) {
                    if (pp0Var.f29472f2 || strArr2[0] != null) {
                        pp0Var.dismiss();
                        if (strArr2[0] == null && pp0Var.f29470d2) {
                            pp0Var.f29471e2 = true;
                            Toast.makeText(pp0Var.getContext(), org.telegram.messenger.dd.L0(2131748789, null), 0).show();
                            return;
                        }
                        pp0Var.getContext();
                        pp0Var.M0();
                        return;
                    }
                    return;
                }
                return;
            default:
                String[] strArr3 = pp0Var.f29473g2;
                if (pp0Var.M1.m() == 0) {
                    if (pp0Var.f29472f2 || strArr3[0] != null) {
                        pp0Var.dismiss();
                        if (strArr3[0] == null && pp0Var.f29470d2) {
                            pp0Var.f29471e2 = true;
                            Toast.makeText(pp0Var.getContext(), org.telegram.messenger.dd.L0(2131748789, null), 0).show();
                            return;
                        }
                        pp0Var.getContext();
                        pp0Var.M0();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
