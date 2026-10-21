package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.df0;
public final class q3 implements Runnable {
    public final int f34773a;
    public final Context f34774b;

    public q3(Context context, int i10) {
        this.f34773a = i10;
        this.f34774b = context;
    }

    @Override
    public final void run() {
        switch (this.f34773a) {
            case 0:
                pf.d.t(this.f34774b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
            case 1:
                pf.d.t(this.f34774b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
            default:
                new p5(this.f34774b.getApplicationContext(), R.drawable.wallet_card_qr, 46, new df0(10));
                return;
        }
    }
}
