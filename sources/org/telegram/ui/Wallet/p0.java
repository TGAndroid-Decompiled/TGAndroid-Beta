package org.telegram.ui.Wallet;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.lk0;
public final class p0 {
    public static final long[] f42964j = {500, 1000, 3000, 5000, 10000};
    public final int f42965a;
    public final String f42966b;
    public final lk0 f42967c;
    public boolean d;
    public int f42968e;
    public int f42969f;
    public int f42970g = -1;
    public final o0 h = new Runnable(this) {
        public final p0 f42881b;

        {
            this.f42881b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    p0 p0Var = this.f42881b;
                    if (p0Var.d) {
                        p0Var.f42968e++;
                        if (p0Var.f42970g >= 0) {
                            ConnectionsManager.getInstance(p0Var.f42965a).cancelRequest(p0Var.f42970g, true);
                            p0Var.f42970g = -1;
                        }
                        p0Var.a();
                        return;
                    }
                    return;
                default:
                    p0 p0Var2 = this.f42881b;
                    if (p0Var2.d) {
                        int i7 = p0Var2.f42968e + 1;
                        p0Var2.f42968e = i7;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(p0Var2.f42966b);
                        org.telegram.messenger.g0.i3(p0Var2.h, 30000L);
                        p0Var2.f42970g = ConnectionsManager.getInstance(p0Var2.f42965a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new org.telegram.ui.Components.q(p0Var2, i7, 1));
                        return;
                    }
                    return;
            }
        }
    };
    public final o0 f42971i = new Runnable(this) {
        public final p0 f42881b;

        {
            this.f42881b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    p0 p0Var = this.f42881b;
                    if (p0Var.d) {
                        p0Var.f42968e++;
                        if (p0Var.f42970g >= 0) {
                            ConnectionsManager.getInstance(p0Var.f42965a).cancelRequest(p0Var.f42970g, true);
                            p0Var.f42970g = -1;
                        }
                        p0Var.a();
                        return;
                    }
                    return;
                default:
                    p0 p0Var2 = this.f42881b;
                    if (p0Var2.d) {
                        int i7 = p0Var2.f42968e + 1;
                        p0Var2.f42968e = i7;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(p0Var2.f42966b);
                        org.telegram.messenger.g0.i3(p0Var2.h, 30000L);
                        p0Var2.f42970g = ConnectionsManager.getInstance(p0Var2.f42965a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new org.telegram.ui.Components.q(p0Var2, i7, 1));
                        return;
                    }
                    return;
            }
        }
    };

    public p0(int i7, String str, lk0 lk0Var) {
        this.f42965a = i7;
        this.f42966b = str;
        this.f42967c = lk0Var;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        int i7 = this.f42969f;
        long j3 = f42964j[i7];
        if (i7 < 4) {
            this.f42969f = i7 + 1;
        }
        org.telegram.messenger.g0.i3(this.f42971i, j3);
    }

    public final void b() {
        this.d = false;
        this.f42968e++;
        org.telegram.messenger.g0.r(this.f42971i);
        org.telegram.messenger.g0.r(this.h);
        if (this.f42970g >= 0) {
            ConnectionsManager.getInstance(this.f42965a).cancelRequest(this.f42970g, true);
            this.f42970g = -1;
        }
    }
}
