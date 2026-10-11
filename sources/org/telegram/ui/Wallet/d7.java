package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.sc;
public final class d7 implements Utilities.Callback {
    public final int f34856a;
    public final n7 f34857b;

    public d7(n7 n7Var, int i10) {
        this.f34856a = i10;
        this.f34857b = n7Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34856a) {
            case 0:
                n7.c0(this.f34857b, (Utilities.Callback) obj);
                return;
            case 1:
                String str = (String) obj;
                n7 n7Var = this.f34857b;
                if (str != null) {
                    ad.a0(n7Var).e0(str, false);
                    return;
                }
                sc M = ad.a0(n7Var).M(LocaleController.getString(R.string.WalletBackupEnabled), LocaleController.getString(R.string.WalletBackupEnabledInfo), R.raw.contact_check);
                M.f30833j = 5000;
                M.j();
                n7Var.f26675a.W2.N(true);
                return;
            default:
                n7.a0(this.f34857b, (Boolean) obj);
                return;
        }
    }
}
