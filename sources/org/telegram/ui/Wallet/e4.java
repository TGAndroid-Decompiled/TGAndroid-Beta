package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.id;
import org.telegram.ui.p61;
public final class e4 implements Runnable {
    public final int f42417a;
    public final Context f42418b;

    public e4(Context context, int i7) {
        this.f42417a = i7;
        this.f42418b = context;
    }

    @Override
    public final void run() {
        int i7 = this.f42417a;
        Context context = this.f42418b;
        switch (i7) {
            case 0:
                vf.c.v(context, id.M0(2131744196, null), false);
                return;
            case 1:
                vf.c.v(context, id.M0(2131744196, null), false);
                return;
            default:
                new x5(context.getApplicationContext(), 2131232810, 46, new p61(5));
                return;
        }
    }
}
