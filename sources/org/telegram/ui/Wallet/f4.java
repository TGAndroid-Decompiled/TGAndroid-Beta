package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.id;
import org.telegram.ui.o61;
public final class f4 implements Runnable {
    public final int f42501a;
    public final Context f42502b;

    public f4(Context context, int i7) {
        this.f42501a = i7;
        this.f42502b = context;
    }

    @Override
    public final void run() {
        int i7 = this.f42501a;
        Context context = this.f42502b;
        switch (i7) {
            case 0:
                vf.c.v(context, id.M0(2131744199, null), false);
                return;
            case 1:
                vf.c.v(context, id.M0(2131744199, null), false);
                return;
            default:
                new y5(context.getApplicationContext(), 2131232810, 46, new o61(5));
                return;
        }
    }
}
