package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.hd;
import org.telegram.ui.ah0;
public final class f4 implements Runnable {
    public final int f43826a;
    public final Context f43827b;

    public f4(Context context, int i7) {
        this.f43826a = i7;
        this.f43827b = context;
    }

    @Override
    public final void run() {
        int i7 = this.f43826a;
        Context context = this.f43827b;
        switch (i7) {
            case 0:
                vf.c.v(context, hd.M0(2131744196, null), false);
                return;
            case 1:
                vf.c.v(context, hd.M0(2131744196, null), false);
                return;
            default:
                new z5(context.getApplicationContext(), 2131232811, 46, new ah0(9));
                return;
        }
    }
}
