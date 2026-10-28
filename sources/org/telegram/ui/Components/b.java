package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class b implements View.OnClickListener {
    public final int f26697a;
    public final e0 f26698b;

    public b(e0 e0Var, int i10) {
        this.f26697a = i10;
        this.f26698b = e0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26697a) {
            case 0:
                this.f26698b.dismiss();
                return;
            case 1:
                e0 e0Var = this.f26698b;
                org.telegram.ui.Cells.g3 g3Var = e0Var.A0;
                AndroidUtilities.hideKeyboard(g3Var.d);
                e0Var.I0 = g3Var.getText().toString();
                e0Var.q0();
                e0Var.p0(true);
                e0Var.k0();
                return;
            case 2:
                e0 e0Var2 = this.f26698b;
                if (e0Var2.f27620k0 != null) {
                    TL_iv.RichMessage g02 = e0Var2.g0();
                    if (g02 != null) {
                        e0Var2.f27620k0.run(g02);
                    }
                } else if (e0Var2.f27619j0 != null && e0Var2.h0() != null) {
                    e0Var2.f27619j0.run(e0Var2.h0());
                }
                e0Var2.dismiss();
                return;
            case 3:
                this.f26698b.dismiss();
                return;
            case 4:
                e0 e0Var3 = this.f26698b;
                e0Var3.P0 = false;
                e0Var3.J();
                e0Var3.O0.O(true);
                e0Var3.s();
                return;
            case 5:
                e0.Y(this.f26698b, view);
                return;
            case 6:
                e0.R(this.f26698b, view);
                return;
            case 7:
                e0 e0Var4 = this.f26698b;
                if (!e0Var4.R0) {
                    AndroidUtilities.addToClipboard(e0Var4.h0());
                    return;
                }
                return;
            case 8:
                this.f26698b.dismiss();
                return;
            default:
                e0 e0Var5 = this.f26698b;
                e0Var5.l0(0, 0, true);
                e0Var5.dismiss();
                return;
        }
    }
}
