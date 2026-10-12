package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class lq0 implements View.OnClickListener {
    public final int f28255a;
    public final sr0 f28256b;

    public lq0(sr0 sr0Var, int i10) {
        this.f28255a = i10;
        this.f28256b = sr0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28255a) {
            case 0:
                sr0 sr0Var = this.f28256b;
                fq fqVar = sr0Var.f30639e0;
                fqVar.a(!fqVar.f26152a.f23875q, true);
                sr0Var.a1();
                return;
            case 1:
                sr0 sr0Var2 = this.f28256b;
                org.telegram.ui.ActionBar.m1 m1Var = sr0Var2.J0;
                if (m1Var != null && m1Var.isShowing()) {
                    sr0Var2.J0.d(true);
                }
                sr0Var2.W0(false);
                return;
            case 2:
                sr0 sr0Var3 = this.f28256b;
                org.telegram.ui.ActionBar.m1 m1Var2 = sr0Var3.J0;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    sr0Var3.J0.d(true);
                }
                sr0Var3.W0(true);
                return;
            case 3:
                sr0 sr0Var4 = this.f28256b;
                String[] strArr = sr0Var4.f30650o0;
                if (sr0Var4.U.m() == 0) {
                    if (sr0Var4.f30649n0 || strArr[0] != null) {
                        sr0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] == null && sr0Var4.f30647l0) {
                            sr0Var4.m0 = true;
                            Toast.makeText(sr0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        sr0Var4.getContext();
                        sr0Var4.N0();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                sr0 sr0Var5 = this.f28256b;
                String[] strArr2 = sr0Var5.f30650o0;
                if (sr0Var5.U.m() == 0) {
                    if (sr0Var5.f30649n0 || strArr2[0] != null) {
                        sr0Var5.dismiss();
                        if (strArr2[0] == null && sr0Var5.f30647l0) {
                            sr0Var5.m0 = true;
                            Toast.makeText(sr0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        sr0Var5.getContext();
                        sr0Var5.N0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                sr0 sr0Var6 = this.f28256b;
                String[] strArr3 = sr0Var6.f30650o0;
                if (sr0Var6.U.m() == 0) {
                    if (sr0Var6.f30649n0 || strArr3[0] != null) {
                        sr0Var6.dismiss();
                        if (strArr3[0] == null && sr0Var6.f30647l0) {
                            sr0Var6.m0 = true;
                            Toast.makeText(sr0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        sr0Var6.getContext();
                        sr0Var6.N0();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f28256b.W0(true);
                return;
        }
    }
}
