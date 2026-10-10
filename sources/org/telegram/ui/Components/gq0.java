package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class gq0 implements View.OnClickListener {
    public final int f26827a;
    public final nr0 f26828b;

    public gq0(nr0 nr0Var, int i10) {
        this.f26827a = i10;
        this.f26828b = nr0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26827a) {
            case 0:
                nr0 nr0Var = this.f26828b;
                dq dqVar = nr0Var.f29197e0;
                dqVar.a(!dqVar.f25781a.f24101q, true);
                nr0Var.a1();
                return;
            case 1:
                nr0 nr0Var2 = this.f26828b;
                org.telegram.ui.ActionBar.n1 n1Var = nr0Var2.J0;
                if (n1Var != null && n1Var.isShowing()) {
                    nr0Var2.J0.d(true);
                }
                nr0Var2.W0(false);
                return;
            case 2:
                nr0 nr0Var3 = this.f26828b;
                org.telegram.ui.ActionBar.n1 n1Var2 = nr0Var3.J0;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    nr0Var3.J0.d(true);
                }
                nr0Var3.W0(true);
                return;
            case 3:
                nr0 nr0Var4 = this.f26828b;
                String[] strArr = nr0Var4.f29208o0;
                if (nr0Var4.U.m() == 0) {
                    if (nr0Var4.f29207n0 || strArr[0] != null) {
                        nr0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] == null && nr0Var4.f29205l0) {
                            nr0Var4.m0 = true;
                            Toast.makeText(nr0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        nr0Var4.getContext();
                        nr0Var4.N0();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                nr0 nr0Var5 = this.f26828b;
                String[] strArr2 = nr0Var5.f29208o0;
                if (nr0Var5.U.m() == 0) {
                    if (nr0Var5.f29207n0 || strArr2[0] != null) {
                        nr0Var5.dismiss();
                        if (strArr2[0] == null && nr0Var5.f29205l0) {
                            nr0Var5.m0 = true;
                            Toast.makeText(nr0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        nr0Var5.getContext();
                        nr0Var5.N0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                nr0 nr0Var6 = this.f26828b;
                String[] strArr3 = nr0Var6.f29208o0;
                if (nr0Var6.U.m() == 0) {
                    if (nr0Var6.f29207n0 || strArr3[0] != null) {
                        nr0Var6.dismiss();
                        if (strArr3[0] == null && nr0Var6.f29205l0) {
                            nr0Var6.m0 = true;
                            Toast.makeText(nr0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        nr0Var6.getContext();
                        nr0Var6.N0();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f26828b.W0(true);
                return;
        }
    }
}
