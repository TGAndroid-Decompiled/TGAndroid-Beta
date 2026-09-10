package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class c implements View.OnClickListener {
    public final int f21926a;
    public final g0 f21927b;

    public c(g0 g0Var, int i10) {
        this.f21926a = i10;
        this.f21927b = g0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21926a) {
            case 0:
                this.f21927b.dismiss();
                return;
            case 1:
                g0 g0Var = this.f21927b;
                org.telegram.ui.Cells.i3 i3Var = g0Var.A0;
                AndroidUtilities.hideKeyboard(i3Var.f19293b);
                g0Var.I0 = i3Var.getText().toString();
                g0Var.q0();
                g0Var.p0(true);
                g0Var.k0();
                return;
            case 2:
                g0 g0Var2 = this.f21927b;
                if (g0Var2.f23121k0 != null) {
                    TL_iv.RichMessage g02 = g0Var2.g0();
                    if (g02 != null) {
                        g0Var2.f23121k0.run(g02);
                    }
                } else if (g0Var2.f23120j0 != null && g0Var2.h0() != null) {
                    g0Var2.f23120j0.run(g0Var2.h0());
                }
                g0Var2.dismiss();
                return;
            case 3:
                this.f21927b.dismiss();
                return;
            case 4:
                g0 g0Var3 = this.f21927b;
                g0Var3.P0 = false;
                g0Var3.J();
                g0Var3.O0.N(true);
                g0Var3.s();
                return;
            case 5:
                g0.Y(this.f21927b, view);
                return;
            case 6:
                g0.R(this.f21927b, view);
                return;
            case 7:
                g0 g0Var4 = this.f21927b;
                if (!g0Var4.R0) {
                    AndroidUtilities.addToClipboard(g0Var4.h0());
                    return;
                }
                return;
            case 8:
                this.f21927b.dismiss();
                return;
            default:
                g0 g0Var5 = this.f21927b;
                g0Var5.l0(0, 0, true);
                g0Var5.dismiss();
                return;
        }
    }
}
