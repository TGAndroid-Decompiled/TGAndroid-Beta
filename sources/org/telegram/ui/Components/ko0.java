package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;

public final class ko0 implements View.OnClickListener {

    public final int f30161a;

    public final sp0 f30162b;

    public ko0(sp0 sp0Var, int i10) {
        this.f30161a = i10;
        this.f30162b = sp0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30161a) {
            case 0:
                sp0 sp0Var = this.f30162b;
                bp bpVar = sp0Var.f32519a0;
                bpVar.a(!bpVar.f27188a.f26309q, true);
                sp0Var.Z0();
                break;
            case 1:
                sp0 sp0Var2 = this.f30162b;
                org.telegram.ui.ActionBar.n1 n1Var = sp0Var2.F0;
                if (n1Var != null && n1Var.isShowing()) {
                    sp0Var2.F0.d(true);
                }
                sp0Var2.V0(false);
                break;
            case 2:
                sp0 sp0Var3 = this.f30162b;
                org.telegram.ui.ActionBar.n1 n1Var2 = sp0Var3.F0;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    sp0Var3.F0.d(true);
                }
                sp0Var3.V0(true);
                break;
            case 3:
                sp0 sp0Var4 = this.f30162b;
                String[] strArr = sp0Var4.f32533k0;
                if (sp0Var4.Q.m() == 0) {
                    if (sp0Var4.f32532j0 || strArr[0] != null) {
                        sp0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] == null && sp0Var4.f32530h0) {
                            sp0Var4.f32531i0 = true;
                            Toast.makeText(sp0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                        } else {
                            sp0Var4.getContext();
                            sp0Var4.M0();
                        }
                    }
                }
                break;
            case 4:
                sp0 sp0Var5 = this.f30162b;
                String[] strArr2 = sp0Var5.f32533k0;
                if (sp0Var5.Q.m() == 0) {
                    if (sp0Var5.f32532j0 || strArr2[0] != null) {
                        sp0Var5.dismiss();
                        if (strArr2[0] == null && sp0Var5.f32530h0) {
                            sp0Var5.f32531i0 = true;
                            Toast.makeText(sp0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                        } else {
                            sp0Var5.getContext();
                            sp0Var5.M0();
                        }
                    }
                }
                break;
            case 5:
                sp0 sp0Var6 = this.f30162b;
                String[] strArr3 = sp0Var6.f32533k0;
                if (sp0Var6.Q.m() == 0) {
                    if (sp0Var6.f32532j0 || strArr3[0] != null) {
                        sp0Var6.dismiss();
                        if (strArr3[0] == null && sp0Var6.f32530h0) {
                            sp0Var6.f32531i0 = true;
                            Toast.makeText(sp0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                        } else {
                            sp0Var6.getContext();
                            sp0Var6.M0();
                        }
                    }
                }
                break;
            default:
                this.f30162b.V0(true);
                break;
        }
    }
}
