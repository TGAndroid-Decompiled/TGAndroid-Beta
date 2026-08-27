package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;

public final class b implements View.OnClickListener {

    public final int f26857a;

    public final e0 f26858b;

    public b(e0 e0Var, int i10) {
        this.f26857a = i10;
        this.f26858b = e0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26857a) {
            case 0:
                this.f26858b.dismiss();
                break;
            case 1:
                e0 e0Var = this.f26858b;
                org.telegram.ui.Cells.g3 g3Var = e0Var.f27899w0;
                AndroidUtilities.hideKeyboard(g3Var.f24370b);
                e0Var.E0 = g3Var.getText().toString();
                e0Var.q0();
                e0Var.p0(true);
                e0Var.k0();
                break;
            case 2:
                e0 e0Var2 = this.f26858b;
                if (e0Var2.f27884g0 != null) {
                    TL_iv.RichMessage richMessageG0 = e0Var2.g0();
                    if (richMessageG0 != null) {
                        e0Var2.f27884g0.run(richMessageG0);
                    }
                } else if (e0Var2.f27883f0 != null && e0Var2.h0() != null) {
                    e0Var2.f27883f0.run(e0Var2.h0());
                }
                e0Var2.dismiss();
                break;
            case 3:
                this.f26858b.dismiss();
                break;
            case 4:
                e0 e0Var3 = this.f26858b;
                e0Var3.L0 = false;
                e0Var3.J();
                e0Var3.K0.N(true);
                e0Var3.t();
                break;
            case 5:
                e0.Y(this.f26858b, view);
                break;
            case 6:
                e0.R(this.f26858b, view);
                break;
            case 7:
                e0 e0Var4 = this.f26858b;
                if (!e0Var4.N0) {
                    AndroidUtilities.addToClipboard(e0Var4.h0());
                    break;
                }
                break;
            case 8:
                this.f26858b.dismiss();
                break;
            default:
                e0 e0Var5 = this.f26858b;
                e0Var5.l0(0, 0, true);
                e0Var5.dismiss();
                break;
        }
    }
}
