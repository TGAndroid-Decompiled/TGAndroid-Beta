package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
public final class x7 implements Utilities.Callback {
    public final int f35121a;
    public final h8 f35122b;

    public x7(h8 h8Var, int i10) {
        this.f35121a = i10;
        this.f35122b = h8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35121a) {
            case 0:
                m0.w(r0.currentAccount).y(new s1(3, this.f35122b, (Utilities.Callback) obj), true, false);
                return;
            case 1:
                String str = (String) obj;
                h8 h8Var = this.f35122b;
                if (str != null) {
                    xc.a0(h8Var).e0(str, false);
                    return;
                }
                qc M = xc.a0(h8Var).M(LocaleController.getString(R.string.WalletBackupEnabled), LocaleController.getString(R.string.WalletBackupEnabledInfo), R.raw.contact_check);
                M.f29531j = 5000;
                M.j();
                h8Var.f32356a.W2.N(true);
                return;
            default:
                h8.a0(this.f35122b, (Boolean) obj);
                return;
        }
    }
}
