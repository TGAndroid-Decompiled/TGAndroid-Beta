package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
public final class b7 implements Utilities.Callback {
    public final int f32707a;
    public final l7 f32708b;

    public b7(l7 l7Var, int i10) {
        this.f32707a = i10;
        this.f32708b = l7Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f32707a) {
            case 0:
                l7.c0(this.f32708b, (Utilities.Callback) obj);
                return;
            case 1:
                String str = (String) obj;
                l7 l7Var = this.f32708b;
                if (str != null) {
                    zc.a0(l7Var).e0(str, false);
                    return;
                }
                sc M = zc.a0(l7Var).M(LocaleController.getString(R.string.WalletBackupEnabled), LocaleController.getString(R.string.WalletBackupEnabledInfo), R.raw.contact_check);
                M.f28805j = 5000;
                M.j();
                l7Var.f24003a.W2.N(true);
                return;
            default:
                l7.a0(this.f32708b, (Boolean) obj);
                return;
        }
    }
}
