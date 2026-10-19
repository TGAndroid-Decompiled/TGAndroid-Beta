package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.kj0;
public final class q3 implements Runnable {
    public final int f34764a;
    public final Context f34765b;

    public q3(Context context, int i10) {
        this.f34764a = i10;
        this.f34765b = context;
    }

    @Override
    public final void run() {
        switch (this.f34764a) {
            case 0:
                pf.d.t(this.f34765b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
            case 1:
                pf.d.t(this.f34765b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
            default:
                new p5(this.f34765b.getApplicationContext(), R.drawable.wallet_card_qr, 46, new kj0(9));
                return;
        }
    }
}
