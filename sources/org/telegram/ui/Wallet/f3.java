package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class f3 implements Runnable {
    public final int f34894a;
    public final Context f34895b;

    public f3(Context context, int i10) {
        this.f34894a = i10;
        this.f34895b = context;
    }

    @Override
    public final void run() {
        switch (this.f34894a) {
            case 0:
                of.f.u(this.f34895b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
            default:
                of.f.u(this.f34895b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
        }
    }
}
