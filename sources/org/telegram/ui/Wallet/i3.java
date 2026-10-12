package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class i3 implements Runnable {
    public final int f34886a;
    public final Context f34887b;

    public i3(Context context, int i10) {
        this.f34886a = i10;
        this.f34887b = context;
    }

    @Override
    public final void run() {
        switch (this.f34886a) {
            case 0:
                of.f.u(this.f34887b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
            default:
                of.f.u(this.f34887b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
        }
    }
}
