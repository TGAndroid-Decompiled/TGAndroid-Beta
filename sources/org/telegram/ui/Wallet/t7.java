package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ad;
import org.telegram.ui.zn;
public final class t7 implements Runnable {
    public final int f35520a;
    public final j8 f35521b;

    public t7(j8 j8Var, int i10) {
        this.f35520a = i10;
        this.f35521b = j8Var;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f35520a) {
            case 0:
                j8 j8Var = this.f35521b;
                if (j8Var.F && (editTextBoldCursor = j8Var.E) != null && editTextBoldCursor.isAttachedToWindow() && j8Var.E.hasWindowFocus()) {
                    j8Var.E.requestFocus();
                    if (AndroidUtilities.showKeyboard(j8Var.E)) {
                        j8Var.F = false;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.f35521b.f35089a0.setLoading(false);
                return;
            case 2:
                this.f35521b.f35089a0.setLoading(false);
                return;
            case 3:
                this.f35521b.q0();
                return;
            case 4:
                j8 j8Var2 = this.f35521b;
                float f7 = j8Var2.Y;
                if (f7 < 1.0f && j8Var2.X == null) {
                    o1.k kVar = new o1.k(new o1.j(f7));
                    j8Var2.X = kVar;
                    o1.l lVar = new o1.l(1.0f);
                    lVar.a(0.55f);
                    lVar.b(65.0f);
                    kVar.f16938u = lVar;
                    j8Var2.X.e(0.001f);
                    j8Var2.X.b(new r2(j8Var2, 1));
                    j8Var2.X.a(new x5(j8Var2, 1));
                    j8Var2.X.h();
                    return;
                }
                return;
            case 5:
                j8 j8Var3 = this.f35521b;
                j8Var3.presentFragment(zn.W9(j8Var3.f35093e.f20185id));
                return;
            default:
                org.telegram.messenger.q.q(R.string.WalletAddressCopiedBulletin, ad.a0(this.f35521b), R.raw.copy, 36);
                return;
        }
    }
}
