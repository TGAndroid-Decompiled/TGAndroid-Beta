package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xc;
import org.telegram.ui.qn;
public final class r8 implements Runnable {
    public final int f34816a;
    public final i9 f34817b;

    public r8(i9 i9Var, int i10) {
        this.f34816a = i10;
        this.f34817b = i9Var;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f34816a) {
            case 0:
                i9 i9Var = this.f34817b;
                if (i9Var.F && (editTextBoldCursor = i9Var.E) != null && editTextBoldCursor.isAttachedToWindow() && i9Var.E.hasWindowFocus()) {
                    i9Var.E.requestFocus();
                    if (AndroidUtilities.showKeyboard(i9Var.E)) {
                        i9Var.F = false;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                i9 i9Var2 = this.f34817b;
                float f7 = i9Var2.Y;
                if (f7 < 1.0f && i9Var2.X == null) {
                    o1.k kVar = new o1.k(new o1.j(f7));
                    i9Var2.X = kVar;
                    o1.l lVar = new o1.l(1.0f);
                    lVar.a(0.55f);
                    lVar.b(65.0f);
                    kVar.f17559u = lVar;
                    i9Var2.X.e(0.001f);
                    i9Var2.X.b(new a3(i9Var2, 2));
                    i9Var2.X.a(new h6(i9Var2, 1));
                    i9Var2.X.h();
                    return;
                }
                return;
            case 2:
                this.f34817b.f34348a0.setLoading(false);
                return;
            case 3:
                this.f34817b.f34348a0.setLoading(false);
                return;
            case 4:
                this.f34817b.q0();
                return;
            case 5:
                i9 i9Var3 = this.f34817b;
                i9Var3.presentFragment(qn.W9(i9Var3.e.f20426id));
                return;
            default:
                org.telegram.messenger.g0.q(R.string.WalletAddressCopiedBulletin, xc.a0(this.f34817b), R.raw.copy, 36);
                return;
        }
    }
}
