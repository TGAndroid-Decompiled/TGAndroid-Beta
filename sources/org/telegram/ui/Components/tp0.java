package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class tp0 implements View.OnClickListener {
    public final int f31142a;
    public final zq0 f31143b;

    public tp0(zq0 zq0Var, int i10) {
        this.f31142a = i10;
        this.f31143b = zq0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31142a) {
            case 0:
                this.f31143b.S0(true);
                return;
            case 1:
                zq0 zq0Var = this.f31143b;
                qp qpVar = zq0Var.f33609e0;
                qpVar.a(!qpVar.f30147a.f24098q, true);
                zq0Var.W0();
                return;
            case 2:
                zq0 zq0Var2 = this.f31143b;
                org.telegram.ui.ActionBar.n1 n1Var = zq0Var2.J0;
                if (n1Var != null && n1Var.isShowing()) {
                    zq0Var2.J0.d(true);
                }
                zq0Var2.S0(false);
                return;
            case 3:
                zq0 zq0Var3 = this.f31143b;
                org.telegram.ui.ActionBar.n1 n1Var2 = zq0Var3.J0;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    zq0Var3.J0.d(true);
                }
                zq0Var3.S0(true);
                return;
            case 4:
                zq0 zq0Var4 = this.f31143b;
                String[] strArr = zq0Var4.f33620o0;
                if (zq0Var4.U.m() == 0) {
                    if (zq0Var4.f33619n0 || strArr[0] != null) {
                        zq0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] == null && zq0Var4.f33617l0) {
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
                zq0 zq0Var5 = this.f31143b;
                String[] strArr2 = zq0Var5.f33620o0;
                if (zq0Var5.U.m() == 0) {
                    if (zq0Var5.f33619n0 || strArr2[0] != null) {
                        zq0Var5.dismiss();
                        if (strArr2[0] == null && zq0Var5.f33617l0) {
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
                zq0 zq0Var6 = this.f31143b;
                String[] strArr3 = zq0Var6.f33620o0;
                if (zq0Var6.U.m() == 0) {
                    if (zq0Var6.f33619n0 || strArr3[0] != null) {
                        zq0Var6.dismiss();
                        if (strArr3[0] == null && zq0Var6.f33617l0) {
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
