package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.hd;
public final class g4 implements Runnable {
    public final int f42531a;
    public final Context f42532b;

    public g4(Context context, int i7) {
        this.f42531a = i7;
        this.f42532b = context;
    }

    @Override
    public final void run() {
        int i7 = this.f42531a;
        Context context = this.f42532b;
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
