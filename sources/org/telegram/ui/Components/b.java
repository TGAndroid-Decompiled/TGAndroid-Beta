package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class b implements View.OnClickListener {
    public final int f26937a;
    public final e0 f26938b;

    public b(e0 e0Var, int i9) {
        this.f26937a = i9;
        this.f26938b = e0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26937a) {
            case 0:
                this.f26938b.dismiss();
                return;
            case 1:
                e0 e0Var = this.f26938b;
                org.telegram.ui.Cells.j3 j3Var = e0Var.f27873w0;
                AndroidUtilities.hideKeyboard(j3Var.f24544b);
                e0Var.E0 = j3Var.getText().toString();
                e0Var.p0();
                e0Var.o0(true);
                e0Var.j0();
                return;
            case 2:
                e0 e0Var2 = this.f26938b;
                if (e0Var2.f27858g0 != null) {
                    TL_iv.RichMessage f02 = e0Var2.f0();
                    if (f02 != null) {
                        e0Var2.f27858g0.run(f02);
                    }
                } else if (e0Var2.f27857f0 != null && e0Var2.g0() != null) {
                    e0Var2.f27857f0.run(e0Var2.g0());
                }
                e0Var2.dismiss();
                return;
            case 3:
                this.f26938b.dismiss();
                return;
            case 4:
                e0 e0Var3 = this.f26938b;
                e0Var3.L0 = false;
                e0Var3.I();
                e0Var3.K0.N(true);
                e0Var3.s();
                return;
            case 5:
                e0.X(this.f26938b, view);
                return;
            case 6:
                e0.Q(this.f26938b, view);
                return;
            case 7:
                e0 e0Var4 = this.f26938b;
                if (!e0Var4.N0) {
                    AndroidUtilities.addToClipboard(e0Var4.g0());
                    return;
                }
                return;
            case 8:
                this.f26938b.dismiss();
                return;
            default:
                e0 e0Var5 = this.f26938b;
                e0Var5.k0(0, 0, true);
                e0Var5.dismiss();
                return;
        }
    }
}
