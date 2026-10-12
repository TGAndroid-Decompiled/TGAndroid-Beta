package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
public final class a7 implements Utilities.Callback {
    public final int f32935a;
    public final k7 f32936b;

    public a7(k7 k7Var, int i10) {
        this.f32935a = i10;
        this.f32936b = k7Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f32935a) {
            case 0:
                k7.c0(this.f32936b, (Utilities.Callback) obj);
                return;
            case 1:
                String str = (String) obj;
                k7 k7Var = this.f32936b;
                if (str != null) {
                    zc.a0(k7Var).e0(str, false);
                    return;
                }
                sc M = zc.a0(k7Var).M(LocaleController.getString(R.string.WalletBackupEnabled), LocaleController.getString(R.string.WalletBackupEnabledInfo), R.raw.contact_check);
                M.f29102j = 5000;
                M.j();
                k7Var.f23964a.W2.N(true);
                return;
            default:
                k7.a0(this.f32936b, (Boolean) obj);
                return;
        }
    }
}
