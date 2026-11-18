package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.gd;
import org.telegram.ui.dd0;
public final class d5 implements Runnable {
    public final int f44034a;
    public final Context f44035b;

    public d5(Context context, int i7) {
        this.f44034a = i7;
        this.f44035b = context;
    }

    @Override
    public final void run() {
        int i7 = this.f44034a;
        Context context = this.f44035b;
        switch (i7) {
            case 0:
                vf.c.v(context, gd.M0(2131743961, null), false);
                return;
            case 1:
                vf.c.v(context, gd.M0(2131743961, null), false);
                return;
            default:
                new p6(context.getApplicationContext(), 2131232813, 46, new dd0(11));
                return;
        }
    }
}
