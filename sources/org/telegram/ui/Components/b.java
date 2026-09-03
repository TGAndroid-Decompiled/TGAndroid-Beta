package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class b implements View.OnClickListener {
    public final int f23499a;
    public final f0 f23500b;

    public b(f0 f0Var, int i10) {
        this.f23499a = i10;
        this.f23500b = f0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23499a) {
            case 0:
                this.f23500b.dismiss();
                return;
            case 1:
                f0 f0Var = this.f23500b;
                org.telegram.ui.Cells.h3 h3Var = f0Var.f24751x0;
                AndroidUtilities.hideKeyboard(h3Var.f21132b);
                f0Var.F0 = h3Var.getText().toString();
                f0Var.q0();
                f0Var.p0(true);
                f0Var.k0();
                return;
            case 2:
                f0 f0Var2 = this.f23500b;
                if (f0Var2.f24736h0 != null) {
                    TL_iv.RichMessage g02 = f0Var2.g0();
                    if (g02 != null) {
                        f0Var2.f24736h0.run(g02);
                    }
                } else if (f0Var2.f24735g0 != null && f0Var2.h0() != null) {
                    f0Var2.f24735g0.run(f0Var2.h0());
                }
                f0Var2.dismiss();
                return;
            case 3:
                this.f23500b.dismiss();
                return;
            case 4:
                f0 f0Var3 = this.f23500b;
                f0Var3.M0 = false;
                f0Var3.I();
                f0Var3.L0.N(true);
                f0Var3.s();
                return;
            case 5:
                f0.Y(this.f23500b, view);
                return;
            case 6:
                f0.R(this.f23500b, view);
                return;
            case 7:
                f0 f0Var4 = this.f23500b;
                if (!f0Var4.O0) {
                    AndroidUtilities.addToClipboard(f0Var4.h0());
                    return;
                }
                return;
            case 8:
                this.f23500b.dismiss();
                return;
            default:
                f0 f0Var5 = this.f23500b;
                f0Var5.l0(0, 0, true);
                f0Var5.dismiss();
                return;
        }
    }
}
