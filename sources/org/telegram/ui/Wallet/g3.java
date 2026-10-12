package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class g3 implements Runnable {
    public final int f33200a;
    public final Context f33201b;

    public g3(Context context, int i10) {
        this.f33200a = i10;
        this.f33201b = context;
    }

    @Override
    public final void run() {
        switch (this.f33200a) {
            case 0:
                pf.d.u(this.f33201b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
            default:
                pf.d.u(this.f33201b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
        }
    }
}
