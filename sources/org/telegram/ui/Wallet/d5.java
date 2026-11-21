package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.gd;
import org.telegram.ui.cd0;
public final class d5 implements Runnable {
    public final int f44074a;
    public final Context f44075b;

    public d5(Context context, int i7) {
        this.f44074a = i7;
        this.f44075b = context;
    }

    @Override
    public final void run() {
        int i7 = this.f44074a;
        Context context = this.f44075b;
        switch (i7) {
            case 0:
                vf.c.v(context, gd.N0(2131743955, null), false);
                return;
            case 1:
                vf.c.v(context, gd.N0(2131743955, null), false);
                return;
            default:
                new p6(context.getApplicationContext(), 2131232813, 46, new cd0(11));
                return;
        }
    }
}
