package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xc;
public final class w2 implements Runnable {
    public final int f35034a;
    public final org.telegram.ui.ActionBar.n2 f35035b;

    public w2(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f35034a = i10;
        this.f35035b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f35034a) {
            case 0:
                this.f35035b.presentFragment(new n5());
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 n2Var = this.f35035b;
                n5.C0(n2Var.getContext(), n2Var.getResourceProvider());
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var2 = this.f35035b;
                if (xc.a(n2Var2)) {
                    xc.a0(n2Var2).M(LocaleController.getString(R.string.WalletCreated), LocaleController.getString(R.string.WalletCreatedInfo), R.raw.contact_check).j();
                    return;
                }
                return;
        }
    }
}
