package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class np0 implements View.OnClickListener {
    public final int f26770a;
    public final uq0 f26771b;

    public np0(uq0 uq0Var, int i10) {
        this.f26770a = i10;
        this.f26771b = uq0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26770a) {
            case 0:
                uq0 uq0Var = this.f26771b;
                op opVar = uq0Var.f28880e0;
                opVar.a(!opVar.f27168a.f22195q, true);
                uq0Var.Z0();
                return;
            case 1:
                uq0 uq0Var2 = this.f26771b;
                org.telegram.ui.ActionBar.m1 m1Var = uq0Var2.J0;
                if (m1Var != null && m1Var.isShowing()) {
                    uq0Var2.J0.d(true);
                }
                uq0Var2.V0(false);
                return;
            case 2:
                uq0 uq0Var3 = this.f26771b;
                org.telegram.ui.ActionBar.m1 m1Var2 = uq0Var3.J0;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    uq0Var3.J0.d(true);
                }
                uq0Var3.V0(true);
                return;
            case 3:
                uq0 uq0Var4 = this.f26771b;
                String[] strArr = uq0Var4.f28891o0;
                if (uq0Var4.U.m() == 0) {
                    if (uq0Var4.f28890n0 || strArr[0] != null) {
                        uq0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] == null && uq0Var4.f28888l0) {
                            uq0Var4.m0 = true;
                            Toast.makeText(uq0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        uq0Var4.getContext();
                        uq0Var4.M0();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                uq0 uq0Var5 = this.f26771b;
                String[] strArr2 = uq0Var5.f28891o0;
                if (uq0Var5.U.m() == 0) {
                    if (uq0Var5.f28890n0 || strArr2[0] != null) {
                        uq0Var5.dismiss();
                        if (strArr2[0] == null && uq0Var5.f28888l0) {
                            uq0Var5.m0 = true;
                            Toast.makeText(uq0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        uq0Var5.getContext();
                        uq0Var5.M0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                uq0 uq0Var6 = this.f26771b;
                String[] strArr3 = uq0Var6.f28891o0;
                if (uq0Var6.U.m() == 0) {
                    if (uq0Var6.f28890n0 || strArr3[0] != null) {
                        uq0Var6.dismiss();
                        if (strArr3[0] == null && uq0Var6.f28888l0) {
                            uq0Var6.m0 = true;
                            Toast.makeText(uq0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        uq0Var6.getContext();
                        uq0Var6.M0();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f26771b.V0(true);
                return;
        }
    }
}
