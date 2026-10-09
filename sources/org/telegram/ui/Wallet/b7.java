package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.tc;
public final class b7 implements Utilities.Callback {
    public final int f34693a;
    public final l7 f34694b;

    public b7(l7 l7Var, int i10) {
        this.f34693a = i10;
        this.f34694b = l7Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34693a) {
            case 0:
                l7.c0(this.f34694b, (Utilities.Callback) obj);
                return;
            case 1:
                String str = (String) obj;
                l7 l7Var = this.f34694b;
                if (str != null) {
                    ad.a0(l7Var).e0(str, false);
                    return;
                }
                tc M = ad.a0(l7Var).M(LocaleController.getString(R.string.WalletBackupEnabled), LocaleController.getString(R.string.WalletBackupEnabledInfo), R.raw.contact_check);
                M.f31130j = 5000;
                M.j();
                l7Var.f26290a.W2.N(true);
                return;
            default:
                l7.a0(this.f34694b, (Boolean) obj);
                return;
        }
    }
}
