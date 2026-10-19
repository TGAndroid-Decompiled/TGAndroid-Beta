package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class wp0 implements View.OnClickListener {
    public final int f32184a;
    public final er0 f32185b;

    public wp0(er0 er0Var, int i10) {
        this.f32184a = i10;
        this.f32185b = er0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32184a) {
            case 0:
                er0 er0Var = this.f32185b;
                xp xpVar = er0Var.f25984f0;
                xpVar.a(!xpVar.f32430a.f24148q, true);
                er0Var.b1();
                return;
            case 1:
                er0 er0Var2 = this.f32185b;
                org.telegram.ui.ActionBar.m1 m1Var = er0Var2.K0;
                if (m1Var != null && m1Var.isShowing()) {
                    er0Var2.K0.d(true);
                }
                er0Var2.X0(false);
                return;
            case 2:
                er0 er0Var3 = this.f32185b;
                org.telegram.ui.ActionBar.m1 m1Var2 = er0Var3.K0;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    er0Var3.K0.d(true);
                }
                er0Var3.X0(true);
                return;
            case 3:
                er0 er0Var4 = this.f32185b;
                String[] strArr = er0Var4.f25994p0;
                if (er0Var4.V.m() == 0) {
                    if (er0Var4.f25993o0 || strArr[0] != null) {
                        er0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] == null && er0Var4.m0) {
                            er0Var4.f25992n0 = true;
                            Toast.makeText(er0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        er0Var4.getContext();
                        er0Var4.O0();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                er0 er0Var5 = this.f32185b;
                String[] strArr2 = er0Var5.f25994p0;
                if (er0Var5.V.m() == 0) {
                    if (er0Var5.f25993o0 || strArr2[0] != null) {
                        er0Var5.dismiss();
                        if (strArr2[0] == null && er0Var5.m0) {
                            er0Var5.f25992n0 = true;
                            Toast.makeText(er0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        er0Var5.getContext();
                        er0Var5.O0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                er0 er0Var6 = this.f32185b;
                String[] strArr3 = er0Var6.f25994p0;
                if (er0Var6.V.m() == 0) {
                    if (er0Var6.f25993o0 || strArr3[0] != null) {
                        er0Var6.dismiss();
                        if (strArr3[0] == null && er0Var6.m0) {
                            er0Var6.f25992n0 = true;
                            Toast.makeText(er0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        er0Var6.getContext();
                        er0Var6.O0();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f32185b.X0(true);
                return;
        }
    }
}
