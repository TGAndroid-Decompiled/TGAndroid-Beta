package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class bp0 implements View.OnClickListener {
    public final int f24807a;
    public final hq0 f24808b;

    public bp0(hq0 hq0Var, int i10) {
        this.f24807a = i10;
        this.f24808b = hq0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24807a) {
            case 0:
                hq0 hq0Var = this.f24808b;
                mp mpVar = hq0Var.f26822e0;
                mpVar.a(!mpVar.f28505a.f23935q, true);
                hq0Var.Z0();
                return;
            case 1:
                hq0 hq0Var2 = this.f24808b;
                org.telegram.ui.ActionBar.n1 n1Var = hq0Var2.J0;
                if (n1Var != null && n1Var.isShowing()) {
                    hq0Var2.J0.d(true);
                }
                hq0Var2.V0(false);
                return;
            case 2:
                hq0 hq0Var3 = this.f24808b;
                org.telegram.ui.ActionBar.n1 n1Var2 = hq0Var3.J0;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    hq0Var3.J0.d(true);
                }
                hq0Var3.V0(true);
                return;
            case 3:
                hq0 hq0Var4 = this.f24808b;
                String[] strArr = hq0Var4.f26833o0;
                if (hq0Var4.U.m() == 0) {
                    if (hq0Var4.f26832n0 || strArr[0] != null) {
                        hq0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] == null && hq0Var4.f26830l0) {
                            hq0Var4.m0 = true;
                            Toast.makeText(hq0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        hq0Var4.getContext();
                        hq0Var4.M0();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                hq0 hq0Var5 = this.f24808b;
                String[] strArr2 = hq0Var5.f26833o0;
                if (hq0Var5.U.m() == 0) {
                    if (hq0Var5.f26832n0 || strArr2[0] != null) {
                        hq0Var5.dismiss();
                        if (strArr2[0] == null && hq0Var5.f26830l0) {
                            hq0Var5.m0 = true;
                            Toast.makeText(hq0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        hq0Var5.getContext();
                        hq0Var5.M0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                hq0 hq0Var6 = this.f24808b;
                String[] strArr3 = hq0Var6.f26833o0;
                if (hq0Var6.U.m() == 0) {
                    if (hq0Var6.f26832n0 || strArr3[0] != null) {
                        hq0Var6.dismiss();
                        if (strArr3[0] == null && hq0Var6.f26830l0) {
                            hq0Var6.m0 = true;
                            Toast.makeText(hq0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        hq0Var6.getContext();
                        hq0Var6.M0();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f24808b.V0(true);
                return;
        }
    }
}
