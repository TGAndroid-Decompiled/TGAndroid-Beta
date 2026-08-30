package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class ep0 implements View.OnClickListener {
    public final int f24627a;
    public final lq0 f24628b;

    public ep0(lq0 lq0Var, int i10) {
        this.f24627a = i10;
        this.f24628b = lq0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24627a) {
            case 0:
                lq0 lq0Var = this.f24628b;
                lp lpVar = lq0Var.f26844b0;
                lpVar.a(!lpVar.f26837a.f22965q, true);
                lq0Var.Z0();
                return;
            case 1:
                lq0 lq0Var2 = this.f24628b;
                org.telegram.ui.ActionBar.p1 p1Var = lq0Var2.G0;
                if (p1Var != null && p1Var.isShowing()) {
                    lq0Var2.G0.d(true);
                }
                lq0Var2.V0(false);
                return;
            case 2:
                lq0 lq0Var3 = this.f24628b;
                org.telegram.ui.ActionBar.p1 p1Var2 = lq0Var3.G0;
                if (p1Var2 != null && p1Var2.isShowing()) {
                    lq0Var3.G0.d(true);
                }
                lq0Var3.V0(true);
                return;
            case 3:
                lq0 lq0Var4 = this.f24628b;
                String[] strArr = lq0Var4.f26856l0;
                if (lq0Var4.R.m() == 0) {
                    if (lq0Var4.f26855k0 || strArr[0] != null) {
                        lq0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] == null && lq0Var4.f26853i0) {
                            lq0Var4.f26854j0 = true;
                            Toast.makeText(lq0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        lq0Var4.getContext();
                        lq0Var4.M0();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                lq0 lq0Var5 = this.f24628b;
                String[] strArr2 = lq0Var5.f26856l0;
                if (lq0Var5.R.m() == 0) {
                    if (lq0Var5.f26855k0 || strArr2[0] != null) {
                        lq0Var5.dismiss();
                        if (strArr2[0] == null && lq0Var5.f26853i0) {
                            lq0Var5.f26854j0 = true;
                            Toast.makeText(lq0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        lq0Var5.getContext();
                        lq0Var5.M0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                lq0 lq0Var6 = this.f24628b;
                String[] strArr3 = lq0Var6.f26856l0;
                if (lq0Var6.R.m() == 0) {
                    if (lq0Var6.f26855k0 || strArr3[0] != null) {
                        lq0Var6.dismiss();
                        if (strArr3[0] == null && lq0Var6.f26853i0) {
                            lq0Var6.f26854j0 = true;
                            Toast.makeText(lq0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        lq0Var6.getContext();
                        lq0Var6.M0();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f24628b.V0(true);
                return;
        }
    }
}
