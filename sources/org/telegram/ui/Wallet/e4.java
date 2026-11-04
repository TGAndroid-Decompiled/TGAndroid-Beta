package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.bd;
import org.telegram.ui.hb1;
public final class e4 implements Runnable {
    public final int f42470a;
    public final Context f42471b;

    public e4(Context context, int i3) {
        this.f42470a = i3;
        this.f42471b = context;
    }

    @Override
    public final void run() {
        int i3 = this.f42470a;
        Context context = this.f42471b;
        switch (i3) {
            case 0:
                sf.c.v(context, bd.M0(2131744206, null), false);
                return;
            case 1:
                sf.c.v(context, bd.M0(2131744206, null), false);
                return;
            default:
                new x5(context.getApplicationContext(), 2131232808, 46, new hb1(4));
                return;
        }
    }
}
