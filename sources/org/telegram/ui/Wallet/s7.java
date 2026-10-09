package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ad;
import org.telegram.ui.zn;
public final class s7 implements Runnable {
    public final int f35456a;
    public final i8 f35457b;

    public s7(i8 i8Var, int i10) {
        this.f35456a = i10;
        this.f35457b = i8Var;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f35456a) {
            case 0:
                i8 i8Var = this.f35457b;
                if (i8Var.F && (editTextBoldCursor = i8Var.E) != null && editTextBoldCursor.isAttachedToWindow() && i8Var.E.hasWindowFocus()) {
                    i8Var.E.requestFocus();
                    if (AndroidUtilities.showKeyboard(i8Var.E)) {
                        i8Var.F = false;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.f35457b.f35018a0.setLoading(false);
                return;
            case 2:
                this.f35457b.f35018a0.setLoading(false);
                return;
            case 3:
                this.f35457b.q0();
                return;
            case 4:
                i8 i8Var2 = this.f35457b;
                float f7 = i8Var2.Y;
                if (f7 < 1.0f && i8Var2.X == null) {
                    o1.k kVar = new o1.k(new o1.j(f7));
                    i8Var2.X = kVar;
                    o1.l lVar = new o1.l(1.0f);
                    lVar.a(0.55f);
                    lVar.b(65.0f);
                    kVar.f16938u = lVar;
                    i8Var2.X.e(0.001f);
                    i8Var2.X.b(new r2(i8Var2, 1));
                    i8Var2.X.a(new w5(i8Var2, 1));
                    i8Var2.X.h();
                    return;
                }
                return;
            case 5:
                i8 i8Var3 = this.f35457b;
                i8Var3.presentFragment(zn.W9(i8Var3.f35022e.f20185id));
                return;
            default:
                org.telegram.messenger.q.q(R.string.WalletAddressCopiedBulletin, ad.a0(this.f35457b), R.raw.copy, 36);
                return;
        }
    }
}
