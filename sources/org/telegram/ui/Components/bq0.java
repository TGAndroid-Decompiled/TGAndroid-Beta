package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class bq0 implements View.OnClickListener {
    public final int f23531a;
    public final ir0 f23532b;

    public bq0(ir0 ir0Var, int i10) {
        this.f23531a = i10;
        this.f23532b = ir0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23531a) {
            case 0:
                ir0 ir0Var = this.f23532b;
                aq aqVar = ir0Var.f25746e0;
                aqVar.a(!aqVar.f23281a.f22792q, true);
                ir0Var.a1();
                return;
            case 1:
                ir0 ir0Var2 = this.f23532b;
                org.telegram.ui.ActionBar.m1 m1Var = ir0Var2.J0;
                if (m1Var != null && m1Var.isShowing()) {
                    ir0Var2.J0.d(true);
                }
                ir0Var2.W0(false);
                return;
            case 2:
                ir0 ir0Var3 = this.f23532b;
                org.telegram.ui.ActionBar.m1 m1Var2 = ir0Var3.J0;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    ir0Var3.J0.d(true);
                }
                ir0Var3.W0(true);
                return;
            case 3:
                ir0 ir0Var4 = this.f23532b;
                String[] strArr = ir0Var4.f25757o0;
                if (ir0Var4.U.m() == 0) {
                    if (ir0Var4.f25756n0 || strArr[0] != null) {
                        ir0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] == null && ir0Var4.f25754l0) {
                            ir0Var4.m0 = true;
                            Toast.makeText(ir0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        ir0Var4.getContext();
                        ir0Var4.N0();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ir0 ir0Var5 = this.f23532b;
                String[] strArr2 = ir0Var5.f25757o0;
                if (ir0Var5.U.m() == 0) {
                    if (ir0Var5.f25756n0 || strArr2[0] != null) {
                        ir0Var5.dismiss();
                        if (strArr2[0] == null && ir0Var5.f25754l0) {
                            ir0Var5.m0 = true;
                            Toast.makeText(ir0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        ir0Var5.getContext();
                        ir0Var5.N0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ir0 ir0Var6 = this.f23532b;
                String[] strArr3 = ir0Var6.f25757o0;
                if (ir0Var6.U.m() == 0) {
                    if (ir0Var6.f25756n0 || strArr3[0] != null) {
                        ir0Var6.dismiss();
                        if (strArr3[0] == null && ir0Var6.f25754l0) {
                            ir0Var6.m0 = true;
                            Toast.makeText(ir0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        ir0Var6.getContext();
                        ir0Var6.N0();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f23532b.W0(true);
                return;
        }
    }
}
