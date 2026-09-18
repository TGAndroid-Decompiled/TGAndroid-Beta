package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class op0 implements View.OnClickListener {
    public final int f27037a;
    public final vq0 f27038b;

    public op0(vq0 vq0Var, int i10) {
        this.f27037a = i10;
        this.f27038b = vq0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27037a) {
            case 0:
                vq0 vq0Var = this.f27038b;
                np npVar = vq0Var.f29718e0;
                npVar.a(!npVar.f26739a.f22158q, true);
                vq0Var.Z0();
                return;
            case 1:
                vq0 vq0Var2 = this.f27038b;
                org.telegram.ui.ActionBar.n1 n1Var = vq0Var2.J0;
                if (n1Var != null && n1Var.isShowing()) {
                    vq0Var2.J0.d(true);
                }
                vq0Var2.V0(false);
                return;
            case 2:
                vq0 vq0Var3 = this.f27038b;
                org.telegram.ui.ActionBar.n1 n1Var2 = vq0Var3.J0;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    vq0Var3.J0.d(true);
                }
                vq0Var3.V0(true);
                return;
            case 3:
                vq0 vq0Var4 = this.f27038b;
                String[] strArr = vq0Var4.f29729o0;
                if (vq0Var4.U.m() == 0) {
                    if (vq0Var4.f29728n0 || strArr[0] != null) {
                        vq0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] == null && vq0Var4.f29726l0) {
                            vq0Var4.m0 = true;
                            Toast.makeText(vq0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        vq0Var4.getContext();
                        vq0Var4.M0();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                vq0 vq0Var5 = this.f27038b;
                String[] strArr2 = vq0Var5.f29729o0;
                if (vq0Var5.U.m() == 0) {
                    if (vq0Var5.f29728n0 || strArr2[0] != null) {
                        vq0Var5.dismiss();
                        if (strArr2[0] == null && vq0Var5.f29726l0) {
                            vq0Var5.m0 = true;
                            Toast.makeText(vq0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        vq0Var5.getContext();
                        vq0Var5.M0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                vq0 vq0Var6 = this.f27038b;
                String[] strArr3 = vq0Var6.f29729o0;
                if (vq0Var6.U.m() == 0) {
                    if (vq0Var6.f29728n0 || strArr3[0] != null) {
                        vq0Var6.dismiss();
                        if (strArr3[0] == null && vq0Var6.f29726l0) {
                            vq0Var6.m0 = true;
                            Toast.makeText(vq0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        vq0Var6.getContext();
                        vq0Var6.M0();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f27038b.V0(true);
                return;
        }
    }
}
