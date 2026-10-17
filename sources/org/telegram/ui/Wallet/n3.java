package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n3 implements Runnable {
    public final int f34633a;
    public final Context f34634b;

    public n3(Context context, int i10) {
        this.f34633a = i10;
        this.f34634b = context;
    }

    @Override
    public final void run() {
        switch (this.f34633a) {
            case 0:
                pf.d.t(this.f34634b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
            default:
                pf.d.t(this.f34634b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
        }
    }
}
