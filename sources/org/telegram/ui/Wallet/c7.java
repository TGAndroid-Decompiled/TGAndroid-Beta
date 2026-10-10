package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.tc;
public final class c7 implements Utilities.Callback {
    public final int f34793a;
    public final m7 f34794b;

    public c7(m7 m7Var, int i10) {
        this.f34793a = i10;
        this.f34794b = m7Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34793a) {
            case 0:
                m7.c0(this.f34794b, (Utilities.Callback) obj);
                return;
            case 1:
                String str = (String) obj;
                m7 m7Var = this.f34794b;
                if (str != null) {
                    ad.a0(m7Var).e0(str, false);
                    return;
                }
                tc M = ad.a0(m7Var).M(LocaleController.getString(R.string.WalletBackupEnabled), LocaleController.getString(R.string.WalletBackupEnabledInfo), R.raw.contact_check);
                M.f31096j = 5000;
                M.j();
                m7Var.f26629a.W2.N(true);
                return;
            default:
                m7.a0(this.f34794b, (Boolean) obj);
                return;
        }
    }
}
