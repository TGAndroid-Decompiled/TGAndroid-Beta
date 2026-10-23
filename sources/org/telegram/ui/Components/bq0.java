package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class bq0 implements View.OnClickListener {
    public final int f25127a;
    public final ir0 f25128b;

    public bq0(ir0 ir0Var, int i10) {
        this.f25127a = i10;
        this.f25128b = ir0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25127a) {
            case 0:
                ir0 ir0Var = this.f25128b;
                xp xpVar = ir0Var.f27417f0;
                xpVar.a(!xpVar.f32618a.f24296q, true);
                ir0Var.f1();
                return;
            case 1:
                ir0 ir0Var2 = this.f25128b;
                org.telegram.ui.ActionBar.m1 m1Var = ir0Var2.K0;
                if (m1Var != null && m1Var.isShowing()) {
                    ir0Var2.K0.d(true);
                }
                ir0Var2.a1(false);
                return;
            case 2:
                ir0 ir0Var3 = this.f25128b;
                org.telegram.ui.ActionBar.m1 m1Var2 = ir0Var3.K0;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    ir0Var3.K0.d(true);
                }
                ir0Var3.a1(true);
                return;
            case 3:
                ir0 ir0Var4 = this.f25128b;
                String[] strArr = ir0Var4.f27427p0;
                if (ir0Var4.V.m() == 0) {
                    if (ir0Var4.f27426o0 || strArr[0] != null) {
                        ir0Var4.dismiss();
                        PhotoViewer.u1().H0(true, false);
                        if (strArr[0] == null && ir0Var4.m0) {
                            ir0Var4.f27425n0 = true;
                            Toast.makeText(ir0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        ir0Var4.getContext();
                        ir0Var4.R0();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ir0 ir0Var5 = this.f25128b;
                String[] strArr2 = ir0Var5.f27427p0;
                if (ir0Var5.V.m() == 0) {
                    if (ir0Var5.f27426o0 || strArr2[0] != null) {
                        ir0Var5.dismiss();
                        if (strArr2[0] == null && ir0Var5.m0) {
                            ir0Var5.f27425n0 = true;
                            Toast.makeText(ir0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        ir0Var5.getContext();
                        ir0Var5.R0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ir0 ir0Var6 = this.f25128b;
                String[] strArr3 = ir0Var6.f27427p0;
                if (ir0Var6.V.m() == 0) {
                    if (ir0Var6.f27426o0 || strArr3[0] != null) {
                        ir0Var6.dismiss();
                        if (strArr3[0] == null && ir0Var6.m0) {
                            ir0Var6.f27425n0 = true;
                            Toast.makeText(ir0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        ir0Var6.getContext();
                        ir0Var6.R0();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f25128b.a1(true);
                return;
        }
    }
}
