package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class hq0 implements View.OnClickListener {
    public final int f29058a;
    public final nr0 f29059b;

    public hq0(nr0 nr0Var, int i10) {
        this.f29058a = i10;
        this.f29059b = nr0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29058a) {
            case 0:
                this.f29059b.X0(true);
                return;
            case 1:
                nr0 nr0Var = this.f29059b;
                aq aqVar = nr0Var.f31038f0;
                aqVar.a(!aqVar.f26634a.f26091q, true);
                nr0Var.c1();
                return;
            case 2:
                nr0 nr0Var2 = this.f29059b;
                org.telegram.ui.ActionBar.o1 o1Var = nr0Var2.K0;
                if (o1Var != null && o1Var.isShowing()) {
                    nr0Var2.K0.d(true);
                }
                nr0Var2.X0(false);
                return;
            case 3:
                nr0 nr0Var3 = this.f29059b;
                org.telegram.ui.ActionBar.o1 o1Var2 = nr0Var3.K0;
                if (o1Var2 != null && o1Var2.isShowing()) {
                    nr0Var3.K0.d(true);
                }
                nr0Var3.X0(true);
                return;
            case 4:
                nr0 nr0Var4 = this.f29059b;
                String[] strArr = nr0Var4.f31048p0;
                if (nr0Var4.V.m() == 0) {
                    if (nr0Var4.f31047o0 || strArr[0] != null) {
                        nr0Var4.dismiss();
                        PhotoViewer.v1().H0(true, false);
                        if (strArr[0] == null && nr0Var4.m0) {
                            nr0Var4.f31046n0 = true;
                            Toast.makeText(nr0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        nr0Var4.getContext();
                        nr0Var4.O0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                nr0 nr0Var5 = this.f29059b;
                String[] strArr2 = nr0Var5.f31048p0;
                if (nr0Var5.V.m() == 0) {
                    if (nr0Var5.f31047o0 || strArr2[0] != null) {
                        nr0Var5.dismiss();
                        if (strArr2[0] == null && nr0Var5.m0) {
                            nr0Var5.f31046n0 = true;
                            Toast.makeText(nr0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        nr0Var5.getContext();
                        nr0Var5.O0();
                        return;
                    }
                    return;
                }
                return;
            default:
                nr0 nr0Var6 = this.f29059b;
                String[] strArr3 = nr0Var6.f31048p0;
                if (nr0Var6.V.m() == 0) {
                    if (nr0Var6.f31047o0 || strArr3[0] != null) {
                        nr0Var6.dismiss();
                        if (strArr3[0] == null && nr0Var6.m0) {
                            nr0Var6.f31046n0 = true;
                            Toast.makeText(nr0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        nr0Var6.getContext();
                        nr0Var6.O0();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
