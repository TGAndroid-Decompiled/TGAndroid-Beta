package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xc;
import org.telegram.ui.sn;
public final class u8 implements Runnable {
    public final int f34940a;
    public final l9 f34941b;

    public u8(l9 l9Var, int i10) {
        this.f34940a = i10;
        this.f34941b = l9Var;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f34940a) {
            case 0:
                l9 l9Var = this.f34941b;
                if (l9Var.F && (editTextBoldCursor = l9Var.E) != null && editTextBoldCursor.isAttachedToWindow() && l9Var.E.hasWindowFocus()) {
                    l9Var.E.requestFocus();
                    if (AndroidUtilities.showKeyboard(l9Var.E)) {
                        l9Var.F = false;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                l9 l9Var2 = this.f34941b;
                float f7 = l9Var2.Y;
                if (f7 < 1.0f && l9Var2.X == null) {
                    o1.k kVar = new o1.k(new o1.j(f7));
                    l9Var2.X = kVar;
                    o1.l lVar = new o1.l(1.0f);
                    lVar.a(0.55f);
                    lVar.b(65.0f);
                    kVar.f17555u = lVar;
                    l9Var2.X.e(0.001f);
                    l9Var2.X.b(new y2(l9Var2, 2));
                    l9Var2.X.a(new k6(l9Var2, 1));
                    l9Var2.X.h();
                    return;
                }
                return;
            case 2:
                this.f34941b.f34524a0.setLoading(false);
                return;
            case 3:
                this.f34941b.f34524a0.setLoading(false);
                return;
            case 4:
                this.f34941b.q0();
                return;
            case 5:
                l9 l9Var3 = this.f34941b;
                l9Var3.presentFragment(sn.W9(l9Var3.e.f20419id));
                return;
            default:
                org.telegram.messenger.q.q(R.string.WalletAddressCopiedBulletin, xc.a0(this.f34941b), R.raw.copy, 36);
                return;
        }
    }
}
