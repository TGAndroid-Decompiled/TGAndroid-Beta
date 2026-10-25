package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class gq0 implements View.OnClickListener {
    public final int f28679a;
    public final mr0 f28680b;

    public gq0(mr0 mr0Var, int i10) {
        this.f28679a = i10;
        this.f28680b = mr0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28679a) {
            case 0:
                this.f28680b.X0(true);
                return;
            case 1:
                mr0 mr0Var = this.f28680b;
                zp zpVar = mr0Var.f30705f0;
                zpVar.a(!zpVar.f35379a.f26087q, true);
                mr0Var.c1();
                return;
            case 2:
                mr0 mr0Var2 = this.f28680b;
                org.telegram.ui.ActionBar.o1 o1Var = mr0Var2.K0;
                if (o1Var != null && o1Var.isShowing()) {
                    mr0Var2.K0.d(true);
                }
                mr0Var2.X0(false);
                return;
            case 3:
                mr0 mr0Var3 = this.f28680b;
                org.telegram.ui.ActionBar.o1 o1Var2 = mr0Var3.K0;
                if (o1Var2 != null && o1Var2.isShowing()) {
                    mr0Var3.K0.d(true);
                }
                mr0Var3.X0(true);
                return;
            case 4:
                mr0 mr0Var4 = this.f28680b;
                String[] strArr = mr0Var4.f30715p0;
                if (mr0Var4.V.m() == 0) {
                    if (mr0Var4.f30714o0 || strArr[0] != null) {
                        mr0Var4.dismiss();
                        PhotoViewer.u1().H0(true, false);
                        if (strArr[0] == null && mr0Var4.m0) {
                            mr0Var4.f30713n0 = true;
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
                mr0 mr0Var5 = this.f28680b;
                String[] strArr2 = mr0Var5.f30715p0;
                if (mr0Var5.V.m() == 0) {
                    if (mr0Var5.f30714o0 || strArr2[0] != null) {
                        mr0Var5.dismiss();
                        if (strArr2[0] == null && mr0Var5.m0) {
                            mr0Var5.f30713n0 = true;
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
                mr0 mr0Var6 = this.f28680b;
                String[] strArr3 = mr0Var6.f30715p0;
                if (mr0Var6.V.m() == 0) {
                    if (mr0Var6.f30714o0 || strArr3[0] != null) {
                        mr0Var6.dismiss();
                        if (strArr3[0] == null && mr0Var6.m0) {
                            mr0Var6.f30713n0 = true;
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
