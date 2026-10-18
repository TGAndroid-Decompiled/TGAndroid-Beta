package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xc;
import org.telegram.ui.sn;
public final class x8 implements Runnable {
    public final int f35099a;
    public final o9 f35100b;

    public x8(o9 o9Var, int i10) {
        this.f35099a = i10;
        this.f35100b = o9Var;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f35099a) {
            case 0:
                o9 o9Var = this.f35100b;
                if (o9Var.F && (editTextBoldCursor = o9Var.E) != null && editTextBoldCursor.isAttachedToWindow() && o9Var.E.hasWindowFocus()) {
                    o9Var.E.requestFocus();
                    if (AndroidUtilities.showKeyboard(o9Var.E)) {
                        o9Var.F = false;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                o9 o9Var2 = this.f35100b;
                float f7 = o9Var2.Y;
                if (f7 < 1.0f && o9Var2.X == null) {
                    o1.k kVar = new o1.k(new o1.j(f7));
                    o9Var2.X = kVar;
                    o1.l lVar = new o1.l(1.0f);
                    lVar.a(0.55f);
                    lVar.b(65.0f);
                    kVar.f17562u = lVar;
                    o9Var2.X.e(0.001f);
                    o9Var2.X.b(new z2(o9Var2, 2));
                    o9Var2.X.a(new n6(o9Var2, 1));
                    o9Var2.X.h();
                    return;
                }
                return;
            case 2:
                this.f35100b.f34689a0.setLoading(false);
                return;
            case 3:
                this.f35100b.f34689a0.setLoading(false);
                return;
            case 4:
                this.f35100b.q0();
                return;
            case 5:
                o9 o9Var3 = this.f35100b;
                o9Var3.presentFragment(sn.W9(o9Var3.e.f20426id));
                return;
            default:
                org.telegram.messenger.g0.q(R.string.WalletAddressCopiedBulletin, xc.a0(this.f35100b), R.raw.copy, 36);
                return;
        }
    }
}
