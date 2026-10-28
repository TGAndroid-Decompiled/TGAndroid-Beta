package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.wc;
import org.telegram.ui.wn;
public final class r8 implements Runnable {
    public final int f37218a;
    public final i9 f37219b;

    public r8(i9 i9Var, int i10) {
        this.f37218a = i10;
        this.f37219b = i9Var;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f37218a) {
            case 0:
                i9 i9Var = this.f37219b;
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
                i9 i9Var2 = this.f37219b;
                float f7 = i9Var2.f36717b0;
                if (f7 < 1.0f && i9Var2.f36716a0 == null) {
                    o1.j jVar = new o1.j(new ac.a(f7));
                    i9Var2.f36716a0 = jVar;
                    o1.k kVar = new o1.k(1.0f);
                    kVar.a(0.55f);
                    kVar.b(65.0f);
                    jVar.f18968u = kVar;
                    i9Var2.f36716a0.e(0.001f);
                    i9Var2.f36716a0.b(new z2(i9Var2, 2));
                    i9Var2.f36716a0.a(new h6(i9Var2, 1));
                    i9Var2.f36716a0.h();
                    return;
                }
                return;
            case 2:
                this.f37219b.f36719d0.setLoading(false);
                return;
            case 3:
                this.f37219b.f36719d0.setLoading(false);
                return;
            case 4:
                this.f37219b.s0();
                return;
            case 5:
                i9 i9Var3 = this.f37219b;
                i9Var3.presentFragment(wn.ea(i9Var3.f36721f.f22177id));
                return;
            default:
                org.telegram.messenger.t.q(R.string.WalletAddressCopiedBulletin, wc.b0(this.f37219b), R.raw.copy, 36);
                return;
        }
    }
}
