package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class h3 implements Runnable {
    public final int f32973a;
    public final Context f32974b;

    public h3(Context context, int i10) {
        this.f32973a = i10;
        this.f32974b = context;
    }

    @Override
    public final void run() {
        switch (this.f32973a) {
            case 0:
                pf.d.t(this.f32974b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
            default:
                pf.d.t(this.f32974b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
        }
    }
}
