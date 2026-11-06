package org.telegram.ui.Wallet;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.lk0;
public final class p0 {
    public static final long[] f42963j = {500, 1000, 3000, 5000, 10000};
    public final int f42964a;
    public final String f42965b;
    public final lk0 f42966c;
    public boolean d;
    public int f42967e;
    public int f42968f;
    public int f42969g = -1;
    public final o0 h = new Runnable(this) {
        public final p0 f42880b;

        {
            this.f42880b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    p0 p0Var = this.f42880b;
                    if (p0Var.d) {
                        p0Var.f42967e++;
                        if (p0Var.f42969g >= 0) {
                            ConnectionsManager.getInstance(p0Var.f42964a).cancelRequest(p0Var.f42969g, true);
                            p0Var.f42969g = -1;
                        }
                        p0Var.a();
                        return;
                    }
                    return;
                default:
                    p0 p0Var2 = this.f42880b;
                    if (p0Var2.d) {
                        int i7 = p0Var2.f42967e + 1;
                        p0Var2.f42967e = i7;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(p0Var2.f42965b);
                        org.telegram.messenger.g0.i3(p0Var2.h, 30000L);
                        p0Var2.f42969g = ConnectionsManager.getInstance(p0Var2.f42964a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new org.telegram.ui.Components.q(p0Var2, i7, 1));
                        return;
                    }
                    return;
            }
        }
    };
    public final o0 f42970i = new Runnable(this) {
        public final p0 f42880b;

        {
            this.f42880b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    p0 p0Var = this.f42880b;
                    if (p0Var.d) {
                        p0Var.f42967e++;
                        if (p0Var.f42969g >= 0) {
                            ConnectionsManager.getInstance(p0Var.f42964a).cancelRequest(p0Var.f42969g, true);
                            p0Var.f42969g = -1;
                        }
                        p0Var.a();
                        return;
                    }
                    return;
                default:
                    p0 p0Var2 = this.f42880b;
                    if (p0Var2.d) {
                        int i7 = p0Var2.f42967e + 1;
                        p0Var2.f42967e = i7;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(p0Var2.f42965b);
                        org.telegram.messenger.g0.i3(p0Var2.h, 30000L);
                        p0Var2.f42969g = ConnectionsManager.getInstance(p0Var2.f42964a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new org.telegram.ui.Components.q(p0Var2, i7, 1));
                        return;
                    }
                    return;
            }
        }
    };

    public p0(int i7, String str, lk0 lk0Var) {
        this.f42964a = i7;
        this.f42965b = str;
        this.f42966c = lk0Var;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        int i7 = this.f42968f;
        long j3 = f42963j[i7];
        if (i7 < 4) {
            this.f42968f = i7 + 1;
        }
        org.telegram.messenger.g0.i3(this.f42970i, j3);
    }

    public final void b() {
        this.d = false;
        this.f42967e++;
        org.telegram.messenger.g0.r(this.f42970i);
        org.telegram.messenger.g0.r(this.h);
        if (this.f42969g >= 0) {
            ConnectionsManager.getInstance(this.f42964a).cancelRequest(this.f42969g, true);
            this.f42969g = -1;
        }
    }
}
