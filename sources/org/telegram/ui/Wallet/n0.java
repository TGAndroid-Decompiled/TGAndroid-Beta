package org.telegram.ui.Wallet;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.xi0;
public final class n0 {
    public static final long[] f44167j = {500, 1000, 3000, 5000, 10000};
    public final int f44168a;
    public final String f44169b;
    public final xi0 f44170c;
    public boolean d;
    public int f44171e;
    public int f44172f;
    public int f44173g = -1;
    public final m0 h = new Runnable(this) {
        public final n0 f44143b;

        {
            this.f44143b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    n0 n0Var = this.f44143b;
                    if (n0Var.d) {
                        n0Var.f44171e++;
                        if (n0Var.f44173g >= 0) {
                            ConnectionsManager.getInstance(n0Var.f44168a).cancelRequest(n0Var.f44173g, true);
                            n0Var.f44173g = -1;
                        }
                        n0Var.a();
                        return;
                    }
                    return;
                default:
                    n0 n0Var2 = this.f44143b;
                    if (n0Var2.d) {
                        int i7 = n0Var2.f44171e + 1;
                        n0Var2.f44171e = i7;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(n0Var2.f44169b);
                        org.telegram.messenger.g0.i3(n0Var2.h, 30000L);
                        n0Var2.f44173g = ConnectionsManager.getInstance(n0Var2.f44168a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new org.telegram.ui.Components.o(n0Var2, i7, 1));
                        return;
                    }
                    return;
            }
        }
    };
    public final m0 f44174i = new Runnable(this) {
        public final n0 f44143b;

        {
            this.f44143b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    n0 n0Var = this.f44143b;
                    if (n0Var.d) {
                        n0Var.f44171e++;
                        if (n0Var.f44173g >= 0) {
                            ConnectionsManager.getInstance(n0Var.f44168a).cancelRequest(n0Var.f44173g, true);
                            n0Var.f44173g = -1;
                        }
                        n0Var.a();
                        return;
                    }
                    return;
                default:
                    n0 n0Var2 = this.f44143b;
                    if (n0Var2.d) {
                        int i7 = n0Var2.f44171e + 1;
                        n0Var2.f44171e = i7;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(n0Var2.f44169b);
                        org.telegram.messenger.g0.i3(n0Var2.h, 30000L);
                        n0Var2.f44173g = ConnectionsManager.getInstance(n0Var2.f44168a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new org.telegram.ui.Components.o(n0Var2, i7, 1));
                        return;
                    }
                    return;
            }
        }
    };

    public n0(int i7, String str, xi0 xi0Var) {
        this.f44168a = i7;
        this.f44169b = str;
        this.f44170c = xi0Var;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        int i7 = this.f44172f;
        long j3 = f44167j[i7];
        if (i7 < 4) {
            this.f44172f = i7 + 1;
        }
        org.telegram.messenger.g0.i3(this.f44174i, j3);
    }

    public final void b() {
        this.d = false;
        this.f44171e++;
        org.telegram.messenger.g0.r(this.f44174i);
        org.telegram.messenger.g0.r(this.h);
        if (this.f44173g >= 0) {
            ConnectionsManager.getInstance(this.f44168a).cancelRequest(this.f44173g, true);
            this.f44173g = -1;
        }
    }
}
