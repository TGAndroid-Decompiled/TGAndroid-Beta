package org.telegram.ui.Wallet;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.na1;
public final class m0 {
    public static final long[] f42808j = {500, 1000, 3000, 5000, 10000};
    public final int f42809a;
    public final String f42810b;
    public final na1 f42811c;
    public boolean d;
    public int f42812e;
    public int f42813f;
    public int f42814g = -1;
    public final l0 h = new Runnable(this) {
        public final m0 f42767b;

        {
            this.f42767b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    m0 m0Var = this.f42767b;
                    if (m0Var.d) {
                        m0Var.f42812e++;
                        if (m0Var.f42814g >= 0) {
                            ConnectionsManager.getInstance(m0Var.f42809a).cancelRequest(m0Var.f42814g, true);
                            m0Var.f42814g = -1;
                        }
                        m0Var.a();
                        return;
                    }
                    return;
                default:
                    m0 m0Var2 = this.f42767b;
                    if (m0Var2.d) {
                        int i3 = m0Var2.f42812e + 1;
                        m0Var2.f42812e = i3;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(m0Var2.f42810b);
                        org.telegram.messenger.g0.i3(m0Var2.h, 30000L);
                        m0Var2.f42814g = ConnectionsManager.getInstance(m0Var2.f42809a).sendRequestTyped(gettransactionsbymsghash, new c3.b(1), new org.telegram.ui.Components.p(m0Var2, i3, 1));
                        return;
                    }
                    return;
            }
        }
    };
    public final l0 f42815i = new Runnable(this) {
        public final m0 f42767b;

        {
            this.f42767b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    m0 m0Var = this.f42767b;
                    if (m0Var.d) {
                        m0Var.f42812e++;
                        if (m0Var.f42814g >= 0) {
                            ConnectionsManager.getInstance(m0Var.f42809a).cancelRequest(m0Var.f42814g, true);
                            m0Var.f42814g = -1;
                        }
                        m0Var.a();
                        return;
                    }
                    return;
                default:
                    m0 m0Var2 = this.f42767b;
                    if (m0Var2.d) {
                        int i3 = m0Var2.f42812e + 1;
                        m0Var2.f42812e = i3;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(m0Var2.f42810b);
                        org.telegram.messenger.g0.i3(m0Var2.h, 30000L);
                        m0Var2.f42814g = ConnectionsManager.getInstance(m0Var2.f42809a).sendRequestTyped(gettransactionsbymsghash, new c3.b(1), new org.telegram.ui.Components.p(m0Var2, i3, 1));
                        return;
                    }
                    return;
            }
        }
    };

    public m0(int i3, String str, na1 na1Var) {
        this.f42809a = i3;
        this.f42810b = str;
        this.f42811c = na1Var;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        int i3 = this.f42813f;
        long j10 = f42808j[i3];
        if (i3 < 4) {
            this.f42813f = i3 + 1;
        }
        org.telegram.messenger.g0.i3(this.f42815i, j10);
    }

    public final void b() {
        this.d = false;
        this.f42812e++;
        org.telegram.messenger.g0.r(this.f42815i);
        org.telegram.messenger.g0.r(this.h);
        if (this.f42814g >= 0) {
            ConnectionsManager.getInstance(this.f42809a).cancelRequest(this.f42814g, true);
            this.f42814g = -1;
        }
    }
}
