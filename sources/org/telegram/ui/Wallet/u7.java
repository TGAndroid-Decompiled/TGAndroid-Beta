package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ad;
import org.telegram.ui.zn;
public final class u7 implements Runnable {
    public final int f35610a;
    public final k8 f35611b;

    public u7(k8 k8Var, int i10) {
        this.f35610a = i10;
        this.f35611b = k8Var;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f35610a) {
            case 0:
                k8 k8Var = this.f35611b;
                if (k8Var.F && (editTextBoldCursor = k8Var.E) != null && editTextBoldCursor.isAttachedToWindow() && k8Var.E.hasWindowFocus()) {
                    k8Var.E.requestFocus();
                    if (AndroidUtilities.showKeyboard(k8Var.E)) {
                        k8Var.F = false;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.f35611b.f35200a0.setLoading(false);
                return;
            case 2:
                this.f35611b.f35200a0.setLoading(false);
                return;
            case 3:
                this.f35611b.q0();
                return;
            case 4:
                k8 k8Var2 = this.f35611b;
                float f7 = k8Var2.Y;
                if (f7 < 1.0f && k8Var2.X == null) {
                    o1.k kVar = new o1.k(new o1.j(f7));
                    k8Var2.X = kVar;
                    o1.l lVar = new o1.l(1.0f);
                    lVar.a(0.55f);
                    lVar.b(65.0f);
                    kVar.f16942u = lVar;
                    k8Var2.X.e(0.001f);
                    k8Var2.X.b(new s2(k8Var2, 1));
                    k8Var2.X.a(new y5(k8Var2, 1));
                    k8Var2.X.h();
                    return;
                }
                return;
            case 5:
                k8 k8Var3 = this.f35611b;
                k8Var3.presentFragment(zn.W9(k8Var3.f35204e.f20189id));
                return;
            default:
                org.telegram.messenger.q.q(R.string.WalletAddressCopiedBulletin, ad.a0(this.f35611b), R.raw.copy, 36);
                return;
        }
    }
}
