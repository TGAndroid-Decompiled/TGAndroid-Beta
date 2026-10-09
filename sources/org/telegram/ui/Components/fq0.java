package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class fq0 implements View.OnClickListener {
    public final int f26461a;
    public final mr0 f26462b;

    public fq0(mr0 mr0Var, int i10) {
        this.f26461a = i10;
        this.f26462b = mr0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26461a) {
            case 0:
                mr0 mr0Var = this.f26462b;
                dq dqVar = mr0Var.f28900e0;
                dqVar.a(!dqVar.f25790a.f24097q, true);
                mr0Var.a1();
                return;
            case 1:
                mr0 mr0Var2 = this.f26462b;
                org.telegram.ui.ActionBar.n1 n1Var = mr0Var2.J0;
                if (n1Var != null && n1Var.isShowing()) {
                    mr0Var2.J0.d(true);
                }
                mr0Var2.W0(false);
                return;
            case 2:
                mr0 mr0Var3 = this.f26462b;
                org.telegram.ui.ActionBar.n1 n1Var2 = mr0Var3.J0;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    mr0Var3.J0.d(true);
                }
                mr0Var3.W0(true);
                return;
            case 3:
                mr0 mr0Var4 = this.f26462b;
                String[] strArr = mr0Var4.f28911o0;
                if (mr0Var4.U.m() == 0) {
                    if (mr0Var4.f28910n0 || strArr[0] != null) {
                        mr0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] == null && mr0Var4.f28908l0) {
                            mr0Var4.m0 = true;
                            Toast.makeText(mr0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        mr0Var4.getContext();
                        mr0Var4.N0();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                mr0 mr0Var5 = this.f26462b;
                String[] strArr2 = mr0Var5.f28911o0;
                if (mr0Var5.U.m() == 0) {
                    if (mr0Var5.f28910n0 || strArr2[0] != null) {
                        mr0Var5.dismiss();
                        if (strArr2[0] == null && mr0Var5.f28908l0) {
                            mr0Var5.m0 = true;
                            Toast.makeText(mr0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        mr0Var5.getContext();
                        mr0Var5.N0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                mr0 mr0Var6 = this.f26462b;
                String[] strArr3 = mr0Var6.f28911o0;
                if (mr0Var6.U.m() == 0) {
                    if (mr0Var6.f28910n0 || strArr3[0] != null) {
                        mr0Var6.dismiss();
                        if (strArr3[0] == null && mr0Var6.f28908l0) {
                            mr0Var6.m0 = true;
                            Toast.makeText(mr0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        mr0Var6.getContext();
                        mr0Var6.N0();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f26462b.W0(true);
                return;
        }
    }
}
