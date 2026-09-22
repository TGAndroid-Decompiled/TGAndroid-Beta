package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class ap0 implements View.OnClickListener {
    public final int f22449a;
    public final hq0 f22450b;

    public ap0(hq0 hq0Var, int i10) {
        this.f22449a = i10;
        this.f22450b = hq0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22449a) {
            case 0:
                hq0 hq0Var = this.f22450b;
                np npVar = hq0Var.f24760e0;
                npVar.a(!npVar.f26546a.f21969q, true);
                hq0Var.Z0();
                return;
            case 1:
                hq0 hq0Var2 = this.f22450b;
                org.telegram.ui.ActionBar.n1 n1Var = hq0Var2.J0;
                if (n1Var != null && n1Var.isShowing()) {
                    hq0Var2.J0.d(true);
                }
                hq0Var2.V0(false);
                return;
            case 2:
                hq0 hq0Var3 = this.f22450b;
                org.telegram.ui.ActionBar.n1 n1Var2 = hq0Var3.J0;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    hq0Var3.J0.d(true);
                }
                hq0Var3.V0(true);
                return;
            case 3:
                hq0 hq0Var4 = this.f22450b;
                String[] strArr = hq0Var4.f24771o0;
                if (hq0Var4.U.m() == 0) {
                    if (hq0Var4.f24770n0 || strArr[0] != null) {
                        hq0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] == null && hq0Var4.f24768l0) {
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
                hq0 hq0Var5 = this.f22450b;
                String[] strArr2 = hq0Var5.f24771o0;
                if (hq0Var5.U.m() == 0) {
                    if (hq0Var5.f24770n0 || strArr2[0] != null) {
                        hq0Var5.dismiss();
                        if (strArr2[0] == null && hq0Var5.f24768l0) {
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
                hq0 hq0Var6 = this.f22450b;
                String[] strArr3 = hq0Var6.f24771o0;
                if (hq0Var6.U.m() == 0) {
                    if (hq0Var6.f24770n0 || strArr3[0] != null) {
                        hq0Var6.dismiss();
                        if (strArr3[0] == null && hq0Var6.f24768l0) {
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
                this.f22450b.V0(true);
                return;
        }
    }
}
