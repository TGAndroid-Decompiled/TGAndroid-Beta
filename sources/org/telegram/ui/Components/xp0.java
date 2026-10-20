package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class xp0 implements View.OnClickListener {
    public final int f32461a;
    public final fr0 f32462b;

    public xp0(fr0 fr0Var, int i10) {
        this.f32461a = i10;
        this.f32462b = fr0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32461a) {
            case 0:
                fr0 fr0Var = this.f32462b;
                xp xpVar = fr0Var.f26372f0;
                xpVar.a(!xpVar.f32458a.f24151q, true);
                fr0Var.b1();
                return;
            case 1:
                fr0 fr0Var2 = this.f32462b;
                org.telegram.ui.ActionBar.m1 m1Var = fr0Var2.K0;
                if (m1Var != null && m1Var.isShowing()) {
                    fr0Var2.K0.d(true);
                }
                fr0Var2.X0(false);
                return;
            case 2:
                fr0 fr0Var3 = this.f32462b;
                org.telegram.ui.ActionBar.m1 m1Var2 = fr0Var3.K0;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    fr0Var3.K0.d(true);
                }
                fr0Var3.X0(true);
                return;
            case 3:
                fr0 fr0Var4 = this.f32462b;
                String[] strArr = fr0Var4.f26382p0;
                if (fr0Var4.V.m() == 0) {
                    if (fr0Var4.f26381o0 || strArr[0] != null) {
                        fr0Var4.dismiss();
                        PhotoViewer.u1().H0(true, false);
                        if (strArr[0] == null && fr0Var4.m0) {
                            fr0Var4.f26380n0 = true;
                            Toast.makeText(fr0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        fr0Var4.getContext();
                        fr0Var4.O0();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                fr0 fr0Var5 = this.f32462b;
                String[] strArr2 = fr0Var5.f26382p0;
                if (fr0Var5.V.m() == 0) {
                    if (fr0Var5.f26381o0 || strArr2[0] != null) {
                        fr0Var5.dismiss();
                        if (strArr2[0] == null && fr0Var5.m0) {
                            fr0Var5.f26380n0 = true;
                            Toast.makeText(fr0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        fr0Var5.getContext();
                        fr0Var5.O0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                fr0 fr0Var6 = this.f32462b;
                String[] strArr3 = fr0Var6.f26382p0;
                if (fr0Var6.V.m() == 0) {
                    if (fr0Var6.f26381o0 || strArr3[0] != null) {
                        fr0Var6.dismiss();
                        if (strArr3[0] == null && fr0Var6.m0) {
                            fr0Var6.f26380n0 = true;
                            Toast.makeText(fr0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        fr0Var6.getContext();
                        fr0Var6.O0();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f32462b.X0(true);
                return;
        }
    }
}
