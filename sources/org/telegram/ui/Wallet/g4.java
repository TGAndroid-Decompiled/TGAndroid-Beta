package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.cd;
public final class g4 implements Runnable {
    public final int f34546a;
    public final Context f34547b;

    public g4(Context context, int i10) {
        this.f34546a = i10;
        this.f34547b = context;
    }

    @Override
    public final void run() {
        int i10 = this.f34546a;
        Context context = this.f34547b;
        switch (i10) {
            case 0:
                gf.f.t(context, cd.L0(2131744221, null));
                return;
            case 1:
                gf.f.t(context, cd.L0(2131744221, null));
                return;
            default:
                new c6(context.getApplicationContext(), 2131232808, 46, new org.telegram.ui.Components.voip.m0(21));
                return;
        }
    }
}
