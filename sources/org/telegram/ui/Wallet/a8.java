package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
public final class a8 implements Utilities.Callback {
    public final int f33999a;
    public final k8 f34000b;

    public a8(k8 k8Var, int i10) {
        this.f33999a = i10;
        this.f34000b = k8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33999a) {
            case 0:
                m0.w(r0.currentAccount).y(new s1(3, this.f34000b, (Utilities.Callback) obj), true, false);
                return;
            case 1:
                String str = (String) obj;
                k8 k8Var = this.f34000b;
                if (str != null) {
                    xc.a0(k8Var).e0(str, false);
                    return;
                }
                qc M = xc.a0(k8Var).M(LocaleController.getString(R.string.WalletBackupEnabled), LocaleController.getString(R.string.WalletBackupEnabledInfo), R.raw.contact_check);
                M.f29639j = 5000;
                M.j();
                k8Var.f31190a.W2.N(true);
                return;
            default:
                k8.a0(this.f34000b, (Boolean) obj);
                return;
        }
    }
}
