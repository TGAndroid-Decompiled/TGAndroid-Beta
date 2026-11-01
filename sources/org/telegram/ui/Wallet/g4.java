package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.dd;
public final class g4 implements Runnable {
    public final int f34552a;
    public final Context f34553b;

    public g4(Context context, int i10) {
        this.f34552a = i10;
        this.f34553b = context;
    }

    @Override
    public final void run() {
        int i10 = this.f34552a;
        Context context = this.f34553b;
        switch (i10) {
            case 0:
                gf.f.t(context, dd.L0(2131744221, null));
                return;
            case 1:
                gf.f.t(context, dd.L0(2131744221, null));
                return;
            default:
                new c6(context.getApplicationContext(), 2131232808, 46, new org.telegram.ui.Components.voip.n0(21));
                return;
        }
    }
}
