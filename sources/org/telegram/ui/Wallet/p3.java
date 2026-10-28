package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.w90;
public final class p3 implements Runnable {
    public final int f37117a;
    public final Context f37118b;

    public p3(Context context, int i10) {
        this.f37117a = i10;
        this.f37118b = context;
    }

    @Override
    public final void run() {
        switch (this.f37117a) {
            case 0:
                qf.d.t(this.f37118b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
            case 1:
                qf.d.t(this.f37118b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
            default:
                new n5(this.f37118b.getApplicationContext(), R.drawable.wallet_card_qr, 46, new w90(14));
                return;
        }
    }
}
