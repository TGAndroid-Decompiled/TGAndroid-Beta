package org.telegram.ui.Wallet;

import android.content.Context;
import org.telegram.messenger.id;
import org.telegram.ui.q61;
public final class g4 implements Runnable {
    public final int f42524a;
    public final Context f42525b;

    public g4(Context context, int i7) {
        this.f42524a = i7;
        this.f42525b = context;
    }

    @Override
    public final void run() {
        int i7 = this.f42524a;
        Context context = this.f42525b;
        switch (i7) {
            case 0:
                vf.c.v(context, id.M0(2131744196, null), false);
                return;
            case 1:
                vf.c.v(context, id.M0(2131744196, null), false);
                return;
            default:
                new a6(context.getApplicationContext(), 2131232810, 46, new q61(5));
                return;
        }
    }
}
