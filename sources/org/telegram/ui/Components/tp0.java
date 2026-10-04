package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class tp0 implements View.OnClickListener {
    public final int f31136a;
    public final zq0 f31137b;

    public tp0(zq0 zq0Var, int i10) {
        this.f31136a = i10;
        this.f31137b = zq0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31136a) {
            case 0:
                this.f31137b.S0(true);
                return;
            case 1:
                zq0 zq0Var = this.f31137b;
                qp qpVar = zq0Var.f33603e0;
                qpVar.a(!qpVar.f30141a.f24094q, true);
                zq0Var.W0();
                return;
            case 2:
                zq0 zq0Var2 = this.f31137b;
                org.telegram.ui.ActionBar.n1 n1Var = zq0Var2.J0;
                if (n1Var != null && n1Var.isShowing()) {
                    zq0Var2.J0.d(true);
                }
                zq0Var2.S0(false);
                return;
            case 3:
                zq0 zq0Var3 = this.f31137b;
                org.telegram.ui.ActionBar.n1 n1Var2 = zq0Var3.J0;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    zq0Var3.J0.d(true);
                }
                zq0Var3.S0(true);
                return;
            case 4:
                zq0 zq0Var4 = this.f31137b;
                String[] strArr = zq0Var4.f33614o0;
                if (zq0Var4.U.m() == 0) {
                    if (zq0Var4.f33613n0 || strArr[0] != null) {
                        zq0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] == null && zq0Var4.f33611l0) {
                            zq0Var4.m0 = true;
                            Toast.makeText(zq0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        zq0Var4.getContext();
                        zq0Var4.J0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                zq0 zq0Var5 = this.f31137b;
                String[] strArr2 = zq0Var5.f33614o0;
                if (zq0Var5.U.m() == 0) {
                    if (zq0Var5.f33613n0 || strArr2[0] != null) {
                        zq0Var5.dismiss();
                        if (strArr2[0] == null && zq0Var5.f33611l0) {
                            zq0Var5.m0 = true;
                            Toast.makeText(zq0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        zq0Var5.getContext();
                        zq0Var5.J0();
                        return;
                    }
                    return;
                }
                return;
            default:
                zq0 zq0Var6 = this.f31137b;
                String[] strArr3 = zq0Var6.f33614o0;
                if (zq0Var6.U.m() == 0) {
                    if (zq0Var6.f33613n0 || strArr3[0] != null) {
                        zq0Var6.dismiss();
                        if (strArr3[0] == null && zq0Var6.f33611l0) {
                            zq0Var6.m0 = true;
                            Toast.makeText(zq0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        zq0Var6.getContext();
                        zq0Var6.J0();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
