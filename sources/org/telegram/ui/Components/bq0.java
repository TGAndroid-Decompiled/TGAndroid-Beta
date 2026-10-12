package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class bq0 implements View.OnClickListener {
    public final int f23837a;
    public final jr0 f23838b;

    public bq0(jr0 jr0Var, int i10) {
        this.f23837a = i10;
        this.f23838b = jr0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23837a) {
            case 0:
                jr0 jr0Var = this.f23838b;
                aq aqVar = jr0Var.f26463e0;
                aqVar.a(!aqVar.f23604a.f23092q, true);
                jr0Var.a1();
                return;
            case 1:
                jr0 jr0Var2 = this.f23838b;
                org.telegram.ui.ActionBar.m1 m1Var = jr0Var2.J0;
                if (m1Var != null && m1Var.isShowing()) {
                    jr0Var2.J0.d(true);
                }
                jr0Var2.W0(false);
                return;
            case 2:
                jr0 jr0Var3 = this.f23838b;
                org.telegram.ui.ActionBar.m1 m1Var2 = jr0Var3.J0;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    jr0Var3.J0.d(true);
                }
                jr0Var3.W0(true);
                return;
            case 3:
                jr0 jr0Var4 = this.f23838b;
                String[] strArr = jr0Var4.f26474o0;
                if (jr0Var4.U.m() == 0) {
                    if (jr0Var4.f26473n0 || strArr[0] != null) {
                        jr0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] == null && jr0Var4.f26471l0) {
                            jr0Var4.m0 = true;
                            Toast.makeText(jr0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        jr0Var4.getContext();
                        jr0Var4.N0();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                jr0 jr0Var5 = this.f23838b;
                String[] strArr2 = jr0Var5.f26474o0;
                if (jr0Var5.U.m() == 0) {
                    if (jr0Var5.f26473n0 || strArr2[0] != null) {
                        jr0Var5.dismiss();
                        if (strArr2[0] == null && jr0Var5.f26471l0) {
                            jr0Var5.m0 = true;
                            Toast.makeText(jr0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        jr0Var5.getContext();
                        jr0Var5.N0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                jr0 jr0Var6 = this.f23838b;
                String[] strArr3 = jr0Var6.f26474o0;
                if (jr0Var6.U.m() == 0) {
                    if (jr0Var6.f26473n0 || strArr3[0] != null) {
                        jr0Var6.dismiss();
                        if (strArr3[0] == null && jr0Var6.f26471l0) {
                            jr0Var6.m0 = true;
                            Toast.makeText(jr0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        jr0Var6.getContext();
                        jr0Var6.N0();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f23838b.W0(true);
                return;
        }
    }
}
