package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class uo0 implements View.OnClickListener {
    public final int f33284a;
    public final dq0 f33285b;

    public uo0(dq0 dq0Var, int i10) {
        this.f33284a = i10;
        this.f33285b = dq0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33284a) {
            case 0:
                dq0 dq0Var = this.f33285b;
                hp hpVar = dq0Var.f27827a0;
                hpVar.a(!hpVar.f29211a.f26324q, true);
                dq0Var.Z0();
                return;
            case 1:
                dq0 dq0Var2 = this.f33285b;
                org.telegram.ui.ActionBar.o1 o1Var = dq0Var2.F0;
                if (o1Var != null && o1Var.isShowing()) {
                    dq0Var2.F0.d(true);
                }
                dq0Var2.V0(false);
                return;
            case 2:
                dq0 dq0Var3 = this.f33285b;
                org.telegram.ui.ActionBar.o1 o1Var2 = dq0Var3.F0;
                if (o1Var2 != null && o1Var2.isShowing()) {
                    dq0Var3.F0.d(true);
                }
                dq0Var3.V0(true);
                return;
            case 3:
                dq0 dq0Var4 = this.f33285b;
                String[] strArr = dq0Var4.f27841k0;
                if (dq0Var4.Q.m() == 0) {
                    if (dq0Var4.f27840j0 || strArr[0] != null) {
                        dq0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] == null && dq0Var4.f27838h0) {
                            dq0Var4.f27839i0 = true;
                            Toast.makeText(dq0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        dq0Var4.getContext();
                        dq0Var4.M0();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                dq0 dq0Var5 = this.f33285b;
                String[] strArr2 = dq0Var5.f27841k0;
                if (dq0Var5.Q.m() == 0) {
                    if (dq0Var5.f27840j0 || strArr2[0] != null) {
                        dq0Var5.dismiss();
                        if (strArr2[0] == null && dq0Var5.f27838h0) {
                            dq0Var5.f27839i0 = true;
                            Toast.makeText(dq0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        dq0Var5.getContext();
                        dq0Var5.M0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                dq0 dq0Var6 = this.f33285b;
                String[] strArr3 = dq0Var6.f27841k0;
                if (dq0Var6.Q.m() == 0) {
                    if (dq0Var6.f27840j0 || strArr3[0] != null) {
                        dq0Var6.dismiss();
                        if (strArr3[0] == null && dq0Var6.f27838h0) {
                            dq0Var6.f27839i0 = true;
                            Toast.makeText(dq0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        dq0Var6.getContext();
                        dq0Var6.M0();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f33285b.V0(true);
                return;
        }
    }
}
