package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class g3 implements Runnable {
    public final int f34958a;
    public final Context f34959b;

    public g3(Context context, int i10) {
        this.f34958a = i10;
        this.f34959b = context;
    }

    @Override
    public final void run() {
        switch (this.f34958a) {
            case 0:
                of.f.u(this.f34959b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
            default:
                of.f.u(this.f34959b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
        }
    }
}
