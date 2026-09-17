package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class bp0 implements View.OnClickListener {
    public final int f22783a;
    public final iq0 f22784b;

    public bp0(iq0 iq0Var, int i10) {
        this.f22783a = i10;
        this.f22784b = iq0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22783a) {
            case 0:
                iq0 iq0Var = this.f22784b;
                np npVar = iq0Var.f24990e0;
                npVar.a(!npVar.f26508a.f21982q, true);
                iq0Var.Z0();
                return;
            case 1:
                iq0 iq0Var2 = this.f22784b;
                org.telegram.ui.ActionBar.o1 o1Var = iq0Var2.J0;
                if (o1Var != null && o1Var.isShowing()) {
                    iq0Var2.J0.d(true);
                }
                iq0Var2.V0(false);
                return;
            case 2:
                iq0 iq0Var3 = this.f22784b;
                org.telegram.ui.ActionBar.o1 o1Var2 = iq0Var3.J0;
                if (o1Var2 != null && o1Var2.isShowing()) {
                    iq0Var3.J0.d(true);
                }
                iq0Var3.V0(true);
                return;
            case 3:
                iq0 iq0Var4 = this.f22784b;
                String[] strArr = iq0Var4.f25001o0;
                if (iq0Var4.U.m() == 0) {
                    if (iq0Var4.f25000n0 || strArr[0] != null) {
                        iq0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] == null && iq0Var4.f24998l0) {
                            iq0Var4.m0 = true;
                            Toast.makeText(iq0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        iq0Var4.getContext();
                        iq0Var4.M0();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                iq0 iq0Var5 = this.f22784b;
                String[] strArr2 = iq0Var5.f25001o0;
                if (iq0Var5.U.m() == 0) {
                    if (iq0Var5.f25000n0 || strArr2[0] != null) {
                        iq0Var5.dismiss();
                        if (strArr2[0] == null && iq0Var5.f24998l0) {
                            iq0Var5.m0 = true;
                            Toast.makeText(iq0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        iq0Var5.getContext();
                        iq0Var5.M0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                iq0 iq0Var6 = this.f22784b;
                String[] strArr3 = iq0Var6.f25001o0;
                if (iq0Var6.U.m() == 0) {
                    if (iq0Var6.f25000n0 || strArr3[0] != null) {
                        iq0Var6.dismiss();
                        if (strArr3[0] == null && iq0Var6.f24998l0) {
                            iq0Var6.m0 = true;
                            Toast.makeText(iq0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        iq0Var6.getContext();
                        iq0Var6.M0();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f22784b.V0(true);
                return;
        }
    }
}
