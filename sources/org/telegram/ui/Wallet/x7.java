package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc;
public final class x7 implements Utilities.Callback {
    public final int f37481a;
    public final h8 f37482b;

    public x7(h8 h8Var, int i10) {
        this.f37481a = i10;
        this.f37482b = h8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37481a) {
            case 0:
                l0.w(r0.currentAccount).y(new r1(3, this.f37482b, (Utilities.Callback) obj), true, false);
                return;
            case 1:
                String str = (String) obj;
                h8 h8Var = this.f37482b;
                if (str != null) {
                    wc.b0(h8Var).f0(str, false);
                    return;
                }
                qc M = wc.b0(h8Var).M(LocaleController.getString(R.string.WalletBackupEnabled), LocaleController.getString(R.string.WalletBackupEnabledInfo), R.raw.contact_check);
                M.f31887j = 5000;
                M.j();
                h8Var.f30417a.f32150g3.O(true);
                return;
            default:
                h8.b0(this.f37482b, (Boolean) obj);
                return;
        }
    }
}
