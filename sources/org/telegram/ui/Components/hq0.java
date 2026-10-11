package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class hq0 implements View.OnClickListener {
    public final int f27058a;
    public final or0 f27059b;

    public hq0(or0 or0Var, int i10) {
        this.f27058a = i10;
        this.f27059b = or0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27058a) {
            case 0:
                or0 or0Var = this.f27059b;
                dq dqVar = or0Var.f29482e0;
                dqVar.a(!dqVar.f25656a.f24089q, true);
                or0Var.a1();
                return;
            case 1:
                or0 or0Var2 = this.f27059b;
                org.telegram.ui.ActionBar.m1 m1Var = or0Var2.J0;
                if (m1Var != null && m1Var.isShowing()) {
                    or0Var2.J0.d(true);
                }
                or0Var2.W0(false);
                return;
            case 2:
                or0 or0Var3 = this.f27059b;
                org.telegram.ui.ActionBar.m1 m1Var2 = or0Var3.J0;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    or0Var3.J0.d(true);
                }
                or0Var3.W0(true);
                return;
            case 3:
                or0 or0Var4 = this.f27059b;
                String[] strArr = or0Var4.f29493o0;
                if (or0Var4.U.m() == 0) {
                    if (or0Var4.f29492n0 || strArr[0] != null) {
                        or0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] == null && or0Var4.f29490l0) {
                            or0Var4.m0 = true;
                            Toast.makeText(or0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        or0Var4.getContext();
                        or0Var4.N0();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                or0 or0Var5 = this.f27059b;
                String[] strArr2 = or0Var5.f29493o0;
                if (or0Var5.U.m() == 0) {
                    if (or0Var5.f29492n0 || strArr2[0] != null) {
                        or0Var5.dismiss();
                        if (strArr2[0] == null && or0Var5.f29490l0) {
                            or0Var5.m0 = true;
                            Toast.makeText(or0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        or0Var5.getContext();
                        or0Var5.N0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                or0 or0Var6 = this.f27059b;
                String[] strArr3 = or0Var6.f29493o0;
                if (or0Var6.U.m() == 0) {
                    if (or0Var6.f29492n0 || strArr3[0] != null) {
                        or0Var6.dismiss();
                        if (strArr3[0] == null && or0Var6.f29490l0) {
                            or0Var6.m0 = true;
                            Toast.makeText(or0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        or0Var6.getContext();
                        or0Var6.N0();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f27059b.W0(true);
                return;
        }
    }
}
