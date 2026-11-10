package org.telegram.ui.Wallet;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ok0;
public final class n0 {
    public static final long[] f42842j = {500, 1000, 3000, 5000, 10000};
    public final int f42843a;
    public final String f42844b;
    public final ok0 f42845c;
    public boolean d;
    public int f42846e;
    public int f42847f;
    public int f42848g = -1;
    public final m0 h = new Runnable(this) {
        public final n0 f42808b;

        {
            this.f42808b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    n0 n0Var = this.f42808b;
                    if (n0Var.d) {
                        n0Var.f42846e++;
                        if (n0Var.f42848g >= 0) {
                            ConnectionsManager.getInstance(n0Var.f42843a).cancelRequest(n0Var.f42848g, true);
                            n0Var.f42848g = -1;
                        }
                        n0Var.a();
                        return;
                    }
                    return;
                default:
                    n0 n0Var2 = this.f42808b;
                    if (n0Var2.d) {
                        int i7 = n0Var2.f42846e + 1;
                        n0Var2.f42846e = i7;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(n0Var2.f42844b);
                        org.telegram.messenger.g0.i3(n0Var2.h, 30000L);
                        n0Var2.f42848g = ConnectionsManager.getInstance(n0Var2.f42843a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new org.telegram.ui.Components.p(n0Var2, i7, 1));
                        return;
                    }
                    return;
            }
        }
    };
    public final m0 f42849i = new Runnable(this) {
        public final n0 f42808b;

        {
            this.f42808b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    n0 n0Var = this.f42808b;
                    if (n0Var.d) {
                        n0Var.f42846e++;
                        if (n0Var.f42848g >= 0) {
                            ConnectionsManager.getInstance(n0Var.f42843a).cancelRequest(n0Var.f42848g, true);
                            n0Var.f42848g = -1;
                        }
                        n0Var.a();
                        return;
                    }
                    return;
                default:
                    n0 n0Var2 = this.f42808b;
                    if (n0Var2.d) {
                        int i7 = n0Var2.f42846e + 1;
                        n0Var2.f42846e = i7;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(n0Var2.f42844b);
                        org.telegram.messenger.g0.i3(n0Var2.h, 30000L);
                        n0Var2.f42848g = ConnectionsManager.getInstance(n0Var2.f42843a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new org.telegram.ui.Components.p(n0Var2, i7, 1));
                        return;
                    }
                    return;
            }
        }
    };

    public n0(int i7, String str, ok0 ok0Var) {
        this.f42843a = i7;
        this.f42844b = str;
        this.f42845c = ok0Var;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        int i7 = this.f42847f;
        long j3 = f42842j[i7];
        if (i7 < 4) {
            this.f42847f = i7 + 1;
        }
        org.telegram.messenger.g0.i3(this.f42849i, j3);
    }

    public final void b() {
        this.d = false;
        this.f42846e++;
        org.telegram.messenger.g0.r(this.f42849i);
        org.telegram.messenger.g0.r(this.h);
        if (this.f42848g >= 0) {
            ConnectionsManager.getInstance(this.f42843a).cancelRequest(this.f42848g, true);
            this.f42848g = -1;
        }
    }
}
