package org.telegram.ui.Wallet;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.lk0;
public final class o0 {
    public static final long[] f42925j = {500, 1000, 3000, 5000, 10000};
    public final int f42926a;
    public final String f42927b;
    public final lk0 f42928c;
    public boolean d;
    public int f42929e;
    public int f42930f;
    public int f42931g = -1;
    public final n0 h = new Runnable(this) {
        public final o0 f42850b;

        {
            this.f42850b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    o0 o0Var = this.f42850b;
                    if (o0Var.d) {
                        o0Var.f42929e++;
                        if (o0Var.f42931g >= 0) {
                            ConnectionsManager.getInstance(o0Var.f42926a).cancelRequest(o0Var.f42931g, true);
                            o0Var.f42931g = -1;
                        }
                        o0Var.a();
                        return;
                    }
                    return;
                default:
                    o0 o0Var2 = this.f42850b;
                    if (o0Var2.d) {
                        int i7 = o0Var2.f42929e + 1;
                        o0Var2.f42929e = i7;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(o0Var2.f42927b);
                        org.telegram.messenger.g0.i3(o0Var2.h, 30000L);
                        o0Var2.f42931g = ConnectionsManager.getInstance(o0Var2.f42926a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new org.telegram.ui.Components.q(o0Var2, i7, 1));
                        return;
                    }
                    return;
            }
        }
    };
    public final n0 f42932i = new Runnable(this) {
        public final o0 f42850b;

        {
            this.f42850b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    o0 o0Var = this.f42850b;
                    if (o0Var.d) {
                        o0Var.f42929e++;
                        if (o0Var.f42931g >= 0) {
                            ConnectionsManager.getInstance(o0Var.f42926a).cancelRequest(o0Var.f42931g, true);
                            o0Var.f42931g = -1;
                        }
                        o0Var.a();
                        return;
                    }
                    return;
                default:
                    o0 o0Var2 = this.f42850b;
                    if (o0Var2.d) {
                        int i7 = o0Var2.f42929e + 1;
                        o0Var2.f42929e = i7;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(o0Var2.f42927b);
                        org.telegram.messenger.g0.i3(o0Var2.h, 30000L);
                        o0Var2.f42931g = ConnectionsManager.getInstance(o0Var2.f42926a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new org.telegram.ui.Components.q(o0Var2, i7, 1));
                        return;
                    }
                    return;
            }
        }
    };

    public o0(int i7, String str, lk0 lk0Var) {
        this.f42926a = i7;
        this.f42927b = str;
        this.f42928c = lk0Var;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        int i7 = this.f42930f;
        long j3 = f42925j[i7];
        if (i7 < 4) {
            this.f42930f = i7 + 1;
        }
        org.telegram.messenger.g0.i3(this.f42932i, j3);
    }

    public final void b() {
        this.d = false;
        this.f42929e++;
        org.telegram.messenger.g0.r(this.f42932i);
        org.telegram.messenger.g0.r(this.h);
        if (this.f42931g >= 0) {
            ConnectionsManager.getInstance(this.f42926a).cancelRequest(this.f42931g, true);
            this.f42931g = -1;
        }
    }
}
