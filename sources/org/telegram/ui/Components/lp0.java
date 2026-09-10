package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class lp0 implements View.OnClickListener {
    public final int f25069a;
    public final sq0 f25070b;

    public lp0(sq0 sq0Var, int i10) {
        this.f25069a = i10;
        this.f25070b = sq0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25069a) {
            case 0:
                sq0 sq0Var = this.f25070b;
                tp tpVar = sq0Var.f27172e0;
                tpVar.a(!tpVar.f27462a.f21057q, true);
                sq0Var.Z0();
                return;
            case 1:
                sq0 sq0Var2 = this.f25070b;
                org.telegram.ui.ActionBar.p1 p1Var = sq0Var2.J0;
                if (p1Var != null && p1Var.isShowing()) {
                    sq0Var2.J0.d(true);
                }
                sq0Var2.V0(false);
                return;
            case 2:
                sq0 sq0Var3 = this.f25070b;
                org.telegram.ui.ActionBar.p1 p1Var2 = sq0Var3.J0;
                if (p1Var2 != null && p1Var2.isShowing()) {
                    sq0Var3.J0.d(true);
                }
                sq0Var3.V0(true);
                return;
            case 3:
                sq0 sq0Var4 = this.f25070b;
                String[] strArr = sq0Var4.f27183o0;
                if (sq0Var4.U.m() == 0) {
                    if (sq0Var4.f27182n0 || strArr[0] != null) {
                        sq0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] == null && sq0Var4.f27180l0) {
                            sq0Var4.m0 = true;
                            Toast.makeText(sq0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        sq0Var4.getContext();
                        sq0Var4.M0();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                sq0 sq0Var5 = this.f25070b;
                String[] strArr2 = sq0Var5.f27183o0;
                if (sq0Var5.U.m() == 0) {
                    if (sq0Var5.f27182n0 || strArr2[0] != null) {
                        sq0Var5.dismiss();
                        if (strArr2[0] == null && sq0Var5.f27180l0) {
                            sq0Var5.m0 = true;
                            Toast.makeText(sq0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        sq0Var5.getContext();
                        sq0Var5.M0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                sq0 sq0Var6 = this.f25070b;
                String[] strArr3 = sq0Var6.f27183o0;
                if (sq0Var6.U.m() == 0) {
                    if (sq0Var6.f27182n0 || strArr3[0] != null) {
                        sq0Var6.dismiss();
                        if (strArr3[0] == null && sq0Var6.f27180l0) {
                            sq0Var6.m0 = true;
                            Toast.makeText(sq0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        sq0Var6.getContext();
                        sq0Var6.M0();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f25070b.V0(true);
                return;
        }
    }
}
