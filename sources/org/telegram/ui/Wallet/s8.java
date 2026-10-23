package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xc;
import org.telegram.ui.sn;
public final class s8 implements Runnable {
    public final int f35179a;
    public final j9 f35180b;

    public s8(j9 j9Var, int i10) {
        this.f35179a = i10;
        this.f35180b = j9Var;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f35179a) {
            case 0:
                j9 j9Var = this.f35180b;
                if (j9Var.H && (editTextBoldCursor = j9Var.G) != null && editTextBoldCursor.isAttachedToWindow() && j9Var.G.hasWindowFocus()) {
                    j9Var.G.requestFocus();
                    if (AndroidUtilities.showKeyboard(j9Var.G)) {
                        j9Var.H = false;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                j9 j9Var2 = this.f35180b;
                float f7 = j9Var2.f34657a0;
                if (f7 < 1.0f && j9Var2.Z == null) {
                    o1.k kVar = new o1.k(new o1.j(f7));
                    j9Var2.Z = kVar;
                    o1.l lVar = new o1.l(1.0f);
                    lVar.a(0.55f);
                    lVar.b(65.0f);
                    kVar.f17622u = lVar;
                    j9Var2.Z.e(0.001f);
                    j9Var2.Z.b(new z2(j9Var2, 2));
                    j9Var2.Z.a(new h6(j9Var2, 1));
                    j9Var2.Z.h();
                    return;
                }
                return;
            case 2:
                this.f35180b.f34659c0.setLoading(false);
                return;
            case 3:
                this.f35180b.f34659c0.setLoading(false);
                return;
            case 4:
                this.f35180b.r0();
                return;
            case 5:
                j9 j9Var3 = this.f35180b;
                j9Var3.presentFragment(sn.W9(j9Var3.e.f20490id));
                return;
            default:
                org.telegram.messenger.v0.p(R.string.WalletAddressCopiedBulletin, xc.a0(this.f35180b), R.raw.copy, 36);
                return;
        }
    }
}
