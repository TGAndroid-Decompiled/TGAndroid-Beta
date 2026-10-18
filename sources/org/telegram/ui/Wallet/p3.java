package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.mj0;
public final class p3 implements Runnable {
    public final int f34704a;
    public final Context f34705b;

    public p3(Context context, int i10) {
        this.f34704a = i10;
        this.f34705b = context;
    }

    @Override
    public final void run() {
        switch (this.f34704a) {
            case 0:
                pf.d.t(this.f34705b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
            case 1:
                pf.d.t(this.f34705b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
            default:
                new o5(this.f34705b.getApplicationContext(), R.drawable.wallet_card_qr, 46, new mj0(9));
                return;
        }
    }
}
