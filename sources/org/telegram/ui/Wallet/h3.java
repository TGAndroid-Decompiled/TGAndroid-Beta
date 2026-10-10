package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class h3 implements Runnable {
    public final int f35047a;
    public final Context f35048b;

    public h3(Context context, int i10) {
        this.f35047a = i10;
        this.f35048b = context;
    }

    @Override
    public final void run() {
        switch (this.f35047a) {
            case 0:
                of.f.u(this.f35048b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
            default:
                of.f.u(this.f35048b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
        }
    }
}
