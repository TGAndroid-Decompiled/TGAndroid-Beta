package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.hf0;
public final class p3 implements Runnable {
    public final int f35005a;
    public final Context f35006b;

    public p3(Context context, int i10) {
        this.f35005a = i10;
        this.f35006b = context;
    }

    @Override
    public final void run() {
        switch (this.f35005a) {
            case 0:
                pf.d.t(this.f35006b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
            case 1:
                pf.d.t(this.f35006b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
            default:
                new p5(this.f35006b.getApplicationContext(), R.drawable.wallet_card_qr, 46, new hf0(10));
                return;
        }
    }
}
