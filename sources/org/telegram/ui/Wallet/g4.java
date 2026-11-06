package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.hd;
public final class g4 implements Runnable {
    public final int f42532a;
    public final Context f42533b;

    public g4(Context context, int i7) {
        this.f42532a = i7;
        this.f42533b = context;
    }

    @Override
    public final void run() {
        int i7 = this.f42532a;
        Context context = this.f42533b;
        switch (i7) {
            case 0:
                vf.c.v(context, hd.M0(2131744197, null), false);
                return;
            case 1:
                vf.c.v(context, hd.M0(2131744197, null), false);
                return;
            default:
                new z5(context.getApplicationContext(), 2131232810, 46, new z(3));
                return;
        }
    }
}
