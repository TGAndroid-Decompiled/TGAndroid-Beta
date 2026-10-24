package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;
public final class x7 implements Utilities.Callback {
    public final int f35420a;
    public final i8 f35421b;

    public x7(i8 i8Var, int i10) {
        this.f35420a = i10;
        this.f35421b = i8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35420a) {
            case 0:
                l0.w(r0.currentAccount).y(new r1(3, this.f35421b, (Utilities.Callback) obj), true, false);
                return;
            case 1:
                String str = (String) obj;
                i8 i8Var = this.f35421b;
                if (str != null) {
                    vc.a0(i8Var).e0(str, false);
                    return;
                }
                oc M = vc.a0(i8Var).M(LocaleController.getString(R.string.WalletBackupEnabled), LocaleController.getString(R.string.WalletBackupEnabledInfo), R.raw.contact_check);
                M.f29203j = 5000;
                M.j();
                i8Var.f25615a.Z2.N(true);
                return;
            default:
                i8.a0(this.f35421b, (Boolean) obj);
                return;
        }
    }
}
