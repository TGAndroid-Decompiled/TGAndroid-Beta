package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
public final class d7 implements Utilities.Callback {
    public final int f34631a;
    public final n7 f34632b;

    public d7(n7 n7Var, int i10) {
        this.f34631a = i10;
        this.f34632b = n7Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34631a) {
            case 0:
                n7.c0(this.f34632b, (Utilities.Callback) obj);
                return;
            case 1:
                String str = (String) obj;
                n7 n7Var = this.f34632b;
                if (str != null) {
                    zc.a0(n7Var).e0(str, false);
                    return;
                }
                sc M = zc.a0(n7Var).M(LocaleController.getString(R.string.WalletBackupEnabled), LocaleController.getString(R.string.WalletBackupEnabledInfo), R.raw.contact_check);
                M.f30540j = 5000;
                M.j();
                n7Var.f27773a.W2.N(true);
                return;
            default:
                n7.a0(this.f34632b, (Boolean) obj);
                return;
        }
    }
}
