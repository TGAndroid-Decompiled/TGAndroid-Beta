package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class gq0 implements View.OnClickListener {
    public final int f28681a;
    public final mr0 f28682b;

    public gq0(mr0 mr0Var, int i10) {
        this.f28681a = i10;
        this.f28682b = mr0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28681a) {
            case 0:
                this.f28682b.X0(true);
                return;
            case 1:
                mr0 mr0Var = this.f28682b;
                zp zpVar = mr0Var.f30707f0;
                zpVar.a(!zpVar.f35382a.f26089q, true);
                mr0Var.c1();
                return;
            case 2:
                mr0 mr0Var2 = this.f28682b;
                org.telegram.ui.ActionBar.o1 o1Var = mr0Var2.K0;
                if (o1Var != null && o1Var.isShowing()) {
                    mr0Var2.K0.d(true);
                }
                mr0Var2.X0(false);
                return;
            case 3:
                mr0 mr0Var3 = this.f28682b;
                org.telegram.ui.ActionBar.o1 o1Var2 = mr0Var3.K0;
                if (o1Var2 != null && o1Var2.isShowing()) {
                    mr0Var3.K0.d(true);
                }
                mr0Var3.X0(true);
                return;
            case 4:
                mr0 mr0Var4 = this.f28682b;
                String[] strArr = mr0Var4.f30717p0;
                if (mr0Var4.V.m() == 0) {
                    if (mr0Var4.f30716o0 || strArr[0] != null) {
                        mr0Var4.dismiss();
                        PhotoViewer.u1().H0(true, false);
                        if (strArr[0] == null && mr0Var4.m0) {
                            mr0Var4.f30715n0 = true;
                            Toast.makeText(mr0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        mr0Var4.getContext();
                        mr0Var4.O0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                mr0 mr0Var5 = this.f28682b;
                String[] strArr2 = mr0Var5.f30717p0;
                if (mr0Var5.V.m() == 0) {
                    if (mr0Var5.f30716o0 || strArr2[0] != null) {
                        mr0Var5.dismiss();
                        if (strArr2[0] == null && mr0Var5.m0) {
                            mr0Var5.f30715n0 = true;
                            Toast.makeText(mr0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        mr0Var5.getContext();
                        mr0Var5.O0();
                        return;
                    }
                    return;
                }
                return;
            default:
                mr0 mr0Var6 = this.f28682b;
                String[] strArr3 = mr0Var6.f30717p0;
                if (mr0Var6.V.m() == 0) {
                    if (mr0Var6.f30716o0 || strArr3[0] != null) {
                        mr0Var6.dismiss();
                        if (strArr3[0] == null && mr0Var6.m0) {
                            mr0Var6.f30715n0 = true;
                            Toast.makeText(mr0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        mr0Var6.getContext();
                        mr0Var6.O0();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
