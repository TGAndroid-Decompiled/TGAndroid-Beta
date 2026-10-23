package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.if0;
public final class p3 implements Runnable {
    public final int f35003a;
    public final Context f35004b;

    public p3(Context context, int i10) {
        this.f35003a = i10;
        this.f35004b = context;
    }

    @Override
    public final void run() {
        switch (this.f35003a) {
            case 0:
                pf.d.t(this.f35004b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
            case 1:
                pf.d.t(this.f35004b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
            default:
                new p5(this.f35004b.getApplicationContext(), R.drawable.wallet_card_qr, 46, new if0(10));
                return;
        }
    }
}
