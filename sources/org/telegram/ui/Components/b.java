package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class b implements View.OnClickListener {
    public final int f24715a;
    public final e0 f24716b;

    public b(e0 e0Var, int i10) {
        this.f24715a = i10;
        this.f24716b = e0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24715a) {
            case 0:
                this.f24716b.dismiss();
                return;
            case 1:
                e0 e0Var = this.f24716b;
                org.telegram.ui.Cells.j3 j3Var = e0Var.A0;
                AndroidUtilities.hideKeyboard(j3Var.f22325b);
                e0Var.I0 = j3Var.getText().toString();
                e0Var.r0();
                e0Var.q0(true);
                e0Var.l0();
                return;
            case 2:
                e0 e0Var2 = this.f24716b;
                if (e0Var2.f25910k0 != null) {
                    TL_iv.RichMessage h02 = e0Var2.h0();
                    if (h02 != null) {
                        e0Var2.f25910k0.run(h02);
                    }
                } else if (e0Var2.f25909j0 != null && e0Var2.i0() != null) {
                    e0Var2.f25909j0.run(e0Var2.i0());
                }
                e0Var2.dismiss();
                return;
            case 3:
                this.f24716b.dismiss();
                return;
            case 4:
                e0 e0Var3 = this.f24716b;
                e0Var3.P0 = false;
                e0Var3.K();
                e0Var3.O0.N(true);
                e0Var3.u();
                return;
            case 5:
                e0.Z(this.f24716b, view);
                return;
            case 6:
                e0.S(this.f24716b, view);
                return;
            case 7:
                e0 e0Var4 = this.f24716b;
                if (!e0Var4.R0) {
                    AndroidUtilities.addToClipboard(e0Var4.i0());
                    return;
                }
                return;
            case 8:
                this.f24716b.dismiss();
                return;
            default:
                e0 e0Var5 = this.f24716b;
                e0Var5.m0(0, 0, true);
                e0Var5.dismiss();
                return;
        }
    }
}
