package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.zc;
import org.telegram.ui.fo;
public final class s7 implements Runnable {
    public final int f33686a;
    public final i8 f33687b;

    public s7(i8 i8Var, int i10) {
        this.f33686a = i10;
        this.f33687b = i8Var;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f33686a) {
            case 0:
                i8 i8Var = this.f33687b;
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
                this.f33687b.f33293a0.setLoading(false);
                return;
            case 2:
                this.f33687b.f33293a0.setLoading(false);
                return;
            case 3:
                this.f33687b.q0();
                return;
            case 4:
                i8 i8Var2 = this.f33687b;
                float f7 = i8Var2.Y;
                if (f7 < 1.0f && i8Var2.X == null) {
                    o1.k kVar = new o1.k(new o1.j(f7));
                    i8Var2.X = kVar;
                    o1.l lVar = new o1.l(1.0f);
                    lVar.a(0.55f);
                    lVar.b(65.0f);
                    kVar.f16468u = lVar;
                    i8Var2.X.e(0.001f);
                    i8Var2.X.b(new r2(i8Var2, 1));
                    i8Var2.X.a(new w5(i8Var2, 1));
                    i8Var2.X.h();
                    return;
                }
                return;
            case 5:
                i8 i8Var3 = this.f33687b;
                i8Var3.presentFragment(fo.W9(i8Var3.e.f19363id));
                return;
            default:
                org.telegram.messenger.q.r(R.string.WalletAddressCopiedBulletin, zc.a0(this.f33687b), R.raw.copy, 36);
                return;
        }
    }
}
