package org.telegram.ui.Wallet;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.lk0;
public final class p0 {
    public static final long[] f42939j = {500, 1000, 3000, 5000, 10000};
    public final int f42940a;
    public final String f42941b;
    public final lk0 f42942c;
    public boolean d;
    public int f42943e;
    public int f42944f;
    public int f42945g = -1;
    public final o0 h = new Runnable(this) {
        public final p0 f42856b;

        {
            this.f42856b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    p0 p0Var = this.f42856b;
                    if (p0Var.d) {
                        p0Var.f42943e++;
                        if (p0Var.f42945g >= 0) {
                            ConnectionsManager.getInstance(p0Var.f42940a).cancelRequest(p0Var.f42945g, true);
                            p0Var.f42945g = -1;
                        }
                        p0Var.a();
                        return;
                    }
                    return;
                default:
                    p0 p0Var2 = this.f42856b;
                    if (p0Var2.d) {
                        int i7 = p0Var2.f42943e + 1;
                        p0Var2.f42943e = i7;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(p0Var2.f42941b);
                        org.telegram.messenger.g0.i3(p0Var2.h, 30000L);
                        p0Var2.f42945g = ConnectionsManager.getInstance(p0Var2.f42940a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new org.telegram.ui.Components.q(p0Var2, i7, 1));
                        return;
                    }
                    return;
            }
        }
    };
    public final o0 f42946i = new Runnable(this) {
        public final p0 f42856b;

        {
            this.f42856b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    p0 p0Var = this.f42856b;
                    if (p0Var.d) {
                        p0Var.f42943e++;
                        if (p0Var.f42945g >= 0) {
                            ConnectionsManager.getInstance(p0Var.f42940a).cancelRequest(p0Var.f42945g, true);
                            p0Var.f42945g = -1;
                        }
                        p0Var.a();
                        return;
                    }
                    return;
                default:
                    p0 p0Var2 = this.f42856b;
                    if (p0Var2.d) {
                        int i7 = p0Var2.f42943e + 1;
                        p0Var2.f42943e = i7;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(p0Var2.f42941b);
                        org.telegram.messenger.g0.i3(p0Var2.h, 30000L);
                        p0Var2.f42945g = ConnectionsManager.getInstance(p0Var2.f42940a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new org.telegram.ui.Components.q(p0Var2, i7, 1));
                        return;
                    }
                    return;
            }
        }
    };

    public p0(int i7, String str, lk0 lk0Var) {
        this.f42940a = i7;
        this.f42941b = str;
        this.f42942c = lk0Var;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        int i7 = this.f42944f;
        long j3 = f42939j[i7];
        if (i7 < 4) {
            this.f42944f = i7 + 1;
        }
        org.telegram.messenger.g0.i3(this.f42946i, j3);
    }

    public final void b() {
        this.d = false;
        this.f42943e++;
        org.telegram.messenger.g0.r(this.f42946i);
        org.telegram.messenger.g0.r(this.h);
        if (this.f42945g >= 0) {
            ConnectionsManager.getInstance(this.f42940a).cancelRequest(this.f42945g, true);
            this.f42945g = -1;
        }
    }
}
