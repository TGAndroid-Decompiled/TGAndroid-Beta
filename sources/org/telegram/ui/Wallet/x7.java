package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc;
public final class x7 implements Utilities.Callback {
    public final int f37508a;
    public final h8 f37509b;

    public x7(h8 h8Var, int i10) {
        this.f37508a = i10;
        this.f37509b = h8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37508a) {
            case 0:
                l0.x(r0.currentAccount).z(new r1(3, this.f37509b, (Utilities.Callback) obj), true, false);
                return;
            case 1:
                String str = (String) obj;
                h8 h8Var = this.f37509b;
                if (str != null) {
                    wc.b0(h8Var).f0(str, false);
                    return;
                }
                qc M = wc.b0(h8Var).M(LocaleController.getString(R.string.WalletBackupEnabled), LocaleController.getString(R.string.WalletBackupEnabledInfo), R.raw.contact_check);
                M.f31861j = 5000;
                M.j();
                h8Var.f30764a.f32504g3.O(true);
                return;
            default:
                h8.b0(this.f37509b, (Boolean) obj);
                return;
        }
    }
}
