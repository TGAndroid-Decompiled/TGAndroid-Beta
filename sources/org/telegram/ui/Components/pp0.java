package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class pp0 implements View.OnClickListener {
    public final int f27396a;
    public final wq0 f27397b;

    public pp0(wq0 wq0Var, int i10) {
        this.f27396a = i10;
        this.f27397b = wq0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27396a) {
            case 0:
                wq0 wq0Var = this.f27397b;
                pp ppVar = wq0Var.f30124e0;
                ppVar.a(!ppVar.f27393a.f22196q, true);
                wq0Var.Z0();
                return;
            case 1:
                wq0 wq0Var2 = this.f27397b;
                org.telegram.ui.ActionBar.m1 m1Var = wq0Var2.J0;
                if (m1Var != null && m1Var.isShowing()) {
                    wq0Var2.J0.d(true);
                }
                wq0Var2.V0(false);
                return;
            case 2:
                wq0 wq0Var3 = this.f27397b;
                org.telegram.ui.ActionBar.m1 m1Var2 = wq0Var3.J0;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    wq0Var3.J0.d(true);
                }
                wq0Var3.V0(true);
                return;
            case 3:
                wq0 wq0Var4 = this.f27397b;
                String[] strArr = wq0Var4.f30135o0;
                if (wq0Var4.U.m() == 0) {
                    if (wq0Var4.f30134n0 || strArr[0] != null) {
                        wq0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] == null && wq0Var4.f30132l0) {
                            wq0Var4.m0 = true;
                            Toast.makeText(wq0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        wq0Var4.getContext();
                        wq0Var4.M0();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                wq0 wq0Var5 = this.f27397b;
                String[] strArr2 = wq0Var5.f30135o0;
                if (wq0Var5.U.m() == 0) {
                    if (wq0Var5.f30134n0 || strArr2[0] != null) {
                        wq0Var5.dismiss();
                        if (strArr2[0] == null && wq0Var5.f30132l0) {
                            wq0Var5.m0 = true;
                            Toast.makeText(wq0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        wq0Var5.getContext();
                        wq0Var5.M0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                wq0 wq0Var6 = this.f27397b;
                String[] strArr3 = wq0Var6.f30135o0;
                if (wq0Var6.U.m() == 0) {
                    if (wq0Var6.f30134n0 || strArr3[0] != null) {
                        wq0Var6.dismiss();
                        if (strArr3[0] == null && wq0Var6.f30132l0) {
                            wq0Var6.m0 = true;
                            Toast.makeText(wq0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        wq0Var6.getContext();
                        wq0Var6.M0();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f27397b.V0(true);
                return;
        }
    }
}
