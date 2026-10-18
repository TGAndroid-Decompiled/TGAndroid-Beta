package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
public final class d8 implements Utilities.Callback {
    public final int f34143a;
    public final n8 f34144b;

    public d8(n8 n8Var, int i10) {
        this.f34143a = i10;
        this.f34144b = n8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34143a) {
            case 0:
                m0.w(r0.currentAccount).y(new s1(3, this.f34144b, (Utilities.Callback) obj), true, false);
                return;
            case 1:
                String str = (String) obj;
                n8 n8Var = this.f34144b;
                if (str != null) {
                    xc.a0(n8Var).e0(str, false);
                    return;
                }
                qc M = xc.a0(n8Var).M(LocaleController.getString(R.string.WalletBackupEnabled), LocaleController.getString(R.string.WalletBackupEnabledInfo), R.raw.contact_check);
                M.f29645j = 5000;
                M.j();
                n8Var.f31197a.W2.N(true);
                return;
            default:
                n8.a0(this.f34144b, (Boolean) obj);
                return;
        }
    }
}
