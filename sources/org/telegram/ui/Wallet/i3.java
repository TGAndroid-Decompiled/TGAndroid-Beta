package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class i3 implements Runnable {
    public final int f34888a;
    public final Context f34889b;

    public i3(Context context, int i10) {
        this.f34888a = i10;
        this.f34889b = context;
    }

    @Override
    public final void run() {
        switch (this.f34888a) {
            case 0:
                of.f.u(this.f34889b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
            default:
                of.f.u(this.f34889b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
        }
    }
}
