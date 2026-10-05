package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class up0 implements View.OnClickListener {
    public final int f31498a;
    public final br0 f31499b;

    public up0(br0 br0Var, int i10) {
        this.f31498a = i10;
        this.f31499b = br0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31498a) {
            case 0:
                this.f31499b.S0(true);
                return;
            case 1:
                br0 br0Var = this.f31499b;
                qp qpVar = br0Var.f25058e0;
                qpVar.a(!qpVar.f30169a.f24101q, true);
                br0Var.W0();
                return;
            case 2:
                br0 br0Var2 = this.f31499b;
                org.telegram.ui.ActionBar.n1 n1Var = br0Var2.J0;
                if (n1Var != null && n1Var.isShowing()) {
                    br0Var2.J0.d(true);
                }
                br0Var2.S0(false);
                return;
            case 3:
                br0 br0Var3 = this.f31499b;
                org.telegram.ui.ActionBar.n1 n1Var2 = br0Var3.J0;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    br0Var3.J0.d(true);
                }
                br0Var3.S0(true);
                return;
            case 4:
                br0 br0Var4 = this.f31499b;
                String[] strArr = br0Var4.f25069o0;
                if (br0Var4.U.m() == 0) {
                    if (br0Var4.f25068n0 || strArr[0] != null) {
                        br0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] == null && br0Var4.f25066l0) {
                            br0Var4.m0 = true;
                            Toast.makeText(br0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        br0Var4.getContext();
                        br0Var4.J0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                br0 br0Var5 = this.f31499b;
                String[] strArr2 = br0Var5.f25069o0;
                if (br0Var5.U.m() == 0) {
                    if (br0Var5.f25068n0 || strArr2[0] != null) {
                        br0Var5.dismiss();
                        if (strArr2[0] == null && br0Var5.f25066l0) {
                            br0Var5.m0 = true;
                            Toast.makeText(br0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        br0Var5.getContext();
                        br0Var5.J0();
                        return;
                    }
                    return;
                }
                return;
            default:
                br0 br0Var6 = this.f31499b;
                String[] strArr3 = br0Var6.f25069o0;
                if (br0Var6.U.m() == 0) {
                    if (br0Var6.f25068n0 || strArr3[0] != null) {
                        br0Var6.dismiss();
                        if (strArr3[0] == null && br0Var6.f25066l0) {
                            br0Var6.m0 = true;
                            Toast.makeText(br0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        br0Var6.getContext();
                        br0Var6.J0();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
