package org.telegram.ui.Wallet;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.nk0;
public final class n0 {
    public static final long[] f42843j = {500, 1000, 3000, 5000, 10000};
    public final int f42844a;
    public final String f42845b;
    public final nk0 f42846c;
    public boolean d;
    public int f42847e;
    public int f42848f;
    public int f42849g = -1;
    public final m0 h = new Runnable(this) {
        public final n0 f42768b;

        {
            this.f42768b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    n0 n0Var = this.f42768b;
                    if (n0Var.d) {
                        n0Var.f42847e++;
                        if (n0Var.f42849g >= 0) {
                            ConnectionsManager.getInstance(n0Var.f42844a).cancelRequest(n0Var.f42849g, true);
                            n0Var.f42849g = -1;
                        }
                        n0Var.a();
                        return;
                    }
                    return;
                default:
                    n0 n0Var2 = this.f42768b;
                    if (n0Var2.d) {
                        int i7 = n0Var2.f42847e + 1;
                        n0Var2.f42847e = i7;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(n0Var2.f42845b);
                        org.telegram.messenger.g0.i3(n0Var2.h, 30000L);
                        n0Var2.f42849g = ConnectionsManager.getInstance(n0Var2.f42844a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new org.telegram.ui.Components.q(n0Var2, i7, 1));
                        return;
                    }
                    return;
            }
        }
    };
    public final m0 f42850i = new Runnable(this) {
        public final n0 f42768b;

        {
            this.f42768b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    n0 n0Var = this.f42768b;
                    if (n0Var.d) {
                        n0Var.f42847e++;
                        if (n0Var.f42849g >= 0) {
                            ConnectionsManager.getInstance(n0Var.f42844a).cancelRequest(n0Var.f42849g, true);
                            n0Var.f42849g = -1;
                        }
                        n0Var.a();
                        return;
                    }
                    return;
                default:
                    n0 n0Var2 = this.f42768b;
                    if (n0Var2.d) {
                        int i7 = n0Var2.f42847e + 1;
                        n0Var2.f42847e = i7;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(n0Var2.f42845b);
                        org.telegram.messenger.g0.i3(n0Var2.h, 30000L);
                        n0Var2.f42849g = ConnectionsManager.getInstance(n0Var2.f42844a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new org.telegram.ui.Components.q(n0Var2, i7, 1));
                        return;
                    }
                    return;
            }
        }
    };

    public n0(int i7, String str, nk0 nk0Var) {
        this.f42844a = i7;
        this.f42845b = str;
        this.f42846c = nk0Var;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        int i7 = this.f42848f;
        long j3 = f42843j[i7];
        if (i7 < 4) {
            this.f42848f = i7 + 1;
        }
        org.telegram.messenger.g0.i3(this.f42850i, j3);
    }

    public final void b() {
        this.d = false;
        this.f42847e++;
        org.telegram.messenger.g0.r(this.f42850i);
        org.telegram.messenger.g0.r(this.h);
        if (this.f42849g >= 0) {
            ConnectionsManager.getInstance(this.f42844a).cancelRequest(this.f42849g, true);
            this.f42849g = -1;
        }
    }
}
