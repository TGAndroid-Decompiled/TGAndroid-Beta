package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class i3 implements Runnable {
    public final int f35077a;
    public final Context f35078b;

    public i3(Context context, int i10) {
        this.f35077a = i10;
        this.f35078b = context;
    }

    @Override
    public final void run() {
        switch (this.f35077a) {
            case 0:
                of.f.u(this.f35078b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
            default:
                of.f.u(this.f35078b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
        }
    }
}
