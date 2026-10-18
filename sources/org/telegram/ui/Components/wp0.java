package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class wp0 implements View.OnClickListener {
    public final int f32194a;
    public final dr0 f32195b;

    public wp0(dr0 dr0Var, int i10) {
        this.f32194a = i10;
        this.f32195b = dr0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32194a) {
            case 0:
                dr0 dr0Var = this.f32195b;
                xp xpVar = dr0Var.f25665e0;
                xpVar.a(!xpVar.f32435a.f24154q, true);
                dr0Var.a1();
                return;
            case 1:
                dr0 dr0Var2 = this.f32195b;
                org.telegram.ui.ActionBar.m1 m1Var = dr0Var2.J0;
                if (m1Var != null && m1Var.isShowing()) {
                    dr0Var2.J0.d(true);
                }
                dr0Var2.W0(false);
                return;
            case 2:
                dr0 dr0Var3 = this.f32195b;
                org.telegram.ui.ActionBar.m1 m1Var2 = dr0Var3.J0;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    dr0Var3.J0.d(true);
                }
                dr0Var3.W0(true);
                return;
            case 3:
                dr0 dr0Var4 = this.f32195b;
                String[] strArr = dr0Var4.f25676o0;
                if (dr0Var4.U.m() == 0) {
                    if (dr0Var4.f25675n0 || strArr[0] != null) {
                        dr0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] == null && dr0Var4.f25673l0) {
                            dr0Var4.m0 = true;
                            Toast.makeText(dr0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        dr0Var4.getContext();
                        dr0Var4.N0();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                dr0 dr0Var5 = this.f32195b;
                String[] strArr2 = dr0Var5.f25676o0;
                if (dr0Var5.U.m() == 0) {
                    if (dr0Var5.f25675n0 || strArr2[0] != null) {
                        dr0Var5.dismiss();
                        if (strArr2[0] == null && dr0Var5.f25673l0) {
                            dr0Var5.m0 = true;
                            Toast.makeText(dr0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        dr0Var5.getContext();
                        dr0Var5.N0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                dr0 dr0Var6 = this.f32195b;
                String[] strArr3 = dr0Var6.f25676o0;
                if (dr0Var6.U.m() == 0) {
                    if (dr0Var6.f25675n0 || strArr3[0] != null) {
                        dr0Var6.dismiss();
                        if (strArr3[0] == null && dr0Var6.f25673l0) {
                            dr0Var6.m0 = true;
                            Toast.makeText(dr0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        dr0Var6.getContext();
                        dr0Var6.N0();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f32195b.W0(true);
                return;
        }
    }
}
