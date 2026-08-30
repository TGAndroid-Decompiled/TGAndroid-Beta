package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class hv0 implements Runnable {
    public final int f34955a;
    public final long f34956b;
    public final Object f34957c;
    public final Object d;

    public hv0(Object obj, long j10, Object obj2, int i10) {
        this.f34955a = i10;
        this.f34957c = obj;
        this.f34956b = j10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f34955a) {
            case 0:
                rv0 rv0Var = (rv0) this.f34957c;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
                rv0Var.getClass();
                Bundle bundle = new Bundle();
                long j10 = this.f34956b;
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                p2Var.presentFragment(new ProfileActivity(bundle, null));
                rv0Var.c(false);
                return;
            case 1:
                ph.z7 z7Var = (ph.z7) this.f34957c;
                z7Var.getClass();
                z7Var.d(this.f34956b, ((TLRPC.ChatFull) this.d).participants);
                return;
            default:
                ((long[]) this.f34957c)[0] = this.f34956b;
                ((dg.f3) this.d).run();
                return;
        }
    }
}
