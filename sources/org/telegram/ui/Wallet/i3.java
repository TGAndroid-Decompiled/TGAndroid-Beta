package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class i3 implements Runnable {
    public final int f35111a;
    public final Context f35112b;

    public i3(Context context, int i10) {
        this.f35111a = i10;
        this.f35112b = context;
    }

    @Override
    public final void run() {
        switch (this.f35111a) {
            case 0:
                of.f.u(this.f35112b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
            default:
                of.f.u(this.f35112b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
        }
    }
}
