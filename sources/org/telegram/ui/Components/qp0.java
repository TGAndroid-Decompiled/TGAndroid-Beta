package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class qp0 implements View.OnClickListener {
    public final int f27700a;
    public final xq0 f27701b;

    public qp0(xq0 xq0Var, int i10) {
        this.f27700a = i10;
        this.f27701b = xq0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27700a) {
            case 0:
                xq0 xq0Var = this.f27701b;
                qp qpVar = xq0Var.f30460e0;
                qpVar.a(!qpVar.f27697a.f22216q, true);
                xq0Var.Z0();
                return;
            case 1:
                xq0 xq0Var2 = this.f27701b;
                org.telegram.ui.ActionBar.m1 m1Var = xq0Var2.J0;
                if (m1Var != null && m1Var.isShowing()) {
                    xq0Var2.J0.d(true);
                }
                xq0Var2.V0(false);
                return;
            case 2:
                xq0 xq0Var3 = this.f27701b;
                org.telegram.ui.ActionBar.m1 m1Var2 = xq0Var3.J0;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    xq0Var3.J0.d(true);
                }
                xq0Var3.V0(true);
                return;
            case 3:
                xq0 xq0Var4 = this.f27701b;
                String[] strArr = xq0Var4.f30471o0;
                if (xq0Var4.U.m() == 0) {
                    if (xq0Var4.f30470n0 || strArr[0] != null) {
                        xq0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] == null && xq0Var4.f30468l0) {
                            xq0Var4.m0 = true;
                            Toast.makeText(xq0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        xq0Var4.getContext();
                        xq0Var4.M0();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                xq0 xq0Var5 = this.f27701b;
                String[] strArr2 = xq0Var5.f30471o0;
                if (xq0Var5.U.m() == 0) {
                    if (xq0Var5.f30470n0 || strArr2[0] != null) {
                        xq0Var5.dismiss();
                        if (strArr2[0] == null && xq0Var5.f30468l0) {
                            xq0Var5.m0 = true;
                            Toast.makeText(xq0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        xq0Var5.getContext();
                        xq0Var5.M0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                xq0 xq0Var6 = this.f27701b;
                String[] strArr3 = xq0Var6.f30471o0;
                if (xq0Var6.U.m() == 0) {
                    if (xq0Var6.f30470n0 || strArr3[0] != null) {
                        xq0Var6.dismiss();
                        if (strArr3[0] == null && xq0Var6.f30468l0) {
                            xq0Var6.m0 = true;
                            Toast.makeText(xq0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        xq0Var6.getContext();
                        xq0Var6.M0();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f27701b.V0(true);
                return;
        }
    }
}
