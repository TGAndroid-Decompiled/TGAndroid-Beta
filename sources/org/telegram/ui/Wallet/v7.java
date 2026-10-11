package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ad;
import org.telegram.ui.zn;
public final class v7 implements Runnable {
    public final int f35640a;
    public final l8 f35641b;

    public v7(l8 l8Var, int i10) {
        this.f35640a = i10;
        this.f35641b = l8Var;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f35640a) {
            case 0:
                l8 l8Var = this.f35641b;
                if (l8Var.F && (editTextBoldCursor = l8Var.E) != null && editTextBoldCursor.isAttachedToWindow() && l8Var.E.hasWindowFocus()) {
                    l8Var.E.requestFocus();
                    if (AndroidUtilities.showKeyboard(l8Var.E)) {
                        l8Var.F = false;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.f35641b.f35230a0.setLoading(false);
                return;
            case 2:
                this.f35641b.f35230a0.setLoading(false);
                return;
            case 3:
                this.f35641b.q0();
                return;
            case 4:
                l8 l8Var2 = this.f35641b;
                float f7 = l8Var2.Y;
                if (f7 < 1.0f && l8Var2.X == null) {
                    o1.k kVar = new o1.k(new o1.j(f7));
                    l8Var2.X = kVar;
                    o1.l lVar = new o1.l(1.0f);
                    lVar.a(0.55f);
                    lVar.b(65.0f);
                    kVar.f16988u = lVar;
                    l8Var2.X.e(0.001f);
                    l8Var2.X.b(new t2(l8Var2, 1));
                    l8Var2.X.a(new z5(l8Var2, 1));
                    l8Var2.X.h();
                    return;
                }
                return;
            case 5:
                l8 l8Var3 = this.f35641b;
                l8Var3.presentFragment(zn.W9(l8Var3.f35234e.f20179id));
                return;
            default:
                org.telegram.messenger.q.q(R.string.WalletAddressCopiedBulletin, ad.a0(this.f35641b), R.raw.copy, 36);
                return;
        }
    }
}
