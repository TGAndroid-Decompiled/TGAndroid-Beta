package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class b implements View.OnClickListener {
    public final int f26924a;
    public final g0 f26925b;

    public b(g0 g0Var, int i10) {
        this.f26924a = i10;
        this.f26925b = g0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26924a) {
            case 0:
                this.f26925b.dismiss();
                return;
            case 1:
                g0 g0Var = this.f26925b;
                org.telegram.ui.Cells.g3 g3Var = g0Var.f28687w0;
                AndroidUtilities.hideKeyboard(g3Var.f24387b);
                g0Var.E0 = g3Var.getText().toString();
                g0Var.q0();
                g0Var.p0(true);
                g0Var.k0();
                return;
            case 2:
                g0 g0Var2 = this.f26925b;
                if (g0Var2.f28672g0 != null) {
                    TL_iv.RichMessage g02 = g0Var2.g0();
                    if (g02 != null) {
                        g0Var2.f28672g0.run(g02);
                    }
                } else if (g0Var2.f28671f0 != null && g0Var2.h0() != null) {
                    g0Var2.f28671f0.run(g0Var2.h0());
                }
                g0Var2.dismiss();
                return;
            case 3:
                this.f26925b.dismiss();
                return;
            case 4:
                g0 g0Var3 = this.f26925b;
                g0Var3.L0 = false;
                g0Var3.I();
                g0Var3.K0.N(true);
                g0Var3.s();
                return;
            case 5:
                g0.Y(this.f26925b, view);
                return;
            case 6:
                g0.R(this.f26925b, view);
                return;
            case 7:
                g0 g0Var4 = this.f26925b;
                if (!g0Var4.N0) {
                    AndroidUtilities.addToClipboard(g0Var4.h0());
                    return;
                }
                return;
            case 8:
                this.f26925b.dismiss();
                return;
            default:
                g0 g0Var5 = this.f26925b;
                g0Var5.l0(0, 0, true);
                g0Var5.dismiss();
                return;
        }
    }
}
