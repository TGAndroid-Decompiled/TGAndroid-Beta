package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.wc;
import org.telegram.ui.un;
public final class r8 implements Runnable {
    public final int f37194a;
    public final i9 f37195b;

    public r8(i9 i9Var, int i10) {
        this.f37194a = i10;
        this.f37195b = i9Var;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f37194a) {
            case 0:
                i9 i9Var = this.f37195b;
                if (i9Var.I && (editTextBoldCursor = i9Var.H) != null && editTextBoldCursor.isAttachedToWindow() && i9Var.H.hasWindowFocus()) {
                    i9Var.H.requestFocus();
                    if (AndroidUtilities.showKeyboard(i9Var.H)) {
                        i9Var.I = false;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                i9 i9Var2 = this.f37195b;
                float f7 = i9Var2.f36692b0;
                if (f7 < 1.0f && i9Var2.f36691a0 == null) {
                    o1.j jVar = new o1.j(new ac.a(f7));
                    i9Var2.f36691a0 = jVar;
                    o1.k kVar = new o1.k(1.0f);
                    kVar.a(0.55f);
                    kVar.b(65.0f);
                    jVar.f18969u = kVar;
                    i9Var2.f36691a0.e(0.001f);
                    i9Var2.f36691a0.b(new z2(i9Var2, 2));
                    i9Var2.f36691a0.a(new g6(i9Var2, 1));
                    i9Var2.f36691a0.h();
                    return;
                }
                return;
            case 2:
                this.f37195b.f36694d0.setLoading(false);
                return;
            case 3:
                this.f37195b.f36694d0.setLoading(false);
                return;
            case 4:
                this.f37195b.s0();
                return;
            case 5:
                i9 i9Var3 = this.f37195b;
                i9Var3.presentFragment(un.ba(i9Var3.f36696f.f22176id));
                return;
            default:
                org.telegram.messenger.t.q(R.string.WalletAddressCopiedBulletin, wc.b0(this.f37195b), R.raw.copy, 36);
                return;
        }
    }
}
