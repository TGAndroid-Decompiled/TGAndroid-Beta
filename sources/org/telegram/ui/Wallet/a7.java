package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.tc;
public final class a7 implements Utilities.Callback {
    public final int f34629a;
    public final k7 f34630b;

    public a7(k7 k7Var, int i10) {
        this.f34629a = i10;
        this.f34630b = k7Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34629a) {
            case 0:
                k7.c0(this.f34630b, (Utilities.Callback) obj);
                return;
            case 1:
                String str = (String) obj;
                k7 k7Var = this.f34630b;
                if (str != null) {
                    ad.a0(k7Var).e0(str, false);
                    return;
                }
                tc M = ad.a0(k7Var).M(LocaleController.getString(R.string.WalletBackupEnabled), LocaleController.getString(R.string.WalletBackupEnabledInfo), R.raw.contact_check);
                M.f31130j = 5000;
                M.j();
                k7Var.f26290a.W2.N(true);
                return;
            default:
                k7.a0(this.f34630b, (Boolean) obj);
                return;
        }
    }
}
