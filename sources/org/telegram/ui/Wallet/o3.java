package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o3 implements Runnable {
    public final int f34670a;
    public final Context f34671b;

    public o3(Context context, int i10) {
        this.f34670a = i10;
        this.f34671b = context;
    }

    @Override
    public final void run() {
        switch (this.f34670a) {
            case 0:
                pf.d.t(this.f34671b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
            default:
                pf.d.t(this.f34671b, LocaleController.getString(R.string.TermsOfServiceUrl));
                return;
        }
    }
}
