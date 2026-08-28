package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class jo0 implements View.OnClickListener {
    public final int f29808a;
    public final rp0 f29809b;

    public jo0(rp0 rp0Var, int i9) {
        this.f29808a = i9;
        this.f29809b = rp0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29808a) {
            case 0:
                rp0 rp0Var = this.f29809b;
                dp dpVar = rp0Var.f32241a0;
                dpVar.a(!dpVar.f27781a.f26313q, true);
                rp0Var.Z0();
                return;
            case 1:
                rp0 rp0Var2 = this.f29809b;
                org.telegram.ui.ActionBar.o1 o1Var = rp0Var2.F0;
                if (o1Var != null && o1Var.isShowing()) {
                    rp0Var2.F0.d(true);
                }
                rp0Var2.V0(false);
                return;
            case 2:
                rp0 rp0Var3 = this.f29809b;
                org.telegram.ui.ActionBar.o1 o1Var2 = rp0Var3.F0;
                if (o1Var2 != null && o1Var2.isShowing()) {
                    rp0Var3.F0.d(true);
                }
                rp0Var3.V0(true);
                return;
            case 3:
                rp0 rp0Var4 = this.f29809b;
                String[] strArr = rp0Var4.f32255k0;
                if (rp0Var4.Q.m() == 0) {
                    if (rp0Var4.f32254j0 || strArr[0] != null) {
                        rp0Var4.dismiss();
                        PhotoViewer.t1().F0(true, false);
                        if (strArr[0] == null && rp0Var4.f32252h0) {
                            rp0Var4.f32253i0 = true;
                            Toast.makeText(rp0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        rp0Var4.getContext();
                        rp0Var4.M0();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                rp0 rp0Var5 = this.f29809b;
                String[] strArr2 = rp0Var5.f32255k0;
                if (rp0Var5.Q.m() == 0) {
                    if (rp0Var5.f32254j0 || strArr2[0] != null) {
                        rp0Var5.dismiss();
                        if (strArr2[0] == null && rp0Var5.f32252h0) {
                            rp0Var5.f32253i0 = true;
                            Toast.makeText(rp0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        rp0Var5.getContext();
                        rp0Var5.M0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                rp0 rp0Var6 = this.f29809b;
                String[] strArr3 = rp0Var6.f32255k0;
                if (rp0Var6.Q.m() == 0) {
                    if (rp0Var6.f32254j0 || strArr3[0] != null) {
                        rp0Var6.dismiss();
                        if (strArr3[0] == null && rp0Var6.f32252h0) {
                            rp0Var6.f32253i0 = true;
                            Toast.makeText(rp0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        rp0Var6.getContext();
                        rp0Var6.M0();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f29809b.V0(true);
                return;
        }
    }
}
