package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.u90;
public final class p3 implements Runnable {
    public final int f37094a;
    public final Context f37095b;

    public p3(Context context, int i10) {
        this.f37094a = i10;
        this.f37095b = context;
    }

    @Override
    public final void run() {
        switch (this.f37094a) {
            case 0:
                qf.d.t(this.f37095b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
            case 1:
                qf.d.t(this.f37095b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
            default:
                new n5(this.f37095b.getApplicationContext(), R.drawable.wallet_card_qr, 46, new u90(13));
                return;
        }
    }
}
