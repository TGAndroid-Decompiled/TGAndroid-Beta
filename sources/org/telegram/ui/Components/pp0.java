package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class pp0 implements View.OnClickListener {
    public final int f27440a;
    public final vq0 f27441b;

    public pp0(vq0 vq0Var, int i10) {
        this.f27440a = i10;
        this.f27441b = vq0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27440a) {
            case 0:
                this.f27441b.S0(true);
                return;
            case 1:
                vq0 vq0Var = this.f27441b;
                pp ppVar = vq0Var.f29746e0;
                ppVar.a(!ppVar.f27437a.f22197q, true);
                vq0Var.W0();
                return;
            case 2:
                vq0 vq0Var2 = this.f27441b;
                org.telegram.ui.ActionBar.o1 o1Var = vq0Var2.J0;
                if (o1Var != null && o1Var.isShowing()) {
                    vq0Var2.J0.d(true);
                }
                vq0Var2.S0(false);
                return;
            case 3:
                vq0 vq0Var3 = this.f27441b;
                org.telegram.ui.ActionBar.o1 o1Var2 = vq0Var3.J0;
                if (o1Var2 != null && o1Var2.isShowing()) {
                    vq0Var3.J0.d(true);
                }
                vq0Var3.S0(true);
                return;
            case 4:
                vq0 vq0Var4 = this.f27441b;
                String[] strArr = vq0Var4.f29757o0;
                if (vq0Var4.U.m() == 0) {
                    if (vq0Var4.f29756n0 || strArr[0] != null) {
                        vq0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] == null && vq0Var4.f29754l0) {
                            vq0Var4.m0 = true;
                            Toast.makeText(vq0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        vq0Var4.getContext();
                        vq0Var4.J0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                vq0 vq0Var5 = this.f27441b;
                String[] strArr2 = vq0Var5.f29757o0;
                if (vq0Var5.U.m() == 0) {
                    if (vq0Var5.f29756n0 || strArr2[0] != null) {
                        vq0Var5.dismiss();
                        if (strArr2[0] == null && vq0Var5.f29754l0) {
                            vq0Var5.m0 = true;
                            Toast.makeText(vq0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        vq0Var5.getContext();
                        vq0Var5.J0();
                        return;
                    }
                    return;
                }
                return;
            default:
                vq0 vq0Var6 = this.f27441b;
                String[] strArr3 = vq0Var6.f29757o0;
                if (vq0Var6.U.m() == 0) {
                    if (vq0Var6.f29756n0 || strArr3[0] != null) {
                        vq0Var6.dismiss();
                        if (strArr3[0] == null && vq0Var6.f29754l0) {
                            vq0Var6.m0 = true;
                            Toast.makeText(vq0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        vq0Var6.getContext();
                        vq0Var6.J0();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
